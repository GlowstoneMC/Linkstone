package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.Delegate;
import me.aki.linkstone.compiler.collect.DelegateAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the content of a {@link Delegate} annotation.
 */
public class DelegateMeta implements Meta {
    public static final String DELEGATE_ANNOTATION_DESC = Type.getDescriptor(Delegate.class);

    public static DelegateMeta from(FieldNode fn) {
        DelegateMeta meta = new DelegateMeta();
        if(fn.visibleAnnotations != null) {
            for (AnnotationNode an : fn.visibleAnnotations) {
                if (an.desc.equals(DELEGATE_ANNOTATION_DESC)) {
                    an.accept(new DelegateAnnotationVisitor(meta));
                }
            }
        }
        return meta;
    }

    private List<Type> delegateClass = new ArrayList<>();

    /**
     * @return types that the class will inherit
     * @see Delegate#value()
     */
    public List<Type> getDelegateClasses() {
        return delegateClass;
    }

    @Override
    public boolean hasAnnotation() {
        return !delegateClass.isEmpty();
    }
}