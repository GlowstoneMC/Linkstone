package net.minecraft.server;

import java.util.Iterator;
import java.util.Random;
// CraftBukkit start
import org.bukkit.TreeType;
import org.bukkit.block.BlockState;
import org.bukkit.event.block.BlockSpreadEvent;

// CraftBukkit end
public class BlockMushroom extends BlockPlant implements IBlockFragilePlantElement {

    protected static final AxisAlignedBB a = null;

    protected BlockMushroom() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    protected boolean i(IBlockData iblockdata) {
        return false;
    }

    public boolean f(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    public boolean c(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
        return false;
    }

    public boolean a(World world, BlockPosition blockposition, IBlockData iblockdata, boolean flag) {
        return false;
    }

    public boolean a(World world, Random random, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    public void b(World world, Random random, BlockPosition blockposition, IBlockData iblockdata) {
    }
}
