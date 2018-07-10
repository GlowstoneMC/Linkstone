package net.glowstone.linkstone.compiler.meta;

import net.glowstone.linkstone.annotations.LSetter;
import net.glowstone.linkstone.compiler.collect.UnnamedAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Represents the content of a {@link LSetter} annotation.
 */
public class SetterMeta extends AbstractAccessorMeta {
    private final static String SETTER_ANNOTION_DESC = Type.getDescriptor(LSetter.class);

    public static SetterMeta from(MethodNode mn) {
        SetterMeta meta = new SetterMeta();
        if (mn.visibleAnnotations != null) {
            for (AnnotationNode an : mn.visibleAnnotations) {
                if (an.desc.equals(SETTER_ANNOTION_DESC)) {
                    an.accept(new UnnamedAnnotationVisitor(meta));
                    meta.setAnnotated(true);
                }
            }
        }
        return meta;
    }
}
