package me.aki.linkstone.annotations;

import java.lang.annotation.*;

/**
 * Tell the generator in which versions this
 * classfile exists and how it should be named.
 */
@Repeatable(LClassfileContainer.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
public @interface LClassfile {
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
