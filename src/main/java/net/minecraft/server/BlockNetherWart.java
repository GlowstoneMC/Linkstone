package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockNetherWart extends BlockPlant {

    public static final BlockStateInteger AGE = null;

    private static final AxisAlignedBB[] c = null;

    protected BlockNetherWart() {
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

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void dropNaturally(World world, BlockPosition blockposition, IBlockData iblockdata, float f, int i) {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public int a(Random random) {
        return 0;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    protected BlockStateList getStateList() {
        return null;
    }
}
