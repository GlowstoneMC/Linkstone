package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.inventory.CraftInventory;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;

// CraftBukkit end
public class ContainerHopper extends Container {

    private final IInventory hopper = null;

    // CraftBukkit start
    private CraftInventoryView bukkitEntity = null;

    private PlayerInventory player = null;

    @Override
    public CraftInventoryView getBukkitView() {
        return null;
    }

    // CraftBukkit end
    public ContainerHopper(PlayerInventory playerinventory, IInventory iinventory, EntityHuman entityhuman) {
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    @Nullable
    public ItemStack b(EntityHuman entityhuman, int i) {
        return null;
    }

    public void b(EntityHuman entityhuman) {
    }
}
