package net.minecraft.server;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class WorldGenVillage extends StructureGenerator {

    public static final List<BiomeBase> a;

    private int b;

    private int d;

    private final int h;

    public WorldGenVillage() {
    }

    public WorldGenVillage(Map<String, String> map) {
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

    public static class WorldGenVillageStart extends StructureStart {

        private boolean c;

        public WorldGenVillageStart() {
        }

        public WorldGenVillageStart(World world, Random random, int i, int j, int k) {
        }

        public boolean a() {
            return false;
        }

        public void a(NBTTagCompound nbttagcompound) {
        }

        public void b(NBTTagCompound nbttagcompound) {
        }
    }
}
