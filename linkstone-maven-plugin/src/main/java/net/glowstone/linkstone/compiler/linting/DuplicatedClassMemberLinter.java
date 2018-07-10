package net.glowstone.linkstone.compiler.linting;

import net.glowstone.linkstone.annotations.Version;
import net.glowstone.linkstone.compiler.meta.FieldMeta;
import net.glowstone.linkstone.compiler.meta.MethodMeta;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.*;

/**
 * Reports if multiple methods/fields have the same name for one version.
 */
public class DuplicatedClassMemberLinter implements Linter {
    @Override
    public void lint(List<ClassNode> classes, ErrorReport report) {
        for (ClassNode cn : classes) {
            lintFields(cn, report);
            lintMethods(cn, report);
        }
    }

    private void lintFields(ClassNode cn, ErrorReport report) {
        Map<Version, Set<String>> fieldMap = new HashMap<>();
        for (FieldNode fn : cn.fields) {
            FieldMeta meta = FieldMeta.from(fn);
            for (Version version : meta.getVersions()) {
                Set<String> fieldNames = fieldMap.computeIfAbsent(version, x -> new HashSet<>());
                String fieldName = meta.getNameOrDefault(version);

                if (!fieldNames.add(fieldName)) {
                    ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                    String message = "Duplicated field name in version " + version.getName();
                    report.addError(new ErrorReport.Error(message, location));
                }
            }
        }
    }

    private void lintMethods(ClassNode cn, ErrorReport report) {
        Map<Version, Set<String>> methodMap = new HashMap<>();
        for (MethodNode mn : cn.methods) {
            MethodMeta meta = MethodMeta.from(mn);
            for (Version version : meta.getVersions()) {
                Set<String> signatures = methodMap.computeIfAbsent(version, x -> new HashSet<>());
                String methodName = meta.getNameOrDefault(version);

                if (!signatures.add(methodName + mn.desc)) {
                    ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
                    String message = "Duplicated method in version " + version.getName();
                    report.addError(new ErrorReport.Error(message, location));
                }
            }
        }
    }
}
