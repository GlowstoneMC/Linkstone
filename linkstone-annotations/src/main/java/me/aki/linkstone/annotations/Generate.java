package me.aki.linkstone.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Annotation that tells the linkstone compiler to generate
 * a getter and setter that accesses the annotated field.
 */
@Target(ElementType.FIELD)
public @interface Generate {
}
