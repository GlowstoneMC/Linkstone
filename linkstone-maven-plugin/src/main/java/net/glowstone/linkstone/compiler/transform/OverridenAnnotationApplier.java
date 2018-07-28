package net.glowstone.linkstone.compiler.transform;

import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LMethodContainer;
import net.glowstone.linkstone.annotations.LOverride;
import net.glowstone.linkstone.compiler.meta.MethodMeta;
import net.glowstone.linkstone.compiler.meta.OverrideMeta;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Add {@link LMethod}/{@link LMethodContainer} annotation of overridden methods to the overriding methods.
 */
public class OverridenAnnotationApplier implements CodeTransformer {
    private Map<Type, ClassNode> classMap;

    @Override
    public void transform(List<ClassNode> classes) {
        initClassMap(classes);

        for (ClassNode cn : classes) {
            for (MethodNode mn : cn.methods) {
                if (!OverrideMeta.from(mn).isAnnotated()) {
                    continue;
                }

                MethodNode overriddenMethod = getOverriddenMethod(cn, mn);
                AnnotationNode lmethodAnnotation = getLMethodAnnotation(overriddenMethod);
                mn.visibleAnnotations.add(lmethodAnnotation);
            }
        }
    }

    private void initClassMap(List<ClassNode> classes) {
        this.classMap = classes.stream().collect(Collectors.toMap(
                cn -> Type.getObjectType(cn.name),
                cn -> cn));
    }

    /**
     * Find the method that a {@link LOverride} annotated method overrides.
     *
     * @param cn class containing the overriding method
     * @param mn method with {@link LOverride} annotation
     * @return the overridden method
     */
    private MethodNode getOverriddenMethod(ClassNode cn, MethodNode mn) {
        return getSuperClasses(cn).stream()
                .flatMap(c -> c.methods.stream())
                .filter(m -> m.name.equals(mn.name) && m.desc.equals(mn.desc))
                .filter(m -> MethodMeta.from(m).isAnnotated())
                .findAny()
                .orElseThrow(() -> new RuntimeException("Could find method overridden by " + cn.name + "." + mn.name + mn.desc));
    }

    private List<ClassNode> getSuperClasses(ClassNode cn) {
        List<ClassNode> superClasses = new ArrayList<>();
        while ((cn = classMap.get(Type.getObjectType(cn.superName))) != null) {
            superClasses.add(cn);
        }
        return superClasses;
    }

    /**
     * Get the {@link LMethod} or {@link LMethodContainer} annotation of a method.
     *
     * @param mn method with a {@link LMethod} or {@link LMethodContainer} annotation
     * @return {@link LMethod} or {@link LMethodContainer} annotation node
     */
    private AnnotationNode getLMethodAnnotation(MethodNode mn) {
        return mn.visibleAnnotations.stream()
                .filter(m -> m.desc.equals(MethodMeta.METHOD_ANNOTION_DESC) ||
                        m.desc.equals(MethodMeta.METHOD_CONTAINER_ANNOTION_DESC))
                .findAny().get();
    }
}
