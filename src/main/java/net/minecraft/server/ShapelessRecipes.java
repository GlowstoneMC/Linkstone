package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.craftbukkit.inventory.CraftShapelessRecipe;

// CraftBukkit end
public class ShapelessRecipes implements IRecipe {

    private final ItemStack result;

    private final List<ItemStack> ingredients;

    public ShapelessRecipes(ItemStack itemstack, List<ItemStack> list) {
    }

    // CraftBukkit start
    @SuppressWarnings("unchecked")
    public org.bukkit.inventory.ShapelessRecipe toBukkitRecipe() {
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

    @Nullable
    public ItemStack craftItem(InventoryCrafting inventorycrafting) {
        return null;
    }

    public int a() {
        return 0;
    }
}
