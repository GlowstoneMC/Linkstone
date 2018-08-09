package net.glowstone.linkstone.compiler.util;

import net.glowstone.linkstone.compiler.ClassStore;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Common operations run against ClassStores.
 */
public class ClassStoreUtil {
    private final ClassStore classStore;

    public ClassStoreUtil(ClassStore classStore) {
        this.classStore = classStore;
    }

    public ClassStore getClassStore() {
        return classStore;
    }

    /**
     * Recursively get all superclasses and interfaces of a certain class
     * that are available in the ClassStore.
     *
     * @param cn class whose superclasses and interfaces should be collected
     * @return ClassNodes of all superclasses and interfaces
     */
    public Set<ClassNode> getAvailableSuperClassesAndInterfaces(ClassNode cn) {
        Set<ClassNode> superClasses = new HashSet<>();
        addSuperTypeAndInterfaces(cn, superClasses);
        return superClasses;
    }

    private void addSuperTypeAndInterfaces(ClassNode cn, Set<ClassNode> results) {
        ClassNode superClassNode;
        if (cn.superName != null && (superClassNode = classStore.getClass(cn.superName)) != null
                && results.add(superClassNode)) {
            addSuperTypeAndInterfaces(superClassNode, results);
        }

        for (String iface : cn.interfaces) {
            ClassNode interfaceNode = classStore.getClass(iface);
            if (interfaceNode != null && results.add(interfaceNode)) {
                addSuperTypeAndInterfaces(interfaceNode, results);
            }
        }
    }

    /**
     * Get all methods that are overridden by a certain method.
     *
     * @param cn class containing the method that overrides
     * @param mn method that overrides others
     * @return all overridden methods
     */
    public List<MethodNode> getOverriddenMethods(ClassNode cn, MethodNode mn) {
        List<MethodNode> overrides = new ArrayList<>();
        for (ClassNode superClass : getAvailableSuperClassesAndInterfaces(cn)) {
            for (MethodNode superMethod : superClass.methods) {
                if (mn.name.equals(superMethod.name) && mn.desc.equals(superMethod.desc)) {
                    overrides.add(superMethod);
                }
            }
        }
        return overrides;
    }
}
