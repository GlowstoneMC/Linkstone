package net.glowstone.linkstone.compiler.meta;

import net.glowstone.linkstone.annotations.LBoxed;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldNode;

/**
 * Represents the content of a {@link LBoxed} annotation.
 */
public class BoxedMeta implements Meta {
    public static final String BOXED_ANNOTATION_DESC = Type.getDescriptor(LBoxed.class);

    public static BoxedMeta from(FieldNode fn) {
        BoxedMeta meta = new BoxedMeta();
        if (fn.visibleAnnotations != null) {
            for (AnnotationNode an : fn.visibleAnnotations) {
                if (an.desc.equals(BOXED_ANNOTATION_DESC)) {
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
