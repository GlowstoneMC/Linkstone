package net.minecraft.server;

import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class PotionRegistry {

    private static final MinecraftKey b;

    public static final RegistryBlocks<MinecraftKey, PotionRegistry> a;

    private static int c;

    private final String d;

    private final ImmutableList<MobEffect> e;

    public static int a(PotionRegistry potionregistry) {
        return 0;
    }

    @Nullable
    public static PotionRegistry a(String s) {
        return null;
    }

    public PotionRegistry(MobEffect... amobeffect) {
    }

    public PotionRegistry(@Nullable String s, MobEffect... amobeffect) {
    }

    public String b(String s) {
        return null;
    }

    public List<MobEffect> a() {
        return null;
    }

    public static void b() {
    }

    protected static void a(String s, PotionRegistry potionregistry) {
    }
}
