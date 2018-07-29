package net.glowstone.linkstone.runtime.collect;

import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LFieldContainer;
import net.glowstone.linkstone.runtime.FieldSet;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Type;

import static org.objectweb.asm.Opcodes.*;

/**
 * Class visitor that stores all fields annotated with a {@link LField} or
 * {@link LFieldContainer} annotation in a {@link FieldSet}.
 */
public class AnnotatedFieldCollectVisitor extends ClassVisitor {
    private final static String FIELD_ANNOTATION_SIGNATURE = Type.getDescriptor(LField.class);
    private final static String FIELD_CONTAINER_ANNOTATION_SIGNATURE = Type.getDescriptor(LFieldContainer.class);

    private final FieldSet annotatedFields;
    private String className;

    public AnnotatedFieldCollectVisitor(FieldSet annotatedFields) {
        this(annotatedFields, null);
    }

    public AnnotatedFieldCollectVisitor(FieldSet annotatedFields, ClassVisitor classVisitor) {
        super(ASM6, classVisitor);
        this.annotatedFields = annotatedFields;
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(version, access, name, signature, superName, interfaces);
        this.className = name;
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        FieldVisitor fv = super.visitField(access, name, descriptor, signature, value);
        String fieldDescriptor = descriptor;
        fv = new FieldVisitor(api, fv) {
            @Override
            public AnnotationVisitor visitAnnotation(String annotationDescriptor, boolean visible) {
                if (annotationDescriptor.equals(FIELD_ANNOTATION_SIGNATURE) ||
                        annotationDescriptor.equals(FIELD_CONTAINER_ANNOTATION_SIGNATURE)) {
                    annotatedFields.add(className, name, fieldDescriptor);
                }
                return super.visitAnnotation(annotationDescriptor, visible);
            }
        };
        return fv;
    }
}
