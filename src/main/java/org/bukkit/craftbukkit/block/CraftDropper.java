package org.bukkit.craftbukkit.block;

import net.minecraft.server.BlockDropper;
import net.minecraft.server.BlockPosition;
import net.minecraft.server.Blocks;
import net.minecraft.server.TileEntityDropper;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Dropper;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.inventory.CraftInventory;
import org.bukkit.inventory.Inventory;

public class CraftDropper extends CraftBlockState implements Dropper {

    private final CraftWorld world = null;

    private final TileEntityDropper dropper = null;

    public CraftDropper(final Block block) {
    }

    public CraftDropper(final Material material, TileEntityDropper te) {
    }

    public Inventory getInventory() {
        return null;
    }

    public void drop() {
    }

    @Override
    public boolean update(boolean force, boolean applyPhysics) {
        return false;
    }

    @Override
    public TileEntityDropper getTileEntity() {
        return null;
    }
}
