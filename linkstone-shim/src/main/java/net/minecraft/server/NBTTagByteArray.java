package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;
import net.glowstone.util.nbt.ByteArrayTag;

import java.util.Arrays;
import java.util.List;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class NBTTagByteArray extends NBTBase {
    public static NBTTagByteArray fromGlowstone(ByteArrayTag tag) {
        return new NBTTagByteArray(tag.getValue());
    }

    @LField(version = V1_12_R1)
    private byte[] data;

    @LConstructor(version = V1_12_R1)
    public NBTTagByteArray(byte[] data) {
        this.data = data;
    }

    @LConstructor(version = V1_12_R1)
    public NBTTagByteArray(List<Byte> list) {
        this(new byte[list.size()]);
        int index = 0;
        for (Byte b : list) {
            this.data[index++] = b;
        }
    }

    @LMethod(version = V1_12_R1, name = "c")
    public byte[] getData() {
        return data;
    }

    @Override
    @LOverride
    public byte getTypeId() {
        return ID_BYTE_ARRAY;
    }

    @Override
    @LOverride
    public NBTBase clone() {
        return new NBTTagByteArray(Arrays.copyOf(this.data, this.data.length));
    }

    @Override
    public ByteArrayTag toGlowstone() {
        return new ByteArrayTag(data);
    }

    @Override
    public boolean equals(Object o) {
        // implementation might differ from nms implementation
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NBTTagByteArray that = (NBTTagByteArray) o;
        return Arrays.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        // implementation might differ from nms implementation
        return Arrays.hashCode(data);
    }
}
