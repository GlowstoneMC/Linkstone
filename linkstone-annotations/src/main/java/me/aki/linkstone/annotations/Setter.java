package me.aki.linkstone.annotations;

/**
 * Annotate a method implementing a setter of a field
 */
public @interface Setter {
    /**
     * @return versions where the annotated method implements the getter
     */
    Version[] version();
}
