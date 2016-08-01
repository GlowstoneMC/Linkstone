package org.bukkit.craftbukkit.block;

import net.minecraft.server.BlockPosition;
import net.minecraft.server.TileEntityChest;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.inventory.CraftInventory;
import org.bukkit.craftbukkit.inventory.CraftInventoryDoubleChest;
import org.bukkit.inventory.Inventory;

public class CraftChest extends CraftBlockState implements Chest {

    private final CraftWorld world;

    private final TileEntityChest chest;

    public CraftChest(final Block block) {
    }

    public CraftChest(final Material material, final TileEntityChest te) {
    }

    public Inventory getBlockInventory() {
        return null;
    }

    public Inventory getInventory() {
        return null;
    }

    @Override
    public boolean update(boolean force, boolean applyPhysics) {
        return false;
    }

    @Override
    public TileEntityChest getTileEntity() {
        return null;
    }
}
