package net.glowstone.linkstone.compiler.meta;

import net.glowstone.linkstone.annotations.LDelegate;
import net.glowstone.linkstone.compiler.collect.DelegateAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the content of a {@link LDelegate} annotation.
 */
public class DelegateMeta implements Meta {
    public static final String DELEGATE_ANNOTATION_DESC = Type.getDescriptor(LDelegate.class);

    public static DelegateMeta from(FieldNode fn) {
        DelegateMeta meta = new DelegateMeta();
        if (fn.visibleAnnotations != null) {
            for (AnnotationNode an : fn.visibleAnnotations) {
                if (an.desc.equals(DELEGATE_ANNOTATION_DESC)) {
                    an.accept(new DelegateAnnotationVisitor(meta));
                    meta.setAnnotated(true);
                }
            }
        }
        return meta;
    }

    private boolean isAnnotated;
    private List<Type> delegateClass = new ArrayList<>();

    /**
     * @return types that the class will inherit
     * @see LDelegate#value()
     */
    public List<Type> getDelegateClasses() {
        return delegateClass;
    }

    @Override
    public boolean isAnnotated() {
        return isAnnotated;
    }

    public void setAnnotated(boolean annotated) {
        isAnnotated = annotated;
    }
}
