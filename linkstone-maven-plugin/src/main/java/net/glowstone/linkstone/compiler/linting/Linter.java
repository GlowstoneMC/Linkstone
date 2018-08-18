package net.glowstone.linkstone.compiler.linting;

import org.objectweb.asm.tree.ClassNode;

import java.util.List;

public interface Linter {
    /**
     * Check classes for errors and add them to an {@link ErrorReport}.
     *
     * @param classes that will be checked
     * @param report container for errors
     */
    void lint(List<ClassNode> classes, ErrorReport report);
}
