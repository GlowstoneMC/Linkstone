package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public enum EnumMoveType {
    SELF, PLAYER, PISTON, SHULKER_BOX, SHULKER;

    private EnumMoveType() {
    }
}
