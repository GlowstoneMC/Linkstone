package me.aki.linkstone.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation marks methods that override delegated methods.
 *
 * It's similar to {@link Override}, but that annotation would cause a compile error.
 *
 * @see Delegate
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Overridden {
}
