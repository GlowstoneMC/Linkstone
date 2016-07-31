package net.minecraft.server;

import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class EntityProjectile extends Entity implements IProjectile {

    private int blockX;

    private int blockY;

    private int blockZ;

    private Block inBlockId;

    protected boolean inGround;

    public int shake;

    public EntityLiving shooter;

    public String shooterName;

    private int av;

    private int aw;

    public Entity c;

    private int ax;

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
