package net.minecraft.server;

import javax.annotation.Nullable;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;

// CraftBukkit
public class ContainerBeacon extends Container {

    private final IInventory beacon;

    private final ContainerBeacon.SlotBeacon f;

    // CraftBukkit start
    private CraftInventoryView bukkitEntity;

    private PlayerInventory player;

    // CraftBukkit end
    public ContainerBeacon(IInventory iinventory, IInventory iinventory1) {
    }

    public void addSlotListener(ICrafting icrafting) {
    }

    public IInventory e() {
        return null;
    }

    public void b(EntityHuman entityhuman) {
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    @Nullable
    public ItemStack b(EntityHuman entityhuman, int i) {
        return null;
    }

    class SlotBeacon extends Slot {

        public SlotBeacon(IInventory iinventory, int i, int j, int k) {
        }

        public boolean isAllowed(@Nullable ItemStack itemstack) {
            return false;
        }

        public int getMaxStackSize() {
            return 0;
        }
    }

    // CraftBukkit start
    @Override
    public CraftInventoryView getBukkitView() {
        return null;
    }
    // CraftBukkit end
}
