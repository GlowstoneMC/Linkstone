package net.minecraft.server;

import javax.annotation.Nullable;

public class RecipiesShield {

    public RecipiesShield() {
    }

    public void a(CraftingManager craftingmanager) {
    }

    static class SyntheticClass_1 {
    }

    static class Decoration extends ShapelessRecipes implements IRecipe {

        // CraftBukkit start - Delegate to new parent class with bogus info
        private Decoration() {
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

        Decoration(RecipiesShield.SyntheticClass_1 recipiesshield_syntheticclass_1) {
        }
    }
}
