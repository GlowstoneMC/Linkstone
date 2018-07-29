package net.glowstone.linkstone.compiler.linting;

import net.glowstone.linkstone.annotations.Version;
import net.glowstone.linkstone.compiler.AccessorCollector;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Reports if getters or setter are duplicated, missing or have a wrong signature.
 */
public class IllegalGetterSetterSignatureLinter implements Linter {
    @Override
    public void lint(List<ClassNode> classes, ErrorReport report) {
        for (ClassNode cn : classes) {
            AccessorCollector accessors = find(cn, report);
            checkGetterSignatures(cn, accessors, report);
            checkSetterSignatures(cn, accessors, report);
        }
    }

    private AccessorCollector find(ClassNode cn, ErrorReport report) {
        return new AccessorCollector(cn) {
            @Override
            protected void onMissingAccessorError(FieldNode fn, Set<Version> missingGetterVersions, Set<Version> missingSetterVersions) {
                ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);

                if (!missingGetterVersions.isEmpty()) {
                    String joinedVersions = missingGetterVersions.stream().map(Version::getName)
                            .collect(Collectors.joining(", "));
                    String message = "Missing getters for version " + joinedVersions;
                    report.addError(new ErrorReport.Error(message, location));
                }

                if (!missingSetterVersions.isEmpty()) {
                    String joinedVersions = missingSetterVersions.stream().map(Version::getName)
                            .collect(Collectors.joining(", "));
                    String message = "Missing setters for version " + joinedVersions;
                    report.addError(new ErrorReport.Error(message, location));
                }
            }

            @Override
            protected void onDuplicatedGetterError(FieldNode fn, Version version) {
                ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                String message = "Duplicated getter for version " + version.getName();
                report.addError(new ErrorReport.Error(message, location));
            }

            @Override
            protected void onDuplicatedSetterError(FieldNode fn, Version version) {
                ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                String message = "Duplicated setter for version " + version.getName();
                report.addError(new ErrorReport.Error(message, location));
            }

            @Override
            protected void onUnusedGetterError(MethodNode mn) {
                ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
                report.addError(new ErrorReport.Error("Unused getter", location));
            }

            @Override
            protected void onUnusedSetterError(MethodNode mn) {
                ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
                report.addError(new ErrorReport.Error("Unused setter", location));
            }
        };
    }

    private void checkGetterSignatures(ClassNode cn, AccessorCollector accessors, ErrorReport report) {
        for (FieldNode field : accessors.getFields()) {
            boolean isStatic = Modifier.isStatic(field.access);
            for (MethodNode getter : accessors.getGetters(field)) {
                if (Type.getArgumentTypes(getter.desc).length != 0) {
                    ErrorReport.Method location = new ErrorReport.Method(cn.name, getter.name, getter.desc);
                    String message = "Getters may have parameters";
                    report.addError(new ErrorReport.Error(message, location));
                }

                Type returnType = Type.getReturnType(getter.desc);
                if (!returnType.getDescriptor().equals(field.desc)) {
                    ErrorReport.Method location = new ErrorReport.Method(cn.name, getter.name, getter.desc);
                    String fieldType = Type.getType(field.desc).getClassName();
                    String message = "Getter return type must match field type (expected " + fieldType + " got " + returnType.getClassName() + ")";
                    report.addError(new ErrorReport.Error(message, location));
                }

                if (isStatic != Modifier.isStatic(getter.access)) {
                    String staticString = isStatic ? "static" : "non-static";
                    ErrorReport.Method location = new ErrorReport.Method(cn.name, getter.name, getter.desc);
                    String message = "Getters for " + staticString + " fields must be " + staticString;
                    report.addError(new ErrorReport.Error(message, location));
                }
            }
        }
    }

    private void checkSetterSignatures(ClassNode cn, AccessorCollector accessors, ErrorReport report) {
        for (FieldNode field : accessors.getFields()) {
            boolean isStatic = Modifier.isStatic(field.access);

            for (MethodNode setter : accessors.getSetters(field)) {
                Type[] arguments = Type.getArgumentTypes(setter.desc);
                if (arguments.length == 1) {
                    if (!arguments[0].getDescriptor().equals(field.desc)) {
                        ErrorReport.Method location = new ErrorReport.Method(cn.name, setter.name, setter.desc);
                        String message = "The setter parameter must be of same type as the field";
                        report.addError(new ErrorReport.Error(message, location));
                    }
                } else {
                    ErrorReport.Method location = new ErrorReport.Method(cn.name, setter.name, setter.desc);
                    String message = "Setters must have one parameter";
                    report.addError(new ErrorReport.Error(message, location));
                }

                if (Type.getReturnType(setter.desc).getSort() != Type.VOID) {
                    ErrorReport.Method location = new ErrorReport.Method(cn.name, setter.name, setter.desc);
                    String message = "Setters must be of void type";
                    report.addError(new ErrorReport.Error(message, location));
                }

                if (isStatic != Modifier.isStatic(setter.access)) {
                    ErrorReport.Method location = new ErrorReport.Method(cn.name, setter.name, setter.desc);
                    String staticString = isStatic ? "static" : "non-static";
                    String message = "Setters for " + staticString + " fields must be " + staticString;
                    report.addError(new ErrorReport.Error(message, location));
                }
            }
        }
    }
}
