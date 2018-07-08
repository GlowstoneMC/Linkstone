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

public class DelegateGenerator implements CodeTransformer {
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

    /**
     * Generate a method that redirects call to the annotated field.
     *
     * @param cn where to add the generated method
     * @param instanceField instance that will be invoked
     * @param owner interface containing the method to delegate
     * @param name name of method to be called
     * @param desc descriptor of method to be called
     */
    private void generateDelegateMethod(ClassNode cn, FieldNode instanceField, Type owner, String name, String desc) {
        if (existsMethod(cn, name, desc)) {
            return;
        }

        MethodNode mn = new MethodNode(ACC_PUBLIC, name, desc, null, null);
        cn.methods.add(mn);

        GeneratorAdapter mv = new GeneratorAdapter(mn, mn.access, mn.name, mn.desc);
        mv.visitCode();

        boolean isStatic = Modifier.isStatic(instanceField.access);
        if (isStatic) {
            mv.getStatic(Type.getObjectType(cn.name), instanceField.name, Type.getType(instanceField.desc));
        } else {
            mv.loadThis();
            mv.getField(Type.getObjectType(cn.name), instanceField.name, Type.getType(instanceField.desc));
        }

        int paramCount = Type.getArgumentTypes(mn.desc).length;
        for (int i = 0; i < paramCount; i++) {
            mv.loadArg(i);
        }

        mv.visitMethodInsn(INVOKEINTERFACE, owner.getInternalName(), name, desc, true);

        mv.returnValue();

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private boolean existsMethod(ClassNode cn, String name, String desc) {
        for (MethodNode mn : cn.methods) {
            if (name.equals(mn.name) && desc.equals(mn.desc)) {
                return true;
            }
        }
        return false;
    }
}
