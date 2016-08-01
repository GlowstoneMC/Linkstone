package net.minecraft.server;

public class BlockQuartz extends Block {

    public static final BlockStateEnum<BlockQuartz.EnumQuartzVariant> VARIANT = null;

    public BlockQuartz() {
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public int getDropData(IBlockData iblockdata) {
        return 0;
    }

    protected ItemStack u(IBlockData iblockdata) {
        return null;
    }

    public MaterialMapColor r(IBlockData iblockdata) {
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

    public static enum EnumQuartzVariant implements INamable {

        DEFAULT(0, "default", "default"), CHISELED(1, "chiseled", "chiseled"), LINES_Y(2, "lines_y", "lines"), LINES_X(3, "lines_x", "lines"), LINES_Z(4, "lines_z", "lines");

        private static final BlockQuartz.EnumQuartzVariant[] f = null;

        private final int g = 0;

        private final String h = null;

        private final String i = null;

        private EnumQuartzVariant(int i, String s, String s1) {
        }

        public int a() {
            return 0;
        }

        public String toString() {
            return null;
        }

        public static BlockQuartz.EnumQuartzVariant a(int i) {
            return null;
        }

        public String getName() {
            return null;
        }

        static {
        }
    }
}
