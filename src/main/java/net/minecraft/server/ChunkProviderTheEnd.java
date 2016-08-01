package net.minecraft.server;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class ChunkProviderTheEnd implements ChunkGenerator {

    private final Random h;

    protected static final IBlockData a;

    protected static final IBlockData b;

    private final NoiseGeneratorOctaves i;

    private final NoiseGeneratorOctaves j;

    private final NoiseGeneratorOctaves k;

    public NoiseGeneratorOctaves c;

    public NoiseGeneratorOctaves d;

    private final World l;

    private final boolean m;

    private final WorldGenEndCity n;

    private final NoiseGenerator3Handler o;

    private double[] p;

    private BiomeBase[] q;

    double[] e;

    double[] f;

    double[] g;

    private final WorldGenEndIsland r;

    public ChunkProviderTheEnd(World world, boolean flag, long i) {
    }

    public void a(int i, int j, ChunkSnapshot chunksnapshot) {
    }

    public void a(ChunkSnapshot chunksnapshot) {
    }

    public Chunk getOrCreateChunk(int i, int j) {
        return null;
    }

    private float a(int i, int j, int k, int l) {
        return 0.0F;
    }

    public boolean c(int i, int j) {
        return false;
    }

    private double[] a(double[] adouble, int i, int j, int k, int l, int i1, int j1) {
        return null;
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
