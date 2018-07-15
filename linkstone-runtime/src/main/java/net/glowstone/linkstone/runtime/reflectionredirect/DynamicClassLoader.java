package net.glowstone.linkstone.runtime.reflectionredirect;

/**
 * Classloader that loads byte arrays of bytecode
 */
public class DynamicClassLoader extends ClassLoader {

    public DynamicClassLoader() {}

    public DynamicClassLoader(ClassLoader classLoader) {
        super(classLoader);
    }

    public Class<?> loadBytecode(String classname, byte[] bytecode) {
        return defineClass(classname, bytecode, 0, bytecode.length);
    }
}
