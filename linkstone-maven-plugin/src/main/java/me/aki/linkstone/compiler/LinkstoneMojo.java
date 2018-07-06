package me.aki.linkstone.compiler;

import me.aki.linkstone.annotations.Version;
import me.aki.linkstone.compiler.linting.ErrorReport;
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


@Mojo(
        name = "compile",
        defaultPhase = LifecyclePhase.PROCESS_CLASSES
)
public class LinkstoneMojo extends AbstractMojo {
    @Parameter( readonly = true, defaultValue = "${project}" )
    private MavenProject project;

    @Parameter()
    private String version;

    public void execute() throws MojoExecutionException {
        getLog().info("-----------------------------------------------------");
        getLog().info("         L I N K S T O N E   C O M P I L E R         ");
        getLog().info("-----------------------------------------------------");

        File outputDir = new File(project.getBuild().getOutputDirectory());
        Version version = Version.forName(this.version);
        getLog().info("Generating classes for version " + version.getName());

        LinkstoneCompiler compiler = new LinkstoneCompiler();
        List<ClassNode> templates = compiler.loadClasses(outputDir);

        ClassStore classStore = new ClassStore();
        classStore.insert(templates);
        loadDependencies(classStore);



        List<ErrorReport.Error> errors = compiler.runLints(templates, classStore).getErrors();
        if (!errors.isEmpty()) {
            printErrors(errors);
            throw new MojoExecutionException("Templates contain errors");
        }

        FileUtils.delete(outputDir);

        List<ClassNode> generatedClasses = compiler.generateClasses(templates, classStore, version);
        compiler.writeClasses(outputDir, generatedClasses);
    }

    private void loadDependencies(ClassStore resolver) throws MojoExecutionException {
        for (Artifact artifact : project.getDependencyArtifacts()) {
            try {
                resolver.insertArtifact(artifact);
            } catch (IOException e) {
                throw new MojoExecutionException("Could not read artifact", e);
            }
        }
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
