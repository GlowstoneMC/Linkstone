package net.glowstone.linkstone.compiler.collect;

import net.glowstone.linkstone.compiler.meta.PackageMeta;
import net.glowstone.linkstone.annotations.Mode;
import net.glowstone.linkstone.annotations.LPackage;
import net.glowstone.linkstone.annotations.Version;
import org.objectweb.asm.AnnotationVisitor;

import java.util.Optional;

/**
 * Visitor that adds the values of a {@link LPackage} annotations to a {@link PackageMeta}
 */
public class PackageMetaVisitor extends NamedAnnotationVisitor<PackageMeta> {
    private Optional<Mode> mode = Optional.empty();

    public PackageMetaVisitor(PackageMeta meta) {
        this(meta, null);
    }

    public PackageMetaVisitor(PackageMeta meta, AnnotationVisitor av) {
        super(meta, av);
    }

    @Override
    protected NamedAnnotationVisitor newVisitor(PackageMeta meta, AnnotationVisitor av) {
        return new PackageMetaVisitor(meta, av);
    }

    @Override
    public void visitEnum(String name, String descriptor, String value) {
        super.visitEnum(name, descriptor, value);
        if (name.equals("mode")) {
            mode = Optional.of(Mode.valueOf(value));
        }
    }

    @Override
    public void visitEnd() {
        super.visitEnd();
        mode.ifPresent(mode -> {
            for (Version version : versions) {
                meta.putTarget(version, mode);
            }
        });
    }
}
