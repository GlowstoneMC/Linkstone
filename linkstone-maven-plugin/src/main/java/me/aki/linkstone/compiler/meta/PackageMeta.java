package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.LPackage;
import me.aki.linkstone.annotations.LPackageContainer;
import me.aki.linkstone.annotations.Version;
import me.aki.linkstone.annotations.Mode;
import me.aki.linkstone.compiler.collect.PackageMetaVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Represents the content of all {@link LPackage} annotations on a package-info template.
 */
public class PackageMeta extends NamedVersionedMeta {
    private final static String PACKAGE_ANNOTION_DESC = Type.getDescriptor(LPackage.class);
    private final static String PACKAGE_CONTAINER_ANNOTION_DESC = Type.getDescriptor(LPackageContainer.class);

    public static PackageMeta from(ClassNode cn) {
        String pkg = cn.name.substring(0, cn.name.lastIndexOf('/'));
        PackageMeta meta = new PackageMeta(pkg);
        if (cn.visibleAnnotations != null) {
            for (AnnotationNode an : cn.visibleAnnotations) {
                if (an.desc.equals(PACKAGE_ANNOTION_DESC) ||
                        an.desc.equals(PACKAGE_CONTAINER_ANNOTION_DESC)) {
                    an.accept(new PackageMetaVisitor(meta));
                    meta.setAnnotated(true);
                }
            }
        }
        return meta;
    }

    private final Map<Version, Mode> targetMap = new HashMap<>();

    private PackageMeta(String templateName) {
        super(templateName);
    }

    /**
     * @param version where the mode is assigned
     * @return what part of the name should be replaced
     */
    public Optional<Mode> getModeOpt(Version version) {
        return Optional.ofNullable(targetMap.get(version));
    }

    /**
     * Get the assigned mode or else {@link Mode#DEFAULT}
     *
     * @param version where the mode is assigned
     * @return what part of the name should be replaced
     */
    public Mode getModeOrDefault(Version version) {
        return targetMap.getOrDefault(version, Mode.DEFAULT);
    }

    public void putTarget(Version version, Mode target) {
        this.targetMap.put(version, target);
    }
}
