package me.aki.linkstone.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

/**
 * Tell the generator how a package should be named for a certain version.
 */
@Repeatable(PackageContainer.class)
@Target({ ElementType.PACKAGE })
public @interface Package {
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
    String name();

    /**
     * @return how should the annotated package should be renamed
     */
    Mode mode() default Mode.SELF;
}
