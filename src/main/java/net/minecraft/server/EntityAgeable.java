package net.minecraft.server;

import javax.annotation.Nullable;

public abstract class EntityAgeable extends EntityCreature {

    private static final DataWatcherObject<Boolean> bx;

    protected int a;

    protected int b;

    protected int c;

    private float by;

    private float bz;

    public boolean ageLocked;

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
