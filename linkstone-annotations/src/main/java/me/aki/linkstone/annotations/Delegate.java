package me.aki.linkstone.annotations;

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
public @interface Delegate {
    /**
     * @return type that the class will inherit
     */
    Class<?>[] value();
}
