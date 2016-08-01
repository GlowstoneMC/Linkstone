package org.bukkit.craftbukkit.inventory;

import java.util.List;
import net.minecraft.server.CraftingManager;
import net.minecraft.server.ShapelessRecipes;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

public class CraftShapelessRecipe extends ShapelessRecipe implements CraftRecipe {

    // TODO: Could eventually use this to add a matches() method or some such
    private ShapelessRecipes recipe = null;

    public CraftShapelessRecipe(ItemStack result) {
    }

    public CraftShapelessRecipe(ItemStack result, ShapelessRecipes recipe) {
    }

    public static CraftShapelessRecipe fromBukkitRecipe(ShapelessRecipe recipe) {
        return null;
    }

    public void addToCraftingManager() {
    }
}
