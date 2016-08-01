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

    private static final Logger y = null;

    protected static final IBlockData a = null;

    protected static final IBlockData b = null;

    protected static final IBlockData c = null;

    protected static final IBlockData d = null;

    protected static final IBlockData e = null;

    protected static final IBlockData f = null;

    protected static final IBlockData g = null;

    protected static final IBlockData h = null;

    public static final Set<BiomeBase> i = null;

    public static final RegistryBlockID<BiomeBase> j = null;

    protected static final NoiseGenerator3 k = null;

    protected static final NoiseGenerator3 l = null;

    protected static final WorldGenTallPlant m = null;

    protected static final WorldGenTrees n = null;

    protected static final WorldGenBigTree o = null;

    protected static final WorldGenSwampTree p = null;

    public static final RegistryMaterials<MinecraftKey, BiomeBase> REGISTRY_ID = null;

    private final String z = null;

    private final float A = 0.0F;

    private final float B = 0.0F;

    private final float C = 0.0F;

    private final float D = 0.0F;

    private final int E = 0;

    private final boolean F = false;

    private final boolean G = false;

    @Nullable
    private final String H = null;

    public IBlockData r = null;

    public IBlockData s = null;

    public BiomeDecorator t = null;

    protected List<BiomeBase.BiomeMeta> u = null;

    protected List<BiomeBase.BiomeMeta> v = null;

    protected List<BiomeBase.BiomeMeta> w = null;

    protected List<BiomeBase.BiomeMeta> x = null;

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

        static final int[] a = null;

        static {
        }
    }

    public static class a {

        private final String a = null;

        private float b = 0.0F;

        private float c = 0.0F;

        private float d = 0.0F;

        private float e = 0.0F;

        private int f = 0;

        private boolean g = false;

        private boolean h = false;

        @Nullable
        private String i = null;

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

        public Class<? extends EntityInsentient> b = null;

        public int c = 0;

        public int d = 0;

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
