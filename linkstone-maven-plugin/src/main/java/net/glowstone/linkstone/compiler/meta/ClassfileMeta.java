package net.glowstone.linkstone.compiler.meta;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LClassfileContainer;
import net.glowstone.linkstone.compiler.collect.NamedAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;

/**
 * Represents the content of all {@link LClassfile} annotations on a template class.
 */
public class ClassfileMeta extends NamedVersionedMeta {
    private final static String CLASSFILE_ANNOTION_DESC = Type.getDescriptor(LClassfile.class);
    private final static String CLASSFILE_CONTAINER_ANNOTION_DESC = Type.getDescriptor(LClassfileContainer.class);

    public static ClassfileMeta from(ClassNode cn) {
        String[] split = cn.name.split("/");
        String className = split[split.length - 1];

        ClassfileMeta meta = new ClassfileMeta(className);
        if (cn.visibleAnnotations != null) {
            for (AnnotationNode an : cn.visibleAnnotations) {
                if (an.desc.equals(CLASSFILE_ANNOTION_DESC) ||
                        an.desc.equals(CLASSFILE_CONTAINER_ANNOTION_DESC)) {
                    an.accept(new NamedAnnotationVisitor<>(meta));
                    meta.setAnnotated(true);
                }
            }
        }
        return meta;
    }

    private ClassfileMeta(String templateName) {
        super(templateName);
    }
}
