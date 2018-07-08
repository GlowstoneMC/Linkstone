package me.aki.linkstone.compiler.linting;

import me.aki.linkstone.annotations.Box;
import me.aki.linkstone.annotations.Boxed;
import me.aki.linkstone.compiler.meta.BoxMeta;
import me.aki.linkstone.compiler.meta.BoxedMeta;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Lint if a {@link Box} annotation has illegal types or the annotated class
 * has no corresponding constructor.
 */
public class BoxLinter implements Linter {
    @Override
    public void lint(List<ClassNode> classes, ErrorReport report) {
        for (ClassNode cn : classes) {
            BoxMeta meta = BoxMeta.from(cn);
            if (!meta.isAnnotated()) {
                continue;
            }

            if (validateBoxType(cn, meta.getType(), report)) {
                checkBoxedField(cn, meta.getType(), report);
                lintMissingConstructor(cn, meta.getType(), report);
            }
        }
    }

    /**
     * Lint if there's no field with a {@link Boxed} annotation that has the corrent type.
     *
     * @param cn current class being processed
     * @param boxType type that the class boxes
     * @param report error report for user
     */
    private void checkBoxedField(ClassNode cn, Type boxType, ErrorReport report) {
        List<FieldNode> annotatedFields = cn.fields.stream()
                .filter(fn -> BoxedMeta.from(fn).isAnnotated())
                .collect(Collectors.toList());

        switch (annotatedFields.size()) {
            case 0: {
                ErrorReport.Class location = new ErrorReport.Class(cn.name);
                String message = "Cannot find field with @Boxed annotation";
                report.addError(new ErrorReport.Error(message, location));
                break;
            }

            case 1: {
                FieldNode fn = annotatedFields.get(0);
                if (!fn.desc.equals(boxType.getDescriptor())) {
                    ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                    String message = "@Boxed field has a different type than the @Box annotation";
                    report.addError(new ErrorReport.Error(message, location));
                }
                break;
            }

            default: {
                ErrorReport.Class location = new ErrorReport.Class(cn.name);
                String message = "Multiple fields have a @Boxed annotation";
                report.addError(new ErrorReport.Error(message, location));
                break;
            }
        }
    }

    private boolean validateBoxType(ClassNode cn, Type type, ErrorReport report) {
        if (type.getSort() == Type.OBJECT) {
            return true;
        } else {
            ErrorReport.Class location = new ErrorReport.Class(cn.name);
            String message = "Only class types can be boxed";
            report.addError(new ErrorReport.Error(message, location));
            return false;
        }
    }

    private void lintMissingConstructor(ClassNode cn, Type type, ErrorReport report) {
        boolean hasConstructor = cn.methods.stream().anyMatch(mn ->
                mn.name.equals("<init>") &&
                        mn.desc.equals("(" + type.getDescriptor() + ")V"));

        if (!hasConstructor) {
            ErrorReport.Class location = new ErrorReport.Class(cn.name);
            String message = "Cannot find box descriptor for type " + type.getInternalName();
            report.addError(new ErrorReport.Error(message, location));
        }
    }
}
