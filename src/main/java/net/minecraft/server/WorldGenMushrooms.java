package net.minecraft.server;

import java.util.Random;

public class WorldGenMushrooms extends WorldGenerator {

    private final BlockPlant a;

    public WorldGenMushrooms(BlockPlant blockplant) {
    }

    public boolean generate(World world, Random random, BlockPosition blockposition) {
        return false;
    }
}
