package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockIceFrost extends BlockIce {

    public static final BlockStateInteger a = null;

    public BlockIceFrost() {
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    private int c(World world, BlockPosition blockposition) {
        return 0;
    }

    protected void a(World world, BlockPosition blockposition, IBlockData iblockdata, Random random, boolean flag) {
    }

    protected BlockStateList getStateList() {
        return null;
    }

    @Nullable
    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }
}
