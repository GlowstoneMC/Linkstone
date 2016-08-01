package net.minecraft.server;

import javax.annotation.Nullable;

public class BlockAir extends Block {

    protected BlockAir() {
    }

    public EnumRenderType a(IBlockData iblockdata) {
        return null;
    }

    @Nullable
    public AxisAlignedBB a(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return null;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean a(IBlockData iblockdata, boolean flag) {
        return false;
    }

    public void dropNaturally(World world, BlockPosition blockposition, IBlockData iblockdata, float f, int i) {
    }

    public boolean a(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }
}
