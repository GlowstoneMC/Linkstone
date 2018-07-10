package net.glowstone.linkstone.compiler.meta;

import net.glowstone.linkstone.annotations.LGetter;
import net.glowstone.linkstone.compiler.collect.UnnamedAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Represents the content of a {@link LGetter} annotation.
 */
public class GetterMeta extends AbstractAccessorMeta {
    private final static String GETTER_ANNOTION_DESC = Type.getDescriptor(LGetter.class);

    public static GetterMeta from(MethodNode mn) {
        GetterMeta meta = new GetterMeta();
        if (mn.visibleAnnotations != null) {
            for (AnnotationNode an : mn.visibleAnnotations) {
                if (an.desc.equals(GETTER_ANNOTION_DESC)) {
                    an.accept(new UnnamedAnnotationVisitor(meta));
                    meta.setAnnotated(true);
                }
            }
        }
        return meta;
    }
}
