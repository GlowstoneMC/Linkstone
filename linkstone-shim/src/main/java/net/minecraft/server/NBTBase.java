package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LMethod;
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

    @LMethod(version = V1_12_R1)
    public abstract byte getTypeId();

    @LMethod(version = V1_12_R1)
    public abstract NBTBase clone();

    public abstract Tag<?> toGlowstone();
}
