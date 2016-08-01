package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockSnowBlock extends Block {

    protected BlockSnowBlock() {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public int a(Random random) {
        return 0;
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }
}
