package me.aki.linkstone.compiler.transform;

import static org.objectweb.asm.Opcodes.*;

import me.aki.linkstone.annotations.Box;
import me.aki.linkstone.compiler.meta.BoxMeta;
import me.aki.linkstone.compiler.meta.BoxedMeta;
import org.objectweb.asm.Label;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;

import java.util.List;
import java.util.WeakHashMap;

/**
 * Transform classes with a {@link Box} annotations. Generate a static method that
 * initializes the box and delegate the equal, hashcode and toString method.
 */
public class BoxDelegateGenerator extends AbstractDelegateGenerator implements CodeTransformer {
    private final static String STATIC_BOX_CONSTRUCTOR = "$linkstone$box$init$";
    private final static String BOX_CACHE_MAP = "$linkstone$box$cache$";

    @Override
    public void transform(List<ClassNode> classes) {
        for (ClassNode cn : classes) {
            BoxMeta meta = BoxMeta.from(cn);
            if (!meta.isAnnotated()) {
                continue;
            }

            Type boxedType = meta.getType();

            FieldNode boxedField = cn.fields.stream()
                    .filter(fn -> BoxedMeta.from(fn).isAnnotated())
                    .findFirst().get();

            generateBoxCache(cn);
            generateStaticConstructor(cn, boxedType);

            generateDelegateMethod(cn, boxedField, boxedType, "equals", "(Ljava/lang/Object;)Z");
            generateDelegateMethod(cn, boxedField, boxedType, "hashCode", "()I");
            generateDelegateMethod(cn, boxedField, boxedType, "toString", "()Ljava/lang/String;");
        }
    }

    /**
     * Generate and initialize a {@link WeakHashMap} that caches box instances.
     *
     * @param cn class of the box
     */
    private void generateBoxCache(ClassNode cn) {
        FieldNode fn = new FieldNode(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, BOX_CACHE_MAP, "Ljava/util/Map;", null, null);
        fn.visitEnd();
        cn.fields.add(fn);

        MethodNode clinit = getOrCreateClinitMethod(cn);
        clinit.maxStack = Math.max(clinit.maxStack, 2);

        InsnList insns = new InsnList();
        insns.add(new TypeInsnNode(NEW, "java/util/WeakHashMap"));
        insns.add(new InsnNode(DUP));
        insns.add(new MethodInsnNode(INVOKESPECIAL, "java/util/WeakHashMap", "<init>", "()V", false));
        insns.add(new FieldInsnNode(PUTSTATIC, cn.name, BOX_CACHE_MAP, "Ljava/util/Map;"));

        clinit.instructions.insertBefore(clinit.instructions.getFirst(), insns);
    }

    /**
     * Find the static class initializer method or else create an empty one.
     *
     * @param cn class to search
     * @return static class initializer method
     */
    private MethodNode getOrCreateClinitMethod(ClassNode cn) {
        for (MethodNode mn : cn.methods) {
            if (mn.name.equals("<clinit>")) {
                return mn;
            }
        }

        MethodNode mn = new MethodNode(ACC_PUBLIC, "<clinit>", "()V", null, null);
        mn.visitCode();
        mn.visitInsn(RETURN);
        mn.visitMaxs(0, 0);
        mn.visitEnd();

        cn.methods.add(mn);
        return mn;
    }

    /**
     * Create a static method that creates a new box if its not already in the cache.
     *
     * @param cn class of the box
     * @param boxedType type to be boxed
     */
    private void generateStaticConstructor(ClassNode cn, Type boxedType) {
        Type boxType = Type.getObjectType(cn.name);

        final int objectToBox = 0;
        final int boxLocal = 1;

        Label returnNull = new Label();
        Label returnBox = new Label();
        Label throwIllegalTypeException = new Label();

        String methodDescriptor = Type.getMethodDescriptor(boxType, Type.getObjectType("java/lang/Object"));
        MethodNode mv = new MethodNode(ACC_PUBLIC | ACC_STATIC, STATIC_BOX_CONSTRUCTOR, methodDescriptor, null, null);
        mv.visitCode();

        mv.visitVarInsn(ALOAD, objectToBox);
        mv.visitJumpInsn(IFNULL, returnNull);

        // Lookup the object in the cache
        mv.visitFieldInsn(GETSTATIC, boxType.getInternalName(), BOX_CACHE_MAP, "Ljava/util/Map;");
        mv.visitVarInsn(ALOAD, objectToBox);
        mv.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
        mv.visitTypeInsn(CHECKCAST, boxType.getInternalName());
        mv.visitVarInsn(ASTORE, boxLocal);

        mv.visitVarInsn(ALOAD, boxLocal);
        mv.visitJumpInsn(IFNONNULL, returnBox);

        // Check if the "object to box" is of the boxed type
        mv.visitVarInsn(ALOAD, objectToBox);
        mv.visitTypeInsn(INSTANCEOF, boxedType.getInternalName());
        mv.visitJumpInsn(IFEQ, throwIllegalTypeException);

        // Create a new Box
        mv.visitTypeInsn(NEW, boxType.getInternalName());
        mv.visitInsn(DUP);
        mv.visitVarInsn(ALOAD, objectToBox);
        mv.visitMethodInsn(INVOKESPECIAL, boxType.getInternalName(), "<init>", "(Lnet/glowstone/entity/GlowPlayer;)V", false);
        mv.visitVarInsn(ASTORE, boxLocal);

        // Store the new box in the cache
        mv.visitFieldInsn(GETSTATIC, boxType.getInternalName(), BOX_CACHE_MAP, "Ljava/util/Map;");
        mv.visitVarInsn(ALOAD, objectToBox);
        mv.visitVarInsn(ALOAD, boxLocal);
        mv.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
        mv.visitInsn(POP);

        mv.visitLabel(returnBox);
        mv.visitFrame(F_APPEND,1, new Object[] {boxType.getInternalName()}, 0, null);
        // Return the box
        mv.visitVarInsn(ALOAD, boxLocal);
        mv.visitInsn(ARETURN);

        mv.visitFrame(F_SAME, 0, null, 0, null);
        mv.visitLabel(throwIllegalTypeException);
        mv.visitTypeInsn(NEW, "java/lang/RuntimeException");
        mv.visitInsn(DUP);
        mv.visitTypeInsn(NEW, "java/lang/StringBuilder");
        mv.visitInsn(DUP);
        mv.visitLdcInsn("Cannot initialize CraftPlayer box for type ");
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
        mv.visitInsn(ATHROW);

        mv.visitFrame(F_CHOP,1, null, 0, null);
        mv.visitLabel(returnNull);
        // Object to wrap is null, so return null
        mv.visitInsn(ACONST_NULL);
        mv.visitInsn(ARETURN);

        mv.visitMaxs(3, 2);
        mv.visitEnd();

        cn.methods.add(mv);
    }
}
