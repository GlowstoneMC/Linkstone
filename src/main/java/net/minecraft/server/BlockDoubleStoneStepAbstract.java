package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class BlockDoubleStoneStepAbstract extends BlockStepAbstract {

    public static final BlockStateBoolean SEAMLESS;

    public static final BlockStateEnum<BlockDoubleStoneStepAbstract.EnumStoneSlab2Variant> VARIANT;

    public BlockDoubleStoneStepAbstract() {
    }

    public String getName() {
        return null;
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

    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
    }

    public int getDropData(IBlockData iblockdata) {
        return 0;
    }

    public static enum EnumStoneSlab2Variant implements INamable {

        RED_SANDSTONE(0, "red_sandstone", BlockSand.EnumSandVariant.RED_SAND.d());

        private static final BlockDoubleStoneStepAbstract.EnumStoneSlab2Variant[] b;

        private final int c;

        private final String d;

        private final MaterialMapColor e;

        private EnumStoneSlab2Variant(int i, String s, MaterialMapColor materialmapcolor) {
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

        public static BlockDoubleStoneStepAbstract.EnumStoneSlab2Variant a(int i) {
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
