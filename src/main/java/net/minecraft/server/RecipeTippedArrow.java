package net.minecraft.server;

import java.util.Collection;
import javax.annotation.Nullable;

class RecipeTippedArrow extends ShapedRecipes implements IRecipe {

    // CraftBukkit
    private static final ItemStack[] a = null;

    // CraftBukkit start
    RecipeTippedArrow() {
    }

    // CraftBukkit end
    public boolean a(InventoryCrafting inventorycrafting, World world) {
        return false;
    }

    @Nullable
    public ItemStack craftItem(InventoryCrafting inventorycrafting) {
        return null;
    }

    public int a() {
        return 0;
    }

    @Nullable
    public ItemStack b() {
        return null;
    }

    public ItemStack[] b(InventoryCrafting inventorycrafting) {
        return null;
    }
}
