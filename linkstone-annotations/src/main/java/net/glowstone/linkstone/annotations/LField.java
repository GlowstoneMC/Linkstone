package net.glowstone.linkstone.annotations;

import java.lang.annotation.*;

/**
 * Tell the generator in which versions this
 * field exists and how it should be named.
 */
@Repeatable(LFieldContainer.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
public @interface LField {
    /**
     * @return version where this field exists and has this name.
     */
    Version[] version();

    /**
     * Name of the annotated field in the generated class.
     *
     * The field will not be renamed if the name is empty.
     *
     * @return name of generated field
     */
    String name() default "";
}
