package org.bukkit.craftbukkit.inventory;

import java.util.Map;
import net.minecraft.server.CraftingManager;
import net.minecraft.server.ShapedRecipes;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class CraftShapedRecipe extends ShapedRecipe implements CraftRecipe {

    // TODO: Could eventually use this to add a matches() method or some such
    private ShapedRecipes recipe;

    public CraftShapedRecipe(ItemStack result) {
    }

    public CraftShapedRecipe(ItemStack result, ShapedRecipes recipe) {
    }

    public static CraftShapedRecipe fromBukkitRecipe(ShapedRecipe recipe) {
        return null;
    }

    public void addToCraftingManager() {
    }
}
