package net.minecraft.server;

import java.util.Random;

public class BiomeTaiga extends BiomeBase {

    private static final WorldGenTaiga1 y;

    private static final WorldGenTaiga2 z;

    private static final WorldGenMegaTree A;

    private static final WorldGenMegaTree B;

    private static final WorldGenTaigaStructure C;

    private final BiomeTaiga.Type D;

    public BiomeTaiga(BiomeTaiga.Type biometaiga_type, BiomeBase.a biomebase_a) {
    }

    public WorldGenTreeAbstract a(Random random) {
        return null;
    }

    public WorldGenerator b(Random random) {
        return null;
    }

    public void a(World world, Random random, BlockPosition blockposition) {
    }

    public void a(World world, Random random, ChunkSnapshot chunksnapshot, int i, int j, double d0) {
    }

    public static enum Type {

        NORMAL, MEGA, MEGA_SPRUCE;

        private Type() {
        }
    }
}
