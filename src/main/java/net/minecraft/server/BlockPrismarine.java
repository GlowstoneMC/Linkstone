package net.minecraft.server;

public class BlockPrismarine extends Block {

    public static final BlockStateEnum<BlockPrismarine.EnumPrismarineVariant> VARIANT;

    public static final int b;

    public static final int c;

    public static final int d;

    public BlockPrismarine() {
    }

    public String getName() {
        return null;
    }

    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
    }

    public int getDropData(IBlockData iblockdata) {
        return 0;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public static enum EnumPrismarineVariant implements INamable {

        ROUGH(0, "prismarine", "rough"), BRICKS(1, "prismarine_bricks", "bricks"), DARK(2, "dark_prismarine", "dark");

        private static final BlockPrismarine.EnumPrismarineVariant[] d;

        private final int e;

        private final String f;

        private final String g;

        private EnumPrismarineVariant(int i, String s, String s1) {
        }

        public int a() {
            return 0;
        }

        public String toString() {
            return null;
        }

        public static BlockPrismarine.EnumPrismarineVariant a(int i) {
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
