package net.glowstone.linkstone.compiler;

import net.glowstone.linkstone.annotations.Version;
import net.glowstone.linkstone.compiler.linting.ErrorReport;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.objectweb.asm.tree.ClassNode;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Mojo(
        name = "compile",
        defaultPhase = LifecyclePhase.PROCESS_CLASSES
)
public class LinkstoneMojo extends AbstractMojo {
    @Parameter(readonly = true, defaultValue = "${project}")
    private MavenProject project;

    @Parameter()
    private String version;

    public void execute() throws MojoExecutionException {
        getLog().info("-----------------------------------------------------");
        getLog().info("         L I N K S T O N E   C O M P I L E R         ");
        getLog().info("-----------------------------------------------------");

        File outputDir = new File(project.getBuild().getOutputDirectory());
        Version version = Version.forName(this.version);
        getLog().info("Targeting version " + version.getName());

        LinkstoneCompiler compiler = new LinkstoneCompiler();
        List<ClassNode> templates = compiler.loadClasses(outputDir);
        getLog().info("Loading dependencies ...");
        ClassStore classStore = createDependencyClassStore(templates);

        getLog().info("Loading template jars ...");
        Map<Version, ClassStore> templateJars = compiler.loadTemplateJars();

        getLog().info("Preparing templates classes ...");
        compiler.runTemplateFixes(templates, classStore);
        Map<Version, MappingModel> mappings = compiler.collectMappingModel(templates);

        getLog().info("Checking template classes for errors");
        List<ErrorReport.Error> errors = compiler.runLints(templates, templateJars, mappings, classStore).getErrors();
        if (!errors.isEmpty()) {
            printErrors(errors);
            throw new MojoExecutionException("Templates contain errors");
        }

        getLog().info("Generating output classes ...");
        FileUtils.delete(outputDir, ".class");

        List<ClassNode> generatedClasses = compiler.generateClasses(templates, classStore, version, mappings);
        compiler.writeClasses(outputDir, generatedClasses);
    }


    private ClassStore createDependencyClassStore(List<ClassNode> templates) throws MojoExecutionException {
        ClassStore classStore = new ClassStore();

        classStore.insert(templates);

        for (Artifact artifact : project.getDependencyArtifacts()) {
            try {
                classStore.insertArtifact(artifact.getFile());
            } catch (IOException e) {
                throw new MojoExecutionException("Could not read artifact", e);
            }
        }

        return classStore;
    }

    private void printErrors(List<ErrorReport.Error> errors) {
        getLog().error("Found " + errors.size() + " errors in your Template");

        for (ErrorReport.Error error : errors) {
            getLog().error(" ");
            getLog().error(error.getMessage());
            getLog().error("Location: " + error.getLocation().toString());
        }
    }

}
