package net.glowstone.linkstone.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotate a method implementing a getter of a field
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LGetter {
    /**
     * @return versions where the annotated method implements the getter
     */
    Version[] version();
}
