package me.aki.linkstone.annotations;

import java.lang.annotation.*;

/**
 * Tell the generator in which versions this
 * method exists and how it should be named.
 */
@Repeatable(LMethodContainer.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
public @interface LMethod {
    /**
     * @return version where this class exists and has this name.
     */
    Version[] version();

    /**
     * Name of the annotated method in the generated class.
     *
     * The method will not be renamed if the name is empty.
     *
     * @return name of generated method
     */
    String name() default "";
}
