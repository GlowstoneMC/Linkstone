package net.minecraft.server;

import java.util.Random;

public abstract class WorldGenerator {

    private final boolean a;

    public WorldGenerator() {
    }

    public WorldGenerator(boolean flag) {
    }

    public abstract boolean generate(World world, Random random, BlockPosition blockposition);

    public void e() {
    }

    protected void a(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }
}
