package net.glowstone.linkstone.compiler.linting;

import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;
import net.glowstone.linkstone.compiler.meta.MethodMeta;
import net.glowstone.linkstone.compiler.meta.OverrideMeta;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Lint if a methods lacks a {@link LOverride} annotation or has one but overrides
 * no {@link LMethod} annotated method.
 */
public class MissingOverrideAnnotationLinter implements Linter {
    private Map<Type, ClassNode> classNodes;

    @Override
    public void lint(List<ClassNode> classes, ErrorReport report) {
        initClassMap(classes);
        classes.stream().forEach(cn -> checkClass(cn, report));
    }

    private void initClassMap(List<ClassNode> classes) {
        classNodes = classes.stream().collect(Collectors.toMap(
                cn -> Type.getObjectType(cn.name),
                cn -> cn));
    }

    private void checkClass(ClassNode cn, ErrorReport report) {
        for (MethodNode mn : cn.methods) {
            boolean isOverride = OverrideMeta.from(mn).isAnnotated();

            if (isOverride) {
                boolean foundOverriddenMethod = false;

                if (MethodMeta.from(mn).isAnnotated()) {
                    ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
                    String message = "Overriding methods may not have a @LMethod annotation";
                    report.addError(new ErrorReport.Error(message, location));
                }

                for (MethodNode overriddenMethod : getOverriddenMethods(cn, mn)) {
                    if (OverrideMeta.from(overriddenMethod).isAnnotated()) {
                        continue;
                    }

                    if (!MethodMeta.from(overriddenMethod).isAnnotated()) {
                        ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
                        String message = "Overridden method has no @LMethod annotation";
                        report.addError(new ErrorReport.Error(message, location));
                    }

                    foundOverriddenMethod = true;
                }

                if (!foundOverriddenMethod) {
                    ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
                    String message = "@LOverride annotated method overrides nothing";
                    report.addError(new ErrorReport.Error(message, location));
                }
            } else {
                boolean overridesAnnotatedMethod = getOverriddenMethods(cn, mn).stream()
                        .anyMatch(overriddenMethod -> MethodMeta.from(overriddenMethod).isAnnotated());

                if (overridesAnnotatedMethod) {
                    ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
                    String message = "The method lacks a @LOverride annotation";
                    report.addError(new ErrorReport.Error(message, location));
                }
            }
        }

    }

    private List<ClassNode> getSuperClasses(ClassNode cn) {
        List<ClassNode> classes = new ArrayList<>();
        while (cn.superName != null
                && (cn = classNodes.get(Type.getObjectType(cn.superName))) != null) {
            classes.add(cn);
        }
        return classes;
    }

    /**
     * Get all methods that are overridden by a certain method.
     *
     * @param cn class containing the method that overrides
     * @param mn method that overrides others
     * @return all overridden methods
     */
    private List<MethodNode> getOverriddenMethods(ClassNode cn, MethodNode mn) {
        List<MethodNode> overrides = new ArrayList<>();
        for (ClassNode superClass : getSuperClasses(cn)) {
            for (MethodNode superMethod : superClass.methods) {
                if (mn.name.equals(superMethod.name) && mn.desc.equals(superMethod.desc)) {
                    overrides.add(superMethod);
                }
            }
        }
        return overrides;
    }
}
