package net.glowstone.linkstone.compiler.transform;

import net.glowstone.linkstone.annotations.Version;
import net.glowstone.linkstone.compiler.meta.ClassfileMeta;
import net.glowstone.linkstone.compiler.meta.EnumMeta;
import net.glowstone.linkstone.compiler.util.AsmUtil;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static org.objectweb.asm.Opcodes.*;

/**
 * Fix the generated (synthetic) boilerplate code within enum classes for the case that a
 * constant was removed by not annotating the targeted version.
 */
public class EnumBoilerplateFix implements CodeTransformer {
    /**
     * Version targeted by the compiler
     */
    private Version version;

    public EnumBoilerplateFix(Version version) {
        this.version = version;
    }

    @Override
    public void transform(List<ClassNode> classes) {
        classes.stream()
                .filter(cn -> (cn.access & ACC_ENUM) != 0)
                .filter(cn -> ClassfileMeta.from(cn).isAnnotated())
                .forEach(this::fixEnum);
    }

    private void fixEnum(ClassNode enumNode) {
        MethodNode clinit = getStaticClassInitializer(enumNode);
        List<FieldNode> unorderedEnumConstants = getEnumConstants(enumNode);
        ValuesArrayInitializationCodeBlock valuesArrayInitialization = getValueArrayInitialization(enumNode, clinit, unorderedEnumConstants);

        // All enum constants as ordered in the "values" array.
        List<FieldNode> orderedConstants = valuesArrayInitialization.valueAssignments.stream()
                .sorted(Comparator.comparingInt(assignment -> assignment.getIndex()))
                .map(assignment -> assignment.constant)
                .collect(Collectors.toList());

        int index = 0;
        for (FieldNode constant : orderedConstants) {
            ConstantInitializerCodeBlock constantInitialization = getConstantInitializerCodeBlock(enumNode, clinit, constant);
            ValuesArrayInitializationCodeBlock.ValueAssignment valuesArrayAssignment = valuesArrayInitialization.getAssignment(constant);

            EnumMeta meta = EnumMeta.from(constant);
            if (meta.isAnnotated() && !meta.getVersions().contains(version)) {
                // The constant does not exist in the targeted version
                // The initialization of the constant and the storage in the "values" array is removed.
                constantInitialization.remove();
                valuesArrayAssignment.remove();
            } else {
                int ordinal = index++;

                // Updates the name and ordinal of a constant initialization.
                // The name might change through obfuscation wih the LEnum annotation.
                // The ordinal changes if a preceding constant was removed.
                constantInitialization.setOrdinal(ordinal);
                constantInitialization.setName(meta.getNameOrDefault(version));

                // Update the index of this constant in the "values" array.
                // It has to be changed as well if a preceding constant was removed.
                valuesArrayAssignment.setIndex(ordinal);
            }
        }

        valuesArrayInitialization.setArraySize(index);
    }

    /**
     * Get the fields of all enum constants.
     *
     * @param enumNode ClassNode of the enum whose constants we want
     * @return list of enum constants
     */
    private List<FieldNode> getEnumConstants(ClassNode enumNode) {
        return enumNode.fields.stream()
                .filter(fn -> (fn.access & ACC_ENUM) != 0)
                .collect(Collectors.toList());
    }

    /**
     * Get the MethodNode of the clinit method of a class.
     *
     * @param cn class whose static initializer we want
     * @return MethodNode of the static initializer
     */
    private MethodNode getStaticClassInitializer(ClassNode cn) {
        return cn.methods.stream()
                .filter(mn -> mn.name.equals("<clinit>"))
                .findAny().get();
    }

    /**
     * Find the code block that create the instance of a certain enum constant and assigns it to its field.
     *
     * @param cn ClassNode of enum class
     * @param clinit static initializer of enum
     * @param constant field of the searched constant
     * @return code block that initializes the constant
     */
    public ConstantInitializerCodeBlock getConstantInitializerCodeBlock(ClassNode cn, MethodNode clinit, FieldNode constant) {
        // Find the insn that assigns the initialized constant to its field.
        // It is the last insn in the requested code block.
        FieldInsnNode fieldAssignment = null;
        for (AbstractInsnNode insn = clinit.instructions.getFirst(); insn != null; insn = insn.getNext()) {
            if (insn.getOpcode() == PUTSTATIC) {
                FieldInsnNode fin = (FieldInsnNode) insn;
                if (fin.owner.equals(cn.name) && fin.name.equals(constant.name) && fin.desc.equals(constant.desc)) {
                    fieldAssignment = fin;
                    break;
                }
            }
        }
        if (fieldAssignment == null) {
            throw new IllegalStateException("Could not find assignment to field of constant '" + constant.name + "' in enum '" + cn.name + "'.");
        }

        // Now walk back until the first insn of the codeblock is found.
        // It is a NEW insn that creates the enum instance.
        AbstractInsnNode newInsn = null;
        for (AbstractInsnNode insn = fieldAssignment; insn != null; insn = insn.getPrevious()) {
            if (insn.getOpcode() == NEW && ((TypeInsnNode) insn).desc.equals(cn.name)) {
                newInsn = insn;
                break;
            }
        }
        if (newInsn == null) {
            throw new IllegalStateException("Could not find first insn of init code block of constant '" + constant.name + "' in enum '" + cn.name + "'.");
        }

        // Create a list of all insns between the first and last one.
        List<AbstractInsnNode> codeBlock = new ArrayList<>();
        AbstractInsnNode insn = newInsn;
        while (true) {
            codeBlock.add(insn);
            if (insn == fieldAssignment) {
                break;
            }
            insn = insn.getNext();
        }

        return new ConstantInitializerCodeBlock(clinit.instructions, constant, codeBlock);
    }

    /**
     * Wraps a set of instructions of the static initializer of an enum that initializes
     * an enum constant and assigns it to its field.
     */
    class ConstantInitializerCodeBlock {
        private final InsnList insnList;
        private final FieldNode constant;
        private final List<AbstractInsnNode> insns;

        /**
         * Instruction that pushes the name of the constant onto the stack
         */
        private LdcInsnNode pushNameInsn;

        /**
         * Instruction that pushes the ordinal of the constant onto the stack
         */
        private AbstractInsnNode pushOrdinalInsn;

        public ConstantInitializerCodeBlock(InsnList insnList, FieldNode constant, List<AbstractInsnNode> insns) {
            this.insnList = insnList;
            this.constant = constant;
            this.insns = insns;

            Iterator<AbstractInsnNode> iter = insns.iterator();

            AbstractInsnNode newInsn = iter.next();
            if (newInsn.getOpcode() != NEW) {
                throw new IllegalStateException("Expected NEW insn got \"" + AsmUtil.insnToString(newInsn) + "\"");
            }

            AbstractInsnNode dupInsn = iter.next();
            if (dupInsn.getOpcode() != DUP) {
                throw new IllegalStateException("Expected DUP insn got \"" + AsmUtil.insnToString(dupInsn) + "\"");
            }

            AbstractInsnNode pushNameInsn = iter.next();
            if (AsmUtil.isStringPush(pushNameInsn)) {
                this.pushNameInsn = (LdcInsnNode) pushNameInsn;
            } else {
                throw new IllegalStateException("Expected String push got \"" + AsmUtil.insnToString(pushNameInsn) + "\"");
            }

            this.pushOrdinalInsn = iter.next();
            if (!AsmUtil.isIntPush(this.pushOrdinalInsn)) {
                throw new IllegalStateException("Expected int push got \"" + AsmUtil.insnToString(this.pushOrdinalInsn) + "\"");
            }
        }

        public void setOrdinal(int ordinal) {
            AbstractInsnNode newInsn = AsmUtil.pushInt(ordinal);
            insnList.set(pushOrdinalInsn, newInsn);
            pushOrdinalInsn = newInsn;
        }

        public void setName(String newName) {
            pushNameInsn.cst = newName;
        }

        /**
         * Remove this code block form the static initializer
         */
        public void remove() {
            insns.stream().forEach(insnList::remove);
        }
    }

    /**
     * Find the code that initializes the values array.
     *
     * @param cn ClassNode of the enum
     * @param clinit static initializer of the enum
     * @param constants fields of all constants in the enum
     * @return code block that initializes the values array
     */
    private ValuesArrayInitializationCodeBlock getValueArrayInitialization(ClassNode cn, MethodNode clinit, List<FieldNode> constants) {
        for (AbstractInsnNode insn = clinit.instructions.getFirst(); insn != null; insn = insn.getNext()) {
            if (insn.getOpcode() == ANEWARRAY && ((TypeInsnNode) insn).desc.equals(cn.name)) {
                return new ValuesArrayInitializationCodeBlock(clinit.instructions, insn, constants);
            }
        }

        throw new IllegalStateException("Could not find creation of \"values\" array");
    }

    /**
     * Wraps the instructions that initialize the "values" array that contains all enum constants.
     */
    class ValuesArrayInitializationCodeBlock {
        private final InsnList insnList;

        /**
         * Instruction that pushed the size of the "values" array onto the stack
         */
        private AbstractInsnNode sizePushInsn;

        /**
         * A list of instructions that store the constants in the "values" array
         */
        private List<ValueAssignment> valueAssignments = new ArrayList<>();

        public ValuesArrayInitializationCodeBlock(InsnList insnList, AbstractInsnNode newArrayInsn, List<FieldNode> constants) {
            this.insnList = insnList;

            this.sizePushInsn = newArrayInsn.getPrevious();
            if (!AsmUtil.isIntPush(this.sizePushInsn)) {
                throw new IllegalStateException("Expected int push got \"" + AsmUtil.insnToString(this.sizePushInsn) + "\"");
            }

            AbstractInsnNode insn = newArrayInsn.getNext();
            loop: while (true) {
                switch (insn.getOpcode()) {
                    case DUP:
                        // An enum constant is stored in the array
                        AbstractInsnNode dupInsn = insn;

                        AbstractInsnNode indexPushInsn = insn = insn.getNext();
                        if (!AsmUtil.isIntPush(indexPushInsn)) {
                            throw new IllegalStateException("Expected int push got \"" + AsmUtil.insnToString(indexPushInsn) + "\"");
                        }

                        AbstractInsnNode constantAccess = insn = insn.getNext();
                        if (constantAccess.getOpcode() != GETSTATIC) {
                            throw new IllegalStateException("Expected access of constant got \"" + AsmUtil.insnToString(constantAccess) + "\"");
                        }
                        String constantName = ((FieldInsnNode) constantAccess).name;
                        FieldNode constant = constants.stream()
                                .filter(fn -> fn.name.equals(constantName))
                                .findAny().get();

                        AbstractInsnNode arrayStore = insn = insn.getNext();
                        if (arrayStore.getOpcode() != AASTORE) {
                            throw new IllegalStateException("Expected AASTORE got \"" + AsmUtil.insnToString(insn) + "\"");
                        }

                        List<AbstractInsnNode> insns = new ArrayList<>(
                                Arrays.asList(dupInsn, indexPushInsn, constantAccess, arrayStore));
                        valueAssignments.add(new ValueAssignment(insns, constant, indexPushInsn));

                        insn = insn.getNext();
                        break;

                    case PUTSTATIC:
                        // assignment of array to value field
                        break loop;

                    default:
                        throw new IllegalStateException("Expected DUP or PUTSTATIC but got \"" + AsmUtil.insnToString(insn) + "\"");
                }
            }
        }

        /**
         * Change the size of the "values" array.
         *
         * @param size the new size
         */
        public void setArraySize(int size) {
            AbstractInsnNode newPush = AsmUtil.pushInt(size);
            insnList.set(this.sizePushInsn, newPush);
            this.sizePushInsn = newPush;
        }

        /**
         * Get the instructions that adds a certain constant to the "values" array
         *
         * @param constant that the requested code block stores in the array
         * @return code that stores the constant in the array
         */
        public ValueAssignment getAssignment(FieldNode constant) {
            return valueAssignments.stream()
                    .filter(assignment -> assignment.constant == constant)
                    .findAny().get();
        }

        /**
         * Wraps the instructions that store one constant in the value array
         */
        class ValueAssignment {
            private final List<AbstractInsnNode> insns;
            private final FieldNode constant;

            /**
             * Instruction that pushed the index in the values array
             */
            private AbstractInsnNode indexPushInsn;

            public ValueAssignment(List<AbstractInsnNode> insns, FieldNode constant, AbstractInsnNode indexPushInsn) {
                this.insns = insns;
                this.constant = constant;
                this.indexPushInsn = indexPushInsn;
            }

            /**
             * Get the index in the "values" array in which this code block stores the constant.
             *
             * @return index in "values" array
             */
            public int getIndex() {
                return AsmUtil.getPushedInt(indexPushInsn);
            }

            /**
             * Change the index under which the constant is stored in the "values" array
             *
             * @param index the new index
             */
            public void setIndex(int index) {
                AbstractInsnNode newPush = AsmUtil.pushInt(index);
                insnList.set(this.indexPushInsn, newPush);
                this.indexPushInsn = newPush;
            }

            /**
             * Remove this code block from the static initializer
             */
            public void remove() {
                insns.stream().forEach(insnList::remove);
                valueAssignments.remove(this);
            }
        }
    }
}
