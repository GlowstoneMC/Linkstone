package net.minecraft.server;

import javax.annotation.Nullable;

public class ItemFood extends Item {

    public final int a = 0;

    private final int b = 0;

    private final float c = 0.0F;

    private final boolean d = false;

    private boolean e = false;

    private MobEffect f = null;

    private float n = 0.0F;

    public ItemFood(int i, float f, boolean flag) {
    }

    public ItemFood(int i, boolean flag) {
    }

    @Nullable
    public ItemStack a(ItemStack itemstack, World world, EntityLiving entityliving) {
        return null;
    }

    protected void a(ItemStack itemstack, World world, EntityHuman entityhuman) {
    }

    public int e(ItemStack itemstack) {
        return 0;
    }

    public EnumAnimation f(ItemStack itemstack) {
        return null;
    }

    public InteractionResultWrapper<ItemStack> a(ItemStack itemstack, World world, EntityHuman entityhuman, EnumHand enumhand) {
        return null;
    }

    public int getNutrition(ItemStack itemstack) {
        return 0;
    }

    public float getSaturationModifier(ItemStack itemstack) {
        return 0.0F;
    }

    public boolean g() {
        return false;
    }

    public ItemFood a(MobEffect mobeffect, float f) {
        return null;
    }

    public ItemFood h() {
        return null;
    }
}
