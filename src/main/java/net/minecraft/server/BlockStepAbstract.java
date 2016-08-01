package net.minecraft.server;

import java.util.Random;

public abstract class BlockStepAbstract extends Block {

    public static final BlockStateEnum<BlockStepAbstract.EnumSlabHalf> HALF = null;

    protected static final AxisAlignedBB b = null;

    protected static final AxisAlignedBB c = null;

    public BlockStepAbstract(Material material) {
    }

    protected boolean o() {
        return false;
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public boolean k(IBlockData iblockdata) {
        return false;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public int a(Random random) {
        return 0;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public abstract String e(int i);

    public abstract boolean e();

    public abstract IBlockState<?> g();

    public abstract Comparable<?> a(ItemStack itemstack);

    public static enum EnumSlabHalf implements INamable {

        TOP("top"), BOTTOM("bottom");

        private final String c = null;

        private EnumSlabHalf(String s) {
        }

        public String toString() {
            return null;
        }

        public String getName() {
            return null;
        }
    }
}
