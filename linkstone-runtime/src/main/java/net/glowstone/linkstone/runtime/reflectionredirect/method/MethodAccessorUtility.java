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
        String wrapperClassName = JMethodAccessorAdapterGenerator.CLASS_NAME.replace('/', '.');
        Class<?> wrapper;
        try {
            wrapper = Class.forName(wrapperClassName, false, classLoader);
        } catch (ClassNotFoundException e) {
            byte[] bytecode = new JMethodAccessorAdapterGenerator().generate();
            wrapper = classLoader.loadBytecode(wrapperClassName, bytecode);
        }

        try {
            Constructor<?> constructor = wrapper.getConstructor(LMethodAccessor.class);
            return constructor.newInstance(accessor);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
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
        String wrapperClassName = LMethodAccessorAdapterGenerator.CLASS_NAME.replace('/', '.');
        Class<?> wrapper;
        try {
            wrapper = Class.forName(wrapperClassName, false, classLoader);
        } catch (ClassNotFoundException e) {
            byte[] bytecode = new LMethodAccessorAdapterGenerator().generate();
            wrapper = classLoader.loadBytecode(wrapperClassName, bytecode);
        }

        try {
            Constructor<?> constructor = wrapper.getDeclaredConstructors()[0];
            return (LMethodAccessor) constructor.newInstance(accessor);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            // This should only happen if we generated wrong bytecode
            throw new RuntimeException(e);
        }
    }
}
