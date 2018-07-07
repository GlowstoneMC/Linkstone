package me.aki.linkstone.compiler.meta;

import org.objectweb.asm.tree.MethodNode;
import me.aki.linkstone.annotations.Overridden;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;

/**
 * Represents the content of a {@link Overridden} annotation.
 */
public class OverriddenMeta implements Meta {
    private final static String OVERRIDDEN_ANNOTATION_DESC = Type.getDescriptor(Overridden.class);

    public static OverriddenMeta from(MethodNode mn) {
        OverriddenMeta meta = new OverriddenMeta();
        if (mn.visibleAnnotations != null) {
            for (AnnotationNode an : mn.visibleAnnotations) {
                if (an.desc.equals(OVERRIDDEN_ANNOTATION_DESC)) {
                    meta.setAnnotated(true);
                    break;
                }
            }
        }
        return meta;

    }

    private boolean isAnnotated;

    @Override
    public boolean isAnnotated() {
        return this.isAnnotated;
    }

    public void setAnnotated(boolean annotated) {
        this.isAnnotated = annotated;
    }
}
