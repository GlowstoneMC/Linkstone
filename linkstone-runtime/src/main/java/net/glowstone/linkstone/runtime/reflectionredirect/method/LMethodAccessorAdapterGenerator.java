package net.glowstone.linkstone.runtime.reflectionredirect.method;

import net.glowstone.linkstone.runtime.reflectionredirect.ClassSource;
import org.objectweb.asm.*;

import static org.objectweb.asm.Opcodes.*;
import static net.glowstone.linkstone.runtime.reflectionredirect.method.JMethodAccessorAdapterGenerator.*;

/**
 * Generate the bytecode for a adapter for {@link LMethodAccessor} that delegates invokes to a
 * MethodAccessor used in the reflection api.
 */
public class LMethodAccessorAdapterGenerator implements ClassSource {
    public static final String JVM_CLASS_NAME = "net/glowstone/linkstone/$generated$accessors$adapters$/LMethodAccessorWrapper";
    public static final String JAVA_CLASS_NAME = JMethodAccessorAdapterGenerator.JVM_CLASS_NAME.replace('/', '.');

    public static final String DELEGATEE_FIELD = "wrappedField";

    @Override
    public String getClassName() {
        return JAVA_CLASS_NAME;
    }

    @Override
    public byte[] getBytecode() {
        ClassWriter cw = new ClassWriter(0);
        ClassVisitor cv = cw;
        cv.visit(V1_7, ACC_PUBLIC, JVM_CLASS_NAME, null, "java/lang/Object",
                new String[] { LINKSTONE_METHOD_ACCESSOR.getInternalName() });

        visitDelegateeField(cv);
        visitConstructor(cv);
        visitInvokeMethod(cv);

        cv.visitEnd();
        return cw.toByteArray();
    }

    private void visitDelegateeField(ClassVisitor cv) {
        FieldVisitor fv = cv.visitField(ACC_PRIVATE, DELEGATEE_FIELD, JDK_METHOD_ACCESSOR.getDescriptor(), null, null);
        fv.visitEnd();
    }

    private void visitConstructor(ClassVisitor cv) {
        String descriptor = "(" + JDK_METHOD_ACCESSOR.getDescriptor() +")V";
        MethodVisitor mv = cv.visitMethod(ACC_PUBLIC, "<init>", descriptor, null, null);
        mv.visitCode();

        mv.visitIntInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);

        mv.visitIntInsn(ALOAD, 0);
        mv.visitIntInsn(ALOAD, 1);
        mv.visitFieldInsn(PUTFIELD, JVM_CLASS_NAME, DELEGATEE_FIELD, JDK_METHOD_ACCESSOR.getDescriptor());
        mv.visitInsn(RETURN);

        mv.visitMaxs(2, 2);
        mv.visitEnd();
    }

    private void visitInvokeMethod(ClassVisitor cv) {
        String descriptor = "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;";
        MethodVisitor mv = cv.visitMethod(ACC_PUBLIC, "invoke", descriptor, null, null);
        mv.visitCode();

        mv.visitIntInsn(ALOAD, 0);
        mv.visitFieldInsn(GETFIELD, JVM_CLASS_NAME, DELEGATEE_FIELD, JDK_METHOD_ACCESSOR.getDescriptor());

        mv.visitIntInsn(ALOAD, 1);
        mv.visitIntInsn(ALOAD, 2);
        mv.visitMethodInsn(INVOKEINTERFACE, JDK_METHOD_ACCESSOR.getInternalName(), "invoke", descriptor, true);
        mv.visitInsn(ARETURN);

        mv.visitMaxs(3, 3);
        mv.visitEnd();
    }
}
