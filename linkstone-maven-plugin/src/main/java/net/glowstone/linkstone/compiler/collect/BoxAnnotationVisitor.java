package net.glowstone.linkstone.compiler.collect;

import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.compiler.meta.BoxMeta;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/**
 * Visitor that collects the content of a {@link LBox} annotation into a {@link BoxMeta}.
 */
public class BoxAnnotationVisitor extends AnnotationVisitor {
    private final BoxMeta meta;

    public BoxAnnotationVisitor(BoxMeta meta) {
        this(meta, null);
    }

    public BoxAnnotationVisitor(BoxMeta meta, AnnotationVisitor av) {
        super(Opcodes.ASM6, av);
        this.meta = meta;
    }

    @Override
    public void visit(String name, Object value) {
        super.visit(name, value);
        if (name.equals("value")) {
            meta.setType((Type)value);
        }
    }
}
