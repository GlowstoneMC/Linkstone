package org.bukkit.craftbukkit.inventory;

import java.util.ListIterator;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryIterator implements ListIterator<ItemStack> {

    private final Inventory inventory;

    private int nextIndex;

    private Boolean lastDirection;

    // true = forward, false = backward, null = haven't moved yet
    InventoryIterator(Inventory craftInventory) {
    }

    InventoryIterator(Inventory craftInventory, int index) {
    }

    public boolean hasNext() {
        return false;
    }

    public ItemStack next() {
        return null;
    }

    public int nextIndex() {
        return 0;
    }

    public boolean hasPrevious() {
        return false;
    }

    public ItemStack previous() {
        return null;
    }

    public int previousIndex() {
        return 0;
    }

    public void set(ItemStack item) {
    }

    public void add(ItemStack item) {
    }

    public void remove() {
    }
}
