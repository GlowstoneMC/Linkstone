package net.glowstone.linkstone.annotations;

import java.lang.annotation.*;

/**
 * Tell the generator how a package should be named for a certain version.
 */
@Repeatable(LPackageContainer.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.PACKAGE })
public @interface LPackage {
    /**
     * @return version where this package has this name.
     */
    Version[] version();

    /**
     * @return name of generated package
     */
    String name();

    /**
     * @return how should the annotated package should be renamed
     * @see Mode
     */
    Mode mode() default Mode.DEFAULT;
}
