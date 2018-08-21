package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;
import net.glowstone.util.nbt.DoubleTag;

import java.util.Objects;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class NBTTagDouble extends NBTNumber {
    public static NBTTagDouble fromGlowstone(DoubleTag tag) {
        return new NBTTagDouble(tag.getValue());
    }

    @LField(version = V1_12_R1)
    private double data;

    @LConstructor(version = V1_12_R1)
    public NBTTagDouble(double data) {
        this.data = data;
    }

    @Override
    @LOverride
    public byte getTypeId() {
        return ID_DOUBLE;
    }

    @Override
    @LOverride
    public NBTBase clone() {
        return _clone();
    }

    @LMethod(version = V1_12_R1, name = "c")
    public NBTTagDouble _clone() {
        return new NBTTagDouble(data);
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
        return (float) data;
    }

    @Override
    @LOverride
    public double asDouble() {
        return data;
    }

    @Override
    public DoubleTag toGlowstone() {
        return new DoubleTag(data);
    }

    @Override
    public boolean equals(Object o) {
        // implementation might differ from nms implementation
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NBTTagDouble that = (NBTTagDouble) o;
        return Double.compare(that.data, data) == 0;
    }

    @Override
    public int hashCode() {
        // implementation might differ from nms implementation
        return Objects.hash(data);
    }
}
