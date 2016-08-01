package net.minecraft.server;

public class BlockSand extends BlockFalling {

    public static final BlockStateEnum<BlockSand.EnumSandVariant> VARIANT = null;

    public BlockSand() {
    }

    public int getDropData(IBlockData iblockdata) {
        return 0;
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

    protected BlockStateList getStateList() {
        return null;
    }

    public static enum EnumSandVariant implements INamable {

        SAND(0, "sand", "default", MaterialMapColor.d, -2370656), RED_SAND(1, "red_sand", "red", MaterialMapColor.q, -5679071);

        private static final BlockSand.EnumSandVariant[] c = null;

        private final int d = 0;

        private final String e = null;

        private final MaterialMapColor f = null;

        private final String g = null;

        private final int h = 0;

        private EnumSandVariant(int i, String s, String s1, MaterialMapColor materialmapcolor, int j) {
        }

        public int b() {
            return 0;
        }

        public String toString() {
            return null;
        }

        public MaterialMapColor d() {
            return null;
        }

        public static BlockSand.EnumSandVariant a(int i) {
            return null;
        }

        public String getName() {
            return null;
        }

        public String e() {
            return null;
        }

        static {
        }
    }
}
