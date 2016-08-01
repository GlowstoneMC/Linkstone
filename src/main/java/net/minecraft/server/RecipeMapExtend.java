package net.minecraft.server;

import javax.annotation.Nullable;

public class RecipeMapExtend extends ShapedRecipes {

    public RecipeMapExtend() {
    }

    public boolean a(InventoryCrafting inventorycrafting, World world) {
        return false;
    }

    @Nullable
    public ItemStack craftItem(InventoryCrafting inventorycrafting) {
        return null;
    }
}
