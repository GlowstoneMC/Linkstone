package net.minecraft.server;

import javax.annotation.Nullable;

public class Slot {

    public final int index = 0;

    public final IInventory inventory = null;

    public int rawSlotIndex = 0;

    public int f = 0;

    public int g = 0;

    public Slot(IInventory iinventory, int i, int j, int k) {
    }

    public void a(ItemStack itemstack, ItemStack itemstack1) {
    }

    protected void a(ItemStack itemstack, int i) {
    }

    protected void c(ItemStack itemstack) {
    }

    public void a(EntityHuman entityhuman, ItemStack itemstack) {
    }

    public boolean isAllowed(@Nullable ItemStack itemstack) {
        return false;
    }

    @Nullable
    public ItemStack getItem() {
        return null;
    }

    public boolean hasItem() {
        return false;
    }

    public void set(@Nullable ItemStack itemstack) {
    }

    public void f() {
    }

    public int getMaxStackSize() {
        return 0;
    }

    public int getMaxStackSize(ItemStack itemstack) {
        return 0;
    }

    public ItemStack a(int i) {
        return null;
    }

    public boolean a(IInventory iinventory, int i) {
        return false;
    }

    public boolean isAllowed(EntityHuman entityhuman) {
        return false;
    }
}
