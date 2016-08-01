package org.bukkit.craftbukkit.block;

import net.minecraft.server.BlockPosition;
import net.minecraft.server.TileEntityEndGateway;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.EndGateway;
import org.bukkit.craftbukkit.CraftWorld;

public class CraftEndGateway extends CraftBlockState implements EndGateway {

    private final CraftWorld world = null;

    private final TileEntityEndGateway gateway = null;

    public CraftEndGateway(Block block) {
    }

    public CraftEndGateway(final Material material, TileEntityEndGateway te) {
    }

    @Override
    public Location getExitLocation() {
        return null;
    }

    @Override
    public void setExitLocation(Location location) {
    }

    @Override
    public boolean isExactTeleport() {
        return false;
    }

    @Override
    public void setExactTeleport(boolean exact) {
    }

    @Override
    public boolean update(boolean force, boolean applyPhysics) {
        return false;
    }

    @Override
    public TileEntityEndGateway getTileEntity() {
        return null;
    }
}
