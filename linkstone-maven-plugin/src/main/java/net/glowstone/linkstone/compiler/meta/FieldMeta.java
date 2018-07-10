package net.glowstone.linkstone.compiler.meta;

import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LFieldContainer;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.linkstone.compiler.collect.NamedAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldNode;

/**
 * Represents the content of all {@link LField} annotations on a field in a template.
 */
public class FieldMeta extends NamedVersionedMeta {
    private final static String FIELD_ANNOTION_DESC = Type.getDescriptor(LField.class);
    private final static String FIELD_CONTAINER_ANNOTION_DESC = Type.getDescriptor(LFieldContainer.class);
    private final static String GENERATE_ANNOTION_DESC = Type.getDescriptor(LGenerate.class);

    public static FieldMeta from(FieldNode fn) {
        FieldMeta meta = new FieldMeta(fn.name);
        if (fn.visibleAnnotations != null) {
            for (AnnotationNode an : fn.visibleAnnotations) {
                if (an.desc.equals(FIELD_ANNOTION_DESC) ||
                        an.desc.equals(FIELD_CONTAINER_ANNOTION_DESC)) {
                    an.accept(new NamedAnnotationVisitor<>(meta));
                    meta.setAnnotated(true);
                } else if (an.desc.equals(GENERATE_ANNOTION_DESC)) {
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
     * @see LGenerate
     */
    public boolean isGenerate() {
        return generate;
    }
}
