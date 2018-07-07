package me.aki.linkstone.compiler.transform;

import static me.aki.linkstone.compiler.LinkstoneCompiler.GETTER_PREFIX;
import static me.aki.linkstone.compiler.LinkstoneCompiler.SETTER_PREFIX;
import me.aki.linkstone.annotations.Generate;
import me.aki.linkstone.annotations.Version;
import me.aki.linkstone.compiler.meta.FieldMeta;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.lang.reflect.Modifier;
import java.util.List;

/**
 * Utility class that generates getters and setters for fields annotated with {@link Generate}
 */
public class AccessorGenerator implements CodeTransformer {
    private final Version version;

    public AccessorGenerator(Version version) {
        this.version = version;
    }

    public void transform(List<ClassNode> cns) {
        for (ClassNode cn : cns) {
            generateAccessor(cn);
        }
    }

    private void generateAccessor(ClassNode cn) {
        for (FieldNode fn : cn.fields) {
            FieldMeta meta = FieldMeta.from(fn);
            if (meta.isGenerate()) {
                cn.methods.add(generateGetter(cn, fn, meta));

                if (!Modifier.isFinal(fn.access)) {
                    cn.methods.add(generateSetter(cn, fn, meta));
                }
            }
        }
    }

    private MethodNode generateGetter(ClassNode owner, FieldNode fn, FieldMeta meta) {
        String name = GETTER_PREFIX + meta.getNameOrDefault(version);
        int access = Opcodes.ACC_PUBLIC | (fn.access & Opcodes.ACC_STATIC);
        MethodNode mn = new MethodNode(access, name, "()" + fn.desc, null, null);
        GeneratorAdapter mv = new GeneratorAdapter(mn, mn.access, mn.name, mn.desc);
        mv.visitCode();

        if (Modifier.isStatic(fn.access)) {
            mv.getStatic(Type.getObjectType(owner.name), fn.name, Type.getType(fn.desc));
        } else {
            mv.loadThis();
            mv.getField(Type.getObjectType(owner.name), fn.name, Type.getType(fn.desc));
        }
        mv.returnValue();

        mv.visitMaxs(0, 0);
        mv.visitEnd();
        return mn;
    }

    private MethodNode generateSetter(ClassNode owner, FieldNode fn, FieldMeta meta) {
        String name = SETTER_PREFIX + meta.getNameOrDefault(version);
        int access = Opcodes.ACC_PUBLIC | (fn.access & Opcodes.ACC_STATIC);
        MethodNode mn = new MethodNode(access, name, "(" + fn.desc + ")V", null, null);
        GeneratorAdapter mv = new GeneratorAdapter(mn, mn.access, mn.name, mn.desc);
        mv.visitCode();

        if (Modifier.isStatic(fn.access)) {
            mv.loadArg(0);
            mv.putStatic(Type.getObjectType(owner.name), fn.name, Type.getType(fn.desc));
        } else {
            mv.loadThis();
            mv.loadArg(0);
            mv.putField(Type.getObjectType(owner.name), fn.name, Type.getType(fn.desc));
        }
        mv.returnValue();

        mv.visitMaxs(0, 0);
        mv.visitEnd();
        return mn;
    }
}
