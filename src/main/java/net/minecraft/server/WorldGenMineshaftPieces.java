package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class WorldGenMineshaftPieces {

    public static void a() {
    }

    private static WorldGenMineshaftPieces.c a(List<StructurePiece> list, Random random, int i, int j, int k, @Nullable EnumDirection enumdirection, int l, WorldGenMineshaft.Type worldgenmineshaft_type) {
        return null;
    }

    private static WorldGenMineshaftPieces.c b(StructurePiece structurepiece, List<StructurePiece> list, Random random, int i, int j, int k, EnumDirection enumdirection, int l) {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static final int[] b = null;

        static {
        }
    }

    public static class WorldGenMineshaftStairs extends WorldGenMineshaftPieces.c {

        public WorldGenMineshaftStairs() {
        }

        public WorldGenMineshaftStairs(int i, Random random, StructureBoundingBox structureboundingbox, EnumDirection enumdirection, WorldGenMineshaft.Type worldgenmineshaft_type) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        public static StructureBoundingBox a(List<StructurePiece> list, Random random, int i, int j, int k, EnumDirection enumdirection) {
            return null;
        }

        public void a(StructurePiece structurepiece, List<StructurePiece> list, Random random) {
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }
    }

    public static class WorldGenMineshaftCross extends WorldGenMineshaftPieces.c {

        private EnumDirection b = null;

        private boolean c = false;

        public WorldGenMineshaftCross() {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        public WorldGenMineshaftCross(int i, Random random, StructureBoundingBox structureboundingbox, @Nullable EnumDirection enumdirection, WorldGenMineshaft.Type worldgenmineshaft_type) {
        }

        public static StructureBoundingBox a(List<StructurePiece> list, Random random, int i, int j, int k, EnumDirection enumdirection) {
            return null;
        }

        public void a(StructurePiece structurepiece, List<StructurePiece> list, Random random) {
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }

        private void b(World world, StructureBoundingBox structureboundingbox, int i, int j, int k, int l) {
        }
    }

    public static class WorldGenMineshaftCorridor extends WorldGenMineshaftPieces.c {

        private boolean b = false;

        private boolean c = false;

        private boolean d = false;

        private int e = 0;

        public WorldGenMineshaftCorridor() {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        public WorldGenMineshaftCorridor(int i, Random random, StructureBoundingBox structureboundingbox, EnumDirection enumdirection, WorldGenMineshaft.Type worldgenmineshaft_type) {
        }

        public static StructureBoundingBox a(List<StructurePiece> list, Random random, int i, int j, int k, EnumDirection enumdirection) {
            return null;
        }

        public void a(StructurePiece structurepiece, List<StructurePiece> list, Random random) {
        }

        protected boolean a(World world, StructureBoundingBox structureboundingbox, Random random, int i, int j, int k, MinecraftKey minecraftkey) {
            return false;
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }

        private void a(World world, StructureBoundingBox structureboundingbox, int i, int j, int k, int l, int i1, Random random) {
        }

        private void a(World world, StructureBoundingBox structureboundingbox, Random random, float f, int i, int j, int k) {
        }
    }

    public static class WorldGenMineshaftRoom extends WorldGenMineshaftPieces.c {

        private final List<StructureBoundingBox> b = null;

        public WorldGenMineshaftRoom() {
        }

        public WorldGenMineshaftRoom(int i, Random random, int j, int k, WorldGenMineshaft.Type worldgenmineshaft_type) {
        }

        public void a(StructurePiece structurepiece, List<StructurePiece> list, Random random) {
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }

        public void a(int i, int j, int k) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }
    }

    abstract static class c extends StructurePiece {

        protected WorldGenMineshaft.Type a = null;

        public c() {
        }

        public c(int i, WorldGenMineshaft.Type worldgenmineshaft_type) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        protected IBlockData F_() {
            return null;
        }

        protected IBlockData b() {
            return null;
        }

        protected boolean a(World world, StructureBoundingBox structureboundingbox, int i, int j, int k, int l) {
            return false;
        }
    }
}
