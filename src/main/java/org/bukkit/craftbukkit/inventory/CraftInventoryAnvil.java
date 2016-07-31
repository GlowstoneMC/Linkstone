package org.bukkit.craftbukkit.inventory;

import net.minecraft.server.IInventory;
import org.bukkit.Location;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.ItemStack;

public class CraftInventoryAnvil extends CraftInventory implements AnvilInventory {

    private final Location location;

    private final IInventory resultInventory;

    public CraftInventoryAnvil(Location location, IInventory inventory, IInventory resultInventory) {
    }

    public IInventory getResultInventory() {
        return null;
    }

    public IInventory getIngredientsInventory() {
        return null;
    }

    @Override
    public ItemStack getItem(int slot) {
        return null;
    }

    @Override
    public void setItem(int index, ItemStack item) {
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public Location getLocation() {
        return null;
    }
}
