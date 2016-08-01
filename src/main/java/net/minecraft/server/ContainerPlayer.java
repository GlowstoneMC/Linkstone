package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.inventory.CraftInventoryCrafting;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;

// CraftBukkit end
public class ContainerPlayer extends Container {

    private static final EnumItemSlot[] h = null;

    public InventoryCrafting craftInventory = null;

    public IInventory resultInventory = null;

    public boolean g = false;

    private final EntityHuman owner = null;

    // CraftBukkit start
    private CraftInventoryView bukkitEntity = null;

    private PlayerInventory player = null;

    // CraftBukkit end
    public ContainerPlayer(final PlayerInventory playerinventory, boolean flag, EntityHuman entityhuman) {
    }

    public void a(IInventory iinventory) {
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

    public boolean a(ItemStack itemstack, Slot slot) {
        return false;
    }

    // CraftBukkit start
    @Override
    public CraftInventoryView getBukkitView() {
        return null;
    }
    // CraftBukkit end
}
