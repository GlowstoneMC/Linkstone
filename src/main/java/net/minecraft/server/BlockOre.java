package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockOre extends Block {

    public BlockOre() {
    }

    public BlockOre(MaterialMapColor materialmapcolor) {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public int a(Random random) {
        return 0;
    }

    public int getDropCount(int i, Random random) {
        return 0;
    }

    public void dropNaturally(World world, BlockPosition blockposition, IBlockData iblockdata, float f, int i) {
    }

    @Override
    public int getExpDrop(World world, IBlockData iblockdata, int i) {
        return 0;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public int getDropData(IBlockData iblockdata) {
        return 0;
    }
}
