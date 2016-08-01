package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockClay extends Block {

    public BlockClay() {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public int a(Random random) {
        return 0;
    }
}
