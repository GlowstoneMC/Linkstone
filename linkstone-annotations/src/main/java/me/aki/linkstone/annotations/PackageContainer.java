package me.aki.linkstone.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ ElementType.PACKAGE })
public @interface PackageContainer {
    Package[] value();
}
