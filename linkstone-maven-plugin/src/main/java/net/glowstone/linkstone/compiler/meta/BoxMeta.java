package net.glowstone.linkstone.compiler.meta;

import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.compiler.collect.BoxAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;

/**
 * Represents the content of a {@link LBox} annotation.
 */
public class BoxMeta implements Meta {
    public static final String BOX_ANNOTATION_DESC = Type.getDescriptor(LBox.class);

    public static BoxMeta from(ClassNode cn) {
        BoxMeta meta = new BoxMeta();
        if (cn.visibleAnnotations != null) {
            for (AnnotationNode an : cn.visibleAnnotations) {
                if (an.desc.equals(BOX_ANNOTATION_DESC)) {
                    an.accept(new BoxAnnotationVisitor(meta));
                    meta.setAnnotated(true);
                }
            }
        }
        return meta;
    }

    private boolean isAnnotated;
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean isAnnotated() {
        return isAnnotated;
    }

    public void setAnnotated(boolean annotated) {
        isAnnotated = annotated;
    }
}
