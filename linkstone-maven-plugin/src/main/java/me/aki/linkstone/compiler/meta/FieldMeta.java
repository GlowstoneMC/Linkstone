package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.Field;
import me.aki.linkstone.annotations.FieldContainer;
import me.aki.linkstone.annotations.Version;
import me.aki.linkstone.compiler.collect.NamedAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Represents the content of all {@link Field} annotations on a field in a template.
 */
public class FieldMeta extends NamedMeta {
    private final static String FIELD_ANNOTION_DESC = Type.getDescriptor(Field.class);
    private final static String FIELD_CONTAINER_ANNOTION_DESC = Type.getDescriptor(FieldContainer.class);

    public static FieldMeta from(FieldNode fn) {
        FieldMeta meta = new FieldMeta(fn.name, new HashMap<>());
        if(fn.invisibleAnnotations != null) {
            for (AnnotationNode an : fn.invisibleAnnotations) {
                if (an.desc.equals(FIELD_ANNOTION_DESC) ||
                        an.desc.equals(FIELD_CONTAINER_ANNOTION_DESC)) {
                    an.accept(new NamedAnnotationVisitor<>(meta));
                }
            }
        }
        return meta;
    }

    private FieldMeta(String templateName, Map<Version, Optional<String>> mapping) {
        super(templateName, mapping);
    }
}
