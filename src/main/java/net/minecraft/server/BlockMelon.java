package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockMelon extends Block {

    protected BlockMelon() {
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
}
