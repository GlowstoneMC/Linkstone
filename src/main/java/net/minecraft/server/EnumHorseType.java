package net.minecraft.server;

public enum EnumHorseType {

    HORSE("EntityHorse", "horse_white", SoundEffects.cp, SoundEffects.cw, SoundEffects.ct, LootTables.F), DONKEY("Donkey", "donkey", SoundEffects.ax, SoundEffects.aB, SoundEffects.aA, LootTables.F), MULE("Mule", "mule", SoundEffects.dD, SoundEffects.dF, SoundEffects.dE, LootTables.F), ZOMBIE("ZombieHorse", "horse_zombie", SoundEffects.hF, SoundEffects.hH, SoundEffects.hG, LootTables.G), SKELETON("SkeletonHorse", "horse_skeleton", SoundEffects.fv, SoundEffects.fx, SoundEffects.fw, LootTables.H);

    private final ChatMessage f;

    private final MinecraftKey g;

    private final SoundEffect h;

    private final SoundEffect i;

    private final SoundEffect j;

    private final MinecraftKey k;

    private EnumHorseType(String s, String s1, SoundEffect soundeffect, SoundEffect soundeffect1, SoundEffect soundeffect2, MinecraftKey minecraftkey) {
    }

    public SoundEffect a() {
        return null;
    }

    public SoundEffect b() {
        return null;
    }

    public SoundEffect c() {
        return null;
    }

    public ChatMessage d() {
        return null;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return false;
    }

    public int k() {
        return 0;
    }

    public static EnumHorseType a(int i) {
        return null;
    }

    public MinecraftKey l() {
        return null;
    }
}
