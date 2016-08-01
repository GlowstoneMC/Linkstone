package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import java.util.List;
import org.bukkit.Location;
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryType;

// CraftBukkit end
public class InventoryCrafting implements IInventory {

    private final ItemStack[] items = null;

    private final int b = 0;

    private final int c = 0;

    private final Container d = null;

    // CraftBukkit start - add fields
    public List<HumanEntity> transaction = null;

    public IRecipe currentRecipe = null;

    public IInventory resultInventory = null;

    private EntityHuman owner = null;

    private int maxStack = 0;

    public ItemStack[] getContents() {
        return null;
    }

    public void onOpen(CraftHumanEntity who) {
    }

    public InventoryType getInvType() {
        return null;
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

    public InventoryCrafting(Container container, int i, int j, EntityHuman player) {
    }

    // CraftBukkit end
    public InventoryCrafting(Container container, int i, int j) {
    }

    public int getSize() {
        return 0;
    }

    @Nullable
    public ItemStack getItem(int i) {
        return null;
    }

    @Nullable
    public ItemStack c(int i, int j) {
        return null;
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
    public ItemStack splitWithoutUpdate(int i) {
        return null;
    }

    @Nullable
    public ItemStack splitStack(int i, int j) {
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

    public void l() {
    }

    public int h() {
        return 0;
    }

    public int i() {
        return 0;
    }
}
