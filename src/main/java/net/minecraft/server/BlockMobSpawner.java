package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockMobSpawner extends BlockTileEntity {

    protected BlockMobSpawner() {
    }

    public TileEntity a(World world, int i) {
        return null;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public int a(Random random) {
        return 0;
    }

    public void dropNaturally(World world, BlockPosition blockposition, IBlockData iblockdata, float f, int i) {
    }

    @Override
    public int getExpDrop(World world, IBlockData iblockdata, int enchantmentLevel) {
        return 0;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public EnumRenderType a(IBlockData iblockdata) {
        return null;
    }

    @Nullable
    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }
}
