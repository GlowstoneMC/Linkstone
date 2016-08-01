package org.bukkit.craftbukkit.block;

import net.minecraft.server.TileEntityCommand;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.CommandBlock;
import org.bukkit.craftbukkit.CraftWorld;

public class CraftCommandBlock extends CraftBlockState implements CommandBlock {

    private final TileEntityCommand commandBlock = null;

    private String command = null;

    private String name = null;

    public CraftCommandBlock(Block block) {
    }

    public CraftCommandBlock(final Material material, final TileEntityCommand te) {
    }

    public String getCommand() {
        return null;
    }

    public void setCommand(String command) {
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
    }

    public boolean update(boolean force, boolean applyPhysics) {
        return false;
    }

    @Override
    public TileEntityCommand getTileEntity() {
        return null;
    }
}
