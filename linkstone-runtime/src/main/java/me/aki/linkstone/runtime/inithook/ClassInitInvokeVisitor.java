package me.aki.linkstone.runtime.inithook;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

import static org.objectweb.asm.Opcodes.*;

/**
 * {@link ClassVisitor} that lets a class call a {@link ClassInitHook}.
 *
 * A invoke of {@link ClassInitHook#call(Class)} will be inserted in the static initializer.
 * If no static initializer exists, one will be created.
 */
public class ClassInitInvokeVisitor extends ClassVisitor {
    private boolean wasClInitVisited = false;
    private String className;

    public ClassInitInvokeVisitor(ClassVisitor cv) {
        super(ASM6, cv);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(version, access, name, signature, superName, interfaces);
        this.className = name;
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
        if(!wasClInitVisited && name.equals("<clinit>")) {
            mv = new MethodVisitor(api, mv) {
                @Override
                public void visitCode() {
                    super.visitCode();
                    insertInvoke(mv);
                }

                @Override
                public void visitMaxs(int maxStack, int maxLocals) {
                    super.visitMaxs(Math.max(maxStack, 1), maxLocals);
                }
            };
            wasClInitVisited = true;
        }
        return mv;
    }

    @Override
    public void visitEnd() {
        if(!wasClInitVisited) {
            MethodVisitor mv = super.visitMethod(ACC_PUBLIC | ACC_STATIC, "<clinit>", "()V", null, null);
            mv.visitCode();

            insertInvoke(mv);
            mv.visitInsn(RETURN);

            mv.visitMaxs(1, 0);
            mv.visitEnd();
        }

        super.visitEnd();
    }

    private void insertInvoke(MethodVisitor mv) {
        mv.visitLdcInsn(Type.getObjectType(this.className));

        mv.visitMethodInsn(INVOKESTATIC, Type.getInternalName(ClassInitHook.class), "call",
                "(Ljava/lang/Class;)V", false);
    }
}
