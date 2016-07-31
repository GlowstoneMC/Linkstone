package net.minecraft.server;

public class FoodMetaData {

    public int foodLevel;

    public float saturationLevel;

    public float exhaustionLevel;

    private int foodTickTimer;

    private EntityHuman entityhuman;

    // CraftBukkit
    private int e;

    public FoodMetaData() {
    }

    // CraftBukkit start - added EntityHuman constructor
    public FoodMetaData(EntityHuman entityhuman) {
    }

    // CraftBukkit end
    public void eat(int i, float f) {
    }

    public void a(ItemFood itemfood, ItemStack itemstack) {
    }

    public void a(EntityHuman entityhuman) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public int getFoodLevel() {
        return 0;
    }

    public boolean c() {
        return false;
    }

    public void a(float f) {
    }

    public float getSaturationLevel() {
        return 0.0F;
    }

    public void a(int i) {
    }
}
