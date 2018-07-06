package me.aki.linkstone.compiler.linting;

import me.aki.linkstone.annotations.Delegate;
import me.aki.linkstone.compiler.ClassStore;
import me.aki.linkstone.compiler.meta.DelegateMeta;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Lint if a {@link Delegate} annotation is used wrong
 */
public class DelegateLinter implements Linter {

    private final ClassStore classStore;

    public DelegateLinter(ClassStore classStore) {
        this.classStore = classStore;
    }

    @Override
    public void lint(List<ClassNode> classes, ErrorReport report) {
        for (ClassNode cn : classes) {
            Set<Type> delegateInterfaces = new HashSet<>();

            for (FieldNode fn : cn.fields) {
                DelegateMeta meta = DelegateMeta.from(fn);
                if (!meta.hasAnnotation()) {
                    continue;
                }

                for (Type t : meta.getDelegateClasses()) {
                    if (t.getSort() == Type.OBJECT) {
                        ClassNode tcn = classStore.getClass(t.getInternalName());
                        if (!Modifier.isInterface(tcn.access)) {
                            ErrorReport.Class location = new ErrorReport.Class(cn.name);
                            String message = "@Delegate annotation contains a non interface type";
                            report.addError(new ErrorReport.Error(message, location));
                        }
                    } else {
                        ErrorReport.Class location = new ErrorReport.Class(cn.name);
                        String message = "@Delegate annotation contains a non class type";
                        report.addError(new ErrorReport.Error(message, location));
                    }
                }

                for (Type t : meta.getDelegateClasses()) {
                    if (!delegateInterfaces.add(t)) {
                        ErrorReport.Class location = new ErrorReport.Class(cn.name);
                        String message = "multiple @Delegate annotations contain the same type (" + t.getClassName() + ")";
                        report.addError(new ErrorReport.Error(message, location));
                    }
                }
            }
        }
    }
}
