package org.bukkit.craftbukkit.inventory;

import net.minecraft.server.RecipesFurnace;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;

public class CraftFurnaceRecipe extends FurnaceRecipe implements CraftRecipe {

    public CraftFurnaceRecipe(ItemStack result, ItemStack source) {
    }

    public static CraftFurnaceRecipe fromBukkitRecipe(FurnaceRecipe recipe) {
        return null;
    }

    @Override
    public void addToCraftingManager() {
    }
}
