package org.bukkit.craftbukkit.inventory;

import java.util.Arrays;
import net.minecraft.server.IRecipe;
import net.minecraft.server.IInventory;
import net.minecraft.server.InventoryCrafting;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

public class CraftInventoryCrafting extends CraftInventory implements CraftingInventory {

    private final IInventory resultInventory = null;

    public CraftInventoryCrafting(InventoryCrafting inventory, IInventory resultInventory) {
    }

    public IInventory getResultInventory() {
        return null;
    }

    public IInventory getMatrixInventory() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void setContents(ItemStack[] items) {
    }

    @Override
    public ItemStack[] getContents() {
        return null;
    }

    public void setContents(ItemStack result, ItemStack[] contents) {
    }

    @Override
    public CraftItemStack getItem(int index) {
        return null;
    }

    @Override
    public void setItem(int index, ItemStack item) {
    }

    public ItemStack[] getMatrix() {
        return null;
    }

    public ItemStack getResult() {
        return null;
    }

    public void setMatrix(ItemStack[] contents) {
    }

    public void setResult(ItemStack item) {
    }

    public Recipe getRecipe() {
        return null;
    }
}
