package me.aki.linkstone.runtime.direct;

import me.aki.linkstone.runtime.FieldSet;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

import static org.objectweb.asm.Opcodes.*;

/**
 * Visitor that replaces field accessing bytecode instructions
 * against invokes of the corresponding getters and setters.
 */
public class DirectFieldAccessReplaceVisitor extends ClassVisitor {
    private final FieldSet fieldsToReplace;

    /**
     * @param fieldsToReplace all fields whose accesses will be replaced
     *                       against getter and setter invokes
     */
    public DirectFieldAccessReplaceVisitor(FieldSet fieldsToReplace) {
        this(fieldsToReplace, null);
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
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
        mv = new MethodVisitor(api, mv) {
            @Override
            public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
                if(fieldsToReplace.contains(owner, name, descriptor)) {
                    switch (opcode) {
                        case GETFIELD:
                        case GETSTATIC: {
                            int invokeOpcode = opcode == GETSTATIC ? INVOKESTATIC : INVOKEVIRTUAL;
                            String methodDescriptor = Type.getMethodDescriptor(Type.getType(descriptor));
                            super.visitMethodInsn(invokeOpcode, owner, "$linkstone$getter$" + name, methodDescriptor, false);
                            break;
                        }

                        case PUTFIELD:
                        case PUTSTATIC: {
                            int invokeOpcode = opcode == PUTSTATIC ? INVOKESTATIC : INVOKEVIRTUAL;
                            String methodDescriptor = Type.getMethodDescriptor(Type.VOID_TYPE, Type.getType(descriptor));
                            super.visitMethodInsn(invokeOpcode, owner, "$linkstone$setter$" + name, methodDescriptor, false);
                            break;
                        }
                    }
                } else {
                    super.visitFieldInsn(opcode, owner, name, descriptor);
                }
            }
        };
        return mv;
    }
}
