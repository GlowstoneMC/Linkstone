package net.minecraft.server;

public enum EnumWorldBorderState {
    GROWING(0), SHRINKING(0), STATIONARY(0);

    private final int d;

    private EnumWorldBorderState(int n2) {
        this.d = n2;
    }
}