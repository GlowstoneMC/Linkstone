package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)

public enum EnumWorldBorderState {
    GROWING(0), SHRINKING(0), STATIONARY(0);

    private final int d;

    private EnumWorldBorderState(int n2) {
        this.d = n2;
    }
}