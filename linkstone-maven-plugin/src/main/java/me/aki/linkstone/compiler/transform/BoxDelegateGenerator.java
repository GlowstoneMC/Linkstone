package me.aki.linkstone.compiler.transform;

import static org.objectweb.asm.Opcodes.*;

import me.aki.linkstone.annotations.LBox;
import me.aki.linkstone.compiler.meta.BoxMeta;
import me.aki.linkstone.compiler.meta.BoxedMeta;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.tree.*;

import java.util.List;

/**
 * Transform classes with a {@link LBox} annotations. Generate a static method that
 * initializes the box and delegate the equal, hashcode and toString method.
 */
public class BoxDelegateGenerator implements CodeTransformer {
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

            generateObjectDelegatedMethod(cn, boxedField, "equals", "(Ljava/lang/Object;)Z");
            generateObjectDelegatedMethod(cn, boxedField, "hashCode", "()I");
            generateObjectDelegatedMethod(cn, boxedField, "toString", "()Ljava/lang/String;");
        }
    }

    private void generateObjectDelegatedMethod(ClassNode cn, FieldNode instanceField, String name, String desc) {
        for (MethodNode mn : cn.methods) {
            if (name.equals(mn.name) && desc.equals(mn.desc)) {
                return;
            }
        }

        MethodNode mn = new MethodNode(ACC_PUBLIC, name, desc, null, null);
        cn.methods.add(mn);

        GeneratorAdapter mv = new GeneratorAdapter(mn, mn.access, mn.name, mn.desc);
        mv.visitCode();

        mv.loadThis();
        mv.getField(Type.getObjectType(cn.name), instanceField.name, Type.getType(instanceField.desc));

        int paramCount = Type.getArgumentTypes(mn.desc).length;
        for (int i = 0; i < paramCount; i++) {
            mv.loadArg(i);
        }

        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", name, desc, false);

        mv.returnValue();

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }
}
