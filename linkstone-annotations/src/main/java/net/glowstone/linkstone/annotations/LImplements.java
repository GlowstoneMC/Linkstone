package net.glowstone.linkstone.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation marks methods that implement a method of a delegated interface.
 *
 * It's similar to {@link Override}, but that annotation would cause a compile error.
 *
 * @see LDelegate
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LImplements {
}
