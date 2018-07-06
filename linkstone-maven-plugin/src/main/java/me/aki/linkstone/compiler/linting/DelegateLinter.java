package me.aki.linkstone.compiler.linting;

import me.aki.linkstone.annotations.Delegate;
import me.aki.linkstone.compiler.ClassStore;
import me.aki.linkstone.compiler.meta.DelegateMeta;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

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

            int delegateCount = 0;
            for (FieldNode fn : cn.fields) {
                DelegateMeta meta = DelegateMeta.from(fn);
                if (!meta.isAnnotated()) {
                    continue;
                }

                if(delegateCount++ >= 1) {
                    ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                    String message = "Multiple @Delegate fields found";
                    report.addError(new ErrorReport.Error(message, location));
                }

                for (Type t : meta.getDelegateClasses()) {
                    if (t.getSort() == Type.OBJECT) {
                        ClassNode tcn = classStore.getClass(t.getInternalName());

                        if(tcn == null) {
                            ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                            String message = "Could not find class " + t.getInternalName() + " in dependency artifacts";
                            report.addError(new ErrorReport.Error(message, location));
                        } else if (!Modifier.isInterface(tcn.access)) {
                            ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                            String message = "@Delegate annotation contains a non interface type";
                            report.addError(new ErrorReport.Error(message, location));
                        }
                    } else {
                        ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                        String message = "@Delegate annotation contains a non class type";
                        report.addError(new ErrorReport.Error(message, location));
                    }
                }

                for (Type t : meta.getDelegateClasses()) {
                    if (!delegateInterfaces.add(t)) {
                        ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                        String message = "Multiple @Delegate annotations contain the same type (" + t.getClassName() + ")";
                        report.addError(new ErrorReport.Error(message, location));
                    }
                }

                MethodNode constructor = findConstructor(cn, fn);
                if (constructor == null) {
                    ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                    String message = "Could not find constructor corresponding constructor for delegate field";
                    report.addError(new ErrorReport.Error(message, location));
                }
            }
        }
    }

    private MethodNode findConstructor(ClassNode cn, FieldNode fn) {
        for(MethodNode mn : cn.methods) {
            if(mn.name.equals("<init>") && mn.desc.equals("(" + fn.desc + ")V")) {
                return mn;
            }
        }
        return null;
    }
}
