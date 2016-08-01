package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class WorldGenStronghold extends StructureGenerator {

    private final List<BiomeBase> a = null;

    private boolean b = false;

    private ChunkCoordIntPair[] d = null;

    private double h = 0.0;

    private int i = 0;

    public WorldGenStronghold() {
    }

    public WorldGenStronghold(Map<String, String> map) {
    }

    public String a() {
        return null;
    }

    public BlockPosition getNearestGeneratedFeature(World world, BlockPosition blockposition) {
        return null;
    }

    protected boolean a(int i, int j) {
        return false;
    }

    private void c() {
    }

    protected List<BlockPosition> G_() {
        return null;
    }

    protected StructureStart b(int i, int j) {
        return null;
    }

    public static class WorldGenStronghold2Start extends StructureStart {

        public WorldGenStronghold2Start() {
        }

        public WorldGenStronghold2Start(World world, Random random, int i, int j) {
        }
    }
}
