package net.minecraft.server;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class ChunkProviderHell implements ChunkGenerator {

    protected static final IBlockData a;

    protected static final IBlockData b;

    protected static final IBlockData c;

    protected static final IBlockData d;

    protected static final IBlockData e;

    protected static final IBlockData f;

    private final World n;

    private final boolean o;

    private final Random p;

    private double[] q;

    private double[] r;

    private double[] s;

    private double[] t;

    private final NoiseGeneratorOctaves u;

    private final NoiseGeneratorOctaves v;

    private final NoiseGeneratorOctaves w;

    private final NoiseGeneratorOctaves x;

    private final NoiseGeneratorOctaves y;

    public final NoiseGeneratorOctaves g;

    public final NoiseGeneratorOctaves h;

    private final WorldGenFire z;

    private final WorldGenLightStone1 A;

    private final WorldGenLightStone2 B;

    private final WorldGenerator C;

    private final WorldGenerator D;

    private final WorldGenHellLava E;

    private final WorldGenHellLava F;

    private final WorldGenMushrooms G;

    private final WorldGenMushrooms H;

    private final WorldGenNether I;

    private final WorldGenBase J;

    double[] i;

    double[] j;

    double[] k;

    double[] l;

    double[] m;

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
