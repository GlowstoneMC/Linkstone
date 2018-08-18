package net.glowstone.linkstone.compiler.linting;

import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;
import net.glowstone.linkstone.compiler.ClassStore;
import net.glowstone.linkstone.compiler.meta.MethodMeta;
import net.glowstone.linkstone.compiler.meta.OverrideMeta;
import net.glowstone.linkstone.compiler.util.ClassStoreUtil;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import java.util.List;

/**
 * Lint if a methods lacks a {@link LOverride} annotation or has one but overrides
 * no {@link LMethod} annotated method.
 */
public class MissingOverrideAnnotationLinter implements Linter {
    private final ClassStoreUtil classStoreUtil;

    public MissingOverrideAnnotationLinter(ClassStore classStore) {
        this.classStoreUtil = new ClassStoreUtil(classStore);
    }

    @Override
    public void lint(List<ClassNode> classes, ErrorReport report) {
        classes.forEach(cn -> checkClass(cn, report));
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

                for (MethodNode overriddenMethod : classStoreUtil.getOverriddenMethods(cn, mn)) {
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
                boolean overridesAnnotatedMethod = classStoreUtil.getOverriddenMethods(cn, mn).stream()
                        .anyMatch(overriddenMethod -> MethodMeta.from(overriddenMethod).isAnnotated());

                if (overridesAnnotatedMethod) {
                    ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
                    String message = "The method lacks a @LOverride annotation";
                    report.addError(new ErrorReport.Error(message, location));
                }
            }
        }
    }
}
