package net.glowstone.linkstone.compiler.transform;

import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LMethodContainer;
import net.glowstone.linkstone.annotations.LOverride;
import net.glowstone.linkstone.compiler.ClassStore;
import net.glowstone.linkstone.compiler.meta.MethodMeta;
import net.glowstone.linkstone.compiler.util.ClassStoreUtil;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.Optional;

/**
 * Shared utilities between transformers that resolve overrides.
 */
public abstract class AbstractOverrideTransformer implements CodeTransformer {
    protected final ClassStoreUtil classStoreUtil;

    public AbstractOverrideTransformer(ClassStore classStore) {
        this.classStoreUtil = new ClassStoreUtil(classStore);
    }

    /**
     * Find the method that a {@link LOverride} annotated method overrides.
     * That method has a {@link LMethod} annotation.
     *
     * @param cn class containing the overriding method
     * @param mn method with {@link LOverride} annotation
     * @return the overridden method
     */
    protected Optional<MethodNode> getOverriddenMethod(ClassNode cn, MethodNode mn) {
        return classStoreUtil.getOverriddenMethods(cn, mn).stream()
                .filter(m -> MethodMeta.from(m).isAnnotated())
                .findAny();
    }

    /**
     * Get the {@link LMethod} or {@link LMethodContainer} annotation of a method.
     *
     * @param mn method with a {@link LMethod} or {@link LMethodContainer} annotation
     * @return {@link LMethod} or {@link LMethodContainer} annotation node
     */
    protected AnnotationNode getLMethodAnnotation(MethodNode mn) {
        return mn.visibleAnnotations.stream()
                .filter(m -> m.desc.equals(MethodMeta.METHOD_ANNOTION_DESC) ||
                        m.desc.equals(MethodMeta.METHOD_CONTAINER_ANNOTION_DESC))
                .findAny().get();
    }
}
