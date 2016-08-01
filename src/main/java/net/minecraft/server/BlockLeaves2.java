package net.minecraft.server;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class BlockLeaves2 extends BlockLeaves {

    public static final BlockStateEnum<BlockWood.EnumLogVariant> VARIANT;

    public BlockLeaves2() {
    }

    protected void a(World world, BlockPosition blockposition, IBlockData iblockdata, int i) {
    }

    public int getDropData(IBlockData iblockdata) {
        return 0;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
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

    public void a(World world, EntityHuman entityhuman, BlockPosition blockposition, IBlockData iblockdata, @Nullable TileEntity tileentity, @Nullable ItemStack itemstack) {
    }
}
