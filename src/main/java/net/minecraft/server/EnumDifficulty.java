package net.minecraft.server;

public enum EnumDifficulty {

    PEACEFUL(0, "options.difficulty.peaceful"), EASY(1, "options.difficulty.easy"), NORMAL(2, "options.difficulty.normal"), HARD(3, "options.difficulty.hard");

    private static final EnumDifficulty[] e;

    private final int f;

    private final String g;

    private EnumDifficulty(int i, String s) {
    }

    public int a() {
        return 0;
    }

    public static EnumDifficulty getById(int i) {
        return null;
    }

    public String b() {
        return null;
    }

    static {
    }
}
