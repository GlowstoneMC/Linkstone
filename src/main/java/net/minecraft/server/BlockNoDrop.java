package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockNoDrop extends Block {

    public BlockNoDrop(Material material) {
    }

    public int a(Random random) {
        return 0;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }
}
