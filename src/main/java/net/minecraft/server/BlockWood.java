package net.minecraft.server;

public class BlockWood extends Block {

    public static final BlockStateEnum<BlockWood.EnumLogVariant> VARIANT;

    public BlockWood() {
    }

    public int getDropData(IBlockData iblockdata) {
        return 0;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    public static enum EnumLogVariant implements INamable {

        OAK(0, "oak", MaterialMapColor.o), SPRUCE(1, "spruce", MaterialMapColor.J), BIRCH(2, "birch", MaterialMapColor.d), JUNGLE(3, "jungle", MaterialMapColor.l), ACACIA(4, "acacia", MaterialMapColor.q), DARK_OAK(5, "dark_oak", "big_oak", MaterialMapColor.B);

        private static final BlockWood.EnumLogVariant[] g;

        private final int h;

        private final String i;

        private final String j;

        private final MaterialMapColor k;

        private EnumLogVariant(int i, String s, MaterialMapColor materialmapcolor) {
        }

        private EnumLogVariant(int i, String s, String s1, MaterialMapColor materialmapcolor) {
        }

        public int a() {
            return 0;
        }

        public MaterialMapColor c() {
            return null;
        }

        public String toString() {
            return null;
        }

        public static BlockWood.EnumLogVariant a(int i) {
            return null;
        }

        public String getName() {
            return null;
        }

        public String d() {
            return null;
        }

        static {
        }
    }
}
