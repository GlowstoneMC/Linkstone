package net.glowstone.linkstone.runtime.reflectionredirect;

import sun.misc.Unsafe;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public class ReflectionUtil {
    public static void setAccessible(AccessibleObject obj, boolean accessible) {
        try {
            // Try to avoid "illegal reflective access" warning on jvm 9+
            Field theUnsafeField = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafeField.setAccessible(true);
            Unsafe theUnsafe = (Unsafe)theUnsafeField.get(null);

            Field overrideField = AccessibleObject.class.getDeclaredField("override");
            long overrideFieldOffset = theUnsafe.objectFieldOffset(overrideField);
            theUnsafe.putBoolean(obj, overrideFieldOffset, accessible);
        } catch (Throwable t) {
            obj.setAccessible(accessible);
        }

    }
}
