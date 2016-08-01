package net.minecraft.server;

import javax.annotation.Nullable;

public class BlockStructureVoid extends Block {

    private static final AxisAlignedBB a;

    protected BlockStructureVoid() {
    }

    public EnumRenderType a(IBlockData iblockdata) {
        return null;
    }

    @Nullable
    public AxisAlignedBB a(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return null;
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public void dropNaturally(World world, BlockPosition blockposition, IBlockData iblockdata, float f, int i) {
    }
}
