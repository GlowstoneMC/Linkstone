package net.minecraft.server;

import javax.annotation.Nullable;
import org.bukkit.craftbukkit.inventory.CraftMerchantRecipe;

// CraftBukkit
public class MerchantRecipe {

    public ItemStack buyingItem1;

    public ItemStack buyingItem2;

    public ItemStack sellingItem;

    public int uses;

    public int maxUses;

    public boolean rewardExp;

    // CraftBukkit start
    private CraftMerchantRecipe bukkitHandle;

    public CraftMerchantRecipe asBukkit() {
        return null;
    }

    public MerchantRecipe(ItemStack itemstack, ItemStack itemstack1, ItemStack itemstack2, int i, int j, CraftMerchantRecipe bukkit) {
    }

    // CraftBukkit end
    public MerchantRecipe(NBTTagCompound nbttagcompound) {
    }

    public MerchantRecipe(ItemStack itemstack, @Nullable ItemStack itemstack1, ItemStack itemstack2) {
    }

    public MerchantRecipe(ItemStack itemstack, @Nullable ItemStack itemstack1, ItemStack itemstack2, int i, int j) {
    }

    public MerchantRecipe(ItemStack itemstack, ItemStack itemstack1) {
    }

    public MerchantRecipe(ItemStack itemstack, Item item) {
    }

    public ItemStack getBuyItem1() {
        return null;
    }

    public ItemStack getBuyItem2() {
        return null;
    }

    public boolean hasSecondItem() {
        return false;
    }

    public ItemStack getBuyItem3() {
        return null;
    }

    public int e() {
        return 0;
    }

    public int f() {
        return 0;
    }

    public void g() {
    }

    public void a(int i) {
    }

    public boolean h() {
        return false;
    }

    public boolean j() {
        return false;
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public NBTTagCompound k() {
        return null;
    }
}
