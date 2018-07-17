package net.glowstone.linkstone.runtime.reflectionredirect.method;

import static org.objectweb.asm.Opcodes.*;

import org.objectweb.asm.*;

/**
 * Generate the bytecode for a adapter for the MethodAccessor type used in the reflection api
 * that delegates invokes to a {@link LMethodAccessor}.
 */
public class JMethodAccessorAdapterGenerator {
    public static final String CLASS_NAME = "net/glowstone/linkstone/$generated$accessors$adapters$/JMethodAccessorWrapper";

    public static final Type JDK_METHOD_ACCESSOR;
    public static final Type LINKSTONE_METHOD_ACCESSOR = Type.getType(LMethodAccessor.class);

    private static final String DELEGATEE_FIELD = "wrappedField";

    static {
        String accessorClass;
        try {
            Class.forName("sun.reflect.MethodAccessor");
            accessorClass = "sun/reflect/MethodAccessor";
        } catch (Exception e) {
            accessorClass = "jdk/internal/reflect/MethodAccessor";
        }
        JDK_METHOD_ACCESSOR = Type.getObjectType(accessorClass);
    }

    public byte[] generate() {
        ClassWriter cw = new ClassWriter(0);
        ClassVisitor cv = cw;
        cv.visit(V1_7, ACC_PUBLIC, CLASS_NAME, null, "java/lang/Object",
                new String[] { JDK_METHOD_ACCESSOR.getInternalName() });

        visitDelegateeField(cv);
        visitConstructor(cv);
        visitInvokeMethod(cv);

        cv.visitEnd();
        return cw.toByteArray();
    }

    private void visitDelegateeField(ClassVisitor cv) {
        FieldVisitor fv = cv.visitField(ACC_PRIVATE, DELEGATEE_FIELD, LINKSTONE_METHOD_ACCESSOR.getDescriptor(), null, null);
        fv.visitEnd();
    }

    private void visitConstructor(ClassVisitor cv) {
        String descriptor = "(" + LINKSTONE_METHOD_ACCESSOR.getDescriptor() +")V";
        MethodVisitor mv = cv.visitMethod(ACC_PUBLIC, "<init>", descriptor, null, null);
        mv.visitCode();

        mv.visitIntInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);

        mv.visitIntInsn(ALOAD, 0);
        mv.visitIntInsn(ALOAD, 1);
        mv.visitFieldInsn(PUTFIELD, CLASS_NAME, DELEGATEE_FIELD, LINKSTONE_METHOD_ACCESSOR.getDescriptor());
        mv.visitInsn(RETURN);

        mv.visitMaxs(2, 2);
        mv.visitEnd();
    }

    private void visitInvokeMethod(ClassVisitor cv) {
        String descriptor = "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;";
        MethodVisitor mv = cv.visitMethod(ACC_PUBLIC, "invoke", descriptor, null, null);
        mv.visitCode();

        mv.visitIntInsn(ALOAD, 0);
        mv.visitFieldInsn(GETFIELD, CLASS_NAME, DELEGATEE_FIELD, LINKSTONE_METHOD_ACCESSOR.getDescriptor());

        mv.visitIntInsn(ALOAD, 1);
        mv.visitIntInsn(ALOAD, 2);
        mv.visitMethodInsn(INVOKEINTERFACE, LINKSTONE_METHOD_ACCESSOR.getInternalName(), "invoke", descriptor, true);
        mv.visitInsn(ARETURN);

        mv.visitMaxs(3, 3);
        mv.visitEnd();
    }
}
