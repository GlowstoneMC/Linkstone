package org.bukkit.craftbukkit.inventory;

import net.minecraft.server.ITileEntityContainer;
import net.minecraft.server.ITileInventory;
import org.bukkit.block.DoubleChest;
import org.bukkit.inventory.DoubleChestInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import net.minecraft.server.InventoryLargeChest;
import org.bukkit.Location;

public class CraftInventoryDoubleChest extends CraftInventory implements DoubleChestInventory {

    private final CraftInventory left;

    private final CraftInventory right;

    public CraftInventoryDoubleChest(CraftInventory left, CraftInventory right) {
    }

    public CraftInventoryDoubleChest(InventoryLargeChest largeChest) {
    }

    public Inventory getLeftSide() {
        return null;
    }

    public Inventory getRightSide() {
        return null;
    }

    @Override
    public void setContents(ItemStack[] items) {
    }

    @Override
    public DoubleChest getHolder() {
        return null;
    }

    @Override
    public Location getLocation() {
        return null;
    }
}
