package me.aki.linkstone.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Annotate a method implementing a getter of a field
 */
@Target(ElementType.METHOD)
public @interface Getter {
    /**
     * @return versions where the annotated method implements the getter
     */
    Version[] version();
}
