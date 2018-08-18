package net.glowstone.linkstone.compiler.meta;

import net.glowstone.linkstone.annotations.LImplements;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;

/**
 * Represents the content of a {@link LImplements} annotation.
 */
public class ImplementsMeta implements Meta {
    private final static String OVERRIDDEN_ANNOTATION_DESC = Type.getDescriptor(LImplements.class);

    public static ImplementsMeta from(MethodNode mn) {
        ImplementsMeta meta = new ImplementsMeta();
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
