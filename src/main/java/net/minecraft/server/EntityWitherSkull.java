package net.minecraft.server;

import org.bukkit.event.entity.ExplosionPrimeEvent;

// CraftBukkit
public class EntityWitherSkull extends EntityFireball {

    private static final DataWatcherObject<Boolean> e = null;

    public EntityWitherSkull(World world) {
    }

    public EntityWitherSkull(World world, EntityLiving entityliving, double d0, double d1, double d2) {
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    protected float l() {
        return 0.0F;
    }

    public boolean isBurning() {
        return false;
    }

    public float a(Explosion explosion, World world, BlockPosition blockposition, IBlockData iblockdata) {
        return 0.0F;
    }

    protected void a(MovingObjectPosition movingobjectposition) {
    }

    public boolean isInteractable() {
        return false;
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    protected void i() {
    }

    public boolean isCharged() {
        return false;
    }

    public void setCharged(boolean flag) {
    }

    protected boolean k() {
        return false;
    }
}
