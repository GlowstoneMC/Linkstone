package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockGravel extends BlockFalling {

    public BlockGravel() {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
    }
}
