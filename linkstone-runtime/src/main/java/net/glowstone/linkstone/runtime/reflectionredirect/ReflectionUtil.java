package net.glowstone.linkstone.runtime.reflectionredirect;

import sun.misc.Unsafe;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    /**
     * Fields as gotten from the {@link Class} api are just copies.
     * This method returns all original fields.
     *
     * @param clazz whose fields to get
     * @return all internal fields
     */
    public static List<Field> getInternalFields(Class<?> clazz) throws ReflectiveOperationException {
        // initializes field in reflectionData
        clazz.getFields();
        clazz.getDeclaredFields();

        Object reflectionData = getReflectionData(clazz);

        Field[] fieldFields = new Field[] {
                reflectionData.getClass().getDeclaredField("declaredFields"),
                reflectionData.getClass().getDeclaredField("publicFields"),
                reflectionData.getClass().getDeclaredField("declaredPublicFields")
        };

        List<Field> fields = new ArrayList<>();
        for (Field f : fieldFields) {
            f.setAccessible(true);
            Field[] fieldArray = (Field[]) f.get(reflectionData);
            if (fieldArray != null) {
                fields.addAll(Arrays.asList(fieldArray));
            }
        }
        return fields;
    }

    /**
     * Methods as gotten from {@link Class} api are just copies.
     * This methods returns all original methods.
     *
     * @param clazz whose methods to get
     * @return all internal methods
     */
    public static List<Method> getInternalMethods(Class<?> clazz) throws ReflectiveOperationException {
        // initializes methods in reflectionData
        clazz.getMethods();
        clazz.getDeclaredMethods();

        Object reflectionData = getReflectionData(clazz);

        Field[] methodFields = new Field[] {
                reflectionData.getClass().getDeclaredField("declaredMethods"),
                reflectionData.getClass().getDeclaredField("publicMethods"),
                reflectionData.getClass().getDeclaredField("declaredPublicMethods")
        };

        List<Method> methods = new ArrayList<>();
        for (Field f : methodFields) {
            f.setAccessible(true);
            Method[] methodArray = (Method[]) f.get(reflectionData);
            if (methodArray != null) {
                methods.addAll(Arrays.asList(methodArray));
            }
        }
        return methods;
    }

    private static Object getReflectionData(Class<?> clazz) throws ReflectiveOperationException {
        Method reflectionDataMethod = Class.class.getDeclaredMethod("reflectionData");
        reflectionDataMethod.setAccessible(true);
        return reflectionDataMethod.invoke(clazz);
    }
}
