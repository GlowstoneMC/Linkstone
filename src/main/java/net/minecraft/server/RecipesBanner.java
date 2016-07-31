package net.minecraft.server;

import javax.annotation.Nullable;

public class RecipesBanner {

    public RecipesBanner() {
    }

    void a(CraftingManager craftingmanager) {
    }

    static class SyntheticClass_1 {
    }

    static class AddRecipe extends ShapelessRecipes implements IRecipe {

        // CraftBukkit start - Delegate to new parent class with bogus info
        private AddRecipe() {
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

        @Nullable
        private TileEntityBanner.EnumBannerPatternType c(InventoryCrafting inventorycrafting) {
            return null;
        }

        AddRecipe(RecipesBanner.SyntheticClass_1 recipesbanner_syntheticclass_1) {
        }
    }

    static class DuplicateRecipe extends ShapelessRecipes implements IRecipe {

        // CraftBukkit start - Delegate to new parent class with bogus info
        private DuplicateRecipe() {
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

        DuplicateRecipe(RecipesBanner.SyntheticClass_1 recipesbanner_syntheticclass_1) {
        }
    }
}
