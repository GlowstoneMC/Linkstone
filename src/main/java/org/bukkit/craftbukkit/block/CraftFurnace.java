package org.bukkit.craftbukkit.block;

import net.minecraft.server.TileEntityFurnace;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Furnace;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.inventory.CraftInventoryFurnace;
import org.bukkit.inventory.FurnaceInventory;

public class CraftFurnace extends CraftBlockState implements Furnace {

    private final TileEntityFurnace furnace;

    public CraftFurnace(final Block block) {
    }

    public CraftFurnace(final Material material, final TileEntityFurnace te) {
    }

    public FurnaceInventory getInventory() {
        return null;
    }

    @Override
    public boolean update(boolean force, boolean applyPhysics) {
        return false;
    }

    public short getBurnTime() {
        return 0;
    }

    public void setBurnTime(short burnTime) {
    }

    public short getCookTime() {
        return 0;
    }

    public void setCookTime(short cookTime) {
    }

    @Override
    public TileEntityFurnace getTileEntity() {
        return null;
    }
}
