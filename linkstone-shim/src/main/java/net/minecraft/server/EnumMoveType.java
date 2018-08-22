package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LEnum;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public enum EnumMoveType {
    @LEnum(version = V1_12_R1)
    SELF,

    @LEnum(version = V1_12_R1)
    PLAYER,

    @LEnum(version = V1_12_R1)
    PISTON,

    @LEnum(version = V1_12_R1)
    SHULKER_BOX,

    @LEnum(version = V1_12_R1)
    SHULKER;

    private EnumMoveType() {
    }
}
