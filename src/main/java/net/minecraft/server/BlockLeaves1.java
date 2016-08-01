package net.minecraft.server;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class BlockLeaves1 extends BlockLeaves {

    public static final BlockStateEnum<BlockWood.EnumLogVariant> VARIANT;

    public BlockLeaves1() {
    }

    protected void a(World world, BlockPosition blockposition, IBlockData iblockdata, int i) {
    }

    protected int i(IBlockData iblockdata) {
        return 0;
    }

    protected ItemStack u(IBlockData iblockdata) {
        return null;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    public BlockWood.EnumLogVariant e(int i) {
        return null;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    public int getDropData(IBlockData iblockdata) {
        return 0;
    }

    public void a(World world, EntityHuman entityhuman, BlockPosition blockposition, IBlockData iblockdata, @Nullable TileEntity tileentity, @Nullable ItemStack itemstack) {
    }
}
