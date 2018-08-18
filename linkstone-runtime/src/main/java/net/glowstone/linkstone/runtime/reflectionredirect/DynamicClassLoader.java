package net.glowstone.linkstone.runtime.reflectionredirect;

import java.util.function.Supplier;

/**
 * Classloader that loads byte arrays of bytecode
 */
public class DynamicClassLoader extends ClassLoader {

    public DynamicClassLoader() {}

    public DynamicClassLoader(ClassLoader classLoader) {
        super(classLoader);
    }

    public Class<?> getOrLoad(ClassSource source) {
        return getOrLoad(source.getClassName(), source::getBytecode);
    }

    /**
     * Load a class from a bytearray of bytecode if it was not already loaded.
     *
     * @param classname name of class
     * @param bytecode of class
     * @return the class
     */
    public Class<?> getOrLoad(String classname, Supplier<byte[]> bytecode) {
        try {
            return loadClass(classname);
        } catch (ClassNotFoundException e) {
            return loadBytecode(classname, bytecode.get());
        }
    }

    public Class<?> loadBytecode(String classname, byte[] bytecode) {
        return defineClass(classname, bytecode, 0, bytecode.length);
    }
}
