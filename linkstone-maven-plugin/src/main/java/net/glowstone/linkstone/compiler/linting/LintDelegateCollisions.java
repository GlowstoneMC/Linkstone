package net.glowstone.linkstone.compiler.linting;

import net.glowstone.linkstone.annotations.LDelegate;
import net.glowstone.linkstone.annotations.LOverrides;
import net.glowstone.linkstone.compiler.ClassStore;
import net.glowstone.linkstone.compiler.meta.DelegateMeta;
import net.glowstone.linkstone.compiler.meta.OverridesMeta;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Lint if multiple fields delegate interfaces that both contain a method with the same signature.
 *
 */
public class LintDelegateCollisions implements Linter {
    private final ClassStore classStore;

    public LintDelegateCollisions(ClassStore classStore) {
        this.classStore = classStore;
    }

    @Override
    public void lint(List<ClassNode> classes, ErrorReport report) {
        for (ClassNode cn : classes) {
            Set<MethodSignature> overrides = getOverriddenMethods(cn);
            Map<Type, FieldNode> interfaceToField = getInterfacesToDelegate(cn);
            Map<MethodSignature, Set<Type>> methodToDelegate =
                    getMethodsToDelegate(interfaceToField.keySet());

            methodToDelegate.forEach((method, interfaces) -> {
                if (interfaces.size() <= 1 || overrides.contains(method)) {
                    return;
                }

                // Fields that try to delegate the method
                Set<FieldNode> fields = interfaces.stream()
                        .map(interfaceToField::get)
                        .collect(Collectors.toSet());

                if (fields.size() > 1) {
                    ErrorReport.Class location = new ErrorReport.Class(cn.name);
                    String message = "Multiple fields are trying to delegate the method \"" + method.name +
                            "\" with the descriptor \"" + method.desc +  "\". " +
                            "Resolve this conflict by manually implementing the method.";
                    report.addError(new ErrorReport.Error(message, location));
                }
            });
        }
    }

    /**
     * Get the signatures of all methods that have a {@link LOverrides} annotation.
     *
     * @param cn class to scan
     * @return all annotated methods
     */
    private Set<MethodSignature> getOverriddenMethods(ClassNode cn) {
        return cn.methods.stream()
                .filter(mn -> OverridesMeta.from(mn).isAnnotated())
                .map(mn -> new MethodSignature(mn.name, mn.desc))
                .collect(Collectors.toSet());
    }

    /**
     * Get a map from all interfaces that should be delegated to the field that has the
     * corresponding {@link LDelegate} annotation.
     *
     * @param cn class to scan
     * @return map from interfaces to the field
     */
    private Map<Type, FieldNode> getInterfacesToDelegate(ClassNode cn) {
        Map<Type, FieldNode> map = new HashMap<>();
        for (FieldNode fn : cn.fields) {
            DelegateMeta meta = DelegateMeta.from(fn);
            if (meta.isAnnotated()) {
                for (Type iface : meta.getDelegateClasses()) {
                    map.put(iface, fn);
                }
            }
        }
        return map;
    }

    /**
     * Get all methods in the requested interface.
     * The methods are mapped to the interfaces that contain them.
     *
     * @param interfaces to analyse
     * @return the request map
     */
    private Map<MethodSignature, Set<Type>> getMethodsToDelegate(Set<Type> interfaces) {
        Map<MethodSignature, Set<Type>> map = new HashMap<>();
        for (Type iface : interfaces) {
            ClassNode cn = classStore.getClass(iface.getInternalName());
            if (cn == null) {
                // Not resolvable interfaces are linted by the DelegateLinter
                continue;
            }

            for (MethodNode mn : cn.methods) {
                MethodSignature signature = new MethodSignature(mn.name, mn.desc);
                map.computeIfAbsent(signature, x -> new HashSet<>()).add(iface);
            }
        }
        return map;
    }

    static class MethodSignature {
        private final String name;
        private final String desc;

        MethodSignature(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MethodSignature that = (MethodSignature) o;
            return Objects.equals(name, that.name) &&
                    Objects.equals(desc, that.desc);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, desc);
        }
    }
}
