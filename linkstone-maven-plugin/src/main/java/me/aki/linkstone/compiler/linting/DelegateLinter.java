package me.aki.linkstone.compiler.linting;

import me.aki.linkstone.annotations.Delegate;
import me.aki.linkstone.annotations.Overridden;
import me.aki.linkstone.compiler.ClassStore;
import me.aki.linkstone.compiler.meta.DelegateMeta;
import me.aki.linkstone.compiler.meta.OverriddenMeta;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Lint if a {@link Delegate} annotation is used wrong
 */
public class DelegateLinter implements Linter {
    private final ClassStore classStore;

    public DelegateLinter(ClassStore classStore) {
        this.classStore = classStore;
    }

    @Override
    public void lint(List<ClassNode> classes, ErrorReport report) {
        for (ClassNode cn : classes) {
            List<ClassNode> interfaces = collectAllDelegateInterfaces(cn, report);

            lintNotOverriddenMethods(cn, interfaces, report);

            lintMissingOverriddenMethods(cn, interfaces, report);
        }
    }

    /**
     * Create a list of all interfaces that should be delegated or report if they are invalid.
     *
     * @param cn class to scan
     * @param report error report for user
     * @return all interfaces to delegate
     */
    private List<ClassNode> collectAllDelegateInterfaces(ClassNode cn, ErrorReport report) {
        List<ClassNode> interfaces = new ArrayList<>();
        Set<Type> delegateInterfaces = new HashSet<>();

        for (FieldNode fn : cn.fields) {
            DelegateMeta meta = DelegateMeta.from(fn);
            if (!meta.isAnnotated()) {
                continue;
            }

            for (Type t : meta.getDelegateClasses()) {
                if (t.getSort() == Type.OBJECT) {
                    ClassNode tcn = classStore.getClass(t.getInternalName());

                    if (tcn == null) {
                        ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                        String message = "Could not find interface " + t.getInternalName() + " in dependency artifacts";
                        report.addError(new ErrorReport.Error(message, location));
                    } else {
                        interfaces.add(tcn);

                        if (!Modifier.isInterface(tcn.access)) {
                            ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                            String message = "Type to delegate is not an interface.";
                            report.addError(new ErrorReport.Error(message, location));
                        }

                        if (!delegateInterfaces.add(t)) {
                            ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                            String message = "Multiple fields try to delegate the interface " + t.getInternalName();
                            report.addError(new ErrorReport.Error(message, location));
                        }
                    }
                } else {
                    ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                    String message = "@Delegate annotations may only contain interface types";
                    report.addError(new ErrorReport.Error(message, location));
                }
            }
        }

        return interfaces;
    }

    /**
     * Get all methods with a {@link Overridden} annotation in a class.
     *
     * @param cn class that is currently checked
     * @return the annotated methods
     */
    private List<MethodNode> getAnnotatedMethods(ClassNode cn) {
        return cn.methods.stream()
                .filter(mn -> OverriddenMeta.from(mn).isAnnotated())
                .collect(Collectors.toList());
    }

    /**
     * Lint if a method has a {@link Overridden} annotation but does not override
     * a delegated method.
     *
     * @param cn class that is currently checked
     * @param delegatees interfaces that should be delegated
     * @param report error report for user
     */
    private void lintNotOverriddenMethods(ClassNode cn, List<ClassNode> delegatees, ErrorReport report) {
        List<MethodNode> notOverridenMethods = getAnnotatedMethods(cn);

        for (ClassNode delegatee : delegatees) {
            for (MethodNode mn : delegatee.methods) {
                notOverridenMethods.removeIf(mn2 ->
                        mn.name.equals(mn2.name) && mn.desc.equals(mn2.desc));
            }
        }

        for (MethodNode mn : notOverridenMethods) {
            ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
            String message = "Method overrides no delegated method";
            report.addError(new ErrorReport.Error(message, location));
        }
    }

    /**
     * Lint if a method would override a delegated method but has not {@link Overridden} annotation.
     *
     *  @param cn class to check against
     * @param delegateClasses interfaces that should be delegated
     * @param report error report for user
     */
    private void lintMissingOverriddenMethods(ClassNode cn, List<ClassNode> delegateClasses, ErrorReport report) {
        for (ClassNode delegateInterface : delegateClasses) {
            for (MethodNode interfaceMethod : delegateInterface.methods) {
                for (MethodNode mn : cn.methods) {
                    if (interfaceMethod.name.equals(mn.name) &&
                            interfaceMethod.desc.equals(mn.desc)) {
                        OverriddenMeta meta = OverriddenMeta.from(mn);
                        if (!meta.isAnnotated()) {
                            ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
                            String message = "Method overrides a delegated method but has no @Overridden annotation";
                            report.addError(new ErrorReport.Error(message, location));
                        }
                    }
                }
            }
        }
    }
}
