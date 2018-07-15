package net.glowstone.linkstone.runtime.reflectionredirect;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Utility class that reflects on a {@link Field} to
 * redirect its get and set methods to a getter and setter.
 */
public class FieldRedirectUtil {
    private static Boolean isSupported = null;

    private final static boolean testField = false;
    public static boolean $linkstone$getter$testField() {
        return true;
    }

    /**
     * Test whether this hack works on your current JVM.
     *
     * @return whether this utility works
     */
    public static boolean isSupported() {
        if (isSupported == null) {
            try {
                Field f = FieldRedirectUtil.class.getDeclaredField("testField");
                new FieldRedirectUtil().redirectField(f);
                isSupported = f.getBoolean(null);
            } catch(Throwable t) {
                isSupported = false;
            }
        }
        return isSupported;
    }

    private final Map<ClassLoader, DynamicClassLoader> classloaders = new WeakHashMap<>();
    private final Field[] accessorFields;

    public FieldRedirectUtil() throws NoSuchFieldException {
        this.accessorFields = new Field[] {
                Field.class.getDeclaredField("fieldAccessor"),
                Field.class.getDeclaredField("overrideFieldAccessor"),
        };

        for (Field f : this.accessorFields) {
            ReflectionUtil.setAccessible(f, true);
        }
    }

    /**
     * Modify a {@link Field} to invoke its getters.
     *
     * @param field that will be modified
     */
    public void redirectField(Field field) throws InstantiationException, IllegalAccessException {
        Object accessor = newAccessor(field);

        for (Field accessorField : accessorFields) {
            accessorField.set(field, accessor);
        }
    }

    private Object newAccessor(Field field) throws IllegalAccessException, InstantiationException {
        DynamicClassLoader classloader = getClassloader(field.getDeclaringClass().getClassLoader());
        FieldAccessorGenerator generator = new FieldAccessorGenerator(field);
        String className = generator.getClassName().replace('/', '.');
        Class<?> accessorClass;

        try {
            accessorClass = Class.forName(className, false, classloader);
        } catch(ClassNotFoundException e) {
            byte[] bytecode = generator.generateAccessor();
            accessorClass = classloader.loadBytecode(className, bytecode);
        }

        return accessorClass.newInstance();
    }

    private DynamicClassLoader getClassloader(ClassLoader classLoader) {
        return classloaders.computeIfAbsent(classLoader,
                loader -> new DynamicClassLoader(loader));
    }
}
