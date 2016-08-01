package net.minecraft.server;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class ChunkProviderGenerate implements ChunkGenerator {

    protected static final IBlockData a;

    private final Random i;

    private final NoiseGeneratorOctaves j;

    private final NoiseGeneratorOctaves k;

    private final NoiseGeneratorOctaves l;

    private final NoiseGenerator3 m;

    public NoiseGeneratorOctaves b;

    public NoiseGeneratorOctaves c;

    public NoiseGeneratorOctaves d;

    private final World n;

    private final boolean o;

    private final WorldType p;

    private final double[] q;

    private final float[] r;

    private CustomWorldSettingsFinal s;

    private IBlockData t;

    private double[] u;

    private final WorldGenBase v;

    private final WorldGenStronghold w;

    private final WorldGenVillage x;

    private final WorldGenMineshaft y;

    private final WorldGenLargeFeature z;

    private final WorldGenBase A;

    private final WorldGenMonument B;

    private BiomeBase[] C;

    double[] e;

    double[] f;

    double[] g;

    double[] h;

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
