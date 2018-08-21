package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LField;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public enum EnumWorldBorderState {
    GROWING(4259712), SHRINKING(16724016), STATIONARY(2138367);

    @LField(version = V1_12_R1, name = "d")
    private final int id;

    EnumWorldBorderState(int id) {
        this.id = id;
    }
}