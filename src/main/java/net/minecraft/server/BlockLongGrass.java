package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockLongGrass extends BlockPlant implements IBlockFragilePlantElement {

    public static final BlockStateEnum<BlockLongGrass.EnumTallGrassType> TYPE = null;

    protected static final AxisAlignedBB c = null;

    protected BlockLongGrass() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public boolean f(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    public boolean a(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public int getDropCount(int i, Random random) {
        return 0;
    }

    public void a(World world, EntityHuman entityhuman, BlockPosition blockposition, IBlockData iblockdata, @Nullable TileEntity tileentity, @Nullable ItemStack itemstack) {
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public boolean a(World world, BlockPosition blockposition, IBlockData iblockdata, boolean flag) {
        return false;
    }

    public boolean a(World world, Random random, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    public void b(World world, Random random, BlockPosition blockposition, IBlockData iblockdata) {
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

    public static enum EnumTallGrassType implements INamable {

        DEAD_BUSH(0, "dead_bush"), GRASS(1, "tall_grass"), FERN(2, "fern");

        private static final BlockLongGrass.EnumTallGrassType[] d = null;

        private final int e = 0;

        private final String f = null;

        private EnumTallGrassType(int i, String s) {
        }

        public int a() {
            return 0;
        }

        public String toString() {
            return null;
        }

        public static BlockLongGrass.EnumTallGrassType a(int i) {
            return null;
        }

        public String getName() {
            return null;
        }

        static {
        }
    }
}
