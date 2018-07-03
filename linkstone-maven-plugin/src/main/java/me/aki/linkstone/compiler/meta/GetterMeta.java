package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.Getter;
import me.aki.linkstone.annotations.Version;
import me.aki.linkstone.compiler.collect.UnnamedAnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Represents the content of a {@link Getter} annotation.
 */
public class GetterMeta extends UnnamedMeta {
    private final static String GETTER_ANNOTION_DESC = Type.getDescriptor(Getter.class);

    public static GetterMeta from(MethodNode mn) {
        GetterMeta meta = new GetterMeta(new HashSet<>());
        if(mn.invisibleAnnotations != null) {
            for (AnnotationNode an : mn.invisibleAnnotations) {
                if (an.desc.equals(GETTER_ANNOTION_DESC)) {
                    an.accept(new UnnamedAnnotationVisitor(meta));
                }
            }
        }
        return meta;
    }

    private GetterMeta(Set<Version> versions) {
        super(versions);
    }
}
