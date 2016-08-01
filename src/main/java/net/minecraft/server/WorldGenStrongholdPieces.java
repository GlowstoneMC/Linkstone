package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class WorldGenStrongholdPieces {

    private static final WorldGenStrongholdPieces.WorldGenStrongholdPieceWeight[] b = null;

    private static List<WorldGenStrongholdPieces.WorldGenStrongholdPieceWeight> c = null;

    private static Class<? extends WorldGenStrongholdPieces.WorldGenStrongholdPiece> d = null;

    static int a = 0;

    private static final WorldGenStrongholdPieces.WorldGenStrongholdStones e = null;

    public static void a() {
    }

    public static void b() {
    }

    private static boolean d() {
        return false;
    }

    private static WorldGenStrongholdPieces.WorldGenStrongholdPiece a(Class<? extends WorldGenStrongholdPieces.WorldGenStrongholdPiece> oclass, List<StructurePiece> list, Random random, int i, int j, int k, @Nullable EnumDirection enumdirection, int l) {
        return null;
    }

    private static WorldGenStrongholdPieces.WorldGenStrongholdPiece b(WorldGenStrongholdPieces.WorldGenStrongholdStart worldgenstrongholdpieces_worldgenstrongholdstart, List<StructurePiece> list, Random random, int i, int j, int k, EnumDirection enumdirection, int l) {
        return null;
    }

    private static StructurePiece c(WorldGenStrongholdPieces.WorldGenStrongholdStart worldgenstrongholdpieces_worldgenstrongholdstart, List<StructurePiece> list, Random random, int i, int j, int k, @Nullable EnumDirection enumdirection, int l) {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static final int[] b = null;

        static {
        }
    }

    static class WorldGenStrongholdStones extends StructurePiece.StructurePieceBlockSelector {

        private WorldGenStrongholdStones() {
        }

        public void a(Random random, int i, int j, int k, boolean flag) {
        }

        WorldGenStrongholdStones(Object object) {
        }
    }

    public static class WorldGenStrongholdPortalRoom extends WorldGenStrongholdPieces.WorldGenStrongholdPiece {

        private boolean a = false;

        public WorldGenStrongholdPortalRoom() {
        }

        public WorldGenStrongholdPortalRoom(int i, Random random, StructureBoundingBox structureboundingbox, EnumDirection enumdirection) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        public void a(StructurePiece structurepiece, List<StructurePiece> list, Random random) {
        }

        public static WorldGenStrongholdPieces.WorldGenStrongholdPortalRoom a(List<StructurePiece> list, Random random, int i, int j, int k, EnumDirection enumdirection, int l) {
            return null;
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }
    }

    public static class WorldGenStrongholdCrossing extends WorldGenStrongholdPieces.WorldGenStrongholdPiece {

        private boolean a = false;

        private boolean b = false;

        private boolean c = false;

        private boolean e = false;

        public WorldGenStrongholdCrossing() {
        }

        public WorldGenStrongholdCrossing(int i, Random random, StructureBoundingBox structureboundingbox, EnumDirection enumdirection) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        public void a(StructurePiece structurepiece, List<StructurePiece> list, Random random) {
        }

        public static WorldGenStrongholdPieces.WorldGenStrongholdCrossing a(List<StructurePiece> list, Random random, int i, int j, int k, EnumDirection enumdirection, int l) {
            return null;
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }
    }

    public static class WorldGenStrongholdLibrary extends WorldGenStrongholdPieces.WorldGenStrongholdPiece {

        private boolean a = false;

        public WorldGenStrongholdLibrary() {
        }

        public WorldGenStrongholdLibrary(int i, Random random, StructureBoundingBox structureboundingbox, EnumDirection enumdirection) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        public static WorldGenStrongholdPieces.WorldGenStrongholdLibrary a(List<StructurePiece> list, Random random, int i, int j, int k, EnumDirection enumdirection, int l) {
            return null;
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }
    }

    public static class WorldGenStrongholdPrison extends WorldGenStrongholdPieces.WorldGenStrongholdPiece {

        public WorldGenStrongholdPrison() {
        }

        public WorldGenStrongholdPrison(int i, Random random, StructureBoundingBox structureboundingbox, EnumDirection enumdirection) {
        }

        public void a(StructurePiece structurepiece, List<StructurePiece> list, Random random) {
        }

        public static WorldGenStrongholdPieces.WorldGenStrongholdPrison a(List<StructurePiece> list, Random random, int i, int j, int k, EnumDirection enumdirection, int l) {
            return null;
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }
    }

    public static class WorldGenStrongholdRoomCrossing extends WorldGenStrongholdPieces.WorldGenStrongholdPiece {

        protected int a = 0;

        public WorldGenStrongholdRoomCrossing() {
        }

        public WorldGenStrongholdRoomCrossing(int i, Random random, StructureBoundingBox structureboundingbox, EnumDirection enumdirection) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        public void a(StructurePiece structurepiece, List<StructurePiece> list, Random random) {
        }

        public static WorldGenStrongholdPieces.WorldGenStrongholdRoomCrossing a(List<StructurePiece> list, Random random, int i, int j, int k, EnumDirection enumdirection, int l) {
            return null;
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }
    }

    public static class WorldGenStrongholdRightTurn extends WorldGenStrongholdPieces.WorldGenStrongholdLeftTurn {

        public WorldGenStrongholdRightTurn() {
        }

        public void a(StructurePiece structurepiece, List<StructurePiece> list, Random random) {
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }
    }

    public static class WorldGenStrongholdLeftTurn extends WorldGenStrongholdPieces.WorldGenStrongholdPiece {

        public WorldGenStrongholdLeftTurn() {
        }

        public WorldGenStrongholdLeftTurn(int i, Random random, StructureBoundingBox structureboundingbox, EnumDirection enumdirection) {
        }

        public void a(StructurePiece structurepiece, List<StructurePiece> list, Random random) {
        }

        public static WorldGenStrongholdPieces.WorldGenStrongholdLeftTurn a(List<StructurePiece> list, Random random, int i, int j, int k, EnumDirection enumdirection, int l) {
            return null;
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }
    }

    public static class WorldGenStrongholdStairsStraight extends WorldGenStrongholdPieces.WorldGenStrongholdPiece {

        public WorldGenStrongholdStairsStraight() {
        }

        public WorldGenStrongholdStairsStraight(int i, Random random, StructureBoundingBox structureboundingbox, EnumDirection enumdirection) {
        }

        public void a(StructurePiece structurepiece, List<StructurePiece> list, Random random) {
        }

        public static WorldGenStrongholdPieces.WorldGenStrongholdStairsStraight a(List<StructurePiece> list, Random random, int i, int j, int k, EnumDirection enumdirection, int l) {
            return null;
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }
    }

    public static class WorldGenStrongholdChestCorridor extends WorldGenStrongholdPieces.WorldGenStrongholdPiece {

        private boolean a = false;

        public WorldGenStrongholdChestCorridor() {
        }

        public WorldGenStrongholdChestCorridor(int i, Random random, StructureBoundingBox structureboundingbox, EnumDirection enumdirection) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        public void a(StructurePiece structurepiece, List<StructurePiece> list, Random random) {
        }

        public static WorldGenStrongholdPieces.WorldGenStrongholdChestCorridor a(List<StructurePiece> list, Random random, int i, int j, int k, EnumDirection enumdirection, int l) {
            return null;
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }
    }

    public static class WorldGenStrongholdStairs extends WorldGenStrongholdPieces.WorldGenStrongholdPiece {

        private boolean a = false;

        private boolean b = false;

        public WorldGenStrongholdStairs() {
        }

        public WorldGenStrongholdStairs(int i, Random random, StructureBoundingBox structureboundingbox, EnumDirection enumdirection) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        public void a(StructurePiece structurepiece, List<StructurePiece> list, Random random) {
        }

        public static WorldGenStrongholdPieces.WorldGenStrongholdStairs a(List<StructurePiece> list, Random random, int i, int j, int k, EnumDirection enumdirection, int l) {
            return null;
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }
    }

    public static class WorldGenStrongholdStart extends WorldGenStrongholdPieces.WorldGenStrongholdStairs2 {

        public WorldGenStrongholdPieces.WorldGenStrongholdPieceWeight a = null;

        public WorldGenStrongholdPieces.WorldGenStrongholdPortalRoom b = null;

        public List<StructurePiece> c = null;

        public WorldGenStrongholdStart() {
        }

        public WorldGenStrongholdStart(int i, Random random, int j, int k) {
        }

        public BlockPosition a() {
            return null;
        }
    }

    public static class WorldGenStrongholdStairs2 extends WorldGenStrongholdPieces.WorldGenStrongholdPiece {

        private boolean a = false;

        public WorldGenStrongholdStairs2() {
        }

        public WorldGenStrongholdStairs2(int i, Random random, int j, int k) {
        }

        public WorldGenStrongholdStairs2(int i, Random random, StructureBoundingBox structureboundingbox, EnumDirection enumdirection) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        public void a(StructurePiece structurepiece, List<StructurePiece> list, Random random) {
        }

        public static WorldGenStrongholdPieces.WorldGenStrongholdStairs2 a(List<StructurePiece> list, Random random, int i, int j, int k, EnumDirection enumdirection, int l) {
            return null;
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }
    }

    public static class WorldGenStrongholdCorridor extends WorldGenStrongholdPieces.WorldGenStrongholdPiece {

        private int a = 0;

        public WorldGenStrongholdCorridor() {
        }

        public WorldGenStrongholdCorridor(int i, Random random, StructureBoundingBox structureboundingbox, EnumDirection enumdirection) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        public static StructureBoundingBox a(List<StructurePiece> list, Random random, int i, int j, int k, EnumDirection enumdirection) {
            return null;
        }

        public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
            return false;
        }
    }

    abstract static class WorldGenStrongholdPiece extends StructurePiece {

        protected WorldGenStrongholdPieces.WorldGenStrongholdPiece.WorldGenStrongholdPiece$WorldGenStrongholdDoorType d = null;

        public WorldGenStrongholdPiece() {
        }

        protected WorldGenStrongholdPiece(int i) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        protected void a(World world, Random random, StructureBoundingBox structureboundingbox, WorldGenStrongholdPieces.WorldGenStrongholdPiece.WorldGenStrongholdPiece$WorldGenStrongholdDoorType worldgenstrongholdpieces_worldgenstrongholdpiece_worldgenstrongholdpiece$worldgenstrongholddoortype, int i, int j, int k) {
        }

        protected WorldGenStrongholdPieces.WorldGenStrongholdPiece.WorldGenStrongholdPiece$WorldGenStrongholdDoorType a(Random random) {
            return null;
        }

        protected StructurePiece a(WorldGenStrongholdPieces.WorldGenStrongholdStart worldgenstrongholdpieces_worldgenstrongholdstart, List<StructurePiece> list, Random random, int i, int j) {
            return null;
        }

        protected StructurePiece b(WorldGenStrongholdPieces.WorldGenStrongholdStart worldgenstrongholdpieces_worldgenstrongholdstart, List<StructurePiece> list, Random random, int i, int j) {
            return null;
        }

        protected StructurePiece c(WorldGenStrongholdPieces.WorldGenStrongholdStart worldgenstrongholdpieces_worldgenstrongholdstart, List<StructurePiece> list, Random random, int i, int j) {
            return null;
        }

        protected static boolean a(StructureBoundingBox structureboundingbox) {
            return false;
        }

        public static enum WorldGenStrongholdPiece$WorldGenStrongholdDoorType {

            OPENING, WOOD_DOOR, GRATES, IRON_DOOR;

            private WorldGenStrongholdPiece$WorldGenStrongholdDoorType() {
            }
        }
    }

    static class WorldGenStrongholdPieceWeight {

        public Class<? extends WorldGenStrongholdPieces.WorldGenStrongholdPiece> a = null;

        public final int b = 0;

        public int c = 0;

        public int d = 0;

        public WorldGenStrongholdPieceWeight(Class<? extends WorldGenStrongholdPieces.WorldGenStrongholdPiece> oclass, int i, int j) {
        }

        public boolean a(int i) {
            return false;
        }

        public boolean a() {
            return false;
        }
    }
}
