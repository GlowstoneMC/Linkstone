package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.Method;
import me.aki.linkstone.annotations.MethodContainer;
import me.aki.linkstone.compiler.collect.NamedAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Represents the content of all {@link Method} annotations on a method in a template.
 */
public class MethodMeta extends NamedVersionedMeta {
    private final static String METHOD_ANNOTION_DESC = Type.getDescriptor(Method.class);
    private final static String METHOD_CONTAINER_ANNOTION_DESC = Type.getDescriptor(MethodContainer.class);

    public static MethodMeta from(MethodNode mn) {
        MethodMeta meta = new MethodMeta(mn.name);
        if (mn.visibleAnnotations != null) {
            for (AnnotationNode an : mn.visibleAnnotations) {
                if (an.desc.equals(METHOD_ANNOTION_DESC) ||
                        an.desc.equals(METHOD_CONTAINER_ANNOTION_DESC)) {
                    an.accept(new NamedAnnotationVisitor<>(meta));
                    meta.setAnnotated(true);
                }
            }
        }
        return meta;
    }

    private MethodMeta(String templateName) {
        super(templateName);
    }
}
