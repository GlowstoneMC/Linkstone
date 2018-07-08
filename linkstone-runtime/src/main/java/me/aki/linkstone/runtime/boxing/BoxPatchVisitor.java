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
            @Override
            public void visitTypeInsn(int opcode, String type) {
                if (opcode == CHECKCAST) {
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
            }
        };
        return mv;
    }
}
