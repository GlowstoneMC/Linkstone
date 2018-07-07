package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.Overrides;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;

/**
 * Represents the content of a {@link Overrides} annotation.
 */
public class OverridesMeta implements Meta {
    private final static String OVERRIDDEN_ANNOTATION_DESC = Type.getDescriptor(Overrides.class);

    public static OverridesMeta from(MethodNode mn) {
        OverridesMeta meta = new OverridesMeta();
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
