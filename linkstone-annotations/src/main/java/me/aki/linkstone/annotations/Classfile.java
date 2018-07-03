package me.aki.linkstone.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

/**
 * Tell the generator in which versions this
 * classfile exists and how it should be named.
 */
@Repeatable(ClassfileContainer.class)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
public @interface Classfile {
    /**
     * @return version where this class exists and has this name.
     */
    Version[] version();

    /**
     * Name of the annotated classfile in the generated class.
     *
     * The classfile will not be renamed if the name is empty.
     *
     * @return name of generated classfile
     */
    String name() default "";
}
