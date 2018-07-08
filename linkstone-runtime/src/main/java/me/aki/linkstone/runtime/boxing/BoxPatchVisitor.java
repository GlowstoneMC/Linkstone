package me.aki.linkstone.runtime.boxing;

import static org.objectweb.asm.Opcodes.*;
import me.aki.linkstone.annotations.Box;
import me.aki.linkstone.runtime.Boxes;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

/**
 * Visitor that replaces casts to a type annotated as {@link Box} against
 * the initialization of that box.
 */
public class BoxPatchVisitor extends ClassVisitor {
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
            @Override
            public void visitTypeInsn(int opcode, String type) {
                if (opcode == CHECKCAST) {
                    Type boxType = Type.getObjectType(type);
                    Type boxedType = boxes.getBoxedType(boxType);
                    if (boxedType != null) {
                        String desc = Type.getMethodDescriptor(boxType, Type.getObjectType("java/lang/Object"));
                        super.visitMethodInsn(INVOKESTATIC, type, "$linkstone$box$init$", desc, false);
                        return;
                    }
                }

                super.visitTypeInsn(opcode, type);
            }
        };
        return mv;
    }
}
