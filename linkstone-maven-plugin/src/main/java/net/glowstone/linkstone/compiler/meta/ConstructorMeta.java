package net.glowstone.linkstone.compiler.meta;

import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.compiler.collect.VersionAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Represents the content of a {@link LConstructor} annotation.
 */
public class ConstructorMeta extends AbstractVersionMeta {
    private final static String CONSTRUCTOR_ANNOTION_DESC = Type.getDescriptor(LConstructor.class);

    public static ConstructorMeta from(MethodNode mn) {
        ConstructorMeta meta = new ConstructorMeta();
        if (mn.visibleAnnotations != null) {
            for (AnnotationNode an : mn.visibleAnnotations) {
                if (an.desc.equals(CONSTRUCTOR_ANNOTION_DESC)) {
                    an.accept(new VersionAnnotationVisitor(meta));
                    meta.setAnnotated(true);
                }
            }
        }
        return meta;
    }
}
