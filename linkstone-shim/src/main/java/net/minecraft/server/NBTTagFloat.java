package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;
import net.glowstone.util.nbt.FloatTag;

import java.util.Objects;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class NBTTagFloat extends NBTNumber {
    public static NBTTagFloat fromGlowstone(FloatTag tag) {
        return new NBTTagFloat(tag.getValue());
    }

    @LField(version = V1_12_R1)
    private float data;

    @LConstructor(version = V1_12_R1)
    public NBTTagFloat(float data) {
        this.data = data;
    }

    @Override
    @LOverride
    public byte getTypeId() {
        return ID_FLOAT;
    }

    @Override
    @LOverride
    public NBTBase clone() {
        return _clone();
    }

    @LMethod(version = V1_12_R1, name = "c")
    public NBTTagFloat _clone() {
        return new NBTTagFloat(data);
    }

    @Override
    @LOverride
    public byte asByte() {
        return (byte) data;
    }

    @Override
    @LOverride
    public short asShort() {
        return (short) data;
    }

    @Override
    @LOverride
    public int asInt() {
        return (int) data;
    }

    @Override
    @LOverride
    public long asLong() {
        return (long) data;
    }

    @Override
    @LOverride
    public float asFloat() {
        return data;
    }

    @Override
    @LOverride
    public double asDouble() {
        return data;
    }

    @Override
    public FloatTag toGlowstone() {
        return new FloatTag(data);
    }

    @Override
    public boolean equals(Object o) {
        // implementation might differ from nms implementation
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NBTTagFloat that = (NBTTagFloat) o;
        return Float.compare(that.data, data) == 0;
    }

    @Override
    public int hashCode() {
        // implementation might differ from nms implementation
        return Objects.hash(data);
    }
}
