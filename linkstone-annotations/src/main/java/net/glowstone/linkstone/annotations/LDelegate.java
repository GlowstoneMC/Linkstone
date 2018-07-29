package net.glowstone.linkstone.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Let a class implement an interface.
 * The methods will be implemented by delegating the calls to the annotated field.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface LDelegate {
    /**
     * The class containing the field will implement these interfaces.
     * All methods will be implemented by delegating invokes to the annotated field.
     * The type of the annotated field must therefore implement these interfaces.
     *
     * @return type that the class will inherit
     */
    Class<?>[] value();
}
