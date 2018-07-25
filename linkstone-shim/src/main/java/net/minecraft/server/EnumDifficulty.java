package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;

import java.util.Locale;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
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