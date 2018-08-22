package net.glowstone.linkstone.compiler.linting;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LPackage;
import net.glowstone.linkstone.annotations.Version;
import net.glowstone.linkstone.compiler.ClassStore;
import net.glowstone.linkstone.compiler.MappingModel;
import net.glowstone.linkstone.compiler.collect.VersionAnnotationVisitor;
import net.glowstone.linkstone.compiler.meta.ClassfileMeta;
import net.glowstone.linkstone.compiler.meta.ConstructorMeta;
import net.glowstone.linkstone.compiler.meta.EnumMeta;
import net.glowstone.linkstone.compiler.meta.FieldMeta;
import net.glowstone.linkstone.compiler.meta.MethodMeta;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Compare the templates with jar files and lint if classes, fields, methods or constructors
 * with declarations do not exist in those jar file.
 */
public class TemplateCompareLinter implements Linter {
    private final Map<Version, ClassStore> templateJars;
    private final Map<Version, MappingModel> mappings;

    public TemplateCompareLinter(Map<Version, ClassStore> templateJars, Map<Version, MappingModel> mappings) {
        this.templateJars = templateJars;
        this.mappings = mappings;
    }

    @Override
    public void lint(List<ClassNode> classes, ErrorReport report) {
        for (Version version : Version.values()) {
            ClassStore templateJar = templateJars.get(version);
            MappingModel model = mappings.get(version);

            for (ClassNode cn : classes) {
                checkClass(cn, templateJar, model, version, report);
            }
        }
    }

    private List<FieldNode> getEnumFields(ClassNode enumNode) {
        return enumNode.fields.stream()
                .filter(fn -> isEnum(fn.access))
                .collect(Collectors.toList());
    }

    private boolean isEnum(int flag) {
        return (flag & Opcodes.ACC_ENUM) != 0;
    }

    private void checkClass(ClassNode cn, ClassStore templateJar, MappingModel model, Version version, ErrorReport report) {
        ClassfileMeta meta = ClassfileMeta.from(cn);
        if (!meta.isAnnotated() || !meta.getVersions().contains(version)) {
            return;
        }

        String resolvedClassName = model.resolveClass(cn.name);
        ClassNode template = templateJar.getClass(resolvedClassName);
        if (template == null) {
            ErrorReport.Class location = new ErrorReport.Class(cn.name);
            String message = "Class '" + resolvedClassName + "' does not exist in template jar for version " + version.getName();
            report.addError(new ErrorReport.Error(message, location));
        } else {
            if (isEnum(cn.access)) {
                checkEnumFields(cn, template, model, version, resolvedClassName, report);
            }

            checkFields(cn, template, model, version, resolvedClassName, report);
            checkConstructors(cn, template, model, version, resolvedClassName, report);
            checkMethods(cn, template, model, version, resolvedClassName, report);
        }
    }

    private void checkEnumFields(ClassNode cn, ClassNode template, MappingModel model, Version version, String resolvedClassName, ErrorReport report) {
        for (FieldNode fn : cn.fields) {
            EnumMeta meta = EnumMeta.from(fn);
            if (!meta.isAnnotated() || !meta.getVersions().contains(version)) {
                continue;
            }

            String resolvedConstantName = model.resolveFieldName(cn.name, fn.name, fn.desc);
            String resolvedDesc = resolveTypeDescriptor(Type.getType(fn.desc), model);
            boolean existsEnumField = template.fields.stream().anyMatch(f ->
                    f.name.equals(resolvedConstantName) && f.desc.equals(resolvedDesc));

            if (!existsEnumField) {
                ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                String message = "Enum constant '" + resolvedConstantName + "' in enum '" +
                        resolvedClassName + "' does not exist in template jar for version " + version.getName();
                report.addError(new ErrorReport.Error(message, location));
            }
        }
    }

    private void checkFields(ClassNode cn, ClassNode template, MappingModel model, Version version, String resolvedClassName, ErrorReport report) {
        for (FieldNode fn : cn.fields) {
            FieldMeta meta = FieldMeta.from(fn);
            if (!meta.isAnnotated() || !meta.getVersions().contains(version)) {
                continue;
            }

            String resolvedFieldName = model.resolveFieldName(cn.name, fn.name, fn.desc);
            String resolvedDesc = resolveTypeDescriptor(Type.getType(fn.desc), model);
            boolean existsField = template.fields.stream().anyMatch(f ->
                    f.name.equals(resolvedFieldName) && f.desc.equals(resolvedDesc));

            if (!existsField) {
                ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                String message = "Field '" + resolvedFieldName + "' in class '" + resolvedClassName + "' with descriptor '" +
                        resolvedDesc + "' does not exist in template jar for version " + version.getName();
                report.addError(new ErrorReport.Error(message, location));
            }
        }
    }

    private void checkConstructors(ClassNode cn, ClassNode template, MappingModel model, Version version, String resolvedClassName, ErrorReport report) {
        for (MethodNode mn : cn.methods) {
            ConstructorMeta meta = ConstructorMeta.from(mn);
            if (!meta.isAnnotated() || !meta.getVersions().contains(version)) {
                continue;
            }

            String resolvedDesc = resolveMethodDescriptor(mn.desc, model);
            boolean doesExist = template.methods.stream().anyMatch(m ->
                    m.name.equals("<init>") && m.desc.equals(resolvedDesc));

            if (!doesExist) {
                ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
                String message = "Constructor with descriptor '" + resolvedDesc + "' in class '" + resolvedClassName +
                        "' does not exist in template jar for version " + version.getName();
                report.addError(new ErrorReport.Error(message, location));
            }
        }
    }

    private void checkMethods(ClassNode cn, ClassNode template, MappingModel model, Version version, String resolvedClassName, ErrorReport report) {
        for (MethodNode mn : cn.methods) {
            MethodMeta meta = MethodMeta.from(mn);
            if (!meta.isAnnotated() || !meta.getVersions().contains(version)) {
                continue;
            }

            String resolvedMethodName = model.resolveMethodName(cn.name, mn.name, mn.desc);
            String resolvedDesc = resolveMethodDescriptor(mn.desc, model);
            boolean doesExist = template.methods.stream().anyMatch(m ->
                    m.name.equals(resolvedMethodName) && m.desc.equals(resolvedDesc));

            if (!doesExist) {
                ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
                String message = "Method '" + resolvedMethodName + resolvedDesc + "' in class '" + resolvedClassName +
                        "' does not exist in template jar for version " + version.getName();
                report.addError(new ErrorReport.Error(message, location));
            }
        }
    }

    private String resolveMethodDescriptor(String desc, MappingModel model) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (Type argument : Type.getArgumentTypes(desc)) {
            sb.append(resolveTypeDescriptor(argument, model));
        }
        sb.append(')');
        sb.append(resolveTypeDescriptor(Type.getReturnType(desc), model));
        return sb.toString();
    }

    /**
     * Apply {@link LPackage} and {@link LClassfile} annotations to a descriptor.
     *
     * @param type type to be resolved
     * @param model MappingModel containing all annotated classes and packages
     * @return descriptor with applied {@link LPackage} and {@link LClassfile} annotations
     */
    private String resolveTypeDescriptor(Type type, MappingModel model) {
        switch (type.getSort()) {
            case Type.OBJECT:
                return 'L' + model.resolveClass(type.getInternalName()) + ';';

            case Type.ARRAY:
                Type element = type.getElementType();
                if (element.getSort() == Type.OBJECT) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < type.getDimensions(); i++) {
                        sb.append('[');
                    }
                    sb.append('L');
                    sb.append(model.resolveClass(element.getInternalName()));
                    sb.append(';');
                    return sb.toString();
                } else {
                    return type.getDescriptor();
                }

            default:
                return type.getDescriptor();
        }
    }
}
