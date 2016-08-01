package net.minecraft.server;

import com.google.common.base.Predicate;
import java.util.Random;

public class WorldGenMinable extends WorldGenerator {

    private final IBlockData a = null;

    private final int b = 0;

    private final Predicate<IBlockData> c = null;

    public WorldGenMinable(IBlockData iblockdata, int i) {
    }

    public WorldGenMinable(IBlockData iblockdata, int i, Predicate<IBlockData> predicate) {
    }

    public boolean generate(World world, Random random, BlockPosition blockposition) {
        return false;
    }
}
