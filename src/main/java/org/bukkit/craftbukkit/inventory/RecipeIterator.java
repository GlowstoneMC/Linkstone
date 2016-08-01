package org.bukkit.craftbukkit.inventory;

import java.util.Iterator;
import org.bukkit.inventory.Recipe;
import net.minecraft.server.CraftingManager;
import net.minecraft.server.IRecipe;
import net.minecraft.server.RecipesFurnace;

public class RecipeIterator implements Iterator<Recipe> {

    private final Iterator<IRecipe> recipes = null;

    private final Iterator<net.minecraft.server.ItemStack> smeltingCustom = null;

    private final Iterator<net.minecraft.server.ItemStack> smeltingVanilla = null;

    private Iterator<?> removeFrom = null;

    public RecipeIterator() {
    }

    public boolean hasNext() {
        return false;
    }

    public Recipe next() {
        return null;
    }

    public void remove() {
    }
}
