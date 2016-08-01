package org.bukkit.craftbukkit.inventory;

import org.bukkit.block.Furnace;
import org.bukkit.inventory.FurnaceInventory;
import org.bukkit.inventory.ItemStack;
import net.minecraft.server.TileEntityFurnace;

public class CraftInventoryFurnace extends CraftInventory implements FurnaceInventory {

    public CraftInventoryFurnace(TileEntityFurnace inventory) {
    }

    public ItemStack getResult() {
        return null;
    }

    public ItemStack getFuel() {
        return null;
    }

    public ItemStack getSmelting() {
        return null;
    }

    public void setFuel(ItemStack stack) {
    }

    public void setResult(ItemStack stack) {
    }

    public void setSmelting(ItemStack stack) {
    }

    @Override
    public Furnace getHolder() {
        return null;
    }
}
