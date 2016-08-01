package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.inventory.CraftInventoryFurnace;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;

// CraftBukkit end
public class ContainerFurnace extends Container {

    private final IInventory furnace = null;

    private int f = 0;

    private int g = 0;

    private int h = 0;

    private int i = 0;

    // CraftBukkit start
    private CraftInventoryView bukkitEntity = null;

    private PlayerInventory player = null;

    @Override
    public CraftInventoryView getBukkitView() {
        return null;
    }

    // CraftBukkit end
    public ContainerFurnace(PlayerInventory playerinventory, IInventory iinventory) {
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
}
