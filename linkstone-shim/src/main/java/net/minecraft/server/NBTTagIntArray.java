package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;
import net.glowstone.util.nbt.IntArrayTag;

import java.util.Arrays;
import java.util.List;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class NBTTagIntArray extends NBTBase {
    public static NBTTagIntArray fromGlowstone(IntArrayTag tag) {
        return new NBTTagIntArray(tag.getValue());
    }

    @LField(version = V1_12_R1)
    private int[] data;

    @LConstructor(version = V1_12_R1)
    public NBTTagIntArray(int[] data) {
        this.data = data;
    }

    @LConstructor(version = V1_12_R1)
    public NBTTagIntArray(List<Integer> list) {
        this(new int[list.size()]);
        int index = 0;
        for (Integer i : list) {
            this.data[index++] = i;
        }
    }

    @LMethod(version = V1_12_R1, name = "d")
    public int[] getData() {
        return data;
    }

    @Override
    @LOverride
    public byte getTypeId() {
        return ID_INT_ARRAY;
    }

    @Override
    @LOverride
    public NBTBase clone() {
        return _clone();
    }

    @LMethod(version = V1_12_R1, name = "c")
    public NBTTagIntArray _clone() {
        return new NBTTagIntArray(Arrays.copyOf(this.data, this.data.length));
    }

    @Override
    public IntArrayTag toGlowstone() {
        return new IntArrayTag(data);
    }

    @Override
    public boolean equals(Object o) {
        // implementation might differ from nms implementation
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NBTTagIntArray that = (NBTTagIntArray) o;
        return Arrays.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        // implementation might differ from nms implementation
        return Arrays.hashCode(data);
    }
}
