package net.minecraft.server;

import java.util.Random;

public class BiomeForest extends BiomeBase {

    protected static final WorldGenForest y = null;

    protected static final WorldGenForest z = null;

    protected static final WorldGenForestTree A = null;

    private final BiomeForest.Type B = null;

    public BiomeForest(BiomeForest.Type biomeforest_type, BiomeBase.a biomebase_a) {
    }

    public WorldGenTreeAbstract a(Random random) {
        return null;
    }

    public BlockFlowers.EnumFlowerVarient a(Random random, BlockPosition blockposition) {
        return null;
    }

    public void a(World world, Random random, BlockPosition blockposition) {
    }

    protected void b(World world, Random random, BlockPosition blockposition) {
    }

    protected void a(World world, Random random, BlockPosition blockposition, int i) {
    }

    public Class<? extends BiomeBase> g() {
        return null;
    }

    public static enum Type {

        NORMAL, FLOWER, BIRCH, ROOFED;

        private Type() {
        }
    }
}
