package net.minecraft.server;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
// CraftBukkit start
import org.bukkit.entity.Hanging;
import org.bukkit.event.hanging.HangingBreakEvent;

// CraftBukkit end
public abstract class EntityHanging extends Entity {

    private static final Predicate<Entity> c = null;

    private int d = 0;

    public BlockPosition blockPosition = null;

    @Nullable
    public EnumDirection direction = null;

    public EntityHanging(World world) {
    }

    public EntityHanging(World world, BlockPosition blockposition) {
    }

    protected void i() {
    }

    public void setDirection(EnumDirection enumdirection) {
    }

    // CraftBukkit start - break out BB calc into own method
    public static AxisAlignedBB calculateBoundingBox(Entity entity, BlockPosition blockPosition, EnumDirection direction, int width, int height) {
        return null;
    }

    protected void updateBoundingBox() {
    }

    private static double a(int i) {
        return 0.0;
    }

    public void m() {
    }

    public boolean survives() {
        return false;
    }

    public boolean isInteractable() {
        return false;
    }

    public boolean t(Entity entity) {
        return false;
    }

    public EnumDirection getDirection() {
        return null;
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public void move(double d0, double d1, double d2) {
    }

    public void g(double d0, double d1, double d2) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public abstract int getWidth();

    public abstract int getHeight();

    public abstract void a(@Nullable Entity entity);

    public abstract void o();

    public EntityItem a(ItemStack itemstack, float f) {
        return null;
    }

    protected boolean as() {
        return false;
    }

    public void setPosition(double d0, double d1, double d2) {
    }

    public BlockPosition getBlockPosition() {
        return null;
    }

    public float a(EnumBlockRotation enumblockrotation) {
        return 0.0F;
    }

    public float a(EnumBlockMirror enumblockmirror) {
        return 0.0F;
    }

    public void onLightningStrike(EntityLightning entitylightning) {
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static {
        }
    }
}
