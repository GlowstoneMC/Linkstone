package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;
import net.glowstone.util.nbt.IntTag;

import java.util.Objects;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class NBTTagInt extends NBTNumber {
    public static NBTTagInt fromGlowstone(IntTag tag) {
        return new NBTTagInt(tag.getValue());
    }

    @LField(version = V1_12_R1)
    private int data;

    @LConstructor(version = V1_12_R1)
    public NBTTagInt(int data) {
        this.data = data;
    }

    @Override
    @LOverride
    public byte getTypeId() {
        return ID_INT;
    }

    @Override
    @LOverride
    public NBTBase clone() {
        return _clone();
    }

    @LMethod(version = V1_12_R1, name = "c")
    public NBTTagInt _clone() {
        return new NBTTagInt(data);
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
        return data;
    }

    @Override
    @LOverride
    public long asLong() {
        return data;
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
    public IntTag toGlowstone() {
        return new IntTag(data);
    }

    @Override
    public boolean equals(Object o) {
        // implementation might differ from nms implementation
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NBTTagInt nbtTagInt = (NBTTagInt) o;
        return data == nbtTagInt.data;
    }

    @Override
    public int hashCode() {
        // implementation might differ from nms implementation
        return Objects.hash(data);
    }
}
