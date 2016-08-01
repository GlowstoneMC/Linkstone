package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class WorldGenNether extends StructureGenerator {

    private final List<BiomeBase.BiomeMeta> a = null;

    public WorldGenNether() {
    }

    public String a() {
        return null;
    }

    public List<BiomeBase.BiomeMeta> b() {
        return null;
    }

    protected boolean a(int i, int j) {
        return false;
    }

    protected StructureStart b(int i, int j) {
        return null;
    }

    public static class WorldGenNetherStart extends StructureStart {

        public WorldGenNetherStart() {
        }

        public WorldGenNetherStart(World world, Random random, int i, int j) {
        }
    }
}
