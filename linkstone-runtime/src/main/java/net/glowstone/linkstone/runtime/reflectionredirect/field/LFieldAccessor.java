package net.glowstone.linkstone.runtime.reflectionredirect.field;

/**
 * Since the FieldAccessor in java's reflection api is in different packages on different JVMs,
 * we use our own class and generate adapters on the fly.
 */
public interface LFieldAccessor {
    Object get(Object instance) throws Exception;

    void set(Object instance, Object value) throws Exception;

    default boolean getBoolean(Object instance) throws Exception {
        return (Boolean) this.get(instance);
    }

    default byte getByte(Object instance) throws Exception {
        return (Byte) this.get(instance);
    }

    default char getChar(Object instance) throws Exception {
        return (Character) this.get(instance);
    }

    default short getShort(Object instance) throws Exception {
        return (Short) this.get(instance);
    }

    default int getInt(Object instance) throws Exception {
        return (Integer) this.get(instance);
    }

    default long getLong(Object instance) throws Exception {
        return (Long) this.get(instance);
    }

    default float getFloat(Object instance) throws Exception {
        return (Float) this.get(instance);
    }

    default double getDouble(Object instance) throws Exception {
        return (Double) this.get(instance);
    }

    default void setBoolean(Object instance, boolean value) throws Exception {
        this.set(instance, value);
    }

    default void setByte(Object instance, byte value) throws Exception {
        this.set(instance, value);
    }

    default void setChar(Object instance, char value) throws Exception {
        this.set(instance, value);
    }

    default void setShort(Object instance, short value) throws Exception {
        this.set(instance, value);
    }

    default void setInt(Object instance, int value) throws Exception {
        this.set(instance, value);
    }

    default void setLong(Object instance, long value) throws Exception {
        this.set(instance, value);
    }

    default void setFloat(Object instance, float value) throws Exception {
        this.set(instance, value);
    }

    default void setDouble(Object instance, double value) throws Exception {
        this.set(instance, value);
    }
}
