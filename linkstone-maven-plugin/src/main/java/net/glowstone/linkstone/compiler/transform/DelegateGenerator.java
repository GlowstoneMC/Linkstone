package net.glowstone.linkstone.compiler.transform;

import net.glowstone.linkstone.compiler.ClassStore;
import net.glowstone.linkstone.compiler.meta.DelegateMeta;
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

            Set<Type> interfaces = delegateMeta.getDelegateClasses().stream()
                    .flatMap(iface -> withExtendedInterfaces(iface).stream())
                    .collect(Collectors.toSet());

            inheritInterfaces(cn, interfaces);

            for (Type clazz : interfaces) {
                ClassNode tcn = classStore.getClass(clazz.getInternalName());
                for (MethodNode mn : tcn.methods) {
                    generateDelegateMethod(cn, fn, clazz, mn.name, mn.desc);
                }
            }
        }
    }

    /**
     * Get a set containing a interfaces and all interfaces it extends.
     *
     * @param iface the interface
     * @return the set
     */
    private Set<Type> withExtendedInterfaces(Type iface) {
        Set<Type> ifaces = new HashSet<>();
        ifaces.add(iface);
        addExtendedInterfaces(iface, ifaces);
        return ifaces;
    }

    private void addExtendedInterfaces(Type target, Set<Type> interfaces) {
        ClassNode cn = classStore.getClass(target.getInternalName());
        if (cn.interfaces != null) {
            for (String iface : cn.interfaces) {
                Type ifaceType = Type.getObjectType(iface);
                if (interfaces.add(ifaceType)) {
                    addExtendedInterfaces(ifaceType, interfaces);
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
    private void inheritInterfaces(ClassNode cn, Collection<Type> interfaces) {
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
