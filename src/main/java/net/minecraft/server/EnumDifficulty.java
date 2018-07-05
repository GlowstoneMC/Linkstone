package net.minecraft.server;

import java.util.Locale;

public enum EnumDifficulty {
    PEACEFUL, EASY, NORMAL, HARD;

    private static final EnumDifficulty[] e;

    public int a() {
        return this.ordinal(); // f
    }

    public static EnumDifficulty getById(int n) {
        return e[n % e.length];
    }

    public String b() {
        return "options.difficulty." + this.name().toLowerCase(Locale.ENGLISH); // g 
    }

    static {
        e = EnumDifficulty.values();
    }
}