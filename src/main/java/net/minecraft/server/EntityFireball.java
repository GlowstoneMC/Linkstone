package net.minecraft.server;

import org.bukkit.craftbukkit.event.CraftEventFactory;

// CraftBukkit
public abstract class EntityFireball extends Entity {

    private int e;

    private int f;

    private int g;

    private Block h;

    private boolean au;

    public EntityLiving shooter;

    private int av;

    private int aw;

    public double dirX;

    public double dirY;

    public double dirZ;

    public float bukkitYield;

    // CraftBukkit
    public boolean isIncendiary;

    // CraftBukkit
    public EntityFireball(World world) {
    }

    protected void i() {
    }

    public EntityFireball(World world, double d0, double d1, double d2, double d3, double d4, double d5) {
    }

    public EntityFireball(World world, EntityLiving entityliving, double d0, double d1, double d2) {
    }

    public void setDirection(double d0, double d1, double d2) {
    }

    public void m() {
    }

    protected boolean k() {
        return false;
    }

    protected EnumParticle j() {
        return null;
    }

    protected float l() {
        return 0.0F;
    }

    protected abstract void a(MovingObjectPosition movingobjectposition);

    public static void a(DataConverterManager dataconvertermanager, String s) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public boolean isInteractable() {
        return false;
    }

    public float aA() {
        return 0.0F;
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public float e(float f) {
        return 0.0F;
    }
}
