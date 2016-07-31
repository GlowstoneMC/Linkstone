package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
// CraftBukkit start
import java.util.List;
import org.bukkit.Location;
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.entity.HumanEntity;

// CraftBukkit end
public class InventorySubcontainer implements IInventory {

    private String a;

    private final int b;

    public final ItemStack[] items;

    private List<IInventoryListener> d;

    private boolean e;

    // CraftBukkit start - add fields and methods
    public List<HumanEntity> transaction;

    private int maxStack;

    protected org.bukkit.inventory.InventoryHolder bukkitOwner;

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

    public void setMaxStackSize(int i) {
    }

    public org.bukkit.inventory.InventoryHolder getOwner() {
        return null;
    }

    @Override
    public Location getLocation() {
        return null;
    }

    public InventorySubcontainer(String s, boolean flag, int i) {
    }

    public InventorySubcontainer(String s, boolean flag, int i, org.bukkit.inventory.InventoryHolder owner) {
    }

    public void a(IInventoryListener iinventorylistener) {
    }

    public void b(IInventoryListener iinventorylistener) {
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
    public ItemStack a(ItemStack itemstack) {
        return null;
    }

    @Nullable
    public ItemStack splitWithoutUpdate(int i) {
        return null;
    }

    public void setItem(int i, @Nullable ItemStack itemstack) {
    }

    public int getSize() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public boolean hasCustomName() {
        return false;
    }

    public void a(String s) {
    }

    public IChatBaseComponent getScoreboardDisplayName() {
        return null;
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

    public void l() {
    }
}
