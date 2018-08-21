package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;
import net.glowstone.util.nbt.StringTag;

import java.util.Objects;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class NBTTagString extends NBTBase {
    public static NBTTagString fromGlowstone(StringTag tag) {
        return new NBTTagString(tag.getValue());
    }

    @LField(version = V1_12_R1)
    private String data;

    @LConstructor(version = V1_12_R1)
    public NBTTagString(String data) {
        this.data = data;
    }

    @Override
    @LOverride
    public byte getTypeId() {
        return (byte) ID_STRING;
    }

    @Override
    @LOverride
    public NBTBase clone() {
        return _clone();
    }

    @LMethod(version = V1_12_R1, name = "c")
    public NBTTagString _clone() {
        return new NBTTagString(this.data);
    }

    @LMethod(version = V1_12_R1, name = "c_")
    public String getData() {
        return this.data;
    }

    @Override
    public StringTag toGlowstone() {
        return new StringTag(data);
    }

    @Override
    public boolean equals(Object o) {
        // implementation might differ from nms implementation
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NBTTagString that = (NBTTagString) o;
        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        // implementation might differ from nms implementation
        return Objects.hash(data);
    }
}
