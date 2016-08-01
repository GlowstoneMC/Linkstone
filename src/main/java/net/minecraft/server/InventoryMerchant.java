package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import java.util.List;
import org.bukkit.Location;
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.craftbukkit.entity.CraftVillager;
import org.bukkit.entity.HumanEntity;

// CraftBukkit end
public class InventoryMerchant implements IInventory {

    private final IMerchant merchant = null;

    private final ItemStack[] itemsInSlots = null;

    private final EntityHuman player = null;

    private MerchantRecipe recipe = null;

    public int selectedIndex = 0;

    // CraftBukkit start - add fields and methods
    public List<HumanEntity> transaction = null;

    private int maxStack = 0;

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

    // CraftBukkit end
    public InventoryMerchant(EntityHuman entityhuman, IMerchant imerchant) {
    }

    public int getSize() {
        return 0;
    }

    @Nullable
    public ItemStack getItem(int i) {
        return null;
    }

    @Nullable
    public ItemStack splitStack(int i, int j) {
        return null;
    }

    private boolean e(int i) {
        return false;
    }

    @Nullable
    public ItemStack splitWithoutUpdate(int i) {
        return null;
    }

    public void setItem(int i, @Nullable ItemStack itemstack) {
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

    public int getMaxStackSize() {
        return 0;
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

    public void update() {
    }

    public void h() {
    }

    public MerchantRecipe getRecipe() {
        return null;
    }

    public void d(int i) {
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
