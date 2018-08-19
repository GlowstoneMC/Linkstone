package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.util.nbt.ByteArrayTag;
import net.glowstone.util.nbt.ByteTag;
import net.glowstone.util.nbt.CompoundTag;
import net.glowstone.util.nbt.DoubleTag;
import net.glowstone.util.nbt.FloatTag;
import net.glowstone.util.nbt.IntArrayTag;
import net.glowstone.util.nbt.IntTag;
import net.glowstone.util.nbt.ListTag;
import net.glowstone.util.nbt.LongTag;
import net.glowstone.util.nbt.ShortTag;
import net.glowstone.util.nbt.StringTag;
import net.glowstone.util.nbt.Tag;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public abstract class NBTBase {
    public static final int ID_END = 0;
    public static final int ID_BYTE = 1;
    public static final int ID_SHORT = 2;
    public static final int ID_INT = 3;
    public static final int ID_LONG = 4;
    public static final int ID_FLOAT = 5;
    public static final int ID_DOUBLE = 6;
    public static final int ID_BYTE_ARRAY = 7;
    public static final int ID_STRING = 8;
    public static final int ID_LIST = 9;
    public static final int ID_COMPOUND = 10;
    public static final int ID_INT_ARRAY = 11;

    /**
     * Virtual id uses by NMS to check whether a value is numeric.
     * It is not part of the NBT format.
     * @see NBTTagCompound#hasKeyOfType(String, int)
     */
    public static final int VIRUTAL_ID_NUMERIC = 99;

    public static NBTBase fromGlowstone(Tag<?> tag) {
        switch (tag.getType()) {
            case BYTE:
                return NBTTagByte.fromGlowstone((ByteTag) tag);

            case SHORT:
                return NBTTagShort.fromGlowstone((ShortTag) tag);

            case INT:
                return NBTTagInt.fromGlowstone((IntTag) tag);

            case LONG:
                return NBTTagLong.fromGlowstone((LongTag) tag);

            case FLOAT:
                return NBTTagFloat.fromGlowstone((FloatTag) tag);

            case DOUBLE:
                return NBTTagDouble.fromGlowstone((DoubleTag) tag);

            case BYTE_ARRAY:
                return NBTTagByteArray.fromGlowstone((ByteArrayTag) tag);

            case STRING:
                return NBTTagString.fromGlowstone((StringTag) tag);

            case LIST:
                return NBTTagList.fromGlowstone((ListTag<?>) tag);

            case COMPOUND:
                return NBTTagCompound.fromGlowstone((CompoundTag) tag);

            case INT_ARRAY:
                return NBTTagIntArray.fromGlowstone((IntArrayTag) tag);

            default:
                throw new AssertionError();
        }
    }

    @LMethod(version = V1_12_R1)
    public abstract byte getTypeId();

    @LMethod(version = V1_12_R1)
    public abstract NBTBase clone();

    public abstract Tag<?> toGlowstone();
}
