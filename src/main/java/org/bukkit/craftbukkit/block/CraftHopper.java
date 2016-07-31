package org.bukkit.craftbukkit.block;

import net.minecraft.server.TileEntityHopper;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Hopper;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.inventory.CraftInventory;
import org.bukkit.inventory.Inventory;

public class CraftHopper extends CraftBlockState implements Hopper {

    private final TileEntityHopper hopper;

    public CraftHopper(final Block block) {
    }

    public CraftHopper(final Material material, final TileEntityHopper te) {
    }

    public Inventory getInventory() {
        return null;
    }

    @Override
    public boolean update(boolean force, boolean applyPhysics) {
        return false;
    }

    @Override
    public TileEntityHopper getTileEntity() {
        return null;
    }
}
