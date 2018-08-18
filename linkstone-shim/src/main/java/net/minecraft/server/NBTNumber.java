package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.util.nbt.Tag;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public abstract class NBTNumber extends NBTBase {
    @LMethod(version = V1_12_R1, name = "g")
    public abstract byte asByte();

    @LMethod(version = V1_12_R1, name = "f")
    public abstract short asShort();

    @LMethod(version = V1_12_R1, name = "e")
    public abstract int asInt();

    @LMethod(version = V1_12_R1, name = "d")
    public abstract long asLong();

    @LMethod(version = V1_12_R1, name = "i")
    public abstract float asFloat();

    @LMethod(version = V1_12_R1)
    public abstract double asDouble();

    @Override
    public abstract Tag<? extends Number> toGlowstone();
}
