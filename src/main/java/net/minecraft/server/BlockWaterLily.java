package net.minecraft.server;

import java.util.List;
import javax.annotation.Nullable;

public class BlockWaterLily extends BlockPlant {

    protected static final AxisAlignedBB a;

    protected BlockWaterLily() {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, AxisAlignedBB axisalignedbb, List<AxisAlignedBB> list, @Nullable Entity entity) {
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, Entity entity) {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    protected boolean i(IBlockData iblockdata) {
        return false;
    }

    public boolean f(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }
}
