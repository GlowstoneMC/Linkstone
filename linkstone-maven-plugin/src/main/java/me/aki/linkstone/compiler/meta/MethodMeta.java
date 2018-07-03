package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.Method;
import me.aki.linkstone.annotations.MethodContainer;
import me.aki.linkstone.annotations.Version;
import me.aki.linkstone.compiler.collect.NamedAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Represents the content of all {@link Method} annotations on a method in a template.
 */
public class MethodMeta extends NamedMeta {
    private final static String METHOD_ANNOTION_DESC = Type.getDescriptor(Method.class);
    private final static String METHOD_CONTAINER_ANNOTION_DESC = Type.getDescriptor(MethodContainer.class);

    public static MethodMeta from(MethodNode mn) {
        MethodMeta meta = new MethodMeta(mn.name, new HashMap<>());
        if(mn.invisibleAnnotations != null) {
            for (AnnotationNode an : mn.invisibleAnnotations) {
                if (an.desc.equals(METHOD_ANNOTION_DESC) ||
                        an.desc.equals(METHOD_CONTAINER_ANNOTION_DESC)) {
                    an.accept(new NamedAnnotationVisitor<>(meta));
                }
            }
        }
        return meta;
    }

    private MethodMeta(String templateName, Map<Version, Optional<String>> mapping) {
        super(templateName, mapping);
    }
}
