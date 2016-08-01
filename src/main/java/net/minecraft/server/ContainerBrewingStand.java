package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.inventory.CraftInventoryBrewer;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;

// CraftBukkit end
public class ContainerBrewingStand extends Container {

    private final IInventory brewingStand = null;

    private final Slot f = null;

    private int g = 0;

    private int h = 0;

    // CraftBukkit start
    private CraftInventoryView bukkitEntity = null;

    private PlayerInventory player = null;

    // CraftBukkit end
    public ContainerBrewingStand(PlayerInventory playerinventory, IInventory iinventory) {
    }

    public void addSlotListener(ICrafting icrafting) {
    }

    public void b() {
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    @Nullable
    public ItemStack b(EntityHuman entityhuman, int i) {
        return null;
    }

    static class a extends Slot {

        public a(IInventory iinventory, int i, int j, int k) {
        }

        public boolean isAllowed(@Nullable ItemStack itemstack) {
            return false;
        }

        public static boolean b_(@Nullable ItemStack itemstack) {
            return false;
        }

        public int getMaxStackSize() {
            return 0;
        }
    }

    static class SlotBrewing extends Slot {

        public SlotBrewing(IInventory iinventory, int i, int j, int k) {
        }

        public boolean isAllowed(@Nullable ItemStack itemstack) {
            return false;
        }

        public int getMaxStackSize() {
            return 0;
        }
    }

    static class SlotPotionBottle extends Slot {

        private final EntityHuman a = null;

        public SlotPotionBottle(EntityHuman entityhuman, IInventory iinventory, int i, int j, int k) {
        }

        public boolean isAllowed(@Nullable ItemStack itemstack) {
            return false;
        }

        public int getMaxStackSize() {
            return 0;
        }

        public void a(EntityHuman entityhuman, ItemStack itemstack) {
        }

        public static boolean c_(@Nullable ItemStack itemstack) {
            return false;
        }
    }

    // CraftBukkit start
    @Override
    public CraftInventoryView getBukkitView() {
        return null;
    }
    // CraftBukkit end
}
