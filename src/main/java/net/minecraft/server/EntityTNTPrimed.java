package net.minecraft.server;

import org.bukkit.event.entity.ExplosionPrimeEvent;

// CraftBukkit
public class EntityTNTPrimed extends Entity {

    private static final DataWatcherObject<Integer> FUSE_TICKS;

    private EntityLiving source;

    private int c;

    public float yield;

    // CraftBukkit - add field
    public boolean isIncendiary;

    // CraftBukkit - add field
    public EntityTNTPrimed(World world) {
    }

    public EntityTNTPrimed(World world, double d0, double d1, double d2, EntityLiving entityliving) {
    }

    protected void i() {
    }

    protected boolean playStepSound() {
        return false;
    }

    public boolean isInteractable() {
        return false;
    }

    public void m() {
    }

    private void explode() {
    }

    protected void b(NBTTagCompound nbttagcompound) {
    }

    protected void a(NBTTagCompound nbttagcompound) {
    }

    public EntityLiving getSource() {
        return null;
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    public void setFuseTicks(int i) {
    }

    public void a(DataWatcherObject<?> datawatcherobject) {
    }

    public int k() {
        return 0;
    }

    public int getFuseTicks() {
        return 0;
    }
}
