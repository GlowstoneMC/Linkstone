package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;
import net.glowstone.util.nbt.ListTag;
import net.glowstone.util.nbt.Tag;
import net.glowstone.util.nbt.TagType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

/**
 * List of NBT tags where each element is of same type.
 */
@LClassfile(version = V1_12_R1)
public class NBTTagList extends NBTBase {
    public static NBTTagList fromGlowstone(ListTag<?> tag) {
        List<NBTBase> elements = tag.getValue().stream()
                .map(NBTBase::fromGlowstone)
                .collect(Collectors.toList());
        return new NBTTagList(elements, tag.getChildType().getId());
    }

    @LField(version = V1_12_R1)
    private List<NBTBase> list;

    /**
     * Type of the elements or zero if the list is empty
     */
    @LField(version = V1_12_R1)
    private byte type;

    @LConstructor(version = V1_12_R1)
    public NBTTagList() {
        this(new ArrayList<>(), (byte) 0);
    }

    private NBTTagList(List<NBTBase> list, byte type) {
        this.list = list;
        this.type = type;
    }

    @Override
    @LOverride
    public byte getTypeId() {
        return ID_LIST;
    }

    @Override
    @LOverride
    public NBTBase clone() {
        return _clone();
    }

    @LMethod(version = V1_12_R1, name = "g")
    public int getElementType() {
        return type;
    }

    @LMethod(version = V1_12_R1, name = "d")
    public NBTTagList _clone() {
        List<NBTBase> elements = this.list.stream()
                .map(NBTBase::clone)
                .collect(Collectors.toList());

        return new NBTTagList(elements, this.type);
    }

    @LMethod(version = V1_12_R1)
    public int size() {
        return list.size();
    }

    @LMethod(version = V1_12_R1)
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @LMethod(version = V1_12_R1)
    public void add(NBTBase tag) {
        if (this.type == 0) {
            this.type = tag.getTypeId();
        }

        list.add(tag);
    }

    @LMethod(version = V1_12_R1, name = "a")
    public void set(int index, NBTBase tag) {
        if (type == 0) {
            this.type = tag.getTypeId();
        }

        list.set(index, tag);
    }

    @LMethod(version = V1_12_R1)
    public NBTBase remove(int index) {
        NBTBase removed = this.list.remove(index);
        if (isEmpty()) {
            type = 0;
        }
        return removed;
    }

    @LMethod(version = V1_12_R1, name = "i")
    public NBTBase get(int index) {
        return index >= 0 && index < size() ?
            list.get(index) : null;
    }

    @LMethod(version = V1_12_R1, name = "get")
    public NBTTagCompound getCompound(int index) {
        NBTBase tag = get(index);
        return tag instanceof NBTTagCompound ? (NBTTagCompound) tag : new NBTTagCompound();
    }

    @LMethod(version = V1_12_R1)
    public String getString(int index) {
        NBTBase tag = get(index);
        return tag instanceof NBTTagString ? ((NBTTagString) tag).getData() : "";
    }

    @LMethod(version = V1_12_R1, name = "c")
    public int getInt(int index) {
        NBTBase tag = get(index);
        return tag instanceof NBTTagInt ? ((NBTTagInt)tag).asInt() : 0;
    }

    @LMethod(version = V1_12_R1, name = "g")
    public float getFloat(int index) {
        NBTBase tag = get(index);
        return tag instanceof NBTTagFloat ? ((NBTTagFloat)tag).asFloat() : 0.0F;
    }

    @LMethod(version = V1_12_R1, name = "f")
    public double getDouble(int index) {
        NBTBase tag = get(index);
        return tag instanceof NBTTagDouble ? ((NBTTagDouble)tag).asDouble() : 0.0D;
    }

    @LMethod(version = V1_12_R1, name = "d")
    public int[] getIntArray(int index) {
        NBTBase tag = get(index);
        return tag instanceof NBTTagIntArray ? ((NBTTagIntArray)tag).getData() : new int[0];
    }

    @Override
    public ListTag<? extends Tag<?>> toGlowstone() {
        List<? extends Tag<?>> elements = list.stream()
                .map(NBTBase::toGlowstone)
                .collect(Collectors.toList());

        return new ListTag<>(TagType.byId(type), elements);
    }

    @Override
    public boolean equals(Object o) {
        // implementation might differ from nms implementation
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NBTTagList that = (NBTTagList) o;
        return type == that.type &&
                Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        // implementation might differ from nms implementation
        return Objects.hash(list, type);
    }
}
