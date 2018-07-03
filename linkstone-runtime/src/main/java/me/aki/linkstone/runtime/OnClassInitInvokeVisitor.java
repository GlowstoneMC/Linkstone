package me.aki.linkstone.runtime;

import static org.objectweb.asm.Opcodes.*;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

import java.lang.reflect.Method;

/**
 * ClassVisitor that prepends a invoke of a static method in the &lt;clinit&gt; method.
 *
 * The static method must be of void type and take one parameter of type {@link java.lang.Class}.
 */
public class OnClassInitInvokeVisitor extends ClassVisitor {
    private final Method method;
    private boolean wasClInitVisited = false;
    private String className;

    public OnClassInitInvokeVisitor(Method method) {
        this(method, null);
    }

    public OnClassInitInvokeVisitor(Method method, ClassVisitor cv) {
        super(ASM6, cv);
        this.method = method;
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(version, access, name, signature, superName, interfaces);
        this.className = name;
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
        if(name.equals("<clinit>")) {
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
            MethodVisitor mv = visitMethod(ACC_PUBLIC | ACC_STATIC, "<clinit>", "()V", null, null);
            mv.visitCode();

            insertInvoke(mv);
            mv.visitInsn(RETURN);

            mv.visitMaxs(1, 0);
            mv.visitEnd();
        }
        super.visitEnd();
    }

    private void insertInvoke(MethodVisitor mv) {
        mv.visitLdcInsn('L' + this.className + ';');

        boolean isInterface = method.getDeclaringClass().isInterface();
        String className = Type.getInternalName(method.getDeclaringClass());
        mv.visitMethodInsn(INVOKESTATIC, className, method.getName(), "(Ljava/lang/Class;)V", isInterface);
    }
}
