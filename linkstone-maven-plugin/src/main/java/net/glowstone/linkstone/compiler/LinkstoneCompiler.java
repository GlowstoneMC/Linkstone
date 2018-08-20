package net.glowstone.linkstone.compiler;

import net.glowstone.linkstone.annotations.Version;
import net.glowstone.linkstone.compiler.linting.*;
import net.glowstone.linkstone.compiler.templatefix.BridgeMethodOverrideFix;
import net.glowstone.linkstone.compiler.transform.*;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.tree.ClassNode;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinkstoneCompiler {
    public final static String GETTER_PREFIX = "$linkstone$getter$";
    public final static String SETTER_PREFIX = "$linkstone$setter$";

    private final static File TEMPLATE_JAR_DIR = new File("templates");

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
     * Fix code generated by the compiler that does
     * not comply to the linkstone annotation style.
     *
     * @param templates to be fixed
     * @param classStore contains all dependencies and classes
     */
    public void runTemplateFixes(List<ClassNode> templates, ClassStore classStore) {
        CodeTransformer[] codeTransformers = {
            new BridgeMethodOverrideFix(classStore)
        };

        for (CodeTransformer transformer : codeTransformers) {
            transformer.transform(templates);
        }
    }

    /**
     * Check the provided templates for error and report them.
     *
     * @param templates to check
     * @param templateJars Template jar files for all versions
     * @param mappings MappingModels of all versions
     * @param classStore contains all dependencies and classes
     * @return detected errors
     */
    public ErrorReport runLints(List<ClassNode> templates, Map<Version, ClassStore> templateJars,
                                Map<Version, MappingModel> mappings, ClassStore classStore) {
        ErrorReport report = new ErrorReport();
        Linter[] linters = new Linter[] {
                new TemplateCompareLinter(templateJars, mappings),
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
     * @param mappings MappingModels for all versions
     * @return generated classes
     */
    public List<ClassNode> generateClasses(List<ClassNode> templates, ClassStore classStore, Version version, Map<Version, MappingModel> mappings) {
        new OverridenAnnotationApplier(classStore).transform(templates);

        CodeTransformer[] codeTransformers = {
                new TemplateFilter(version),
                new AccessorGenerator(version),
                new DelegateGenerator(classStore),
                new BoxDelegateGenerator()
        };

        for(CodeTransformer transformer : codeTransformers) {
            transformer.transform(templates);
        }

        // Renames classes, methods, ... to their annotated names
        return remapClasses(templates, mappings.get(version));
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

    public Map<Version, MappingModel> collectMappingModel(List<ClassNode> cns) {
        MappingModelCollector collector = new MappingModelCollector();
        cns.stream().forEach(collector::addClass);
        return collector.getModels();
    }

    /**
     * Map all versions to a {@link ClassStore} containing the corresponding template jar file.
     *
     * @return map from all version to a ClassStore
     */
    public Map<Version, ClassStore> loadTemplateJars() {
        Map<Version, ClassStore> templateJars = new HashMap<>();
        for (Version version : Version.values()) {
            File jarFile = new File(TEMPLATE_JAR_DIR, version.getName() + ".jar");
            ClassStore store = new ClassStore();

            if (!jarFile.exists()) {
                throw new RuntimeException("Could not find template jar at location " + jarFile.getPath());
            }

            try {
                store.insertArtifact(jarFile);
            } catch (IOException e) {
                throw new RuntimeException("Could not read template jar " + jarFile.getName(), e);
            }

            templateJars.put(version, store);
        }
        return templateJars;
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
