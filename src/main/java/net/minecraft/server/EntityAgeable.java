package net.minecraft.server;

import javax.annotation.Nullable;

public abstract class EntityAgeable extends EntityCreature {

    private static final DataWatcherObject<Boolean> bx = null;

    protected int a = 0;

    protected int b = 0;

    protected int c = 0;

    private float by = 0.0F;

    private float bz = 0.0F;

    public boolean ageLocked = false;

    // CraftBukkit
    public EntityAgeable(World world) {
    }

    public abstract EntityAgeable createChild(EntityAgeable entityageable);

    public boolean a(EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack) {
        return false;
    }

    protected void i() {
    }

    public int getAge() {
        return 0;
    }

    public void setAge(int i, boolean flag) {
    }

    public void setAge(int i) {
    }

    public void setAgeRaw(int i) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void a(DataWatcherObject<?> datawatcherobject) {
    }

    public void n() {
    }

    protected void o() {
    }

    public boolean isBaby() {
        return false;
    }

    public void a(boolean flag) {
    }

    public final void setSize(float f, float f1) {
    }

    protected final void a(float f) {
    }
}
