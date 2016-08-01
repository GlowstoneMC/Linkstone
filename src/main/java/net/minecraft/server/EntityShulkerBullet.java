package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class EntityShulkerBullet extends Entity {

    private EntityLiving shooter = null;

    private Entity target = null;

    @Nullable
    private EnumDirection c = null;

    private int d = 0;

    private double e = 0.0;

    private double f = 0.0;

    private double g = 0.0;

    @Nullable
    private UUID h = null;

    private BlockPosition au = null;

    @Nullable
    private UUID av = null;

    private BlockPosition aw = null;

    public EntityShulkerBullet(World world) {
    }

    public SoundCategory bC() {
        return null;
    }

    public EntityShulkerBullet(World world, EntityLiving entityliving, Entity entity, EnumDirection.EnumAxis enumdirection_enumaxis) {
    }

    // CraftBukkit start
    public EntityLiving getShooter() {
        return null;
    }

    public void setShooter(EntityLiving e) {
    }

    public Entity getTarget() {
        return null;
    }

    public void setTarget(Entity e) {
    }

    // CraftBukkit end
    protected void b(NBTTagCompound nbttagcompound) {
    }

    protected void a(NBTTagCompound nbttagcompound) {
    }

    protected void i() {
    }

    private void a(@Nullable EnumDirection enumdirection) {
    }

    private void a(@Nullable EnumDirection.EnumAxis enumdirection_enumaxis) {
    }

    public void m() {
    }

    public boolean isBurning() {
        return false;
    }

    public float e(float f) {
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
}
