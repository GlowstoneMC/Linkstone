package net.minecraft.server;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class ChunkProviderTheEnd implements ChunkGenerator {

    private final Random h = null;

    protected static final IBlockData a = null;

    protected static final IBlockData b = null;

    private final NoiseGeneratorOctaves i = null;

    private final NoiseGeneratorOctaves j = null;

    private final NoiseGeneratorOctaves k = null;

    public NoiseGeneratorOctaves c = null;

    public NoiseGeneratorOctaves d = null;

    private final World l = null;

    private final boolean m = false;

    private final WorldGenEndCity n = null;

    private final NoiseGenerator3Handler o = null;

    private double[] p = null;

    private BiomeBase[] q = null;

    double[] e = null;

    double[] f = null;

    double[] g = null;

    private final WorldGenEndIsland r = null;

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
