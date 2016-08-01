package org.bukkit.craftbukkit.util;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.server.Block;
import net.minecraft.server.BlockPosition;
import net.minecraft.server.IBlockData;
import org.bukkit.World;
import org.bukkit.block.BlockState;

public class BlockStateListPopulator {

    private final World world = null;

    private final List<BlockState> list = null;

    public BlockStateListPopulator(World world) {
    }

    public BlockStateListPopulator(World world, List<BlockState> list) {
    }

    public void setTypeAndData(int x, int y, int z, Block block, int data, int light) {
    }

    public void setTypeId(int x, int y, int z, int type) {
    }

    public void setTypeUpdate(int x, int y, int z, Block block) {
    }

    public void setTypeUpdate(BlockPosition position, IBlockData data) {
    }

    public void setType(int x, int y, int z, Block block) {
    }

    public void updateList() {
    }

    public List<BlockState> getList() {
        return null;
    }

    public World getWorld() {
        return null;
    }
}
