package net.minecraft.server;

import javax.annotation.Nullable;

public class SlotResult extends Slot {

    private final InventoryCrafting a = null;

    private final EntityHuman b = null;

    private int c = 0;

    public SlotResult(EntityHuman entityhuman, InventoryCrafting inventorycrafting, IInventory iinventory, int i, int j, int k) {
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
}
