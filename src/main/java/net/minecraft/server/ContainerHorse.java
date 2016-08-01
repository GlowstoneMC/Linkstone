package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.inventory.CraftInventory;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;
import org.bukkit.inventory.InventoryView;

// CraftBukkit end
public class ContainerHorse extends Container {

    private final IInventory a;

    private final EntityHorse f;

    // CraftBukkit start
    org.bukkit.craftbukkit.inventory.CraftInventoryView bukkitEntity;

    PlayerInventory player;

    @Override
    public InventoryView getBukkitView() {
        return null;
    }

    public ContainerHorse(IInventory iinventory, final IInventory iinventory1, final EntityHorse entityhorse, EntityHuman entityhuman) {
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
