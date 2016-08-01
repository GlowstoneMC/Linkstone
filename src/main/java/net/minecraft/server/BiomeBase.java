package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class BiomeBase {

    private static final Logger y;

    protected static final IBlockData a;

    protected static final IBlockData b;

    protected static final IBlockData c;

    protected static final IBlockData d;

    protected static final IBlockData e;

    protected static final IBlockData f;

    protected static final IBlockData g;

    protected static final IBlockData h;

    public static final Set<BiomeBase> i;

    public static final RegistryBlockID<BiomeBase> j;

    protected static final NoiseGenerator3 k;

    protected static final NoiseGenerator3 l;

    protected static final WorldGenTallPlant m;

    protected static final WorldGenTrees n;

    protected static final WorldGenBigTree o;

    protected static final WorldGenSwampTree p;

    public static final RegistryMaterials<MinecraftKey, BiomeBase> REGISTRY_ID;

    private final String z;

    private final float A;

    private final float B;

    private final float C;

    private final float D;

    private final int E;

    private final boolean F;

    private final boolean G;

    @Nullable
    private final String H;

    public IBlockData r;

    public IBlockData s;

    public BiomeDecorator t;

    protected List<BiomeBase.BiomeMeta> u;

    protected List<BiomeBase.BiomeMeta> v;

    protected List<BiomeBase.BiomeMeta> w;

    protected List<BiomeBase.BiomeMeta> x;

    public static int a(BiomeBase biomebase) {
        return 0;
    }

    @Nullable
    public static BiomeBase a(int i) {
        return null;
    }

    @Nullable
    public static BiomeBase b(BiomeBase biomebase) {
        return null;
    }

    protected BiomeBase(BiomeBase.a biomebase_a) {
    }

    protected BiomeDecorator a() {
        return null;
    }

    public boolean b() {
        return false;
    }

    public WorldGenTreeAbstract a(Random random) {
        return null;
    }

    public WorldGenerator b(Random random) {
        return null;
    }

    public BlockFlowers.EnumFlowerVarient a(Random random, BlockPosition blockposition) {
        return null;
    }

    public List<BiomeBase.BiomeMeta> getMobs(EnumCreatureType enumcreaturetype) {
        return null;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public float f() {
        return 0.0F;
    }

    public final float a(BlockPosition blockposition) {
        return 0.0F;
    }

    public void a(World world, Random random, BlockPosition blockposition) {
    }

    public void a(World world, Random random, ChunkSnapshot chunksnapshot, int i, int j, double d0) {
    }

    public final void b(World world, Random random, ChunkSnapshot chunksnapshot, int i, int j, double d0) {
    }

    public Class<? extends BiomeBase> g() {
        return null;
    }

    public BiomeBase.EnumTemperature h() {
        return null;
    }

    @Nullable
    public static BiomeBase getBiome(int i) {
        return null;
    }

    public static BiomeBase getBiome(int i, BiomeBase biomebase) {
        return null;
    }

    public boolean i() {
        return false;
    }

    public final float j() {
        return 0.0F;
    }

    public final float getHumidity() {
        return 0.0F;
    }

    public final String l() {
        return null;
    }

    public final float m() {
        return 0.0F;
    }

    public final float getTemperature() {
        return 0.0F;
    }

    public final boolean p() {
        return false;
    }

    public static void q() {
    }

    private static void a(int i, String s, BiomeBase biomebase) {
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }

    public static class a {

        private final String a;

        private float b;

        private float c;

        private float d;

        private float e;

        private int f;

        private boolean g;

        private boolean h;

        @Nullable
        private String i;

        public a(String s) {
        }

        protected BiomeBase.a a(float f) {
            return null;
        }

        protected BiomeBase.a b(float f) {
            return null;
        }

        protected BiomeBase.a c(float f) {
            return null;
        }

        protected BiomeBase.a d(float f) {
            return null;
        }

        protected BiomeBase.a a() {
            return null;
        }

        protected BiomeBase.a b() {
            return null;
        }

        protected BiomeBase.a a(int i) {
            return null;
        }

        protected BiomeBase.a a(String s) {
            return null;
        }
    }

    public static class BiomeMeta extends WeightedRandom.WeightedRandomChoice {

        public Class<? extends EntityInsentient> b;

        public int c;

        public int d;

        public BiomeMeta(Class<? extends EntityInsentient> oclass, int i, int j, int k) {
        }

        public String toString() {
            return null;
        }
    }

    public static enum EnumTemperature {

        OCEAN, COLD, MEDIUM, WARM;

        private EnumTemperature() {
        }
    }
}
