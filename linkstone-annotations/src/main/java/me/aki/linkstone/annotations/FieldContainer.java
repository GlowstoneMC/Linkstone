package me.aki.linkstone.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
public @interface FieldContainer {
    Field[] value();
}
