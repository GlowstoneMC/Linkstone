package net.glowstone.linkstone.runtime.reflectionredirect.field;

import org.objectweb.asm.*;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.objectweb.asm.Opcodes.*;

/**
 * Generate an implementation of a {@link LFieldAccessor} that invokes the getter and setter.
 */
public class RedirectFieldAccessorGenerator {
    private final Field field;
    private final String className;

    public RedirectFieldAccessorGenerator(Field field) {
        this.field = field;

        String escapedClassName = field.getDeclaringClass().getName().replace('.', '$');
        this.className = "net/glowstone/linkstone/$generated$accessors$/" + escapedClassName + "/" + field.getName();
    }

    public String getClassName() {
        return className;
    }

    public byte[] generateAccessor() {
        ClassWriter cv = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cv.visit(V1_7, ACC_PUBLIC, className, null, "java/lang/Object",
                new String[] { Type.getInternalName(LFieldAccessor.class) });

        visitConstructor(cv);

        visitDefaultGetter(cv);
        visitDefaultSetter(cv);

        visitGetterAndSetter(cv, boolean.class);
        visitGetterAndSetter(cv, byte.class);
        visitGetterAndSetter(cv, char.class);
        visitGetterAndSetter(cv, short.class);
        visitGetterAndSetter(cv, int.class);
        visitGetterAndSetter(cv, long.class);
        visitGetterAndSetter(cv, float.class);
        visitGetterAndSetter(cv, double.class);

        cv.visitEnd();
        return cv.toByteArray();
    }

    private void visitConstructor(ClassVisitor cv) {
        MethodVisitor mv = cv.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
        mv.visitCode();

        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        mv.visitInsn(RETURN);

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private void visitDefaultGetter(ClassVisitor cv) {
        Method method = new Method("get", "(Ljava/lang/Object;)Ljava/lang/Object;");
        Type[] exceptions = new Type[] { Type.getObjectType("java/lang/IllegalArgumentException") };
        GeneratorAdapter mv = new GeneratorAdapter(ACC_PUBLIC, method, null, exceptions, cv);
        mv.visitCode();

        if (!Modifier.isStatic(field.getModifiers())){
            mv.loadArg(0);
            mv.checkCast(Type.getType(field.getDeclaringClass()));
        }


        invokeGetter(mv);

        if (field.getType().isPrimitive()) {
            mv.box(Type.getType(field.getType()));
        }

        mv.returnValue();

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private void visitDefaultSetter(ClassVisitor cv) {
        Method method = new Method("set", "(Ljava/lang/Object;Ljava/lang/Object;)V");
        Type[] exceptions = new Type[] { Type.getObjectType("java/lang/IllegalArgumentException"),
                Type.getObjectType("java/lang/IllegalAccessException") };
        GeneratorAdapter mv = new GeneratorAdapter(ACC_PUBLIC, method, null, exceptions, cv);
        mv.visitCode();

        if (!Modifier.isStatic(field.getModifiers())) {
            mv.loadArg(0);
            mv.checkCast(Type.getType(field.getDeclaringClass()));
        }

        mv.loadArg(1);
        mv.checkCast(Type.getType(field.getType()));

        if (field.getType().isPrimitive()) {
            mv.unbox(Type.getType(field.getType()));
        }

        invokeSetter(mv);

        mv.visitInsn(RETURN);

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private void visitGetterAndSetter(ClassVisitor cv, Class<?> type) {
        visitGetter(cv, type);
        visitSetter(cv, type);
    }

    private void visitGetter(ClassVisitor cv, Class<?> type) {
        String primitiveTypeDesc = Type.getDescriptor(type);
        String primitiveTypeName = type.getName();
        String methodName = "get" + Character.toUpperCase(primitiveTypeName.charAt(0)) + primitiveTypeName.substring(1);
        Method method = new Method(methodName, "(Ljava/lang/Object;)" + primitiveTypeDesc);

        Type[] exceptions = new Type[] { Type.getObjectType("java/lang/IllegalArgumentException") };
        GeneratorAdapter mv = new GeneratorAdapter(ACC_PUBLIC, method, null, exceptions, cv);
        mv.visitCode();

        if (type.equals(field.getType())) {
            if (!Modifier.isStatic(field.getModifiers())) {
                mv.loadArg(0);
                mv.checkCast(Type.getType(field.getDeclaringClass()));
            }

            invokeGetter(mv);

            mv.returnValue();
        } else {
            String fieldType = field.getType().getName();
            String fieldPath = field.getDeclaringClass().getName() + "." + field.getName();
            String errorMessage = "Attempt to get " + fieldType + " field \"" + fieldPath + "\" with illegal data type " + primitiveTypeName;

            mv.throwException(Type.getObjectType("java/lang/IllegalArgumentException"), errorMessage);
        }

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private void visitSetter(ClassVisitor cv, Class<?> primitiveType) {
        String primitiveTypeName = primitiveType.getName();
        String primitiveTypeDesc = Type.getDescriptor(primitiveType);
        String methodName = "set" + Character.toUpperCase(primitiveTypeName.charAt(0)) + primitiveTypeName.substring(1);
        Method method = new Method(methodName, "(Ljava/lang/Object;" + primitiveTypeDesc + ")V");

        Type[] exceptions = new Type[] { Type.getObjectType("java/lang/IllegalArgumentException"),
                Type.getObjectType("java/lang/IllegalAccessException") };
        GeneratorAdapter mv = new GeneratorAdapter(ACC_PUBLIC, method,null, exceptions, cv);

        mv.visitCode();

        if (field.getType().equals(primitiveType)) {
            if (!Modifier.isStatic(field.getModifiers())) {
                mv.loadArg(0);
                mv.checkCast(Type.getType(field.getDeclaringClass()));
            }

            mv.loadArg(1);

            invokeSetter(mv);

            mv.returnValue();
        } else {
            String fieldType = field.getType().getName();
            String fieldPath = field.getDeclaringClass().getName() + "." + field.getName();
            String errorMessage = "Attempt to set " + fieldType + " field \"" + fieldPath + "\" with illegal data type " + primitiveTypeName;

            mv.throwException(Type.getObjectType("java/lang/IllegalArgumentException"), errorMessage);
        }

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private void invokeGetter(MethodVisitor mv) {
        int invokeOpcode = Modifier.isStatic(field.getModifiers()) ? INVOKESTATIC : INVOKEVIRTUAL;
        String fieldOwner = Type.getInternalName(field.getDeclaringClass());
        String getterName = "$linkstone$getter$" + field.getName();
        String getterDesc = "()" + Type.getDescriptor(field.getType());
        mv.visitMethodInsn(invokeOpcode, fieldOwner, getterName, getterDesc, false);
    }

    private void invokeSetter(MethodVisitor mv) {
        int invokeOpcode = Modifier.isStatic(field.getModifiers()) ? INVOKESTATIC : INVOKEVIRTUAL;
        String fieldOwner = Type.getInternalName(field.getDeclaringClass());
        String setterName = "$linkstone$setter$" + field.getName();
        String setterDesc = "(" + Type.getDescriptor(field.getType()) + ")V";
        mv.visitMethodInsn(invokeOpcode, fieldOwner, setterName, setterDesc, false);
    }
}
