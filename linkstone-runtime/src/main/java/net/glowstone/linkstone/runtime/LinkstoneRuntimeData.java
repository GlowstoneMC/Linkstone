package net.glowstone.linkstone.runtime;

import net.glowstone.linkstone.runtime.reflectionredirect.field.FieldAccessorUtility;
import net.glowstone.linkstone.runtime.reflectionredirect.method.MethodAccessorUtility;
import net.glowstone.linkstone.runtime.reflectionreplace.ReflectionReplaceVisitor;
import org.objectweb.asm.Type;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LinkstoneRuntimeData {
    private static ClassLoader pluginClassLoader;
    private static Boxes boxes;
    private static FieldSet fields;

    public static ClassLoader getPluginClassLoader() {
        return pluginClassLoader;
    }

    public static void setPluginClassLoader(ClassLoader pluginClassLoader) {
        LinkstoneRuntimeData.pluginClassLoader = pluginClassLoader;
    }

    public static FieldSet getFields() {
        return fields;
    }

    public static void setFields(FieldSet fields) {
        LinkstoneRuntimeData.fields = fields;
    }

    public static Boxes getBoxes() {
        return boxes;
    }

    public static void setBoxes(Boxes boxes) {
        LinkstoneRuntimeData.boxes = boxes;
    }

    /**
     * Get the value of a field or call the getter if its contained in the {@link FieldSet}.
     *
     * The {@link ReflectionReplaceVisitor} will replace calls
     * of get methods in {@link Field} against invokes of this method.
     *
     * @param field that should be accessed
     * @param instance of the class containing the field or null for static fields
     * @return value of the field
     * @see ReflectionReplaceVisitor
     */
    public static Object getField(Field field, Object instance) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> owner = field.getDeclaringClass();

        if (!FieldAccessorUtility.isSupported() || !MethodAccessorUtility.isSupported()) {
            instance = boxIfNecessary(owner, instance);
        }

        if (!FieldAccessorUtility.isSupported()) {
            String classname = owner.getName().replace('.', '/');
            if (fields.contains(classname, field.getName(), Type.getDescriptor(field.getType()))) {
                Method method = owner.getDeclaredMethod("$linkstone$getter$" + field.getName());
                return method.invoke(instance);
            }
        }

        return field.get(instance);
    }

    /**
     * Set the value of a field or invoke its setter if its contained in the {@link FieldSet}.
     *
     * The {@link ReflectionReplaceVisitor} will replace calls
     * of set methods in {@link Field} against invokes of this method.
     *
     * @param field that should be accessed
     * @param instance of the class containing the field or null for static fields
     * @param value that should be assigned to the field
     * @see ReflectionReplaceVisitor
     */
    public static void setField(Field field, Object instance, Object value) throws ReflectiveOperationException {
        Class<?> owner = field.getDeclaringClass();

        if (!FieldAccessorUtility.isSupported() || !MethodAccessorUtility.isSupported()) {
            instance = boxIfNecessary(owner, instance);
        }

        if (!FieldAccessorUtility.isSupported()) {
            String classname = owner.getName().replace('.', '/');
            if (fields.contains(classname, field.getName(), Type.getDescriptor(field.getType()))) {
                Method method = owner.getDeclaredMethod("$linkstone$setter$" + field.getName(), field.getType());
                method.invoke(instance, value);
                return;
            }
        }

        field.set(instance, value);
    }

    /**
     * Invoke a method or box the instance if necessary.
     *
     * The {@link ReflectionReplaceVisitor} will replace reflective method
     * invokes against calls of this method.
     *
     * @param method to invoke
     * @param instance or null for static methods
     * @param arguments passed to the invoked method
     * @return result of the method invoke
     * @see ReflectionReplaceVisitor
     */
    public static Object invoke(Method method, Object instance, Object[] arguments)
            throws InvocationTargetException, IllegalAccessException {
        if (!MethodAccessorUtility.isSupported()) {
            instance = boxIfNecessary(method.getDeclaringClass(), instance);
        }

        return method.invoke(instance, arguments);
    }

    /**
     * Box the instance if it is not an instance of the expected class.
     *
     * @param target expected class
     * @param instance instance that might get boxed
     * @return the instance or boxed instance
     */
    private static Object boxIfNecessary(Class<?> target, Object instance) {
        if (instance != null && !target.isAssignableFrom(instance.getClass())) {
            return BoxCache.box(instance, target);
        } else {
            return instance;
        }
    }
}
