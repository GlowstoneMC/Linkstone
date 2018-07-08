package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.LSetter;
import me.aki.linkstone.compiler.collect.UnnamedAnnotationVisitor;
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
