package net.minecraft.server;

public class BlockSandStone extends Block {

    public static final BlockStateEnum<BlockSandStone.EnumSandstoneVariant> TYPE = null;

    public BlockSandStone() {
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

    public static enum EnumSandstoneVariant implements INamable {

        DEFAULT(0, "sandstone", "default"), CHISELED(1, "chiseled_sandstone", "chiseled"), SMOOTH(2, "smooth_sandstone", "smooth");

        private static final BlockSandStone.EnumSandstoneVariant[] d = null;

        private final int e = 0;

        private final String f = null;

        private final String g = null;

        private EnumSandstoneVariant(int i, String s, String s1) {
        }

        public int a() {
            return 0;
        }

        public String toString() {
            return null;
        }

        public static BlockSandStone.EnumSandstoneVariant a(int i) {
            return null;
        }

        public String getName() {
            return null;
        }

        public String c() {
            return null;
        }

        static {
        }
    }
}
