package net.minecraft.server;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class ChunkProviderHell implements ChunkGenerator {

    protected static final IBlockData a = null;

    protected static final IBlockData b = null;

    protected static final IBlockData c = null;

    protected static final IBlockData d = null;

    protected static final IBlockData e = null;

    protected static final IBlockData f = null;

    private final World n = null;

    private final boolean o = false;

    private final Random p = null;

    private double[] q = null;

    private double[] r = null;

    private double[] s = null;

    private double[] t = null;

    private final NoiseGeneratorOctaves u = null;

    private final NoiseGeneratorOctaves v = null;

    private final NoiseGeneratorOctaves w = null;

    private final NoiseGeneratorOctaves x = null;

    private final NoiseGeneratorOctaves y = null;

    public final NoiseGeneratorOctaves g = null;

    public final NoiseGeneratorOctaves h = null;

    private final WorldGenFire z = null;

    private final WorldGenLightStone1 A = null;

    private final WorldGenLightStone2 B = null;

    private final WorldGenerator C = null;

    private final WorldGenerator D = null;

    private final WorldGenHellLava E = null;

    private final WorldGenHellLava F = null;

    private final WorldGenMushrooms G = null;

    private final WorldGenMushrooms H = null;

    private final WorldGenNether I = null;

    private final WorldGenBase J = null;

    double[] i = null;

    double[] j = null;

    double[] k = null;

    double[] l = null;

    double[] m = null;

    public ChunkProviderHell(World world, boolean flag, long i) {
    }

    public void a(int i, int j, ChunkSnapshot chunksnapshot) {
    }

    public void b(int i, int j, ChunkSnapshot chunksnapshot) {
    }

    public Chunk getOrCreateChunk(int i, int j) {
        return null;
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
