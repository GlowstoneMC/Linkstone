package me.aki.linkstone.compiler;

import me.aki.linkstone.annotations.Version;
import me.aki.linkstone.compiler.linting.*;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.tree.ClassNode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LinkstoneCompiler {
    private final static Linter[] LINTER = new Linter[] {
            new DuplicatedClassMemberLinter(),
            new IllegalGetterSetterSignatureLinter(),
            new MissingClassVersionLinter()
    };

    public List<ClassNode> loadClasses(File classDirectory) {
        List<ClassNode> classes = new ArrayList<>();
        for(File classfile : FileUtils.listFiles(classDirectory)) {
            if(!classfile.isFile() || !classfile.getName().endsWith(".class"))continue;

            try {
                ClassNode cn = new ClassNode();
                new ClassReader(new FileInputStream(classfile)).accept(cn, 0);
                classes.add(cn);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return classes;
    }

    public ErrorReport runLints(List<ClassNode> templates) {
        ErrorReport report = new ErrorReport();
        for(Linter linter : LINTER) {
            linter.lint(templates, report);
        }
        return report;
    }


    public List<ClassNode> generateClasses(List<ClassNode> templates, Version version) {
        MappingModel mappingModel = collectMappingModel(templates, version);

        // Leave only classes, fields amd methods that exists in the current version
        new TemplateTransformer(version).processClasses(templates);

        // Renames classes, methods, ... to their annotated name
        return remapClasses(templates, mappingModel);
    }

    private List<ClassNode> remapClasses(List<ClassNode> cns, MappingModel mappingModel) {
        Remapper remapper = new MappingModelRemapper(mappingModel);
        List<ClassNode> newClasses = new ArrayList<>(cns.size());

        for(ClassNode cn : cns) {
            ClassNode newClassNode = new ClassNode();
            cn.accept(new ClassRemapper(newClassNode, remapper));
            newClasses.add(newClassNode);
        }

        return newClasses;
    }

    private MappingModel collectMappingModel(List<ClassNode> cns, Version version) {
        MappingModel mappingModel = new MappingModel();
        MappingModelCollector collector = new MappingModelCollector(mappingModel, version);
        cns.stream().forEach(collector::addClass);
        return mappingModel;
    }

    public void writeClasses(final File outputDir, List<ClassNode> cns) {
        for(ClassNode cn : cns) {
            String[] split = cn.name.split("/");
            String className = split[split.length - 1];

            File packageDir = outputDir;
            for (int i = 0; i < (split.length - 1); i++) {
                packageDir = new File(packageDir, split[i]);
            }

            ClassWriter cw = new ClassWriter(0);
            cn.accept(cw);

            try {
                File sourceLocation = new File(packageDir, className + ".class");
                packageDir.mkdirs();

                FileOutputStream out = new FileOutputStream(sourceLocation);
                out.write(cw.toByteArray());
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
