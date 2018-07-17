package net.glowstone.linkstone.runtime.reflectionredirect.field;

import org.objectweb.asm.*;

import static org.objectweb.asm.Opcodes.*;

/**
 * Generate an adapter for {@link LFieldAccessor} that delegates all invokes to a FieldAccessor
 * as used within the reflection api.
 */
public class LFieldAccessorAdapterGenerator {
    public static final String CLASS_NAME = "net/glowstone/linkstone/$generated$accessors$adapters$/LFieldAccessorWrapper";
    private static final String DELEGATEE_FIELD = "wrappedField";

    public static final Type JDK_FIELD_ACCESSOR;
    public static final Type LINKSTONE_FIELD_ACCESSOR = Type.getType(LFieldAccessor.class);

    static {
        String accessorClass;
        try {
            Class.forName("sun.reflect.FieldAccessor");
            accessorClass = "sun/reflect/FieldAccessor";
        } catch (Exception e) {
            accessorClass = "jdk/internal/reflect/FieldAccessor";
        }
        JDK_FIELD_ACCESSOR = Type.getObjectType(accessorClass);
    }

    public byte[] generate() {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        ClassVisitor cv = cw;
        cv.visit(V1_7, ACC_PUBLIC, CLASS_NAME, null, "java/lang/Object",
                new String[] { LINKSTONE_FIELD_ACCESSOR.getInternalName() });

        visitDelegateField(cv);
        visitConstructor(cv);

        visitDelegatedGetter(cv, "get", Type.getType(Object.class));
        visitDelegatedGetter(cv, "getBoolean", Type.BOOLEAN_TYPE);
        visitDelegatedGetter(cv, "getByte", Type.BYTE_TYPE);
        visitDelegatedGetter(cv, "getChar", Type.CHAR_TYPE);
        visitDelegatedGetter(cv, "getShort", Type.SHORT_TYPE);
        visitDelegatedGetter(cv, "getInt", Type.INT_TYPE);
        visitDelegatedGetter(cv, "getLong", Type.LONG_TYPE);
        visitDelegatedGetter(cv, "getFloat", Type.FLOAT_TYPE);
        visitDelegatedGetter(cv, "getDouble", Type.DOUBLE_TYPE);

        visitDelegatedSetter(cv, "set", Type.getType(Object.class));
        visitDelegatedSetter(cv, "setBoolean", Type.BOOLEAN_TYPE);
        visitDelegatedSetter(cv, "setByte", Type.BYTE_TYPE);
        visitDelegatedSetter(cv, "setChar", Type.CHAR_TYPE);
        visitDelegatedSetter(cv, "setShort", Type.SHORT_TYPE);
        visitDelegatedSetter(cv, "setInt", Type.INT_TYPE);
        visitDelegatedSetter(cv, "setLong", Type.LONG_TYPE);
        visitDelegatedSetter(cv, "setFloat", Type.FLOAT_TYPE);
        visitDelegatedSetter(cv, "setDouble", Type.DOUBLE_TYPE);

        return cw.toByteArray();
    }

    private void visitDelegateField(ClassVisitor cv) {
        FieldVisitor fv = cv.visitField(ACC_PUBLIC, DELEGATEE_FIELD, JDK_FIELD_ACCESSOR.getDescriptor(), null, null);
        fv.visitEnd();
    }

    private void visitConstructor(ClassVisitor cv) {
        String descriptor = "(" + JDK_FIELD_ACCESSOR.getDescriptor() + ")V";
        MethodVisitor mv = cv.visitMethod(ACC_PUBLIC, "<init>", descriptor, null, null);
        mv.visitCode();

        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);

        mv.visitVarInsn(ALOAD, 0);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitFieldInsn(PUTFIELD, CLASS_NAME, DELEGATEE_FIELD, JDK_FIELD_ACCESSOR.getDescriptor());

        mv.visitInsn(RETURN);

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private void visitDelegatedGetter(ClassVisitor cv, String getterName, Type type) {
        String descriptor = "(Ljava/lang/Object;)" + type.getDescriptor();
        MethodVisitor mv = cv.visitMethod(ACC_PUBLIC, getterName, descriptor, null, null);
        mv.visitCode();

        mv.visitVarInsn(ALOAD, 0);
        mv.visitFieldInsn(GETFIELD, CLASS_NAME, DELEGATEE_FIELD, JDK_FIELD_ACCESSOR.getDescriptor());

        mv.visitVarInsn(ALOAD, 1);

        mv.visitMethodInsn(INVOKEINTERFACE, JDK_FIELD_ACCESSOR.getInternalName(), getterName, descriptor, true);

        switch (type.getSort()) {
            case Type.BOOLEAN:
            case Type.BYTE:
            case Type.CHAR:
            case Type.SHORT:
            case Type.INT:
                mv.visitInsn(IRETURN);
                break;

            case Type.LONG:
                mv.visitInsn(LRETURN);
                break;

            case Type.FLOAT:
                mv.visitInsn(FRETURN);
                break;

            case Type.DOUBLE:
                mv.visitInsn(DRETURN);
                break;

            default:
                mv.visitInsn(ARETURN);
                break;
        }

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private void visitDelegatedSetter(ClassVisitor cv, String setterName, Type type) {
        String descriptor = "(Ljava/lang/Object;" + type.getDescriptor() + ")V";
        MethodVisitor mv = cv.visitMethod(ACC_PUBLIC, setterName, descriptor, null, null);
        mv.visitCode();

        mv.visitVarInsn(ALOAD, 0);
        mv.visitFieldInsn(GETFIELD, CLASS_NAME, DELEGATEE_FIELD, JDK_FIELD_ACCESSOR.getDescriptor());

        mv.visitVarInsn(ALOAD, 1);

        switch (type.getSort()) {
            case Type.BOOLEAN:
            case Type.BYTE:
            case Type.CHAR:
            case Type.SHORT:
            case Type.INT:
                mv.visitVarInsn(ILOAD, 2);
                break;

            case Type.LONG:
                mv.visitVarInsn(LLOAD, 2);
                break;

            case Type.FLOAT:
                mv.visitVarInsn(FLOAD, 2);
                break;

            case Type.DOUBLE:
                mv.visitVarInsn(DLOAD, 2);
                break;

            default:
                mv.visitVarInsn(ALOAD, 2);
                break;
        }

        mv.visitMethodInsn(INVOKEINTERFACE, JDK_FIELD_ACCESSOR.getInternalName(), setterName, descriptor, true);
        mv.visitInsn(RETURN);

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }
}
