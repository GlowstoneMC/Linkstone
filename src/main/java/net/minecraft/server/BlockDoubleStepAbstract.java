package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class BlockDoubleStepAbstract extends BlockStepAbstract {

    public static final BlockStateBoolean SEAMLESS;

    public static final BlockStateEnum<BlockDoubleStepAbstract.EnumStoneSlabVariant> VARIANT;

    public BlockDoubleStepAbstract() {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public String e(int i) {
        return null;
    }

    public IBlockState<?> g() {
        return null;
    }

    public Comparable<?> a(ItemStack itemstack) {
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

    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
    }

    public static enum EnumStoneSlabVariant implements INamable {

        STONE(0, MaterialMapColor.m, "stone"), SAND(1, MaterialMapColor.d, "sandstone", "sand"), WOOD(2, MaterialMapColor.o, "wood_old", "wood"), COBBLESTONE(3, MaterialMapColor.m, "cobblestone", "cobble"), BRICK(4, MaterialMapColor.D, "brick"), SMOOTHBRICK(5, MaterialMapColor.m, "stone_brick", "smoothStoneBrick"), NETHERBRICK(6, MaterialMapColor.K, "nether_brick", "netherBrick"), QUARTZ(7, MaterialMapColor.p, "quartz");

        private static final BlockDoubleStepAbstract.EnumStoneSlabVariant[] i;

        private final int j;

        private final MaterialMapColor k;

        private final String l;

        private final String m;

        private EnumStoneSlabVariant(int i, MaterialMapColor materialmapcolor, String s) {
        }

        private EnumStoneSlabVariant(int i, MaterialMapColor materialmapcolor, String s, String s1) {
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

        public static BlockDoubleStepAbstract.EnumStoneSlabVariant a(int i) {
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
