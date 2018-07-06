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

public class DelegateGenerator {
    private final ClassStore classStore;

    public DelegateGenerator(ClassStore classStore) {
        this.classStore = classStore;
    }

    public void generateDelegateMethods(List<ClassNode> classnodes) {
        for (ClassNode cn : classnodes) {
            for(FieldNode fn : cn.fields) {
                DelegateMeta delegateMeta = DelegateMeta.from(fn);
                if(delegateMeta.hasAnnotation()) {
                    List<Type> classes = delegateMeta.getDelegateClasses();

                    inheritTypes(cn, classes);

                    for (Type clazz : classes) {
                        ClassNode tcn = classStore.getClass(clazz.getInternalName());
                        for (MethodNode mn : tcn.methods) {
                            generateDelegateMethod(cn, fn, clazz, mn);
                        }
                    }
                }
            }
        }
    }

    private void inheritTypes(ClassNode cn, List<Type> types) {
        for (Type t : types) {
            String name = t.getInternalName();

            if (!cn.interfaces.contains(name)) {
                cn.interfaces.add(name);
            }
        }
    }

    /**
     * Get all superclasses and interfaces of a class.
     *
     * @param type the class
     * @return all supertypes
     */
    private Set<Type> getSuperTypes(Type type) {
        Set<Type> types = new HashSet<>();
        appendSuperTypes(type, types);
        return types;
    }

    private void appendSuperTypes(Type type, Set<Type> allTypes) {
        ClassNode cn = classStore.getClass(type.getInternalName());
        if (cn != null) {
            Set<Type> superTypes = cn.interfaces.stream()
                    .map(Type::getObjectType)
                    .collect(Collectors.toSet());
            if (cn.superName != null) {
                superTypes.add(Type.getObjectType(cn.superName));
            }

            superTypes.stream()
                    .filter(allTypes::add)
                    .forEach(x -> appendSuperTypes(x, allTypes));
        }
    }

    /**
     * Generate a method that redirects call to the annotated field.
     *
     * @param cn where to add the generated method
     * @param instanceField instance that will be invoked
     * @param owner interface containing the method to delegate
     * @param method method that should be called
     */
    private void generateDelegateMethod(ClassNode cn, FieldNode instanceField, Type owner, MethodNode method) {
        if (existsMethod(cn, method.name, method.desc)) {
            return;
        }

        MethodNode mn = new MethodNode(ACC_PUBLIC, method.name, method.desc, null, null);
        cn.methods.add(mn);

        GeneratorAdapter mv = new GeneratorAdapter(mn, mn.access, mn.name, mn.desc);
        mv.visitCode();

        if (!Modifier.isStatic(instanceField.access)) {
            mv.loadThis();
        }
        mv.getField(Type.getObjectType(cn.name), instanceField.name, Type.getType(instanceField.desc));

        int paramCount = Type.getArgumentTypes(mn.desc).length;
        for (int i = 0; i < paramCount; i++) {
            mv.loadArg(i);
        }

        mv.visitMethodInsn(INVOKEINTERFACE, owner.getInternalName(), method.name, method.desc, true);

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
