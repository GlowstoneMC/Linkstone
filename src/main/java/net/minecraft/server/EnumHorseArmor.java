package net.minecraft.server;

import javax.annotation.Nullable;

public enum EnumHorseArmor {

    NONE(0), IRON(5, "iron", "meo"), GOLD(7, "gold", "goo"), DIAMOND(11, "diamond", "dio");

    private final String e;

    private final String f;

    private final int g;

    private EnumHorseArmor(int i) {
    }

    private EnumHorseArmor(int i, String s, String s1) {
    }

    public int a() {
        return 0;
    }

    public int c() {
        return 0;
    }

    public static EnumHorseArmor a(int i) {
        return null;
    }

    public static EnumHorseArmor a(@Nullable ItemStack itemstack) {
        return null;
    }

    public static EnumHorseArmor a(@Nullable Item item) {
        return null;
    }

    public static boolean b(@Nullable Item item) {
        return false;
    }
}
