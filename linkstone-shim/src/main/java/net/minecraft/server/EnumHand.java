package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LEnum;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public enum EnumHand {
    @LEnum(version = V1_12_R1)
    MAIN_HAND,

    @LEnum(version = V1_12_R1)
    OFF_HAND;

    private EnumHand() {
    }
}
