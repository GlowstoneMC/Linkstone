package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.event.entity.EntityRegainHealthEvent.RegainReason;

// CraftBukkit end
public class MobEffectList {

    public static final RegistryMaterials<MinecraftKey, MobEffectList> REGISTRY;

    private final Map<IAttribute, AttributeModifier> a;

    private final boolean c;

    private final int d;

    private String e;

    private int f;

    public double durationModifier;

    private boolean h;

    @Nullable
    public static MobEffectList fromId(int i) {
        return null;
    }

    public static int getId(MobEffectList mobeffectlist) {
        return 0;
    }

    @Nullable
    public static MobEffectList getByName(String s) {
        return null;
    }

    protected MobEffectList(boolean flag, int i) {
    }

    protected MobEffectList b(int i, int j) {
        return null;
    }

    public void tick(EntityLiving entityliving, int i) {
    }

    public void applyInstantEffect(@Nullable Entity entity, @Nullable Entity entity1, EntityLiving entityliving, int i, double d0) {
    }

    public boolean a(int i, int j) {
        return false;
    }

    public boolean isInstant() {
        return false;
    }

    public MobEffectList c(String s) {
        return null;
    }

    public String a() {
        return null;
    }

    protected MobEffectList a(double d0) {
        return null;
    }

    public int getColor() {
        return 0;
    }

    public MobEffectList a(IAttribute iattribute, String s, double d0, int i) {
        return null;
    }

    public void a(EntityLiving entityliving, AttributeMapBase attributemapbase, int i) {
    }

    public void b(EntityLiving entityliving, AttributeMapBase attributemapbase, int i) {
    }

    public double a(int i, AttributeModifier attributemodifier) {
        return 0.0;
    }

    public MobEffectList j() {
        return null;
    }

    public static void k() {
    }
}
