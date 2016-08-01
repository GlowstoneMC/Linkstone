package net.minecraft.server;

public class FoodMetaData {

    public int foodLevel = 0;

    public float saturationLevel = 0.0F;

    public float exhaustionLevel = 0.0F;

    private int foodTickTimer = 0;

    private EntityHuman entityhuman = null;

    // CraftBukkit
    private int e = 0;

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
