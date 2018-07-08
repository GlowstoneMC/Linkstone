package me.aki.linkstone.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The annotated class is a box around another type.
 * Casts to that type will be replaced against wrapping it in the annotated box.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Box {
    /**
     * @return type boxed by the annotated class
     */
    Class<?> value();
}
