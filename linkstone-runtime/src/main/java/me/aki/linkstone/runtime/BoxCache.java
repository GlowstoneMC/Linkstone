package me.aki.linkstone.runtime;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.objectweb.asm.Type;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/**
 * A static utility class that boxes objects.
 * Casts to box types are replaced against the usage of this utility.
 */
public class BoxCache {
    /**
     * Cache that maps objects to a Map. This Map maps box classes the box instances
     * that contain the object.
     */
    private static final Cache<Object, Map<Class<?>, Object>> boxCache =
            CacheBuilder.newBuilder()
                    .weakKeys()
                    .build();

    public static Object box(Object objectToBox, Class<?> expectedBox) throws ExecutionException, ClassNotFoundException {
        if (objectToBox == null) {
            return null;
        }

        BoxAndBoxed idealBox = getBoxType(objectToBox.getClass(), expectedBox);
        if (idealBox == null) {
            throw new RuntimeException("Cannot box " + objectToBox.getClass().getName() + " into " + expectedBox.getClass().getName());
        }

        Map<Class<?>, Object> boxMap = boxCache.get(objectToBox, HashMap::new);

        synchronized (boxMap) {
            return boxMap.computeIfAbsent(idealBox.boxClass, boxClass -> {
                try {
                    return boxClass.getConstructor(idealBox.boxedClass).newInstance(objectToBox);
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                    throw new RuntimeException("Could not create Linkstone box " + idealBox.boxClass.getName() + " for type " + idealBox.boxedClass.getName());
                }
            });
        }
    }

    private static BoxAndBoxed getBoxType(Class<?> classToBox, Class<?> expectedBox) throws ClassNotFoundException {
        Boxes boxes = LinkstoneRuntimeData.getBoxes();
        ClassLoader pluginClassLoader = LinkstoneRuntimeData.getPluginClassLoader();

        do {
            Set<Type> availableBoxes = boxes.getBoxTypes(Type.getType(classToBox));
            for(Type boxType : availableBoxes) {
                Class<?> boxClass = pluginClassLoader.loadClass(boxType.getClassName());
                if (expectedBox.isAssignableFrom(boxClass)) {
                    return new BoxAndBoxed(boxClass, classToBox);
                }
            }
        } while((classToBox = classToBox.getSuperclass()) != null);

        return null;
    }

    private static class BoxAndBoxed {
        private final Class<?> boxClass;
        private final Class<?> boxedClass;

        private BoxAndBoxed(Class<?> boxClass, Class<?> boxedClass) {
            this.boxClass = boxClass;
            this.boxedClass = boxedClass;
        }
    }
}
