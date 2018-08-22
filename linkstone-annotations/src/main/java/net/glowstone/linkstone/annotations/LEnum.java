package net.glowstone.linkstone.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for constants of an enum
 */
@Repeatable(LEnumContainer.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface LEnum {
    /**
     * @return version where this enum constant exists and has this name.
     */
    Version[] version();

    /**
     * Name of the annotated enum constant in the generated class.
     *
     * The enum constant will not be renamed if the name is empty.
     *
     * @return name of generated enum constant
     */
    String name() default "";
}
