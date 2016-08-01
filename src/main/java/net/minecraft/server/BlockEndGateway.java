package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockEndGateway extends BlockTileEntity {

    protected BlockEndGateway(Material material) {
    }

    public TileEntity a(World world, int i) {
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

    public int a(Random random) {
        return 0;
    }

    @Nullable
    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
    }
}
