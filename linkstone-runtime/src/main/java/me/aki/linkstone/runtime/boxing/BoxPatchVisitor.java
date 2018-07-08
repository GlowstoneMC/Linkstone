package me.aki.linkstone.runtime.boxing;

import static org.objectweb.asm.Opcodes.*;
import me.aki.linkstone.annotations.LBox;
import me.aki.linkstone.runtime.BoxCache;
import me.aki.linkstone.runtime.Boxes;
import org.objectweb.asm.*;

/**
 * Visitor that replaces casts to a type annotated as {@link LBox} against
 * the initialization of that box.
 */
public class BoxPatchVisitor extends ClassVisitor {
    private static final Type BOX_CACHE_TYPE = Type.getType(BoxCache.class);
    private final Boxes boxes;

    public BoxPatchVisitor(Boxes boxes) {
        this(boxes, null);
    }

    public BoxPatchVisitor(Boxes boxes, ClassVisitor cv) {
        super(ASM6, cv);
        this.boxes = boxes;
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
        mv = new MethodVisitor(api, mv) {
            // Since the BoxCache.box method is generic it will insert a CHECKCAST to the box type after the invoke.
            // This will not break the code but is suboptimal, so let's try to avoid it!
            private boolean preceededByBoxCall = false;

            @Override
            public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
                super.visitMethodInsn(opcode, owner, name, descriptor, isInterface);

                preceededByBoxCall = name.equals("box") &&
                        owner.equals(BOX_CACHE_TYPE.getInternalName()) &&
                        descriptor.equals("(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;");
            }

            @Override
            public void visitTypeInsn(int opcode, String type) {
                if (!preceededByBoxCall && opcode == CHECKCAST) {
                    Type boxType = Type.getObjectType(type);
                    Type boxedType = boxes.getBoxedType(boxType);
                    if (boxedType != null) {
                        super.visitLdcInsn(boxType);
                        super.visitMethodInsn(INVOKESTATIC, "me/aki/linkstone/runtime/BoxCache", "box",
                                "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", false);
                        super.visitTypeInsn(CHECKCAST, boxType.getInternalName());
                        return;
                    }
                }

                super.visitTypeInsn(opcode, type);
                preceededByBoxCall = false;
            }

            @Override
            public void visitInsn(int opcode) {
                super.visitInsn(opcode);
                preceededByBoxCall = false;
            }

            @Override
            public void visitIntInsn(int opcode, int operand) {
                super.visitIntInsn(opcode, operand);
                preceededByBoxCall = false;
            }

            @Override
            public void visitVarInsn(int opcode, int var) {
                super.visitVarInsn(opcode, var);
                preceededByBoxCall = false;
            }

            @Override
            public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
                super.visitFieldInsn(opcode, owner, name, descriptor);
                preceededByBoxCall = false;
            }

            @Override
            public void visitInvokeDynamicInsn(String name, String descriptor, Handle bootstrapMethodHandle, Object... bootstrapMethodArguments) {
                super.visitInvokeDynamicInsn(name, descriptor, bootstrapMethodHandle, bootstrapMethodArguments);
                preceededByBoxCall = false;
            }

            @Override
            public void visitJumpInsn(int opcode, Label label) {
                super.visitJumpInsn(opcode, label);
                preceededByBoxCall = false;
            }

            @Override
            public void visitLdcInsn(Object value) {
                super.visitLdcInsn(value);
                preceededByBoxCall = false;
            }

            @Override
            public void visitIincInsn(int var, int increment) {
                super.visitIincInsn(var, increment);
                preceededByBoxCall = false;
            }

            @Override
            public void visitTableSwitchInsn(int min, int max, Label dflt, Label... labels) {
                super.visitTableSwitchInsn(min, max, dflt, labels);
                preceededByBoxCall = false;
            }

            @Override
            public void visitLookupSwitchInsn(Label dflt, int[] keys, Label[] labels) {
                super.visitLookupSwitchInsn(dflt, keys, labels);
                preceededByBoxCall = false;
            }

            @Override
            public void visitMultiANewArrayInsn(String descriptor, int numDimensions) {
                super.visitMultiANewArrayInsn(descriptor, numDimensions);
                preceededByBoxCall = false;
            }
        };
        return mv;
    }
}
