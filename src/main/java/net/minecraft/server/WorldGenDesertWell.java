package net.minecraft.server;

import com.google.common.base.Predicates;
import java.util.Iterator;
import java.util.Random;

public class WorldGenDesertWell extends WorldGenerator {

    private static final BlockStatePredicate a;

    private final IBlockData b;

    private final IBlockData c;

    private final IBlockData d;

    public WorldGenDesertWell() {
    }

    public boolean generate(World world, Random random, BlockPosition blockposition) {
        return false;
    }
}
