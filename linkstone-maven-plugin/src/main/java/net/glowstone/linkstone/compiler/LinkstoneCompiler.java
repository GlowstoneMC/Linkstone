package net.glowstone.linkstone.compiler;

import net.glowstone.linkstone.annotations.Version;
import net.glowstone.linkstone.compiler.linting.*;
import net.glowstone.linkstone.compiler.transform.*;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.tree.ClassNode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LinkstoneCompiler {
    public final static String GETTER_PREFIX = "$linkstone$getter$";
    public final static String SETTER_PREFIX = "$linkstone$setter$";

    /**
     * Read all classfiles in a directory
     *
     * @param directory containing classfiles
     * @return list of all parsed classfiles
     */
    public List<ClassNode> loadClasses(File directory) {
        List<ClassNode> classes = new ArrayList<>();
        for (File classfile : FileUtils.listFiles(directory)) {
            if (!classfile.isFile() || !classfile.getName().endsWith(".class"))continue;

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

    /**
     * Check the provided templates for error and report them.
     *
     * @param templates to check
     * @param classStore containing all dependencies
     * @return detected errors
     */
    public ErrorReport runLints(List<ClassNode> templates, ClassStore classStore) {
        ErrorReport report = new ErrorReport();
        Linter[] linters = new Linter[] {
                new DuplicatedClassMemberLinter(),
                new IllegalGetterSetterSignatureLinter(),
                new MissingClassVersionLinter(),
                new MissingFieldAnnotationLinter(),
                new DelegateLinter(classStore),
                new LintDelegateCollisionLinter(classStore),
                new MissingOverrideAnnotationLinter(classStore),
                new BoxLinter()
        };

        for (Linter linter : linters) {
            linter.lint(templates, report);
        }

        return report;
    }

    /**
     * Generate the final classes and apply patches defined by annotations.
     *
     * @param templates user written, annotated source code
     * @param classStore containing all dependencies
     * @param version to generate for
     * @return generated classes
     */
    public List<ClassNode> generateClasses(List<ClassNode> templates, ClassStore classStore, Version version) {
        new OverridenAnnotationApplier(classStore).transform(templates);

        MappingModel mappingModel = collectMappingModel(templates, version);

        CodeTransformer[] codeTransformers = {
                new TemplateFilter(version),
                new AccessorGenerator(version),
                new DelegateGenerator(classStore),
                new BoxDelegateGenerator()
        };

        for(CodeTransformer transformer : codeTransformers) {
            transformer.transform(templates);
        }

        // Renames classes, methods, ... to their annotated name
        return remapClasses(templates, mappingModel);
    }

    private List<ClassNode> remapClasses(List<ClassNode> cns, MappingModel mappingModel) {
        Remapper remapper = new MappingModelRemapper(mappingModel);
        List<ClassNode> newClasses = new ArrayList<>(cns.size());

        for (ClassNode cn : cns) {
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

    /**
     * Write a list of classnodes into a directory
     *
     * @param dir output directory
     * @param cns Classnodes that should be written
     */
    public void writeClasses(final File dir, List<ClassNode> cns) {
        for (ClassNode cn : cns) {
            String[] split = cn.name.split("/");
            String className = split[split.length - 1];

            File file = dir;
            for (int i = 0; i < (split.length - 1); i++) {
                file = new File(file, split[i]);
            }

            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            cn.accept(cw);

            try {
                File sourceLocation = new File(file, className + ".class");
                file.mkdirs();

                FileOutputStream out = new FileOutputStream(sourceLocation);
                out.write(cw.toByteArray());
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
