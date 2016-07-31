package net.minecraft.server;

import javax.annotation.Nullable;
import org.bukkit.craftbukkit.entity.CraftHumanEntity;

// CraftBukkit
public interface IInventory extends INamableTileEntity {

    int getSize() {
        return 0;
    }

    @Nullable
    ItemStack getItem(int i) {
        return null;
    }

    @Nullable
    ItemStack splitStack(int i, int j) {
        return null;
    }

    @Nullable
    ItemStack splitWithoutUpdate(int i) {
        return null;
    }

    void setItem(int i, @Nullable ItemStack itemstack) {
    }

    int getMaxStackSize() {
        return 0;
    }

    void update() {
    }

    boolean a(EntityHuman entityhuman) {
        return false;
    }

    void startOpen(EntityHuman entityhuman) {
    }

    void closeContainer(EntityHuman entityhuman) {
    }

    boolean b(int i, ItemStack itemstack) {
        return false;
    }

    int getProperty(int i) {
        return 0;
    }

    void setProperty(int i, int j) {
    }

    int g() {
        return 0;
    }

    void l() {
    }

    // CraftBukkit start
    ItemStack[] getContents() {
        return null;
    }

    void onOpen(CraftHumanEntity who) {
    }

    void onClose(CraftHumanEntity who) {
    }

    java.util.List<org.bukkit.entity.HumanEntity> getViewers() {
        return null;
    }

    org.bukkit.inventory.InventoryHolder getOwner() {
        return null;
    }

    void setMaxStackSize(int size) {
    }

    org.bukkit.Location getLocation() {
        return null;
    }

    int MAX_STACK;
    // CraftBukkit end
}
