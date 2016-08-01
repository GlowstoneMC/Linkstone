package net.minecraft.server;

public enum EnumZombieType {

    NORMAL("Zombie", false), VILLAGER_FARMER("Zombie", true), VILLAGER_LIBRARIAN("Zombie", true), VILLAGER_PRIEST("Zombie", true), VILLAGER_SMITH("Zombie", true), VILLAGER_BUTCHER("Zombie", true), HUSK("Husk", false);

    private boolean h = false;

    private final ChatMessage i = null;

    private EnumZombieType(String s, boolean flag) {
    }

    public int a() {
        return 0;
    }

    public boolean b() {
        return false;
    }

    public int c() {
        return 0;
    }

    public static EnumZombieType a(int i) {
        return null;
    }

    public static EnumZombieType b(int i) {
        return null;
    }

    public ChatMessage d() {
        return null;
    }

    public boolean e() {
        return false;
    }

    public SoundEffect f() {
        return null;
    }

    public SoundEffect g() {
        return null;
    }

    public SoundEffect h() {
        return null;
    }

    public SoundEffect i() {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static {
        }
    }
}
