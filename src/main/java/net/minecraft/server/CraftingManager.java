package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import org.bukkit.craftbukkit.event.CraftEventFactory;

// CraftBukkit
public class CraftingManager {

    private static final CraftingManager a = null;

    public List<IRecipe> recipes = null;

    // CraftBukkit start
    public IRecipe lastRecipe = null;

    public org.bukkit.inventory.InventoryView lastCraftView = null;

    // CraftBukkit end
    public static CraftingManager getInstance() {
        return null;
    }

    public CraftingManager() {
    }

    // CraftBukkit start
    public void sort() {
    }

    public ShapedRecipes registerShapedRecipe(ItemStack itemstack, Object... aobject) {
        return null;
    }

    public void registerShapelessRecipe(ItemStack itemstack, Object... aobject) {
    }

    public void a(IRecipe irecipe) {
    }

    @Nullable
    public ItemStack craft(InventoryCrafting inventorycrafting, World world) {
        return null;
    }

    public ItemStack[] b(InventoryCrafting inventorycrafting, World world) {
        return null;
    }

    public List<IRecipe> getRecipes() {
        return null;
    }
}
