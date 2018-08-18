package net.glowstone.linkstone.compiler.linting;

import static org.objectweb.asm.Opcodes.*;

import net.glowstone.linkstone.annotations.LDelegate;
import net.glowstone.linkstone.annotations.LImplements;
import net.glowstone.linkstone.compiler.ClassStore;
import net.glowstone.linkstone.compiler.meta.DelegateMeta;
import net.glowstone.linkstone.compiler.meta.ImplementsMeta;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;

import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Lint if a {@link LDelegate} annotation or the 'Linkstone.as(...)' method is used wrong.
 */
public class DelegateLinter implements Linter {
    private final ClassStore classStore;

    /**
     * Map a class to all interfaces delegated by the fields in that class.
     * This includes all interfaces extended by delegated interfaces.
     */
    private final Map<Type, Set<ClassNode>> delegatedInterfaces = new HashMap<>();

    public DelegateLinter(ClassStore classStore) {
        this.classStore = classStore;
    }

    @Override
    public void lint(List<ClassNode> classes, ErrorReport report) {
        for (ClassNode cn : classes) {
            Set<ClassNode> delegateInterfaces = collectDelegatedInterfaces(cn, report);
            if (delegateInterfaces != null && !delegateInterfaces.isEmpty()) {
                delegatedInterfaces.put(Type.getObjectType(cn.name), delegateInterfaces);
            }
        }

        for (ClassNode cn : classes) {
            Collection<ClassNode> interfaces = getAllDelegateInterfaces(cn);
            lintNotImplementingMethods(cn, interfaces, report);
            lintMissingImplementsAnnotation(cn, interfaces, report);

            for (MethodNode mn : cn.methods) {
                lintAsMethodUsage(cn, mn, report);
            }
        }
    }

    /**
     * Get the ClassNodes of all interfaces delegated to the fields of a class or
     * report if types in the annotations cannot be delegated.
     *
     * @param cn the class to scan
     * @param report error report for the user
     * @return ClassNodes of delegated interfaces
     */
    private Set<ClassNode> collectDelegatedInterfaces(ClassNode cn, ErrorReport report) {
        Set<Type> interfaceTypes = new HashSet<>();
        Set<ClassNode> interfaceNodes = new HashSet<>();

        for (FieldNode fn : cn.fields) {
            DelegateMeta meta = DelegateMeta.from(fn);
            if (!meta.isAnnotated()) {
                continue;
            }

            Set<Type> fieldInterfaceTypes = new HashSet<>();
            for (Type iface : meta.getDelegateClasses()) {
                addInterfacesRecursive(cn, fn, iface, interfaceNodes, interfaceTypes,
                        fieldInterfaceTypes, report);
            }
        }

        return interfaceNodes;
    }

    /**
     * Check whether a certain type is a delegable interfaces and thereby add it to certain sets.
     *
     * @param cn current processed class containing the delegated field
     * @param fn the delegated field being processed
     * @param iface the interface to delegate to the field
     * @param interfaceNodes ClassNodes of interfaces delegated by the current processed class
     * @param interfaceTypes types of interfaces delegated by the current processed class
     * @param fieldInterfaces all interfaces delegated by the current field
     * @param report error report for the user
     */
    private void addInterfacesRecursive(ClassNode cn, FieldNode fn, Type iface,
                                        Set<ClassNode> interfaceNodes, Set<Type> interfaceTypes,
                                        Set<Type> fieldInterfaces, ErrorReport report) {
        if (iface.getSort() != Type.OBJECT) {
            ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
            String message = "@LDelegate annotations may only contain interface types";
            report.addError(new ErrorReport.Error(message, location));
            return;
        }

        ClassNode tcn = classStore.getClass(iface.getInternalName());
        if (tcn == null) {
            ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
            String message = "Could not find interface " + iface.getInternalName() + " in dependency artifacts";
            report.addError(new ErrorReport.Error(message, location));
            return;
        }

        if (!Modifier.isInterface(tcn.access)) {
            ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
            String message = "Type to delegate is not an interface.";
            report.addError(new ErrorReport.Error(message, location));
            return;
        }

        if (fieldInterfaces.add(iface)) {
            if (!interfaceTypes.add(iface)) {
                ErrorReport.Field location = new ErrorReport.Field(cn.name, fn.name, fn.desc);
                String message = "Multiple fields try to delegate the interface " + iface.getInternalName();
                report.addError(new ErrorReport.Error(message, location));
                return;
            }

            interfaceNodes.add(tcn);

            if (tcn.interfaces != null) {
                for (String iface2 : tcn.interfaces) {
                    Type ifaceType = Type.getObjectType(iface2);
                    addInterfacesRecursive(cn, fn, ifaceType, interfaceNodes,
                            interfaceTypes, fieldInterfaces, report);
                }
            }
        }
    }

    /**
     * Get the ClassNodes of all interfaces delegated by a class and its superclasses
     *
     * @param cn class whose delegated interfaces we want.
     * @return all interfaces to delegate
     */
    private Set<ClassNode> getAllDelegateInterfaces(ClassNode cn) {
        Set<ClassNode> delegatedInterface = new HashSet<>();
        addInterfacesToDelegateRecursive(delegatedInterface, cn);
        return delegatedInterface;
    }

    private void addInterfacesToDelegateRecursive(Set<ClassNode> allDelegatedInterface, ClassNode cn) {
        Set<ClassNode> interfaces = delegatedInterfaces.get(Type.getObjectType(cn.name));
        if (interfaces != null) {
            allDelegatedInterface.addAll(interfaces);
        }

        ClassNode superClass = classStore.getClass(cn.superName);
        if (superClass != null) {
            addInterfacesToDelegateRecursive(allDelegatedInterface, superClass);
        }
    }

    /**
     * Get all methods with a {@link LImplements} annotation in a class.
     *
     * @param cn class that is currently checked
     * @return the annotated methods
     */
    private List<MethodNode> getAnnotatedMethods(ClassNode cn) {
        return cn.methods.stream()
                .filter(mn -> ImplementsMeta.from(mn).isAnnotated())
                .collect(Collectors.toList());
    }

    /**
     * Lint if a method has a {@link LImplements} annotation but implements no method
     * of a delegated interface.
     *
     * @param cn class that is currently checked
     * @param delegatees interfaces that should be delegated
     * @param report error report for user
     */
    private void lintNotImplementingMethods(ClassNode cn, Collection<ClassNode> delegatees, ErrorReport report) {
        List<MethodNode> notImplementingMethods = getAnnotatedMethods(cn);

        for (ClassNode delegatee : delegatees) {
            for (MethodNode mn : delegatee.methods) {
                notImplementingMethods.removeIf(mn2 ->
                        mn.name.equals(mn2.name) && mn.desc.equals(mn2.desc));
            }
        }

        for (MethodNode mn : notImplementingMethods) {
            ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
            String message = "Method implements no delegated method";
            report.addError(new ErrorReport.Error(message, location));
        }
    }

    /**
     * Lint if a method would implement a method of a delegated interface but has no
     * {@link LImplements} annotation.
     *
     * @param cn class to check against
     * @param delegateInterfaces interfaces that should be delegated
     * @param report error report for user
     */
    private void lintMissingImplementsAnnotation(ClassNode cn, Collection<ClassNode> delegateInterfaces, ErrorReport report) {
        for (MethodNode mn : cn.methods) {
            boolean doesImplement = delegateInterfaces.stream()
                    .flatMap(iface -> iface.methods.stream())
                    .anyMatch(imn -> imn.name.equals(mn.name) && imn.desc.equals(mn.desc));

            if (doesImplement) {
                ImplementsMeta meta = ImplementsMeta.from(mn);
                if (!meta.isAnnotated()) {
                    ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
                    String message = "Method implements a method of a delegated interface but has no @LImplements annotation";
                    report.addError(new ErrorReport.Error(message, location));
                }
            }
        }
    }

    /**
     * Check whether a method contains an illegal 'Linkstone.as(...)' invoke.
     *
     * @param cn class that contains the method
     * @param mn method to scan
     * @param report error report for the user
     */
    private void lintAsMethodUsage(ClassNode cn, MethodNode mn, ErrorReport report) {
        for (MethodInsnNode invoke : getAsInvokes(mn)) {
            Type interfaceType = getInterfaceType(cn, mn, invoke, report);
            Type concreteClass = getFromType(cn, mn, invoke, report);

            if (interfaceType != null && concreteClass != null) {
                final String internalInterfaceName = interfaceType.getInternalName();
                Set<ClassNode> delegatedInterfaces = this.delegatedInterfaces.getOrDefault(concreteClass, Collections.emptySet());
                boolean isDelegable = delegatedInterfaces.stream().anyMatch(n -> n.name.equals(internalInterfaceName));
                if (!isDelegable) {
                    ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
                    String message = "Class " + concreteClass.getInternalName() + " does not delegate interface " + internalInterfaceName + "." ;
                    report.addError(new ErrorReport.Error(message, location));
                }
            }
        }
    }

    /**
     * Get the interface type to which the parameter of a 'Linkstone.as(...)' invoke should be converted.
     *
     * @param cn class containing the instruction
     * @param mn method containing the instruction
     * @param invoke instruction that invokes 'Linkstone.as(...)'
     * @param report error report for the user
     * @return interface type or {@code null}
     */
    private Type getInterfaceType(ClassNode cn, MethodNode mn, MethodInsnNode invoke, ErrorReport report) {
        AbstractInsnNode nextInsn = invoke.getNext();
        switch (nextInsn.getOpcode()) {
            case CHECKCAST: {
                return Type.getObjectType(((TypeInsnNode) nextInsn).desc);
            }

            case POP:
            case POP2: {
                ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
                String message = "Unused result of Linkstone.as invoke";
                report.addError(new ErrorReport.Error(message, location));
                return null;
            }

            default: {
                ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
                String message = "Interface type for Linkstone.as invoke was not interferred";
                report.addError(new ErrorReport.Error(message, location));
                return null;
            }
        }
    }

    /**
     * Get the type from which the parameter of a 'Linkstone.as(...)' is converted.
     *
     * @param cn class containing the instruction
     * @param mn method containing the instruction
     * @param invoke instruction that invokes 'Linkstone.as(...)'
     * @param report error report for the user
     * @return type of parameter or {@code null}
     */
    private Type getFromType(ClassNode cn, MethodNode mn, MethodInsnNode invoke, ErrorReport report) {
        AbstractInsnNode prevInsn = invoke.getPrevious();
        if (prevInsn.getOpcode() == LDC) {
            Object push = ((LdcInsnNode) prevInsn).cst;
            if (push instanceof Type) {
                return (Type) push;
            }
        }

        ErrorReport.Method location = new ErrorReport.Method(cn.name, mn.name, mn.desc);
        String message = "Class parameter of Linkstone.as invoke must be a class constant";
        report.addError(new ErrorReport.Error(message, location));
        return null;
    }

    /**
     * Find all instructions that invoke the 'Linkstone.as(...)' method.
     *
     * @param mn Method to scan
     * @return all invoking instructions
     */
    private List<MethodInsnNode> getAsInvokes(MethodNode mn) {
        List<MethodInsnNode> invokes = new ArrayList<>();
        mn.instructions.iterator().forEachRemaining(insn -> {
            if (insn.getOpcode() != INVOKESTATIC) {
                return;
            }

            MethodInsnNode min = (MethodInsnNode) insn;
            if (min.owner.equals("net/glowstone/linkstone/Linkstone") && min.name.equals("as") &&
                    min.desc.equals("(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;")) {
                invokes.add(min);
            }
        });
        return invokes;
    }

}
