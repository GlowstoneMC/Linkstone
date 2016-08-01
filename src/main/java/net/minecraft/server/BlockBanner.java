package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockBanner extends BlockTileEntity {

    public static final BlockStateDirection FACING = null;

    public static final BlockStateInteger ROTATION = null;

    protected static final AxisAlignedBB c = null;

    protected BlockBanner() {
    }

    public String getName() {
        return null;
    }

    @Nullable
    public AxisAlignedBB a(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return null;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean b(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean d() {
        return false;
    }

    public TileEntity a(World world, int i) {
        return null;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    @Nullable
    private ItemStack e(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public void dropNaturally(World world, BlockPosition blockposition, IBlockData iblockdata, float f, int i) {
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    public void a(World world, EntityHuman entityhuman, BlockPosition blockposition, IBlockData iblockdata, @Nullable TileEntity tileentity, @Nullable ItemStack itemstack) {
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static {
        }
    }

    public static class BlockStandingBanner extends BlockBanner {

        public BlockStandingBanner() {
        }

        public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
            return null;
        }

        public IBlockData a(IBlockData iblockdata, EnumBlockRotation enumblockrotation) {
            return null;
        }

        public IBlockData a(IBlockData iblockdata, EnumBlockMirror enumblockmirror) {
            return null;
        }

        public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
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

    public static class BlockWallBanner extends BlockBanner {

        protected static final AxisAlignedBB d = null;

        protected static final AxisAlignedBB e = null;

        protected static final AxisAlignedBB f = null;

        protected static final AxisAlignedBB g = null;

        public BlockWallBanner() {
        }

        public IBlockData a(IBlockData iblockdata, EnumBlockRotation enumblockrotation) {
            return null;
        }

        public IBlockData a(IBlockData iblockdata, EnumBlockMirror enumblockmirror) {
            return null;
        }

        public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
            return null;
        }

        public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
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
}
