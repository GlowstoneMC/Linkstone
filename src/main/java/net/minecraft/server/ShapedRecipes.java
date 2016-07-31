package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.craftbukkit.inventory.CraftShapedRecipe;

// CraftBukkit end
public class ShapedRecipes implements IRecipe {

    private final int width;

    private final int height;

    private final ItemStack[] items;

    private final ItemStack result;

    private boolean e;

    public ShapedRecipes(int i, int j, ItemStack[] aitemstack, ItemStack itemstack) {
    }

    // CraftBukkit start
    public org.bukkit.inventory.ShapedRecipe toBukkitRecipe() {
        return null;
    }

    // CraftBukkit end
    @Nullable
    public ItemStack b() {
        return null;
    }

    public ItemStack[] b(InventoryCrafting inventorycrafting) {
        return null;
    }

    public boolean a(InventoryCrafting inventorycrafting, World world) {
        return false;
    }

    private boolean a(InventoryCrafting inventorycrafting, int i, int j, boolean flag) {
        return false;
    }

    @Nullable
    public ItemStack craftItem(InventoryCrafting inventorycrafting) {
        return null;
    }

    public int a() {
        return 0;
    }
}
