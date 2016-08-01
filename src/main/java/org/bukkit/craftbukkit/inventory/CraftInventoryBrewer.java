package org.bukkit.craftbukkit.inventory;

import org.bukkit.block.BrewingStand;
import org.bukkit.inventory.BrewerInventory;
import org.bukkit.inventory.ItemStack;
import net.minecraft.server.IInventory;

public class CraftInventoryBrewer extends CraftInventory implements BrewerInventory {

    public CraftInventoryBrewer(IInventory inventory) {
    }

    public ItemStack getIngredient() {
        return null;
    }

    public void setIngredient(ItemStack ingredient) {
    }

    @Override
    public BrewingStand getHolder() {
        return null;
    }

    @Override
    public ItemStack getFuel() {
        return null;
    }

    @Override
    public void setFuel(ItemStack fuel) {
    }
}
