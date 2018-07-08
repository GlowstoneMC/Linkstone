package me.aki.linkstone.compiler.linting;

import me.aki.linkstone.annotations.LField;
import me.aki.linkstone.annotations.LGenerate;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

import java.util.List;

/**
 * Lint if a field has a {@link LGenerate} annotation but no {@link LField} annotations
 */
public class MissingFieldAnnotationLinter implements Linter {
    private final static String FIELD_ANNOTION_DESC = Type.getDescriptor(LField.class);
    private final static String GENERATE_ANNOTION_DESC = Type.getDescriptor(LGenerate.class);

    @Override
    public void lint(List<ClassNode> classes, ErrorReport report) {
        for (ClassNode cn : classes) {
            for (FieldNode fn  : cn.fields) {
                if (fn.visibleAnnotations == null) {
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

                if (hasGenerateAnnotation && !hasFieldAnnotation) {
                    ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                    String message = "Field has a @LGenerate annotation but not @LField annotations";
                    report.addError(new ErrorReport.Error(message, location));
                }
            }
        }
    }
}
