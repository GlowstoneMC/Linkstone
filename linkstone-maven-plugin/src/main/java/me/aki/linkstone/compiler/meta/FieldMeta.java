package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.Field;
import me.aki.linkstone.annotations.FieldContainer;
import me.aki.linkstone.annotations.Generate;
import me.aki.linkstone.compiler.collect.NamedAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldNode;

/**
 * Represents the content of all {@link Field} annotations on a field in a template.
 */
public class FieldMeta extends NamedMeta {
    private final static String FIELD_ANNOTION_DESC = Type.getDescriptor(Field.class);
    private final static String FIELD_CONTAINER_ANNOTION_DESC = Type.getDescriptor(FieldContainer.class);
    private final static String GENERATE_ANNOTION_DESC = Type.getDescriptor(Generate.class);

    public static FieldMeta from(FieldNode fn) {
        FieldMeta meta = new FieldMeta(fn.name);
        if(fn.visibleAnnotations != null) {
            for (AnnotationNode an : fn.visibleAnnotations) {
                if (an.desc.equals(FIELD_ANNOTION_DESC) ||
                        an.desc.equals(FIELD_CONTAINER_ANNOTION_DESC)) {
                    an.accept(new NamedAnnotationVisitor<>(meta));
                } else if(an.desc.equals(GENERATE_ANNOTION_DESC)) {
                    meta.generate = true;
                }
            }
        }
        return meta;
    }

    private boolean generate;

    public FieldMeta(String templateName) {
        super(templateName);
    }

    /**
     * @return whether the compiler generates a getter and setter.
     * @see Generate
     */
    public boolean isGenerate() {
        return generate;
    }
}
