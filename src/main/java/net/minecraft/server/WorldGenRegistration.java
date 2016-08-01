package net.minecraft.server;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class WorldGenRegistration {

    public static void a() {
    }

    static class SyntheticClass_1 {
    }

    public static class b extends WorldGenRegistration.WorldGenScatteredPiece {

        private static final MinecraftKey e = null;

        private static final MinecraftKey f = null;

        private static final MinecraftKey g = null;

        public b() {
        }

        public b(Random random, int i, int j) {
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }
    }

    public static class WorldGenWitchHut extends WorldGenRegistration.WorldGenScatteredPiece {

        private boolean e = false;

        public WorldGenWitchHut() {
        }

        public WorldGenWitchHut(Random random, int i, int j) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }
    }

    public static class WorldGenJungleTemple extends WorldGenRegistration.WorldGenScatteredPiece {

        private boolean e = false;

        private boolean f = false;

        private boolean g = false;

        private boolean h = false;

        private static final WorldGenRegistration.WorldGenJungleTemple.WorldGenJungleTemple$WorldGenJungleTemplePiece i = null;

        public WorldGenJungleTemple() {
        }

        public WorldGenJungleTemple(Random random, int i, int j) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }

        static class WorldGenJungleTemple$WorldGenJungleTemplePiece extends StructurePiece.StructurePieceBlockSelector {

            private WorldGenJungleTemple$WorldGenJungleTemplePiece() {
            }

            public void a(Random random, int i, int j, int k, boolean flag) {
            }

            WorldGenJungleTemple$WorldGenJungleTemplePiece(WorldGenRegistration.SyntheticClass_1 worldgenregistration_syntheticclass_1) {
            }
        }
    }

    public static class WorldGenPyramidPiece extends WorldGenRegistration.WorldGenScatteredPiece {

        private final boolean[] e = null;

        public WorldGenPyramidPiece() {
        }

        public WorldGenPyramidPiece(Random random, int i, int j) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }
    }

    abstract static class WorldGenScatteredPiece extends StructurePiece {

        protected int a = 0;

        protected int b = 0;

        protected int c = 0;

        protected int d = 0;

        public WorldGenScatteredPiece() {
        }

        protected WorldGenScatteredPiece(Random random, int i, int j, int k, int l, int i1, int j1) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        protected boolean a(World world, StructureBoundingBox structureboundingbox, int i) {
            return false;
        }
    }
}
