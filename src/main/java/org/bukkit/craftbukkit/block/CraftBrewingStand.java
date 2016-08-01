package org.bukkit.craftbukkit.block;

import net.minecraft.server.TileEntityBrewingStand;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BrewingStand;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.inventory.CraftInventoryBrewer;
import org.bukkit.inventory.BrewerInventory;

public class CraftBrewingStand extends CraftBlockState implements BrewingStand {

    private final TileEntityBrewingStand brewingStand = null;

    public CraftBrewingStand(Block block) {
    }

    public CraftBrewingStand(final Material material, final TileEntityBrewingStand te) {
    }

    public BrewerInventory getInventory() {
        return null;
    }

    @Override
    public boolean update(boolean force, boolean applyPhysics) {
        return false;
    }

    public int getBrewingTime() {
        return 0;
    }

    public void setBrewingTime(int brewTime) {
    }

    @Override
    public TileEntityBrewingStand getTileEntity() {
        return null;
    }

    @Override
    public int getFuelLevel() {
        return 0;
    }

    @Override
    public void setFuelLevel(int level) {
    }
}
