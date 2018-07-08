package me.aki.linkstone.compiler.transform;

import static org.objectweb.asm.Opcodes.*;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import me.aki.linkstone.annotations.Box;
import me.aki.linkstone.compiler.meta.BoxMeta;
import me.aki.linkstone.compiler.meta.BoxedMeta;
import org.objectweb.asm.Label;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;

import java.util.List;

/**
 * Transform classes with a {@link Box} annotations. Generate a static method that
 * initializes the box and delegate the equal, hashcode and toString method.
 */
public class BoxDelegateGenerator extends AbstractDelegateGenerator implements CodeTransformer {
    @Override
    public void transform(List<ClassNode> classes) {
        for (ClassNode cn : classes) {
            BoxMeta meta = BoxMeta.from(cn);
            if (!meta.isAnnotated()) {
                continue;
            }

            Type boxedType = meta.getType();

            FieldNode boxedField = cn.fields.stream()
                    .filter(fn -> BoxedMeta.from(fn).isAnnotated())
                    .findFirst().get();

            generateDelegateMethod(cn, boxedField, boxedType, "equals", "(Ljava/lang/Object;)Z");
            generateDelegateMethod(cn, boxedField, boxedType, "hashCode", "()I");
            generateDelegateMethod(cn, boxedField, boxedType, "toString", "()Ljava/lang/String;");
        }
    }
}
