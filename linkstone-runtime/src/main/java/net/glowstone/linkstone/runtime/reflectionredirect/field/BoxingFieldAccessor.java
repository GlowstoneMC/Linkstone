package net.glowstone.linkstone.runtime.reflectionredirect.field;

import net.glowstone.linkstone.runtime.BoxCache;

import java.lang.reflect.Field;

/**
 * FieldAccessor that boxes the instance before it is delegated to another FieldAccessor.
 */
public class BoxingFieldAccessor implements LFieldAccessor {
    private final LFieldAccessor delegatee;
    private final Field field;

    public BoxingFieldAccessor(LFieldAccessor delegatee, Field field) {
        this.delegatee = delegatee;
        this.field = field;
    }

    private Object boxInstance(Object instance) {
        if (instance != null && !field.getDeclaringClass().isAssignableFrom(instance.getClass())) {
            instance = BoxCache.box(instance, field.getDeclaringClass());
        }

        return instance;
    }

    @Override
    public Object get(Object instance) throws Exception {
        return delegatee.get(boxInstance(instance));
    }

    @Override
    public void set(Object instance, Object value) throws Exception {
        delegatee.set(boxInstance(instance), value);
    }

    @Override
    public boolean getBoolean(Object instance) throws Exception {
        return delegatee.getBoolean(boxInstance(instance));
    }

    @Override
    public byte getByte(Object instance) throws Exception {
        return delegatee.getByte(boxInstance(instance));
    }

    @Override
    public char getChar(Object instance) throws Exception {
        return delegatee.getChar(boxInstance(instance));
    }

    @Override
    public short getShort(Object instance) throws Exception {
        return delegatee.getShort(boxInstance(instance));
    }

    @Override
    public int getInt(Object instance) throws Exception {
        return delegatee.getInt(boxInstance(instance));
    }

    @Override
    public long getLong(Object instance) throws Exception {
        return delegatee.getLong(boxInstance(instance));
    }

    @Override
    public float getFloat(Object instance) throws Exception {
        return delegatee.getFloat(boxInstance(instance));
    }

    @Override
    public double getDouble(Object instance) throws Exception {
        return delegatee.getDouble(boxInstance(instance));
    }

    @Override
    public void setBoolean(Object instance, boolean value) throws Exception {
        delegatee.setBoolean(boxInstance(instance), value);
    }

    @Override
    public void setByte(Object instance, byte value) throws Exception {
        delegatee.setByte(boxInstance(instance), value);
    }

    @Override
    public void setChar(Object instance, char value) throws Exception {
        delegatee.setChar(boxInstance(instance), value);
    }

    @Override
    public void setShort(Object instance, short value) throws Exception {
        delegatee.setShort(boxInstance(instance), value);
    }

    @Override
    public void setInt(Object instance, int value) throws Exception {
        delegatee.setInt(boxInstance(instance), value);
    }

    @Override
    public void setLong(Object instance, long value) throws Exception {
        delegatee.setLong(boxInstance(instance), value);
    }

    @Override
    public void setFloat(Object instance, float value) throws Exception {
        delegatee.setFloat(boxInstance(instance), value);
    }

    @Override
    public void setDouble(Object instance, double value) throws Exception {
        delegatee.setDouble(boxInstance(instance), value);
    }
}
