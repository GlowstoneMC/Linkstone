package net.minecraft.server;

import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;

public class WorldGenEnder extends WorldGenerator {

    private boolean a = false;

    private WorldGenEnder.Spike b = null;

    private BlockPosition c = null;

    public WorldGenEnder() {
    }

    public void a(WorldGenEnder.Spike worldgenender_spike) {
    }

    public void a(boolean flag) {
    }

    public boolean generate(World world, Random random, BlockPosition blockposition) {
        return false;
    }

    public void a(@Nullable BlockPosition blockposition) {
    }

    public static class Spike {

        private final int a = 0;

        private final int b = 0;

        private final int c = 0;

        private final int d = 0;

        private final boolean e = false;

        private final AxisAlignedBB f = null;

        public Spike(int i, int j, int k, int l, boolean flag) {
        }

        public boolean a(BlockPosition blockposition) {
            return false;
        }

        public int a() {
            return 0;
        }

        public int b() {
            return 0;
        }

        public int c() {
            return 0;
        }

        public int d() {
            return 0;
        }

        public boolean e() {
            return false;
        }

        public AxisAlignedBB f() {
            return null;
        }
    }
}
