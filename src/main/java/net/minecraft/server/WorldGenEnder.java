package net.minecraft.server;

import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;

public class WorldGenEnder extends WorldGenerator {

    private boolean a;

    private WorldGenEnder.Spike b;

    private BlockPosition c;

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

        private final int a;

        private final int b;

        private final int c;

        private final int d;

        private final boolean e;

        private final AxisAlignedBB f;

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
