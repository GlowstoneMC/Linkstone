package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LEnum;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public enum EnumMonsterType {
    @LEnum(version = V1_12_R1)
    UNDEFINED,

    @LEnum(version = V1_12_R1)
    UNDEAD,

    @LEnum(version = V1_12_R1)
    ARTHROPOD,

    @LEnum(version = V1_12_R1)
    ILLAGER;

    private EnumMonsterType() {
    }
}

