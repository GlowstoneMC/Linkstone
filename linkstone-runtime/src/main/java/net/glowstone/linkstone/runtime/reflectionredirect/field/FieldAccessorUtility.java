package net.glowstone.linkstone.runtime.reflectionredirect.field;

import net.glowstone.linkstone.runtime.reflectionredirect.DynamicClassLoader;
import net.glowstone.linkstone.runtime.reflectionredirect.ReflectionUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Utility class that accesses the internal FieldAccessor of a {@link Field}.
 */
public class FieldAccessorUtility {
    private static Boolean isSupported = null;

    // Field used for self test
    public static int foo = 20;

    /**
     * @return whether this hack works on your current JVM.
     */
    public static boolean isSupported() {
        if (isSupported == null) {
            try {
                boolean[] wasGetterInvoked = new boolean[] { false };
                boolean[] wasSetterInvoked = new boolean[] { false };
                boolean[] wasOverrideGetterInvoked = new boolean[] { false };
                boolean[] wasOverrideSetterInvoked = new boolean[] { false };

                Field field = FieldAccessorUtility.class.getDeclaredField("foo");
                LFieldAccessor accessor = new LFieldAccessor() {
                    @Override
                    public Object get(Object instance) throws Exception {
                        wasGetterInvoked[0] = true;
                        return null;
                    }

                    @Override
                    public void set(Object instance, Object value) throws Exception {
                        wasSetterInvoked[0] = true;
                    }
                };

                LFieldAccessor overrideAccessor = new LFieldAccessor() {
                    @Override
                    public Object get(Object instance) throws Exception {
                        wasOverrideGetterInvoked[0] = true;
                        return null;
                    }

                    @Override
                    public void set(Object instance, Object value) throws Exception {
                        wasOverrideSetterInvoked[0] = true;
                    }
                };

                new FieldAccessorUtility().setAccessor(field, accessor);
                new FieldAccessorUtility().setOverrideAccessor(field, overrideAccessor);

                field.get(null);
                field.set(null, null);

                field.setAccessible(true);

                field.get(null);
                field.set(null, null);

                isSupported = wasSetterInvoked[0] && wasSetterInvoked[0] &&
                        wasOverrideGetterInvoked[0] && wasOverrideSetterInvoked[0];
            } catch (Throwable e) {
                isSupported = false;
            }
        }
        return isSupported;
    }

    private final DynamicClassLoader classLoader = new DynamicClassLoader();
    private final Field accessorField;
    private final Field overrideAccessorField;

    private Method acquireFieldAccessorMethod;

    public FieldAccessorUtility() throws NoSuchFieldException {
        accessorField = Field.class.getDeclaredField("fieldAccessor");
        overrideAccessorField = Field.class.getDeclaredField("overrideFieldAccessor");

        ReflectionUtil.setAccessible(accessorField, true);
        ReflectionUtil.setAccessible(overrideAccessorField, true);
    }

    /**
     * Replace the internal FieldAccessor of a {@link Field} against a custom one.
     *
     * @param field whose accessor will be replaced
     * @param accessor the new accessor
     * @throws IllegalAccessException could not replace the accessor
     */
    public void setAccessor(Field field, LFieldAccessor accessor) throws IllegalAccessException {
        Object wrappedAccessor = wrapLinkstoneFieldAccessor(accessor);
        accessorField.set(field, wrappedAccessor);
    }

    /**
     * Replace the internal FieldAccessor of a {@link Field} against a custom one.
     *
     * The override accessor will be used after the field has been set accessible.
     *
     * @param field whose accessor will be replaced
     * @param accessor the new accessor
     * @throws IllegalAccessException could not replace the accessor
     */
    public void setOverrideAccessor(Field field, LFieldAccessor accessor) throws IllegalAccessException {
        Object wrappedAccessor = wrapLinkstoneFieldAccessor(accessor);
        overrideAccessorField.set(field, wrappedAccessor);
    }

    private void initializeFieldAccessor(Field field, boolean override) throws ReflectiveOperationException {
        if (acquireFieldAccessorMethod == null) {
            acquireFieldAccessorMethod = Field.class.getDeclaredMethod("acquireFieldAccessor", boolean.class);
            ReflectionUtil.setAccessible(acquireFieldAccessorMethod, true);
        }

        acquireFieldAccessorMethod.invoke(field, override);
    }

    /**
     * Get the current internal FieldAccessor of a {@link Field}.
     *
     * @param field whose FieldAccessor we want
     * @return the internal field accessor
     * @throws ReflectiveOperationException the accessor could not be accessed
     */
    public LFieldAccessor getAccessor(Field field) throws ReflectiveOperationException {
        Object jvmAccessor = accessorField.get(field);
        if (jvmAccessor == null) {
            initializeFieldAccessor(field, false);
            jvmAccessor = accessorField.get(field);
        }
        return wrapJvmFieldAccessor(jvmAccessor);
    }

    /**
     * Get the current internal FieldAccessor of a {@link Field}.
     *
     * The override accessor will be used after the field has been set accessible.
     *
     * @param field whose FieldAccessor we want
     * @return the internal field accessor
     * @throws ReflectiveOperationException the accessor could not be accessed
     */
    public LFieldAccessor getOverrideAccessor(Field field) throws ReflectiveOperationException {
        Object jvmAccessor = overrideAccessorField.get(field);
        if (jvmAccessor == null) {
            initializeFieldAccessor(field, true);
            jvmAccessor = overrideAccessorField.get(field);
        }
        return wrapJvmFieldAccessor(jvmAccessor);
    }

    /**
     * Wrap a {@link LFieldAccessor} in a type adapter for the
     * FieldAccessor type used by the reflection api.
     *
     * @param accessor a linkstone FieldAccessor
     * @return jvm field accessor adapter
     */
    private Object wrapLinkstoneFieldAccessor(LFieldAccessor accessor) {
        try {
            if (accessor == null) {
                return null;
            }

            if (accessor.getClass().getName().equals(LFieldAccessorAdapterGenerator.JAVA_CLASS_NAME)) {
                Field field = accessor.getClass().getDeclaredField(LFieldAccessorAdapterGenerator.DELEGATEE_FIELD);
                return field.get(accessor);
            }

            Class<?> wrapper = classLoader.getOrLoad(new JFieldAccessorAdapterGenerator());
            Constructor<?> constructor = wrapper.getConstructor(LFieldAccessor.class);
            return constructor.newInstance(accessor);
        } catch (ReflectiveOperationException e) {
            // This should only happen if we generated wrong bytecode
            throw new RuntimeException(e);
        }
    }

    /**
     * Wrap a FieldAccessor as used in the reflection api in a type adapter
     * for {@link LFieldAccessor}.
     *
     * @param accessor linkstone field accessor class
     * @return jvm field accessor adapter
     */
    private LFieldAccessor wrapJvmFieldAccessor(Object accessor) {
        try {
            if (accessor == null) {
                return null;
            }

            if (accessor.getClass().getName().equals(JFieldAccessorAdapterGenerator.JAVA_CLASS_NAME)) {
                Field field = accessor.getClass().getDeclaredField(JFieldAccessorAdapterGenerator.DELEGATEE_FIELD);
                return (LFieldAccessor) field.get(accessor);
            }

            Class<?> wrapper = classLoader.getOrLoad(new LFieldAccessorAdapterGenerator());
            Constructor<?> constructor = wrapper.getDeclaredConstructors()[0];
            return (LFieldAccessor) constructor.newInstance(accessor);
        } catch (ReflectiveOperationException e) {
            // This should only happen if we generated wrong bytecode
            throw new RuntimeException(e);
        }
    }
}
