package net.minecraft.server;

import javax.annotation.Nullable;

public class RecipeBookClone extends ShapelessRecipes implements IRecipe {

    // CraftBukkit - added extends
    public RecipeBookClone() {
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
