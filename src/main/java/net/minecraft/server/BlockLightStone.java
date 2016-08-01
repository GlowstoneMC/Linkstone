package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockLightStone extends Block {

    public BlockLightStone(Material material) {
    }

    public int getDropCount(int i, Random random) {
        return 0;
    }

    public int a(Random random) {
        return 0;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
    }
}
