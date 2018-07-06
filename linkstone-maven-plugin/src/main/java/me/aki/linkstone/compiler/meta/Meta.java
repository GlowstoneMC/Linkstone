package me.aki.linkstone.compiler.meta;

/**
 * Runtime model for linkstone annotations.
 */
public interface Meta {
    /**
     * Has the annotated entity the annotation or is this a null object.
     *
     * @return was the entity annotated
     */
    boolean isAnnotated();
}
