package net.glowstone.linkstone.runtime.reflectionredirect.method;

import net.glowstone.linkstone.runtime.reflectionredirect.DynamicClassLoader;
import net.glowstone.linkstone.runtime.reflectionredirect.ReflectionUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Utility class that accesses the internal MethodAccessor of a {@link Method}.
 */
public class MethodAccessorUtility {
    private static Boolean isSupported = null;

    // Method used for self test
    public static void foo() {
        throw new RuntimeException("MethodAccessor was not replaced");
    }

    /**
     * @return whether this hack works on your current JVM.
     */
    public static boolean isSupported() {
        if (isSupported == null) {
            try {
                Method method = MethodAccessorUtility.class.getDeclaredMethod("foo");
                LMethodAccessor accessor = (Object instance, Object[] arguments) -> isSupported = true;
                new MethodAccessorUtility().setAccessor(method, accessor);
                method.invoke(null);
            } catch (Throwable e) {
                isSupported = false;
            }
        }
        return isSupported;
    }

    private final DynamicClassLoader classLoader = new DynamicClassLoader();
    private Field accessorField;

    private Method acquireMethodAccessorMethod;

    public MethodAccessorUtility() throws NoSuchFieldException {
        this.accessorField = Method.class.getDeclaredField("methodAccessor");
        ReflectionUtil.setAccessible(accessorField, true);
    }

    /**
     * Replace the internal MethodAccessor of a {@link Method} against a custom one.
     *
     * @param method whose accessor will be replaced
     * @param accessor the new accessor
     * @throws IllegalAccessException could not replace the accessor
     */
    public void setAccessor(Method method, LMethodAccessor accessor) throws IllegalAccessException {
        Object wrappedAccessor = wrapLinkstoneMethodAccessor(accessor);
        accessorField.set(method, wrappedAccessor);
    }

    /**
     * Get the current internal MethodAcessor of a {@link Method}.
     *
     * @param method whose we want
     * @return the internal method accessor
     * @throws ReflectiveOperationException the accessor could not be accessed
     */
    public LMethodAccessor getAccessor(Method method) throws ReflectiveOperationException {
        Object jvmAccesor = accessorField.get(method);
        if (jvmAccesor == null) {
            initializeMethodAccessor(method);
            jvmAccesor = accessorField.get(method);
        }
        return wrapJvmMethodAccessor(jvmAccesor);
    }

    private void initializeMethodAccessor(Method method) throws ReflectiveOperationException {
        if (acquireMethodAccessorMethod == null) {
            acquireMethodAccessorMethod = Method.class.getDeclaredMethod("acquireMethodAccessor");
            ReflectionUtil.setAccessible(acquireMethodAccessorMethod, true);
        }

        acquireMethodAccessorMethod.invoke(method);
    }

    /**
     * Wrap a {@link LMethodAccessor} in a type adapter for the
     * MethodAccessor type used by the reflection api.
     *
     * @param accessor a linkstone MethodAccessor
     * @return jvm method accessor adapter
     */
    private Object wrapLinkstoneMethodAccessor(LMethodAccessor accessor) {
        try {
            if (accessor == null) {
                return null;
            }

            if (accessor.getClass().getName().equals(LMethodAccessorAdapterGenerator.JAVA_CLASS_NAME)) {
                Field field = accessor.getClass().getDeclaredField(LMethodAccessorAdapterGenerator.DELEGATEE_FIELD);
                return field.get(accessor);
            }

            Class<?> wrapper = classLoader.getOrLoad(new JMethodAccessorAdapterGenerator());
            Constructor<?> constructor = wrapper.getConstructor(LMethodAccessor.class);
            return constructor.newInstance(accessor);
        } catch (ReflectiveOperationException e) {
            // This should only happen if we generated wrong bytecode
            throw new RuntimeException(e);
        }
    }

    /**
     * Wrap a MethodAccessor as used in the reflection api in a type adapter
     * for {@link LMethodAccessor}.
     *
     * @param accessor linkstone method accessor class
     * @return jvm method accessor adapter
     */
    private LMethodAccessor wrapJvmMethodAccessor(Object accessor) {
        try {
            if (accessor == null) {
                return null;
            }

            if (accessor.getClass().getName().equals(JMethodAccessorAdapterGenerator.JAVA_CLASS_NAME)) {
                Field field = accessorField.getClass().getDeclaredField(JMethodAccessorAdapterGenerator.DELEGATEE_FIELD);
                return (LMethodAccessor) field.get(accessor);
            }

            Class<?> wrapper = classLoader.getOrLoad(new LMethodAccessorAdapterGenerator());
            Constructor<?> constructor = wrapper.getDeclaredConstructors()[0];
            return (LMethodAccessor) constructor.newInstance(accessor);
        } catch (ReflectiveOperationException e) {
            // This should only happen if we generated wrong bytecode
            throw new RuntimeException(e);
        }
    }
}
