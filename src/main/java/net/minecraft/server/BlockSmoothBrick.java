package net.minecraft.server;

public class BlockSmoothBrick extends Block {

    public static final BlockStateEnum<BlockSmoothBrick.EnumStonebrickType> VARIANT;

    public static final int b;

    public static final int c;

    public static final int d;

    public static final int e;

    public BlockSmoothBrick() {
    }

    public int getDropData(IBlockData iblockdata) {
        return 0;
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

    public static enum EnumStonebrickType implements INamable {

        DEFAULT(0, "stonebrick", "default"), MOSSY(1, "mossy_stonebrick", "mossy"), CRACKED(2, "cracked_stonebrick", "cracked"), CHISELED(3, "chiseled_stonebrick", "chiseled");

        private static final BlockSmoothBrick.EnumStonebrickType[] e;

        private final int f;

        private final String g;

        private final String h;

        private EnumStonebrickType(int i, String s, String s1) {
        }

        public int a() {
            return 0;
        }

        public String toString() {
            return null;
        }

        public static BlockSmoothBrick.EnumStonebrickType a(int i) {
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
