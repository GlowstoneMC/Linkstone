package net.minecraft.server;

import javax.annotation.Nullable;

public class SlotMerchantResult extends Slot {

    private final InventoryMerchant a = null;

    private final EntityHuman b = null;

    private int c = 0;

    private final IMerchant h = null;

    public SlotMerchantResult(EntityHuman entityhuman, IMerchant imerchant, InventoryMerchant inventorymerchant, int i, int j, int k) {
    }

    public boolean isAllowed(@Nullable ItemStack itemstack) {
        return false;
    }

    public ItemStack a(int i) {
        return null;
    }

    protected void a(ItemStack itemstack, int i) {
    }

    protected void c(ItemStack itemstack) {
    }

    public void a(EntityHuman entityhuman, ItemStack itemstack) {
    }

    private boolean a(MerchantRecipe merchantrecipe, ItemStack itemstack, ItemStack itemstack1) {
        return false;
    }
}
