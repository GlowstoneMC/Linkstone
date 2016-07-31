package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockCake extends Block {

    public static final BlockStateInteger BITES;

    protected static final AxisAlignedBB[] b;

    protected BlockCake() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    private void b(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman) {
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    private boolean b(World world, BlockPosition blockposition) {
        return false;
    }

    public int a(Random random) {
        return 0;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
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

    public int d(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return 0;
    }

    public boolean isComplexRedstone(IBlockData iblockdata) {
        return false;
    }
}
