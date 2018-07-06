package me.aki.linkstone.compiler;

import me.aki.linkstone.compiler.meta.ClassfileMeta;
import me.aki.linkstone.compiler.meta.FieldMeta;
import me.aki.linkstone.compiler.meta.MethodMeta;
import me.aki.linkstone.compiler.meta.PackageMeta;
import me.aki.linkstone.annotations.Version;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Create a mapping model from class nodes
 */
public class MappingModelCollector {
    private final MappingModel mappingModel;
    private final Version version;

    public MappingModelCollector(MappingModel mappingModel, Version version) {
        this.mappingModel = mappingModel;
        this.version = version;
    }

    public void addClass(ClassNode cn) {
        if (cn.name.endsWith("/package-info")) {
            addPackage(cn);
        }

        ClassfileMeta classMeta = ClassfileMeta.from(cn);
        if (classMeta.getVersions().contains(this.version)) {
            String newClassName = classMeta.getNameOrDefault(this.version);
            mappingModel.putClassName(cn.name, newClassName);

            cn.fields.forEach(fn -> addField(cn.name, fn));
            cn.methods.forEach(mn -> addMethod(cn.name, mn));
        }
    }

    private void addPackage(ClassNode cn) {
        PackageMeta meta = PackageMeta.from(cn);
        if (meta.getVersions().contains(this.version)) {
            mappingModel.putPackageName(meta.getDefaultName(), meta.getNameOrDefault(version), meta.getModeOrDefault(version));
        }
    }

    private void addField(String classname, FieldNode fn) {
        FieldMeta fieldMeta = FieldMeta.from(fn);
        if (fieldMeta.getVersions().contains(this.version)) {
            String newFieldName = fieldMeta.getNameOrDefault(this.version);
            mappingModel.putFieldName(classname, fn.name, fn.desc, newFieldName);
        }
    }

    private void addMethod(String classname, MethodNode mn) {
        MethodMeta methodMeta = MethodMeta.from(mn);
        if (methodMeta.getVersions().contains(this.version)) {
            String newMethodName = methodMeta.getNameOrDefault(this.version);
            mappingModel.setMethodName(classname, mn.name, mn.desc, newMethodName);
        }
    }
}
