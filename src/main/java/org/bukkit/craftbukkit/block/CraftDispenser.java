package org.bukkit.craftbukkit.block;

import net.minecraft.server.BlockDispenser;
import net.minecraft.server.BlockPosition;
import net.minecraft.server.Blocks;
import net.minecraft.server.TileEntityDispenser;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Dispenser;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.inventory.CraftInventory;
import org.bukkit.craftbukkit.projectiles.CraftBlockProjectileSource;
import org.bukkit.inventory.Inventory;
import org.bukkit.projectiles.BlockProjectileSource;

public class CraftDispenser extends CraftBlockState implements Dispenser {

    private final CraftWorld world = null;

    private final TileEntityDispenser dispenser = null;

    public CraftDispenser(final Block block) {
    }

    public CraftDispenser(final Material material, final TileEntityDispenser te) {
    }

    public Inventory getInventory() {
        return null;
    }

    public BlockProjectileSource getBlockProjectileSource() {
        return null;
    }

    public boolean dispense() {
        return false;
    }

    @Override
    public boolean update(boolean force, boolean applyPhysics) {
        return false;
    }

    @Override
    public TileEntityDispenser getTileEntity() {
        return null;
    }
}
