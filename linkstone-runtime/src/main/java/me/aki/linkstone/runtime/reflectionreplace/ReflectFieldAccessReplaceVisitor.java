package me.aki.linkstone.runtime.reflectionreplace;

import me.aki.linkstone.runtime.FieldAccessBus;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

import java.lang.reflect.Field;

import static org.objectweb.asm.Opcodes.*;

/**
 * Visitor that replaces calls of get and set methods on a {@link Field}
 * against invokes on the {@link FieldAccessBus#getField(Field, Object)}
 * and {@link FieldAccessBus#setField(Field, Object, Object)} methods.
 */
public class ReflectFieldAccessReplaceVisitor extends ClassVisitor {
    private final static String INVOKE_BUS_NAME = Type.getInternalName(FieldAccessBus.class);

    public ReflectFieldAccessReplaceVisitor() {
        super(ASM6);
    }

    public ReflectFieldAccessReplaceVisitor(ClassVisitor classVisitor) {
        super(ASM6, classVisitor);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
        mv = new MethodVisitor(api, mv) {
            @Override
            public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
                if(owner.equals("java/lang/reflect/Field")) {
                    switch (name) {
                        case "get": visitGet(); return;
                        case "set" : visitSet(); return;

                        case "getBoolean": visitGetAndUnbox(Type.BOOLEAN_TYPE); return;
                        case "getByte": visitGetAndUnbox(Type.BYTE_TYPE); return;
                        case "getChar": visitGetAndUnbox(Type.CHAR_TYPE); return;
                        case "getShort": visitGetAndUnbox(Type.SHORT_TYPE); return;
                        case "getInt": visitGetAndUnbox(Type.INT_TYPE); return;
                        case "getLong": visitGetAndUnbox(Type.LONG_TYPE); return;
                        case "getFloat": visitGetAndUnbox(Type.FLOAT_TYPE); return;
                        case "getDouble": visitGetAndUnbox(Type.DOUBLE_TYPE); return;

                        case "setBoolean": visitBoxAndSet(Type.BOOLEAN_TYPE); return;
                        case "setByte": visitBoxAndSet(Type.BYTE_TYPE); return;
                        case "setChar": visitBoxAndSet(Type.CHAR_TYPE); return;
                        case "setShort": visitBoxAndSet(Type.SHORT_TYPE); return;
                        case "setInt": visitBoxAndSet(Type.INT_TYPE); return;
                        case "setLong": visitBoxAndSet(Type.LONG_TYPE); return;
                        case "setFloat": visitBoxAndSet(Type.FLOAT_TYPE); return;
                        case "setDouble" : visitBoxAndSet(Type.DOUBLE_TYPE); return;
                    }
                }

                super.visitMethodInsn(opcode, owner, name, descriptor, isInterface);
            }

            private void visitGet() {
                super.visitMethodInsn(INVOKESTATIC, INVOKE_BUS_NAME, "getField",
                        "(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;", false);
            }

            private void visitGetAndUnbox(Type primitiveType) {
                Type boxedType = getBoxedType(primitiveType);
                String unboxMethodName = primitiveType.getClassName() + "Value";
                String unboxMethodDescriptor = "()" + primitiveType.getDescriptor();

                visitGet();
                super.visitMethodInsn(INVOKEVIRTUAL, boxedType.getInternalName(), unboxMethodName, unboxMethodDescriptor, false);
            }

            private void visitSet() {
                super.visitMethodInsn(INVOKESTATIC, INVOKE_BUS_NAME, "setField",
                        "(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)V", false);
            }

            private void visitBoxAndSet(Type primitiveType) {
                Type boxedType = getBoxedType(primitiveType);
                String valueOfDescriptor = "(" + primitiveType.getDescriptor() + ")" + boxedType.getDescriptor();

                super.visitMethodInsn(INVOKESTATIC, boxedType.getInternalName(), "valueOf", valueOfDescriptor, false);
                visitSet();
            }

            private Type getBoxedType(Type primitiveType) {
                switch (primitiveType.getSort()) {
                    case Type.BOOLEAN: return Type.getObjectType("java/lang/Boolean");
                    case Type.BYTE: return Type.getObjectType("java/lang/Byte");
                    case Type.CHAR: return Type.getObjectType("java/lang/Character");
                    case Type.SHORT: return Type.getObjectType("java/lang/Short");
                    case Type.INT: return Type.getObjectType("java/lang/Integer");
                    case Type.LONG: return Type.getObjectType("java/lang/Long");
                    case Type.FLOAT: return Type.getObjectType("java/lang/Float");
                    case Type.DOUBLE: return Type.getObjectType("java/lang/Double");
                    default: throw new IllegalArgumentException();
                }
            }
        };
        return mv;
    }
}
