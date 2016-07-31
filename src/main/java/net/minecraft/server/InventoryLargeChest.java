package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import java.util.List;
import org.bukkit.Location;
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.entity.HumanEntity;

// CraftBukkit end
public class InventoryLargeChest implements ITileInventory {

    private final String a;

    public final ITileInventory left;

    public final ITileInventory right;

    // CraftBukkit start - add fields and methods
    public List<HumanEntity> transaction;

    public ItemStack[] getContents() {
        return null;
    }

    public void onOpen(CraftHumanEntity who) {
    }

    public void onClose(CraftHumanEntity who) {
    }

    public List<HumanEntity> getViewers() {
        return null;
    }

    public org.bukkit.inventory.InventoryHolder getOwner() {
        return null;
    }

    public void setMaxStackSize(int size) {
    }

    @Override
    public Location getLocation() {
        return null;
    }

    // CraftBukkit end
    public InventoryLargeChest(String s, ITileInventory itileinventory, ITileInventory itileinventory1) {
    }

    public int getSize() {
        return 0;
    }

    public boolean a(IInventory iinventory) {
        return false;
    }

    public String getName() {
        return null;
    }

    public boolean hasCustomName() {
        return false;
    }

    public IChatBaseComponent getScoreboardDisplayName() {
        return null;
    }

    @Nullable
    public ItemStack getItem(int i) {
        return null;
    }

    @Nullable
    public ItemStack splitStack(int i, int j) {
        return null;
    }

    @Nullable
    public ItemStack splitWithoutUpdate(int i) {
        return null;
    }

    public void setItem(int i, @Nullable ItemStack itemstack) {
    }

    public int getMaxStackSize() {
        return 0;
    }

    public void update() {
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    public void startOpen(EntityHuman entityhuman) {
    }

    public void closeContainer(EntityHuman entityhuman) {
    }

    public boolean b(int i, ItemStack itemstack) {
        return false;
    }

    public int getProperty(int i) {
        return 0;
    }

    public void setProperty(int i, int j) {
    }

    public int g() {
        return 0;
    }

    public boolean x_() {
        return false;
    }

    public void a(ChestLock chestlock) {
    }

    public ChestLock y_() {
        return null;
    }

    public String getContainerName() {
        return null;
    }

    public Container createContainer(PlayerInventory playerinventory, EntityHuman entityhuman) {
        return null;
    }

    public void l() {
    }
}
