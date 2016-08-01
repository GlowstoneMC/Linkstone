package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public class RecipeRepair extends ShapelessRecipes implements IRecipe {

    // CraftBukkit start - Delegate to new parent class
    public RecipeRepair() {
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
