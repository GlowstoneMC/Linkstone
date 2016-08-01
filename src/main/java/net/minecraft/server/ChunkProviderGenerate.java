package net.minecraft.server;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class ChunkProviderGenerate implements ChunkGenerator {

    protected static final IBlockData a = null;

    private final Random i = null;

    private final NoiseGeneratorOctaves j = null;

    private final NoiseGeneratorOctaves k = null;

    private final NoiseGeneratorOctaves l = null;

    private final NoiseGenerator3 m = null;

    public NoiseGeneratorOctaves b = null;

    public NoiseGeneratorOctaves c = null;

    public NoiseGeneratorOctaves d = null;

    private final World n = null;

    private final boolean o = false;

    private final WorldType p = null;

    private final double[] q = null;

    private final float[] r = null;

    private CustomWorldSettingsFinal s = null;

    private IBlockData t = null;

    private double[] u = null;

    private final WorldGenBase v = null;

    private final WorldGenStronghold w = null;

    private final WorldGenVillage x = null;

    private final WorldGenMineshaft y = null;

    private final WorldGenLargeFeature z = null;

    private final WorldGenBase A = null;

    private final WorldGenMonument B = null;

    private BiomeBase[] C = null;

    double[] e = null;

    double[] f = null;

    double[] g = null;

    double[] h = null;

    public ChunkProviderGenerate(World world, long i, boolean flag, String s) {
    }

    public void a(int i, int j, ChunkSnapshot chunksnapshot) {
    }

    public void a(int i, int j, ChunkSnapshot chunksnapshot, BiomeBase[] abiomebase) {
    }

    public Chunk getOrCreateChunk(int i, int j) {
        return null;
    }

    private void a(int i, int j, int k) {
    }

    public void recreateStructures(int i, int j) {
    }

    public boolean a(Chunk chunk, int i, int j) {
        return false;
    }

    public List<BiomeBase.BiomeMeta> getMobsFor(EnumCreatureType enumcreaturetype, BlockPosition blockposition) {
        return null;
    }

    @Nullable
    public BlockPosition findNearestMapFeature(World world, String s, BlockPosition blockposition) {
        return null;
    }

    public void recreateStructures(Chunk chunk, int i, int j) {
    }
}
