package net.minecraft.server;

import javax.annotation.Nullable;

public class BlockCobbleWall extends Block {

    public static final BlockStateBoolean UP = null;

    public static final BlockStateBoolean NORTH = null;

    public static final BlockStateBoolean EAST = null;

    public static final BlockStateBoolean SOUTH = null;

    public static final BlockStateBoolean WEST = null;

    public static final BlockStateEnum<BlockCobbleWall.EnumCobbleVariant> VARIANT = null;

    protected static final AxisAlignedBB[] g = null;

    protected static final AxisAlignedBB[] B = null;

    public BlockCobbleWall(Block block) {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    @Nullable
    public AxisAlignedBB a(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return null;
    }

    private static int i(IBlockData iblockdata) {
        return 0;
    }

    public String getName() {
        return null;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean b(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    private boolean c(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
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

    public IBlockData updateState(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    public static enum EnumCobbleVariant implements INamable {

        NORMAL(0, "cobblestone", "normal"), MOSSY(1, "mossy_cobblestone", "mossy");

        private static final BlockCobbleWall.EnumCobbleVariant[] c = null;

        private final int d = 0;

        private final String e = null;

        private final String f = null;

        private EnumCobbleVariant(int i, String s, String s1) {
        }

        public int a() {
            return 0;
        }

        public String toString() {
            return null;
        }

        public static BlockCobbleWall.EnumCobbleVariant a(int i) {
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
