package net.glowstone.linkstone.compiler.collect;

import net.glowstone.linkstone.annotations.LGetter;
import net.glowstone.linkstone.annotations.LSetter;
import net.glowstone.linkstone.annotations.Version;
import net.glowstone.linkstone.compiler.meta.AbstractAccessorMeta;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Opcodes;

/**
 * Visitor that adds all values of {@link LGetter} and
 * {@link LSetter} annotations to a {@link AbstractAccessorMeta}.
 */
public class UnnamedAnnotationVisitor extends AnnotationVisitor {
    private final AbstractAccessorMeta meta;

    public UnnamedAnnotationVisitor(AbstractAccessorMeta meta) {
        this(meta, null);
    }

    private UnnamedAnnotationVisitor(AbstractAccessorMeta meta, AnnotationVisitor av) {
        super(Opcodes.ASM6, av);
        this.meta = meta;
    }

    @Override
    public AnnotationVisitor visitArray(String name) {
        AnnotationVisitor av = super.visitArray(name);
        if (name.equals("version")) {
            av = new AnnotationVisitor(api, av) {
                @Override
                public void visitEnum(String name, String descriptor, String value) {
                    super.visitEnum(name, descriptor, value);
                    meta.getVersions().add(Version.valueOf(value));
                }
            };
        }
        return av;
    }

}
