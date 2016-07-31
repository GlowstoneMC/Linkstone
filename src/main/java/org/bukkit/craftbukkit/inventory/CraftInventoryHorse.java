package org.bukkit.craftbukkit.inventory;

import net.minecraft.server.IInventory;
import org.bukkit.inventory.HorseInventory;
import org.bukkit.inventory.ItemStack;

public class CraftInventoryHorse extends CraftInventory implements HorseInventory {

    public CraftInventoryHorse(IInventory inventory) {
    }

    public ItemStack getSaddle() {
        return null;
    }

    public ItemStack getArmor() {
        return null;
    }

    public void setSaddle(ItemStack stack) {
    }

    public void setArmor(ItemStack stack) {
    }
}
