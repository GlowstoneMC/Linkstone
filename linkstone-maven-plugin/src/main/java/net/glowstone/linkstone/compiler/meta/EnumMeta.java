package net.glowstone.linkstone.compiler.meta;

import net.glowstone.linkstone.annotations.LEnum;
import net.glowstone.linkstone.annotations.LEnumContainer;
import net.glowstone.linkstone.compiler.collect.NamedAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldNode;

/**
 * Represents the content of all {@link LEnum} annotations on an enum constant.
 */
public class EnumMeta extends NamedVersionedMeta {
    private final static String ENUM_ANNOTION_DESC = Type.getDescriptor(LEnum.class);
    private final static String ENUM_CONTAINER_ANNOTION_DESC = Type.getDescriptor(LEnumContainer.class);

    public static EnumMeta from(FieldNode fn) {
        EnumMeta meta = new EnumMeta(fn.name);
        if (fn.visibleAnnotations != null) {
            for (AnnotationNode an : fn.visibleAnnotations) {
                if (an.desc.equals(ENUM_ANNOTION_DESC) ||
                        an.desc.equals(ENUM_CONTAINER_ANNOTION_DESC)) {
                    an.accept(new NamedAnnotationVisitor<>(meta));
                    meta.setAnnotated(true);
                }
            }
        }
        return meta;
    }

    public EnumMeta(String defaultName) {
        super(defaultName);
    }
}
