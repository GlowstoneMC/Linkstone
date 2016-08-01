package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class BlockPurpurSlab extends BlockStepAbstract {

    public static final BlockStateEnum<BlockPurpurSlab.Type> d = null;

    public BlockPurpurSlab() {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
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

    public String e(int i) {
        return null;
    }

    public IBlockState<?> g() {
        return null;
    }

    public Comparable<?> a(ItemStack itemstack) {
        return null;
    }

    public static enum Type implements INamable {

        DEFAULT;

        private Type() {
        }

        public String getName() {
            return null;
        }
    }

    public static class Default extends BlockPurpurSlab {

        public Default() {
        }

        public boolean e() {
            return false;
        }
    }

    public static class Half extends BlockPurpurSlab {

        public Half() {
        }

        public boolean e() {
            return false;
        }
    }
}
