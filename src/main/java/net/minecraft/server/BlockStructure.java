package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockStructure extends BlockTileEntity {

    public static final BlockStateEnum<TileEntityStructure.UsageMode> a = null;

    public BlockStructure() {
    }

    public TileEntity a(World world, int i) {
        return null;
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    public void postPlace(World world, BlockPosition blockposition, IBlockData iblockdata, EntityLiving entityliving, ItemStack itemstack) {
    }

    @Nullable
    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public int a(Random random) {
        return 0;
    }

    public EnumRenderType a(IBlockData iblockdata) {
        return null;
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
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

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    private void a(TileEntityStructure tileentitystructure) {
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static {
        }
    }
}
