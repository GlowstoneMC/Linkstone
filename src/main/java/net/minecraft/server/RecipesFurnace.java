package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class RecipesFurnace {

    private static final RecipesFurnace a = null;

    public Map<ItemStack, ItemStack> recipes = null;

    private final Map<ItemStack, Float> experience = null;

    public Map<ItemStack, ItemStack> customRecipes = null;

    // CraftBukkit - add field
    public Map<ItemStack, Float> customExperience = null;

    // CraftBukkit - add field
    public static RecipesFurnace getInstance() {
        return null;
    }

    public RecipesFurnace() {
    }

    // CraftBukkit start - add method
    public void registerRecipe(ItemStack itemstack, ItemStack itemstack1, float f) {
    }

    // CraftBukkit end
    public void registerRecipe(Block block, ItemStack itemstack, float f) {
    }

    public void a(Item item, ItemStack itemstack, float f) {
    }

    public void a(ItemStack itemstack, ItemStack itemstack1, float f) {
    }

    @Nullable
    public ItemStack getResult(ItemStack itemstack) {
        return null;
    }

    private boolean a(ItemStack itemstack, ItemStack itemstack1) {
        return false;
    }

    public Map<ItemStack, ItemStack> getRecipes() {
        return null;
    }

    public float b(ItemStack itemstack) {
        return 0.0F;
    }
}
