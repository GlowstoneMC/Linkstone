package me.aki.linkstone.runtime.collect;

import me.aki.linkstone.annotations.LBox;
import me.aki.linkstone.runtime.Boxes;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/**
 * Visitor that registers the visited class in a {@link Boxes} collection if
 * it has a {@link LBox} annotation.
 */
public class BoxCollectVisitor extends ClassVisitor {
    private static final String BOX_ANNOTATION_DESC = Type.getDescriptor(LBox.class);

    private final Boxes boxes;
    private String className;

    public BoxCollectVisitor(Boxes boxes) {
        this(boxes, null);
    }

    public BoxCollectVisitor(Boxes boxes, ClassVisitor classVisitor) {
        super(Opcodes.ASM6, classVisitor);
        this.boxes = boxes;
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(version, access, name, signature, superName, interfaces);
        this.className = name;
    }

    @Override
    public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
        AnnotationVisitor av = super.visitAnnotation(descriptor, visible);
        if (descriptor.equals(BOX_ANNOTATION_DESC)) {
            av = new AnnotationVisitor(api, av) {
                @Override
                public void visit(String name, Object value) {
                    super.visit(name, value);
                    if (name.equals("value")) {
                        boxes.addBox(Type.getObjectType(className), (Type) value);
                    }
                }
            };
        }
        return av;
    }
}
