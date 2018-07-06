package me.aki.linkstone.compiler.collect;

import me.aki.linkstone.annotations.Delegate;
import me.aki.linkstone.compiler.meta.DelegateMeta;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/**
 * Visitor that adds values of {@link Delegate} annotations to a {@link DelegateMeta}.
 */
public class DelegateAnnotationVisitor extends AnnotationVisitor {
    private final DelegateMeta meta;

    public DelegateAnnotationVisitor(DelegateMeta meta) {
        this(meta, null);
    }

    public DelegateAnnotationVisitor(DelegateMeta meta, AnnotationVisitor av) {
        super(Opcodes.ASM6, av);
        this.meta = meta;
    }

    @Override
    public void visit(String name, Object value) {
        super.visit(name, value);
    }

    @Override
    public AnnotationVisitor visitArray(String name) {
        AnnotationVisitor av = super.visitArray(name);
        if(name.equals("value")) {
            av = new AnnotationVisitor(api, av) {
                @Override
                public void visit(String name, Object value) {
                    super.visit(name, value);
                    meta.getDelegateClasses().add((Type)value);
                }
            };
        }
        return av;
    }
}
