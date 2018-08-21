package net.glowstone.linkstone.compiler.linting;

import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LRedirect;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

import java.util.List;

/**
 * Lint if a field has a {@link LRedirect} annotation but no {@link LField} annotations
 */
public class MissingFieldAnnotationLinter implements Linter {
    private final static String FIELD_ANNOTION_DESC = Type.getDescriptor(LField.class);
    private final static String REDIRECT_ANNOTION_DESC = Type.getDescriptor(LRedirect.class);

    @Override
    public void lint(List<ClassNode> classes, ErrorReport report) {
        for (ClassNode cn : classes) {
            for (FieldNode fn  : cn.fields) {
                if (fn.visibleAnnotations == null) {
                    continue;
                }

                boolean hasFieldAnnotation = false;
                boolean hasRedirectAnnotation = false;

                for (AnnotationNode an : fn.visibleAnnotations) {
                    if (an.desc.equals(FIELD_ANNOTION_DESC)) {
                       hasFieldAnnotation = true;
                    } else if (an.desc.equals(REDIRECT_ANNOTION_DESC)) {
                        hasRedirectAnnotation = true;
                    }
                }

                if (hasRedirectAnnotation && !hasFieldAnnotation) {
                    ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                    String message = "Field has a @LRedirect annotation but no @LField annotations";
                    report.addError(new ErrorReport.Error(message, location));
                }
            }
        }
    }
}
