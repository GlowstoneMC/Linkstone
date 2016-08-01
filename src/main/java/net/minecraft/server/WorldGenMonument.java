package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

public class WorldGenMonument extends StructureGenerator {

    private int d = 0;

    private int h = 0;

    public static final List<BiomeBase> a = null;

    public static final List<BiomeBase> b = null;

    private static final List<BiomeBase.BiomeMeta> i = null;

    public WorldGenMonument() {
    }

    public WorldGenMonument(Map<String, String> map) {
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

    public List<BiomeBase.BiomeMeta> b() {
        return null;
    }

    static {
    }

    public static class WorldGenMonumentStart extends StructureStart {

        private final Set<ChunkCoordIntPair> c = null;

        private boolean d = false;

        public WorldGenMonumentStart() {
        }

        public WorldGenMonumentStart(World world, Random random, int i, int j) {
        }

        private void b(World world, Random random, int i, int j) {
        }

        public void a(World world, Random random, StructureBoundingBox structureboundingbox) {
        }

        public boolean a(ChunkCoordIntPair chunkcoordintpair) {
            return false;
        }

        public void b(ChunkCoordIntPair chunkcoordintpair) {
        }

        public void a(NBTTagCompound nbttagcompound) {
        }

        public void b(NBTTagCompound nbttagcompound) {
        }
    }
}
