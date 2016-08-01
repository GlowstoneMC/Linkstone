package net.minecraft.server;

import java.util.Random;

public class BiomeBigHills extends BiomeBase {

    private final WorldGenerator y;

    private final WorldGenTaiga2 z;

    private final BiomeBigHills.Type A;

    protected BiomeBigHills(BiomeBigHills.Type biomebighills_type, BiomeBase.a biomebase_a) {
    }

    public WorldGenTreeAbstract a(Random random) {
        return null;
    }

    public void a(World world, Random random, BlockPosition blockposition) {
    }

    public void a(World world, Random random, ChunkSnapshot chunksnapshot, int i, int j, double d0) {
    }

    public static enum Type {

        NORMAL, EXTRA_TREES, MUTATED;

        private Type() {
        }
    }
}
