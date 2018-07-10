package net.glowstone.linkstone.compiler.meta;

import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LMethodContainer;
import net.glowstone.linkstone.compiler.collect.NamedAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Represents the content of all {@link LMethod} annotations on a method in a template.
 */
public class MethodMeta extends NamedVersionedMeta {
    private final static String METHOD_ANNOTION_DESC = Type.getDescriptor(LMethod.class);
    private final static String METHOD_CONTAINER_ANNOTION_DESC = Type.getDescriptor(LMethodContainer.class);

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
