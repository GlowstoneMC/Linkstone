package org.bukkit.craftbukkit.inventory;

import java.util.Iterator;
import org.bukkit.inventory.Recipe;
import net.minecraft.server.CraftingManager;
import net.minecraft.server.IRecipe;
import net.minecraft.server.RecipesFurnace;

public class RecipeIterator implements Iterator<Recipe> {

    private final Iterator<IRecipe> recipes;

    private final Iterator<net.minecraft.server.ItemStack> smeltingCustom;

    private final Iterator<net.minecraft.server.ItemStack> smeltingVanilla;

    private Iterator<?> removeFrom;

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
