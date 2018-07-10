package net.glowstone.linkstone.runtime.direct;

import net.glowstone.linkstone.runtime.FieldSet;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

import static org.objectweb.asm.Opcodes.*;

/**
 * Visitor that replaces field accessing bytecode instructions
 * against invokes of the corresponding getters and setters.
 */
public class DirectFieldAccessReplaceVisitor extends ClassVisitor {
    private static final String GETTER_PREFIX = "$linkstone$getter$";
    private static final String SETTER_PREFIX = "$linkstone$setter$";

    private final FieldSet fieldsToReplace;
    private String classname;

    /**
     * @param fieldsToReplace all fields whose accesses will be replaced
     *                       against getter and setter invokes
     */
    public DirectFieldAccessReplaceVisitor(FieldSet fieldsToReplace) {
        this(fieldsToReplace, null);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(version, access, name, signature, superName, interfaces);
        this.classname = name;
    }

    /**
     * @param fieldsToReplace all fields whose accesses will be replaced
     *                       against getter and setter invokes
     */
    public DirectFieldAccessReplaceVisitor(FieldSet fieldsToReplace, ClassVisitor cv) {
        super(ASM6, cv);
        this.fieldsToReplace = fieldsToReplace;
    }

    @Override
    public MethodVisitor visitMethod(int mAccess, String mName, String mDescriptor, String mSignature, String[] mExceptions) {
        MethodVisitor mv = super.visitMethod(mAccess, mName, mDescriptor, mSignature, mExceptions);
        mv = new MethodVisitor(api, mv) {
            @Override
            public void visitFieldInsn(int opcode, String fOwner, String fName, String fDescriptor) {
                if (fieldsToReplace.contains(fOwner, fName, fDescriptor)) {
                    AccessorType accessor = isSelfAccessor(classname, mName, mDescriptor, fOwner, fName, fDescriptor);

                    switch (opcode) {
                        case GETFIELD:
                        case GETSTATIC: {
                            if (accessor == AccessorType.GETTER) {
                                break;
                            }

                            int invokeOpcode = opcode == GETSTATIC ? INVOKESTATIC : INVOKEVIRTUAL;
                            String methodDescriptor = Type.getMethodDescriptor(Type.getType(fDescriptor));
                            super.visitMethodInsn(invokeOpcode, fOwner, GETTER_PREFIX + fName, methodDescriptor, false);
                            return;
                        }

                        case PUTFIELD:
                        case PUTSTATIC: {
                            if (accessor == AccessorType.SETTER) {
                                break;
                            }

                            int invokeOpcode = opcode == PUTSTATIC ? INVOKESTATIC : INVOKEVIRTUAL;
                            String methodDescriptor = Type.getMethodDescriptor(Type.VOID_TYPE, Type.getType(fDescriptor));
                            super.visitMethodInsn(invokeOpcode, fOwner, SETTER_PREFIX + fName, methodDescriptor, false);
                            return;
                        }
                    }
                }

                super.visitFieldInsn(opcode, fOwner, fName, fDescriptor);
            }
        };
        return mv;
    }

    /**
     * Check whether a method is a getter or setter for a field.
     *
     * @param mOwner class containing method
     * @param mName name of method
     * @param mDesc descriptor of method
     * @param fOwner class containing field
     * @param fName name of field
     * @param fDesc descriptor of field
     * @return whether the method is a getter or setter for the field.
     */
    private AccessorType isSelfAccessor(String mOwner, String mName, String mDesc,
                                        String fOwner, String fName, String fDesc) {
        if (mOwner.equals(fOwner)) {
            boolean isGetter = mName.equals(GETTER_PREFIX + fName) && mDesc.equals("()" + fDesc);
            if (isGetter) {
                return AccessorType.GETTER;
            }

            boolean isSetter = mName.equals(SETTER_PREFIX + fName) && mDesc.equals("(" + fDesc + ")V");
            if (isSetter) {
                return AccessorType.SETTER;
            }
        }

        return null;
    }

    enum AccessorType {
        GETTER, SETTER;
    }
}
