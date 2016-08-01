package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.event.block.BlockPhysicsEvent;

// CraftBukkit end
public class BlockPlant extends Block {

    protected static final AxisAlignedBB b = null;

    protected BlockPlant() {
    }

    protected BlockPlant(Material material) {
    }

    protected BlockPlant(Material material, MaterialMapColor materialmapcolor) {
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    protected boolean i(IBlockData iblockdata) {
        return false;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    protected void e(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public boolean f(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    @Nullable
    public AxisAlignedBB a(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return null;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }
}
