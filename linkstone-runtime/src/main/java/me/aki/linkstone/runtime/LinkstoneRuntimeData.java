package me.aki.linkstone.runtime;

import me.aki.linkstone.runtime.reflectionreplace.ReflectFieldAccessReplaceVisitor;
import org.objectweb.asm.Type;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @see ReflectFieldAccessReplaceVisitor
 */
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
     * The {@link ReflectFieldAccessReplaceVisitor} will replace calls
     * of get methods in {@link Field} against invokes of this method.
     *
     * @param field that should be accessed
     * @param instance of the class containing the field or null for static fields
     * @return value of the field
     * @see ReflectFieldAccessReplaceVisitor
     */
    public static Object getField(Field field, Object instance) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> owner = field.getDeclaringClass();
        String classname = owner.getName().replace('.', '/');
        if (fields.contains(classname, field.getName(), Type.getDescriptor(field.getType()))) {
            Method method = owner.getDeclaredMethod("$linkstone$getter$" + field.getName());
            return method.invoke(instance);
        } else {
            return field.get(instance);
        }
    }

    /**
     * Set the value of a field or invoke its setter if its contained in the {@link FieldSet}.
     *
     * The {@link ReflectFieldAccessReplaceVisitor} will replace calls
     * of set methods in {@link Field} against invokes of this method.
     *
     * @param field that should be accessed
     * @param instance of the class containing the field or null for static fields
     * @param value that should be assigned to the field
     * @see ReflectFieldAccessReplaceVisitor
     */
    public static void setField(Field field, Object instance, Object value) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> owner = field.getDeclaringClass();
        String classname = owner.getName().replace('.', '/');
        if (fields.contains(classname, field.getName(), Type.getDescriptor(field.getType()))) {
            Method method = owner.getDeclaredMethod("$linkstone$setter$" + field.getName(), field.getType());
            method.invoke(instance, value);
        } else {
            field.set(instance, value);
        }
    }
}
