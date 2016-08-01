package org.bukkit.craftbukkit.util;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.server.Block;
import net.minecraft.server.Blocks;
import net.minecraft.server.World;
import org.bukkit.BlockChangeDelegate;
import org.bukkit.block.BlockState;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.material.MaterialData;

public class StructureGrowDelegate implements BlockChangeDelegate {

    private final CraftWorld world = null;

    private final List<BlockState> blocks = null;

    public StructureGrowDelegate(World world) {
    }

    public boolean setRawTypeId(int x, int y, int z, int type) {
        return false;
    }

    public boolean setRawTypeIdAndData(int x, int y, int z, int type, int data) {
        return false;
    }

    public boolean setTypeId(int x, int y, int z, int typeId) {
        return false;
    }

    public boolean setTypeIdAndData(int x, int y, int z, int typeId, int data) {
        return false;
    }

    public int getTypeId(int x, int y, int z) {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    public List<BlockState> getBlocks() {
        return null;
    }

    public boolean isEmpty(int x, int y, int z) {
        return false;
    }
}
