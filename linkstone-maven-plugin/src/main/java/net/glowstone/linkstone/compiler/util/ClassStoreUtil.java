package net.glowstone.linkstone.compiler.util;

import net.glowstone.linkstone.compiler.ClassStore;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.ArrayList;
import java.util.List;

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
     * Recursively get all superclasses of a certain class that are available in the ClassStore.
     *
     * @param cn class whose superclasses to look for
     * @return ClassNodes of all superclasses
     */
    public List<ClassNode> getAvailableSuperClasses(ClassNode cn) {
        List<ClassNode> superClasses = new ArrayList<>();
        while (cn.superName != null && (cn = classStore.getClass(cn.superName)) != null) {
            superClasses.add(cn);
        }
        return superClasses;
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
        for (ClassNode superClass : getAvailableSuperClasses(cn)) {
            for (MethodNode superMethod : superClass.methods) {
                if (mn.name.equals(superMethod.name) && mn.desc.equals(superMethod.desc)) {
                    overrides.add(superMethod);
                }
            }
        }
        return overrides;
    }
}
