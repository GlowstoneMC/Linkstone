package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockHugeMushroom extends Block {

    public static final BlockStateEnum<BlockHugeMushroom.EnumHugeMushroomVariant> VARIANT = null;

    private final Block b = null;

    public BlockHugeMushroom(Material material, MaterialMapColor materialmapcolor, Block block) {
    }

    public int a(Random random) {
        return 0;
    }

    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
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

    public IBlockData a(IBlockData iblockdata, EnumBlockRotation enumblockrotation) {
        return null;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockMirror enumblockmirror) {
        return null;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static final int[] b = null;

        static final int[] c = null;

        static {
        }
    }

    public static enum EnumHugeMushroomVariant implements INamable {

        NORTH_WEST(1, "north_west"), NORTH(2, "north"), NORTH_EAST(3, "north_east"), WEST(4, "west"), CENTER(5, "center"), EAST(6, "east"), SOUTH_WEST(7, "south_west"), SOUTH(8, "south"), SOUTH_EAST(9, "south_east"), STEM(10, "stem"), ALL_INSIDE(0, "all_inside"), ALL_OUTSIDE(14, "all_outside"), ALL_STEM(15, "all_stem");

        private static final BlockHugeMushroom.EnumHugeMushroomVariant[] n = null;

        private final int o = 0;

        private final String p = null;

        private EnumHugeMushroomVariant(int i, String s) {
        }

        public int a() {
            return 0;
        }

        public String toString() {
            return null;
        }

        public static BlockHugeMushroom.EnumHugeMushroomVariant a(int i) {
            return null;
        }

        public String getName() {
            return null;
        }

        static {
        }
    }
}
