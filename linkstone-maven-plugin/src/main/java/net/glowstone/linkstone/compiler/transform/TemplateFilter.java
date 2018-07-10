package net.glowstone.linkstone.compiler.transform;

import static net.glowstone.linkstone.compiler.LinkstoneCompiler.GETTER_PREFIX;
import static net.glowstone.linkstone.compiler.LinkstoneCompiler.SETTER_PREFIX;
import static org.objectweb.asm.Opcodes.*;

import net.glowstone.linkstone.compiler.AccessorCollector;
import net.glowstone.linkstone.annotations.Version;
import net.glowstone.linkstone.compiler.meta.*;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.*;

/**
 * Removes all classes, methods, fields, getters and setters that do not exist for a certain version.
 * It does also rename getters and setters.
 */
public class TemplateFilter implements CodeTransformer {
    private final Version version;

    public TemplateFilter(Version version) {
        this.version = version;
    }

    public void transform(List<ClassNode> cns) {
        Iterator<ClassNode> iter = cns.iterator();
        while (iter.hasNext()) {
            ClassNode cn = iter.next();
            ClassfileMeta meta = ClassfileMeta.from(cn);

            if (meta.isAnnotated() && !meta.getVersions().contains(version)) {
                iter.remove();
                continue;
            }

            processFieldAccessors(cn);
            processFields(cn.fields);
            processMethods(cn.methods);
        }
    }

    /**
     * Remove all getters and setters that do not exist in the targeted version and
     * rename the left over getters and setters.
     *
     * @param cn class to process
     */
    private void processFieldAccessors(ClassNode cn) {
        AccessorCollector accessors = new AccessorCollector(cn);
        for (FieldNode fn : accessors.getFields()) {
            for (MethodNode getter : accessors.getGetters(fn)) {
                GetterMeta meta = GetterMeta.from(getter);
                if (!meta.getVersions().contains(this.version)) {
                    cn.methods.remove(getter);
                }

                getter.access = setPublic(getter.access);
                getter.name = GETTER_PREFIX + fn.name;
            }

            for (MethodNode setter : accessors.getSetters(fn)) {
                SetterMeta meta = SetterMeta.from(setter);
                if (!meta.getVersions().contains(this.version)) {
                    cn.methods.remove(setter);
                }
                setter.access = setPublic(setter.access);
                setter.name = SETTER_PREFIX + fn.name;
            }
        }
    }

    private int setPublic(int access) {
        access |= ACC_PUBLIC;
        access &= ~ACC_PRIVATE;
        access &= ~ACC_PROTECTED;
        return access;
    }

    /**
     * Leave only fields that exist in the target version.
     *
     * @param fields to filter
     */
    private void processFields(List<FieldNode> fields) {
        fields.removeIf(fn -> {
            FieldMeta meta = FieldMeta.from(fn);

            return meta.isAnnotated() && !meta.getVersions().contains(version);
        });
    }

    /**
     * Leave only methods that exist in the targeted version
     *
     * @param methods to filter
     */
    private void processMethods(List<MethodNode> methods) {
        methods.removeIf(mn -> {
            MethodMeta meta = MethodMeta.from(mn);

            return meta.isAnnotated() && !meta.getVersions().contains(version);
        });
    }
}
