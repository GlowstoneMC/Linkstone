package me.aki.linkstone.compiler.linting;

import me.aki.linkstone.annotations.Field;
import me.aki.linkstone.annotations.Generate;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

import java.util.List;

/**
 * Lint if a field has a {@link Generate} annotation but no {@link Field} annotations
 */
public class MissingFieldAnnotationLinter implements Linter {
    private final static String FIELD_ANNOTION_DESC = Type.getDescriptor(Field.class);
    private final static String GENERATE_ANNOTION_DESC = Type.getDescriptor(Generate.class);

    @Override
    public void lint(List<ClassNode> classes, ErrorReport report) {
        for (ClassNode cn : classes) {
            for (FieldNode fn  : cn.fields) {
                if(fn.visibleAnnotations == null) {
                    continue;
                }

                boolean hasFieldAnnotation = false;
                boolean hasGenerateAnnotation = false;

                for (AnnotationNode an : fn.visibleAnnotations) {
                    if (an.desc.equals(FIELD_ANNOTION_DESC)) {
                       hasFieldAnnotation = true;
                    } else if (an.desc.equals(GENERATE_ANNOTION_DESC)) {
                        hasGenerateAnnotation = true;
                    }
                }

                if(hasGenerateAnnotation && !hasFieldAnnotation) {
                    ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                    String message = "Field has a @Generate annotation but not @Field annotations";
                    report.addError(new ErrorReport.Error(message, location));
                }
            }
        }
    }
}
