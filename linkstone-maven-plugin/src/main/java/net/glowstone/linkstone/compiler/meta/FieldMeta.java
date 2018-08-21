package net.glowstone.linkstone.compiler.meta;

import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LFieldContainer;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LRedirect;
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
    private final static String REDIRECT_ANNOTION_DESC = Type.getDescriptor(LRedirect.class);

    public static FieldMeta from(FieldNode fn) {
        FieldMeta meta = new FieldMeta(fn.name);
        if (fn.visibleAnnotations != null) {
            for (AnnotationNode an : fn.visibleAnnotations) {
                if (an.desc.equals(FIELD_ANNOTION_DESC) ||
                        an.desc.equals(FIELD_CONTAINER_ANNOTION_DESC)) {
                    an.accept(new NamedAnnotationVisitor<>(meta));
                    meta.setAnnotated(true);
                } else if (an.desc.equals(REDIRECT_ANNOTION_DESC)) {
                    meta.generate = false;
                }
            }
        }
        return meta;
    }

    private boolean generate = true;

    public FieldMeta(String templateName) {
        super(templateName);
    }

    /**
     * Return whether getters and setters that accesses/sets the field.
     * This is necessary if {@link LMethod} annotated fields are not
     * annotated with a {@link LRedirect} annotation.
     *
     * @return whether the compiler generates a getter and setter.
     */
    public boolean isGenerate() {
        return generate;
    }
}
