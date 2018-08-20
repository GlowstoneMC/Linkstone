package net.glowstone.linkstone.compiler.transform;

import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LMethodContainer;
import net.glowstone.linkstone.compiler.ClassStore;
import net.glowstone.linkstone.compiler.meta.MethodMeta;
import net.glowstone.linkstone.compiler.meta.OverrideMeta;
import net.glowstone.linkstone.compiler.util.ClassStoreUtil;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.List;

/**
 * Add {@link LMethod}/{@link LMethodContainer} annotation of overridden methods to the overriding methods.
 */
public class OverridenAnnotationApplier extends AbstractOverrideTransformer {
    public OverridenAnnotationApplier(ClassStore classStore) {
        super(classStore);
    }

    @Override
    public void transform(List<ClassNode> classes) {
        for (ClassNode cn : classes) {
            for (MethodNode mn : cn.methods) {
                if (!OverrideMeta.from(mn).isAnnotated()) {
                    continue;
                }

                MethodNode overriddenMethod = getOverriddenMethod(cn, mn).get();

                AnnotationNode lmethodAnnotation = getLMethodAnnotation(overriddenMethod);
                mn.visibleAnnotations.add(lmethodAnnotation);
            }
        }
    }
}
