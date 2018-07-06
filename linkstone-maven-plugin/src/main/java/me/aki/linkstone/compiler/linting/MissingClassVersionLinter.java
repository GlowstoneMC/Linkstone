package me.aki.linkstone.compiler.linting;

import me.aki.linkstone.annotations.Version;
import me.aki.linkstone.compiler.meta.*;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.*;

/**
 * Reports if class members have versions in their annotation that their class do not have.
 */
public class MissingClassVersionLinter implements Linter {
    @Override
    public void lint(List<ClassNode> classes, ErrorReport report) {
        for (ClassNode cn : classes) {
            ClassfileMeta classMeta = ClassfileMeta.from(cn);
            Set<Version> classVersions = classMeta.getVersions();

            validateFields(cn, classVersions, report);
            validateMethods(cn, classVersions, report);
        }
    }

    private void validateFields(ClassNode cn, Set<Version> classVersions, ErrorReport report) {
        for (FieldNode fn : cn.fields) {
            FieldMeta meta = FieldMeta.from(fn);
            for (Version fieldVersion : meta.getVersions()) {
                if (!classVersions.contains(fieldVersion)) {
                    ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                    String message = "The class does not exist in version " + fieldVersion.getName() + " but the field does.";
                    report.addError(new ErrorReport.Error(message, location));
                }
            }
        }
    }

    private void validateMethods(ClassNode cn, Set<Version> classVersions, ErrorReport report) {
        for (MethodNode mn : cn.methods) {
            Set<Version> methodVersions = new HashSet<>();

            methodVersions.addAll(MethodMeta.from(mn).getVersions());
            methodVersions.addAll(GetterMeta.from(mn).getVersions());
            methodVersions.addAll(SetterMeta.from(mn).getVersions());

            for (Version methodVersion : methodVersions) {
                if (!classVersions.contains(methodVersion)) {
                    ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
                    String message = "The class does not exist in version " + methodVersion.getName() + " but the method does.";
                    report.addError(new ErrorReport.Error(message, location));
                }
            }
        }
    }
}
