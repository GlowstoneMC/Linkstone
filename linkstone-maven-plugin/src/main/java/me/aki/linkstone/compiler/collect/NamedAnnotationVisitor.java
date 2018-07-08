package me.aki.linkstone.compiler.collect;

import me.aki.linkstone.annotations.LField;
import me.aki.linkstone.compiler.meta.NamedVersionedMeta;
import me.aki.linkstone.annotations.LClassfile;
import me.aki.linkstone.annotations.LMethod;
import me.aki.linkstone.annotations.Version;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Opcodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Visitor that adds values of {@link LField}, {@link LMethod} or
 * {@link LClassfile} annotations to a {@link NamedVersionedMeta}.
 */
public class NamedAnnotationVisitor<T extends NamedVersionedMeta> extends AnnotationVisitor {
    protected final T meta;
    protected List<Version> versions = new ArrayList<>();
    private Optional<String> name = Optional.empty();

    public NamedAnnotationVisitor(T meta) {
        this(meta, null);
    }

    public NamedAnnotationVisitor(T meta, AnnotationVisitor av) {
        super(Opcodes.ASM6, av);
        this.meta = meta;
    }

    protected NamedAnnotationVisitor newVisitor(T meta, AnnotationVisitor av) {
        return new NamedAnnotationVisitor(meta, av);
    }

    @Override
    public void visit(String name, Object value) {
        super.visit(name, value);
        if (name.equals("name")) {
            this.name = Optional.of((String)value);
        }
    }

    @Override
    public AnnotationVisitor visitArray(String name) {
        AnnotationVisitor av = super.visitArray(name);
        switch (name) {
            case "value":
                // The visitor is visiting a "container" annotation
                av = new AnnotationVisitor(api, av) {
                    @Override
                    public AnnotationVisitor visitAnnotation(String name, String descriptor) {
                        AnnotationVisitor av = super.visitAnnotation(name, descriptor);
                        av = newVisitor(meta, av);
                        return av;
                    }
                };
                break;

            case "version":
                av = new AnnotationVisitor(api, av) {
                    @Override
                    public void visitEnum(String name, String descriptor, String value) {
                        super.visitEnum(name, descriptor, value);
                        versions.add(Version.valueOf(value));
                    }
                };
                break;
        }
        return av;
    }

    @Override
    public void visitEnd() {
        super.visitEnd();
        for (Version version : versions) {
            meta.getMapping().put(version, name);
        }
    }
}
