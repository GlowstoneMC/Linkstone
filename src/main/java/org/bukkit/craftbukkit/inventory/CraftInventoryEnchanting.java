package org.bukkit.craftbukkit.inventory;

import org.bukkit.inventory.EnchantingInventory;
import org.bukkit.inventory.ItemStack;
import net.minecraft.server.InventorySubcontainer;

public class CraftInventoryEnchanting extends CraftInventory implements EnchantingInventory {

    public CraftInventoryEnchanting(InventorySubcontainer inventory) {
    }

    @Override
    public void setItem(ItemStack item) {
    }

    @Override
    public ItemStack getItem() {
        return null;
    }

    @Override
    public InventorySubcontainer getInventory() {
        return null;
    }

    @Override
    public void setSecondary(ItemStack item) {
    }

    @Override
    public ItemStack getSecondary() {
        return null;
    }
}
