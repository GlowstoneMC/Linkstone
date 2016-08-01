package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockDeadBush extends BlockPlant {

    protected static final AxisAlignedBB a;

    protected BlockDeadBush() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
    }

    protected boolean i(IBlockData iblockdata) {
        return false;
    }

    public boolean a(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    public int a(Random random) {
        return 0;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public void a(World world, EntityHuman entityhuman, BlockPosition blockposition, IBlockData iblockdata, @Nullable TileEntity tileentity, @Nullable ItemStack itemstack) {
    }
}
