package net.minecraft.server;

import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class EntityProjectile extends Entity implements IProjectile {

    private int blockX = 0;

    private int blockY = 0;

    private int blockZ = 0;

    private Block inBlockId = null;

    protected boolean inGround = false;

    public int shake = 0;

    public EntityLiving shooter = null;

    public String shooterName = null;

    private int av = 0;

    private int aw = 0;

    public Entity c = null;

    private int ax = 0;

    public EntityProjectile(World world) {
    }

    public EntityProjectile(World world, double d0, double d1, double d2) {
    }

    public EntityProjectile(World world, EntityLiving entityliving) {
    }

    protected void i() {
    }

    public void a(Entity entity, float f, float f1, float f2, float f3, float f4) {
    }

    public void shoot(double d0, double d1, double d2, float f, float f1) {
    }

    public void m() {
    }

    protected float j() {
        return 0.0F;
    }

    protected abstract void a(MovingObjectPosition movingobjectposition);

    public static void a(DataConverterManager dataconvertermanager, String s) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    @Nullable
    public EntityLiving getShooter() {
        return null;
    }
}
