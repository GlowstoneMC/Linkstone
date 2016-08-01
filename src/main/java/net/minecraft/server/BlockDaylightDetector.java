package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockDaylightDetector extends BlockTileEntity {

    public static final BlockStateInteger POWER = null;

    protected static final AxisAlignedBB b = null;

    private final boolean c = false;

    public BlockDaylightDetector(boolean flag) {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public int b(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    public void c(World world, BlockPosition blockposition) {
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public EnumRenderType a(IBlockData iblockdata) {
        return null;
    }

    public boolean isPowerSource(IBlockData iblockdata) {
        return false;
    }

    public TileEntity a(World world, int i) {
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
