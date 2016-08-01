package net.minecraft.server;

import javax.annotation.Nullable;

public class DamageSource {

    public static DamageSource FIRE;

    public static DamageSource LIGHTNING;

    public static DamageSource BURN;

    public static DamageSource LAVA;

    public static DamageSource HOT_FLOOR;

    public static DamageSource STUCK;

    public static DamageSource DROWN;

    public static DamageSource STARVE;

    public static DamageSource CACTUS;

    public static DamageSource FALL;

    public static DamageSource FLY_INTO_WALL;

    public static DamageSource OUT_OF_WORLD;

    public static DamageSource GENERIC;

    public static DamageSource MAGIC;

    public static DamageSource WITHER;

    public static DamageSource ANVIL;

    public static DamageSource FALLING_BLOCK;

    public static DamageSource DRAGON_BREATH;

    private boolean t;

    private boolean u;

    private boolean v;

    private float w;

    private boolean x;

    private boolean y;

    private boolean z;

    private boolean A;

    private boolean B;

    public String translationIndex;

    public static DamageSource mobAttack(EntityLiving entityliving) {
        return null;
    }

    public static DamageSource a(Entity entity, EntityLiving entityliving) {
        return null;
    }

    public static DamageSource playerAttack(EntityHuman entityhuman) {
        return null;
    }

    public static DamageSource arrow(EntityArrow entityarrow, @Nullable Entity entity) {
        return null;
    }

    public static DamageSource fireball(EntityFireball entityfireball, @Nullable Entity entity) {
        return null;
    }

    public static DamageSource projectile(Entity entity, @Nullable Entity entity1) {
        return null;
    }

    public static DamageSource b(Entity entity, @Nullable Entity entity1) {
        return null;
    }

    public static DamageSource a(Entity entity) {
        return null;
    }

    public static DamageSource explosion(@Nullable Explosion explosion) {
        return null;
    }

    public static DamageSource b(@Nullable EntityLiving entityliving) {
        return null;
    }

    public boolean a() {
        return false;
    }

    public DamageSource b() {
        return null;
    }

    public boolean isExplosion() {
        return false;
    }

    public DamageSource d() {
        return null;
    }

    public boolean ignoresArmor() {
        return false;
    }

    public float getExhaustionCost() {
        return 0.0F;
    }

    public boolean ignoresInvulnerability() {
        return false;
    }

    public boolean isStarvation() {
        return false;
    }

    protected DamageSource(String s) {
    }

    @Nullable
    public Entity i() {
        return null;
    }

    @Nullable
    public Entity getEntity() {
        return null;
    }

    protected DamageSource setIgnoreArmor() {
        return null;
    }

    protected DamageSource l() {
        return null;
    }

    protected DamageSource m() {
        return null;
    }

    protected DamageSource setExplosion() {
        return null;
    }

    public IChatBaseComponent getLocalizedDeathMessage(EntityLiving entityliving) {
        return null;
    }

    public boolean o() {
        return false;
    }

    public String p() {
        return null;
    }

    public DamageSource q() {
        return null;
    }

    public boolean r() {
        return false;
    }

    public boolean isMagic() {
        return false;
    }

    public DamageSource setMagic() {
        return null;
    }

    public boolean u() {
        return false;
    }

    @Nullable
    public Vec3D v() {
        return null;
    }
}
