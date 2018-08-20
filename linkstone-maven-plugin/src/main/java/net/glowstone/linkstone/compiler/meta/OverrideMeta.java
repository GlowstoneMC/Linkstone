package net.glowstone.linkstone.compiler.meta;

import net.glowstone.linkstone.annotations.LOverride;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Represents the content of a {@link LOverride} annotation.
 */
public class OverrideMeta implements Meta {
    public final static String METHOD_OVERRIDE_ANNOTATION_DESC = Type.getDescriptor(LOverride.class);

    public static OverrideMeta from(MethodNode mn) {
        OverrideMeta meta = new OverrideMeta();
        if (mn.visibleAnnotations != null) {
            for (AnnotationNode an : mn.visibleAnnotations) {
                if (an.desc.equals(METHOD_OVERRIDE_ANNOTATION_DESC)) {
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
        return isAnnotated;
    }

    public void setAnnotated(boolean annotated) {
        isAnnotated = annotated;
    }
}
