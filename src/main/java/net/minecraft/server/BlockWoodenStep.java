package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class BlockWoodenStep extends BlockStepAbstract {

    public static final BlockStateEnum<BlockWood.EnumLogVariant> VARIANT;

    public BlockWoodenStep() {
    }

    public MaterialMapColor r(IBlockData iblockdata) {
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

    public int getDropData(IBlockData iblockdata) {
        return 0;
    }
}
