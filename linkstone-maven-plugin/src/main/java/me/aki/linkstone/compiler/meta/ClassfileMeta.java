package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.Classfile;
import me.aki.linkstone.annotations.ClassfileContainer;
import me.aki.linkstone.compiler.collect.NamedAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;

/**
 * Represents the content of all {@link Classfile} annotations on a template class.
 */
public class ClassfileMeta extends NamedVersionedMeta {
    private final static String CLASSFILE_ANNOTION_DESC = Type.getDescriptor(Classfile.class);
    private final static String CLASSFILE_CONTAINER_ANNOTION_DESC = Type.getDescriptor(ClassfileContainer.class);

    public static ClassfileMeta from(ClassNode cn) {
        String[] split = cn.name.split("/");
        String className = split[split.length - 1];

        ClassfileMeta meta = new ClassfileMeta(className);
        if(cn.visibleAnnotations != null) {
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
