package net.minecraft.server;

public enum EnumGamemode {

    NOT_SET(-1, "", ""), SURVIVAL(0, "survival", "s"), CREATIVE(1, "creative", "c"), ADVENTURE(2, "adventure", "a"), SPECTATOR(3, "spectator", "sp");

    int f = 0;

    String g = null;

    String h = null;

    private EnumGamemode(int i, String s, String s1) {
    }

    public int getId() {
        return 0;
    }

    public String b() {
        return null;
    }

    public void a(PlayerAbilities playerabilities) {
    }

    public boolean c() {
        return false;
    }

    public boolean isCreative() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public static EnumGamemode getById(int i) {
        return null;
    }

    public static EnumGamemode a(int i, EnumGamemode enumgamemode) {
        return null;
    }

    public static EnumGamemode a(String s, EnumGamemode enumgamemode) {
        return null;
    }
}
