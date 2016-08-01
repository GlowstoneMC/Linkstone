package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.bukkit.craftbukkit.entity.CraftLivingEntity;
// CraftBukkit
import org.bukkit.entity.LivingEntity;
// CraftBukkit
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class EntityAreaEffectCloud extends Entity {

    private static final DataWatcherObject<Float> a = null;

    private static final DataWatcherObject<Integer> b = null;

    private static final DataWatcherObject<Boolean> c = null;

    private static final DataWatcherObject<Integer> d = null;

    private static final DataWatcherObject<Integer> e = null;

    private static final DataWatcherObject<Integer> f = null;

    private PotionRegistry potionRegistry = null;

    public List<MobEffect> effects = null;

    private final Map<Entity, Integer> au = null;

    private int av = 0;

    public int waitTime = 0;

    public int reapplicationDelay = 0;

    private boolean hasColor = false;

    public int durationOnUse = 0;

    public float radiusOnUse = 0.0F;

    public float radiusPerTick = 0.0F;

    private EntityLiving aC = null;

    private UUID aD = null;

    public EntityAreaEffectCloud(World world) {
    }

    public EntityAreaEffectCloud(World world, double d0, double d1, double d2) {
    }

    protected void i() {
    }

    public void setRadius(float f) {
    }

    public float getRadius() {
        return 0.0F;
    }

    public void a(PotionRegistry potionregistry) {
    }

    public void a(MobEffect mobeffect) {
    }

    // CraftBukkit start accessor methods
    public void refreshEffects() {
    }

    public String getType() {
        return null;
    }

    public void setType(String string) {
    }

    // CraftBukkit end
    public int getColor() {
        return 0;
    }

    public void setColor(int i) {
    }

    public EnumParticle getParticle() {
        return null;
    }

    public void setParticle(EnumParticle enumparticle) {
    }

    public int n() {
        return 0;
    }

    public void b(int i) {
    }

    public int o() {
        return 0;
    }

    public void d(int i) {
    }

    protected void a(boolean flag) {
    }

    public boolean q() {
        return false;
    }

    public int getDuration() {
        return 0;
    }

    public void setDuration(int i) {
    }

    public void m() {
    }

    public void setRadiusOnUse(float f) {
    }

    public void setRadiusPerTick(float f) {
    }

    public void setWaitTime(int i) {
    }

    public void setSource(@Nullable EntityLiving entityliving) {
    }

    @Nullable
    public EntityLiving y() {
        return null;
    }

    protected void a(NBTTagCompound nbttagcompound) {
    }

    protected void b(NBTTagCompound nbttagcompound) {
    }

    public void a(DataWatcherObject<?> datawatcherobject) {
    }

    public EnumPistonReaction o_() {
        return null;
    }
}
