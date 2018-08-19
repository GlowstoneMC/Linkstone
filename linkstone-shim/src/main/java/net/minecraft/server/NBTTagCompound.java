package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;
import net.glowstone.util.nbt.ByteArrayTag;
import net.glowstone.util.nbt.CompoundTag;
import net.glowstone.util.nbt.Tag;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class NBTTagCompound extends NBTBase {
    public static NBTTagCompound fromGlowstone(CompoundTag tag) {
        return new NBTTagCompound(tag.getValue().entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> NBTBase.fromGlowstone(e.getValue()))));
    }

    @LGenerate
    @LField(version = V1_12_R1)
    private final Map<String, NBTBase> map;

    @LConstructor(version = V1_12_R1)
    public NBTTagCompound() {
        this(new HashMap<>());
    }

    private NBTTagCompound(Map<String, NBTBase> map) {
        this.map = map;
    }

    @Override
    @LOverride
    public byte getTypeId() {
        return (byte) ID_COMPOUND;
    }

    @Override
    @LOverride
    public NBTBase clone() {
        return _clone();
    }

    @LMethod(version = V1_12_R1, name = "g")
    public NBTTagCompound _clone() {
        return new NBTTagCompound(this.map.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().clone())));
    }

    @LMethod(version = V1_12_R1, name = "c")
    public Set<String> keySet() {
        return map.keySet();
    }

    @LMethod(version = V1_12_R1)
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @LMethod(version = V1_12_R1, name = "d")
    public int size() {
        return map.size();
    }

    @LMethod(version = V1_12_R1)
    public boolean hasKey(String key) {
        return map.containsKey(key);
    }

    @LMethod(version = V1_12_R1)
    public boolean hasKeyOfType(String key, int id) {
        NBTBase value = map.get(key);
        int otherId = value == null ? 0 : value.getTypeId();

        if (id == VIRUTAL_ID_NUMERIC) {
            switch (otherId) {
                case ID_BYTE:
                case ID_SHORT:
                case ID_INT:
                case ID_LONG:
                case ID_FLOAT:
                case ID_DOUBLE:
                    return true;

                default:
                    return false;
            }
        } else {
            return id == otherId;
        }
    }

    @LMethod(version = V1_12_R1)
    public void remove(String key) {
        map.remove(key);
    }

    /**
     * Add all values of another compound to this one.
     *
     * If both compounds have compounds assigned to the same key,
     * their values will get merged
     *
     * @param other
     */
    @LMethod(version = V1_12_R1, name = "a")
    public void addAll(NBTTagCompound other) {
        other.map.forEach((key, value) -> {
            NBTBase currentValue = this.map.get(key);
            if (value instanceof NBTTagCompound && currentValue instanceof NBTTagCompound) {
                NBTTagCompound currentCompound = (NBTTagCompound) currentValue;
                NBTTagCompound otherCompound = (NBTTagCompound) value;
                currentCompound.addAll(otherCompound);
            } else {
                set(key, value);
            }
        });
    }

    @LMethod(version = V1_12_R1)
    public void set(String key, NBTBase value) {
        map.put(key, value);
    }

    @LMethod(version = V1_12_R1)
    public void setByte(String key, byte value) {
        set(key, new NBTTagByte(value));
    }

    @LMethod(version = V1_12_R1)
    public void setShort(String key, short value) {
        set(key, new NBTTagShort(value));
    }

    @LMethod(version = V1_12_R1)
    public void setInt(String key, int value) {
        set(key, new NBTTagInt(value));
    }

    @LMethod(version = V1_12_R1)
    public void setLong(String key, long value) {
        set(key, new NBTTagLong(value));
    }

    @LMethod(version = V1_12_R1)
    public void setFloat(String key, float value) {
        set(key, new NBTTagFloat(value));
    }

    @LMethod(version = V1_12_R1)
    public void setDouble(String key, double value) {
        set(key, new NBTTagDouble(value));
    }

    @LMethod(version = V1_12_R1)
    public void setByteArray(String key, byte[] value) {
        set(key, new NBTTagByteArray(value));
    }

    @LMethod(version = V1_12_R1)
    public void setString(String key, String value) {
        set(key, new NBTTagString(value));
    }

    // There are no setList and setCompound method

    @LMethod(version = V1_12_R1)
    public void setIntArray(String key, int[] value) {
        set(key, new NBTTagIntArray(value));
    }

    @LMethod(version = V1_12_R1)
    public void setUUID(String key, UUID uuid) {
        setLong(key + "Least", uuid.getLeastSignificantBits());
        setLong(key + "Most", uuid.getMostSignificantBits());
    }

    @LMethod(version = V1_12_R1)
    public NBTBase get(String key) {
        return map.get(key);
    }

    @LMethod(version = V1_12_R1)
    public byte getByte(String key) {
        NBTBase tag = get(key);
        return tag instanceof NBTNumber ? ((NBTNumber) tag).asByte() : 0;
    }

    @LMethod(version = V1_12_R1)
    public short getShort(String key) {
        NBTBase tag = get(key);
        return tag instanceof NBTNumber ? ((NBTNumber) tag).asShort() : 0;
    }

    @LMethod(version = V1_12_R1)
    public int getInt(String key) {
        NBTBase tag = get(key);
        return tag instanceof NBTNumber ? ((NBTNumber) tag).asInt() : 0;
    }

    @LMethod(version = V1_12_R1)
    public long getLong(String key) {
        NBTBase tag = get(key);
        return tag instanceof NBTNumber ? ((NBTNumber) tag).asLong() : 0L;
    }

    @LMethod(version = V1_12_R1)
    public float getFloat(String key) {
        NBTBase tag = get(key);
        return tag instanceof NBTNumber ? ((NBTNumber) tag).asFloat() : 0L;
    }

    @LMethod(version = V1_12_R1)
    public double getDouble(String key) {
        NBTBase tag = get(key);
        return tag instanceof NBTNumber ? ((NBTNumber) tag).asDouble() : 0L;
    }

    @LMethod(version = V1_12_R1)
    public byte[] getByteArray(String key) {
        NBTBase tag = get(key);
        return tag instanceof NBTTagByteArray ? ((NBTTagByteArray)tag).getData() : new byte[0];
    }

    @LMethod(version = V1_12_R1)
    public String getString(String key) {
        NBTBase tag = get(key);
        return tag instanceof NBTTagString ? ((NBTTagString)tag).getData() : "";
    }

    @LMethod(version = V1_12_R1)
    public NBTTagList getList(String key, int elementType) {
        NBTBase tag = get(key);
        if (tag instanceof NBTTagList) {
            NBTTagList list = (NBTTagList) tag;
            if (list.isEmpty() || list.getElementType() == elementType) {
                return list;
            }
        }
        return new NBTTagList();
    }

    @LMethod(version = V1_12_R1)
    public NBTTagCompound getCompound(String key) {
        NBTBase tag = get(key);
        return tag instanceof NBTTagCompound ? (NBTTagCompound) tag : new NBTTagCompound();
    }

    @LMethod(version = V1_12_R1)
    public int[] getIntArray(String key) {
        NBTBase tag = get(key);
        return tag instanceof NBTTagIntArray ? ((NBTTagIntArray) tag).getData() : new int[0];
    }

    @LMethod(version = V1_12_R1, name = "a")
    public UUID getUUID(String key) {
        long most = getLong(key + "Most");
        long least = getLong(key + "Least");
        return new UUID(most, least);
    }

    @Override
    public Tag<?> toGlowstone() {
        Map<String, Tag> values = this.map.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().toGlowstone()));
        return new CompoundTag(values);
    }

    @Override
    public boolean equals(Object o) {
        // implementation might differ from nms implementation
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NBTTagCompound that = (NBTTagCompound) o;
        return Objects.equals(map, that.map);
    }

    @Override
    public int hashCode() {
        // implementation might differ from nms implementation
        return Objects.hash(map);
    }
}
