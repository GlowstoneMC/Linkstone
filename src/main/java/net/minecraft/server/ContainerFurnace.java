package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.inventory.CraftInventoryFurnace;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;

// CraftBukkit end
public class ContainerFurnace extends Container {

    private final IInventory furnace;

    private int f;

    private int g;

    private int h;

    private int i;

    // CraftBukkit start
    private CraftInventoryView bukkitEntity;

    private PlayerInventory player;

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
