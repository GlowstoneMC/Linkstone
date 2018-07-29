package net.glowstone.linkstone.runtime.reflectionredirect;

/**
 * Provides the bytecode for a class
 */
public interface ClassSource {
    /**
     * Get the runtime name of the class.
     *
     * @return classname
     */
    String getClassName();

    /**
     * Get the bytecode of the class.
     *
     * @return bytecode
     */
    byte[] getBytecode();
}
