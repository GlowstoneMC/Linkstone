package net.glowstone.linkstone.compiler;

import net.glowstone.linkstone.compiler.meta.ClassfileMeta;
import net.glowstone.linkstone.compiler.meta.EnumMeta;
import net.glowstone.linkstone.compiler.meta.FieldMeta;
import net.glowstone.linkstone.compiler.meta.MethodMeta;
import net.glowstone.linkstone.compiler.meta.PackageMeta;
import net.glowstone.linkstone.annotations.Version;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Create mapping models for all versions from class nodes
 */
public class MappingModelCollector {
    private final Map<Version, MappingModel> models;

    public MappingModelCollector() {
        this.models = new HashMap<>();
        for (Version version : Version.values()) {
            this.models.put(version, new MappingModel());
        }
    }

    public Map<Version, MappingModel> getModels() {
        return models;
    }

    public void addClass(ClassNode cn) {
        if (cn.name.endsWith("/package-info")) {
            addPackage(cn);
        } else {
            ClassfileMeta classMeta = ClassfileMeta.from(cn);
            models.forEach(((version, mapping) -> {
                if (classMeta.getVersions().contains(version)) {
                    String newClassName = classMeta.getNameOrDefault(version);
                    mapping.putClassName(cn.name, newClassName);

                    cn.fields.forEach(fn -> addField(cn.name, fn, version, mapping));
                    cn.methods.forEach(mn -> addMethod(cn.name, mn, version, mapping));
                }
            }));
        }
    }

    private void addPackage(ClassNode cn) {
        PackageMeta meta = PackageMeta.from(cn);
        models.forEach(((version, mapping) -> {
            if (meta.getVersions().contains(version)) {
                mapping.putPackageName(meta.getDefaultName(), meta.getNameOrDefault(version), meta.getModeOrDefault(version));
            }
        }));
    }

    private void addField(String classname, FieldNode fn, Version version, MappingModel mapping) {
        FieldMeta fieldMeta = FieldMeta.from(fn);
        if (fieldMeta.getVersions().contains(version)) {
            String newFieldName = fieldMeta.getNameOrDefault(version);
            mapping.putFieldName(classname, fn.name, fn.desc, newFieldName);
        }

        EnumMeta enumMeta = EnumMeta.from(fn);
        if (enumMeta.getVersions().contains(version)) {
            String newEnumFieldName = enumMeta.getNameOrDefault(version);
            mapping.putFieldName(classname, fn.name, fn.desc, newEnumFieldName);
        }
    }

    private void addMethod(String classname, MethodNode mn, Version version, MappingModel mapping) {
        MethodMeta methodMeta = MethodMeta.from(mn);
        if (methodMeta.getVersions().contains(version)) {
            String newMethodName = methodMeta.getNameOrDefault(version);
            mapping.setMethodName(classname, mn.name, mn.desc, newMethodName);
        }
    }
}
