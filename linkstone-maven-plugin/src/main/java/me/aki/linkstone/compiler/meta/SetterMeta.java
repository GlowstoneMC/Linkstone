package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.Setter;
import me.aki.linkstone.annotations.Version;
import me.aki.linkstone.compiler.collect.UnnamedAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Represents the content of a {@link Setter} annotation.
 */
public class SetterMeta extends UnnamedMeta {
    private final static String SETTER_ANNOTION_DESC = Type.getDescriptor(Setter.class);

    public static SetterMeta from(MethodNode mn) {
        SetterMeta meta = new SetterMeta(new HashSet<>());
        if(mn.invisibleAnnotations != null) {
            for (AnnotationNode an : mn.invisibleAnnotations) {
                if (an.desc.equals(SETTER_ANNOTION_DESC)) {
                    an.accept(new UnnamedAnnotationVisitor(meta));
                }
            }
        }
        return meta;
    }

    private SetterMeta(Set<Version> versions) {
        super(versions);
    }
}
