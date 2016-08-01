package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class WorldGenLargeFeature extends StructureGenerator {

    private static final List<BiomeBase> a = null;

    private final List<BiomeBase.BiomeMeta> b = null;

    private int d = 0;

    private final int h = 0;

    public WorldGenLargeFeature() {
    }

    public WorldGenLargeFeature(Map<String, String> map) {
    }

    public String a() {
        return null;
    }

    protected boolean a(int i, int j) {
        return false;
    }

    protected StructureStart b(int i, int j) {
        return null;
    }

    public boolean a(BlockPosition blockposition) {
        return false;
    }

    public List<BiomeBase.BiomeMeta> b() {
        return null;
    }

    public static class WorldGenLargeFeatureStart extends StructureStart {

        public WorldGenLargeFeatureStart() {
        }

        public WorldGenLargeFeatureStart(World world, Random random, int i, int j) {
        }

        public WorldGenLargeFeatureStart(World world, Random random, int i, int j, BiomeBase biomebase) {
        }
    }
}
