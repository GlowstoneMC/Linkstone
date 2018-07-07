package me.aki.linkstone.compiler.transform;

import org.objectweb.asm.tree.ClassNode;

import java.util.List;

public interface CodeTransformer {
    /**
     * Apply changes to the code of classes.
     *
     * @param classes to change
     */
    void transform(List<ClassNode> classes);
}
