package net.minecraft.server;

public enum EnumSkeletonType {

    NORMAL("Skeleton", LootTables.al), WITHER("WitherSkeleton", LootTables.am), STRAY("Stray", LootTables.an);

    private final ChatMessage d;

    private final MinecraftKey e;

    private EnumSkeletonType(String s, MinecraftKey minecraftkey) {
    }

    public int a() {
        return 0;
    }

    public static EnumSkeletonType a(int i) {
        return null;
    }

    public MinecraftKey c() {
        return null;
    }

    public SoundEffect d() {
        return null;
    }

    public SoundEffect e() {
        return null;
    }

    public SoundEffect f() {
        return null;
    }

    public SoundEffect g() {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }
}
