package net.glowstone.linkstone.compiler.meta;

import net.glowstone.linkstone.annotations.LMethodOverride;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Represents the content of a {@link LMethodOverride} annotation.
 */
public class MethodOverrideMeta implements Meta {
    private final static String METHOD_OVERRIDE_ANNOTATION_DESC = Type.getDescriptor(LMethodOverride.class);

    public static MethodOverrideMeta from(MethodNode mn) {
        MethodOverrideMeta meta = new MethodOverrideMeta();
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
