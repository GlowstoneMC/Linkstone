package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.inventory.CraftInventory;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;

// CraftBukkit end
public class ContainerChest extends Container {

    private final IInventory container = null;

    private final int f = 0;

    // CraftBukkit start
    private CraftInventoryView bukkitEntity = null;

    private PlayerInventory player = null;

    @Override
    public CraftInventoryView getBukkitView() {
        return null;
    }

    // CraftBukkit end
    public ContainerChest(IInventory iinventory, IInventory iinventory1, EntityHuman entityhuman) {
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

    public IInventory e() {
        return null;
    }
}
