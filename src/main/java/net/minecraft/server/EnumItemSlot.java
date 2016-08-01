package net.minecraft.server;

public enum EnumItemSlot {

    MAINHAND(EnumItemSlot.Function.HAND, 0, 0, "mainhand"), OFFHAND(EnumItemSlot.Function.HAND, 1, 5, "offhand"), FEET(EnumItemSlot.Function.ARMOR, 0, 1, "feet"), LEGS(EnumItemSlot.Function.ARMOR, 1, 2, "legs"), CHEST(EnumItemSlot.Function.ARMOR, 2, 3, "chest"), HEAD(EnumItemSlot.Function.ARMOR, 3, 4, "head");

    private final EnumItemSlot.Function g = null;

    private final int h = 0;

    private final int i = 0;

    private final String j = null;

    private EnumItemSlot(EnumItemSlot.Function enumitemslot_function, int i, int j, String s) {
    }

    public EnumItemSlot.Function a() {
        return null;
    }

    public int b() {
        return 0;
    }

    public int c() {
        return 0;
    }

    public String d() {
        return null;
    }

    public static EnumItemSlot a(String s) {
        return null;
    }

    public static enum Function {

        HAND, ARMOR;

        private Function() {
        }
    }
}
