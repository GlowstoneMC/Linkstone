package net.minecraft.server;

public class BlockDirt extends Block {

    public static final BlockStateEnum<BlockDirt.EnumDirtVariant> VARIANT = null;

    public static final BlockStateBoolean SNOWY = null;

    protected BlockDirt() {
    }

    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
    }

    public IBlockData updateState(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
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

    public int getDropData(IBlockData iblockdata) {
        return 0;
    }

    public static enum EnumDirtVariant implements INamable {

        DIRT(0, "dirt", "default", MaterialMapColor.l), COARSE_DIRT(1, "coarse_dirt", "coarse", MaterialMapColor.l), PODZOL(2, "podzol", MaterialMapColor.J);

        private static final BlockDirt.EnumDirtVariant[] d = null;

        private final int e = 0;

        private final String f = null;

        private final String g = null;

        private final MaterialMapColor h = null;

        private EnumDirtVariant(int i, String s, MaterialMapColor materialmapcolor) {
        }

        private EnumDirtVariant(int i, String s, String s1, MaterialMapColor materialmapcolor) {
        }

        public int a() {
            return 0;
        }

        public String c() {
            return null;
        }

        public MaterialMapColor d() {
            return null;
        }

        public String toString() {
            return null;
        }

        public static BlockDirt.EnumDirtVariant a(int i) {
            return null;
        }

        public String getName() {
            return null;
        }

        static {
        }
    }
}
