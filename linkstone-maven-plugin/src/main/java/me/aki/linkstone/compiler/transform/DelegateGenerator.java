package me.aki.linkstone.compiler.transform;

import me.aki.linkstone.compiler.ClassStore;
import me.aki.linkstone.compiler.meta.DelegateMeta;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;

import static org.objectweb.asm.Opcodes.*;

public class DelegateGenerator extends AbstractDelegateGenerator implements CodeTransformer {
    private final ClassStore classStore;

    public DelegateGenerator(ClassStore classStore) {
        this.classStore = classStore;
    }

    public void transform(List<ClassNode> classnodes) {
        for (ClassNode cn : classnodes) {
            transformClass(cn);
        }
    }

    private void transformClass(ClassNode cn) {
        for (FieldNode fn : cn.fields) {
            DelegateMeta delegateMeta = DelegateMeta.from(fn);
            if (!delegateMeta.isAnnotated()) {
                continue;
            }

            List<Type> classes = delegateMeta.getDelegateClasses();

            inheritTypes(cn, classes);

            for (Type clazz : classes) {
                ClassNode tcn = classStore.getClass(clazz.getInternalName());
                for (MethodNode mn : tcn.methods) {
                    generateDelegateMethod(cn, fn, clazz, mn.name, mn.desc);
                }
            }
        }
    }

    /**
     * Add interfaces to a class (if they are not already implemented).
     *
     * @param cn class to add interfaces
     * @param interfaces interfaces to add
     */
    private void inheritTypes(ClassNode cn, List<Type> interfaces) {
        for (Type iface : interfaces) {
            String name = iface.getInternalName();

            if (!cn.interfaces.contains(name)) {
                cn.interfaces.add(name);
            }
        }
    }
}
