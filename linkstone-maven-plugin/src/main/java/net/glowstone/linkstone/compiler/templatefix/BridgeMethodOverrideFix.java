package net.glowstone.linkstone.compiler.templatefix;

import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;
import net.glowstone.linkstone.compiler.ClassStore;
import net.glowstone.linkstone.compiler.meta.OverrideMeta;
import net.glowstone.linkstone.compiler.transform.AbstractOverrideTransformer;
import net.glowstone.linkstone.compiler.transform.CodeTransformer;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * If a method is overridden but the return type changed,
 * then javac generates a so called bridge method.
 * This method overrides the actual overriden method and
 * calls the method with a different return type.
 * Here's one example:
 *
 * <code>
 *     class Entity {
 *         @LMethod(version={Version.V1_12_R1})
 *         public CraftEntity getBukkitEntity() { ... }
 *     }
 *     class EntityHuman extends Entity {
 *         @LOverride
 *         public CraftHumanEntity getBukkitEntity() { ... }
 *     }
 * </code>
 *
 * That code compiles to something like this:
 * <code>
 *     class EntityHuman extends Entity {
 *         @LOverride
 *         public CraftHumanEntity getBukkitEntity() { ... }
 *
 *         // This method has the bridge access flag.
 *         // It calls the other getBukkitEntity() method
 *         // with the different return type.
 *         public CraftEntity getBukkitEntity() {
 *             return getBukkitEntity();
 *         }
 *     }
 * </code>
 *
 * This generated code uses the {@link LOverride} annotation the wrong way.
 * The bridge method is the actual method that overrides the {@link LMethod}
 * annotated class so it should actually have the {@link LOverride} annotation.
 *
 * Since the method with different return type does actually override nothing
 * it cannot have a {@link LOverride} annotation.
 * If a subclass of EntityHuman overrides the getBukkitEntity method,
 * it will override the method with the different return type.
 * Therefore that method should have a {@link LMethod} annotation.
 *
 * These changes are applied by this {@link CodeTransformer}.
 */
public class BridgeMethodOverrideFix extends AbstractOverrideTransformer {
    public BridgeMethodOverrideFix(ClassStore classStore) {
        super(classStore);
    }

    private Map<String, ClassNode> notYetComputedClasses;

    @Override
    public void transform(List<ClassNode> classes) {
        // Superclasses must be transformed first!

        notYetComputedClasses = classes.stream()
                .collect(Collectors.toMap(cn -> cn.name, Function.identity()));

        while (!notYetComputedClasses.isEmpty()) {
            Iterator<Map.Entry<String, ClassNode>> iter = notYetComputedClasses.entrySet().iterator();
            ClassNode nextNode = iter.next().getValue();
            iter.remove();

            transform(nextNode);
        }
    }

    private void transform(ClassNode cn) {
        // transform superclass first
        ClassNode superClass = notYetComputedClasses.remove(cn.superName);
        if (superClass != null) {
            transform(superClass);
        }

        for (MethodNode mn : cn.methods) {
            getOverriddenMethod(cn, mn).ifPresent(overriddenMethod -> {
                if ((mn.access & Opcodes.ACC_BRIDGE) != 0) {
                    MethodNode bridgeMethod = mn;
                    MethodNode bridgedMethod = getBridgedMethod(cn, bridgeMethod);

                    AnnotationNode lmethodAnnotation = getLMethodAnnotation(overriddenMethod);
                    AnnotationNode loverrideAnnotation = new AnnotationNode(OverrideMeta.METHOD_OVERRIDE_ANNOTATION_DESC);

                    removeLOverrideAnnotation(bridgedMethod);
                    addVisibleAnnotation(bridgedMethod, lmethodAnnotation);

                    addVisibleAnnotation(bridgeMethod, loverrideAnnotation);
                }
            });
        }
    }

    private void removeLOverrideAnnotation(MethodNode mn) {
        if (mn.visibleAnnotations != null) {
            mn.visibleAnnotations.removeIf(m ->
                    m.desc.equals(OverrideMeta.METHOD_OVERRIDE_ANNOTATION_DESC));
        }
    }

    private void addVisibleAnnotation(MethodNode mn, AnnotationNode an) {
        if (mn.visibleAnnotations == null) {
            mn.visibleAnnotations = new ArrayList<>();
        }
        mn.visibleAnnotations.add(an);
    }

    /**
     * Bridge methods call one other method in the same class.
     * This method's MethodNode is returned
     *
     * @param cn class containing the bridge method
     * @param mn the bridge method
     * @return method called by the bridge method
     */
    private MethodNode getBridgedMethod(ClassNode cn, MethodNode mn) {
        MethodInsnNode invoke = null;
        for (AbstractInsnNode insn = mn.instructions.getFirst(); insn != null; insn = insn.getNext()) {
            if (insn instanceof MethodInsnNode) {
                if (invoke == null) {
                    invoke = (MethodInsnNode) insn;
                } else {
                    throw new IllegalStateException("Bridge method invokes multiple methods");
                }
            }
        }

        if (invoke == null) {
            throw new IllegalStateException("Bridge method invokes no other method");
        }

        if (!invoke.owner.equals(cn.name)) {
            throw new IllegalStateException("Bridge method invokes method in other class");
        }

        MethodInsnNode min = invoke;
        return cn.methods.stream()
                .filter(m -> min.name.equals(m.name) && min.desc.equals(m.desc))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Cannot find method invoked by bridge method"));
    }
}
