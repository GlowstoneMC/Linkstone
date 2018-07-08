package me.aki.linkstone.annotations;

import java.lang.annotation.*;

/**
 * Tell the generator how a package should be named for a certain version.
 */
@Repeatable(LPackageContainer.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.PACKAGE })
public @interface LPackage {
    /**
     * @return version where this class exists and has this name.
     */
    Version[] version();

    /**
     * Name of the annotated package in the generated class.
     *
     * @return name of generated package
     */
    String name();

    /**
     * @return how should the annotated package should be renamed
     * @see Mode
     */
    Mode mode() default Mode.DEFAULT;
}
