package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class WorldGenEndCityPieces {

    public static final DefinedStructureManager a;

    private static final DefinedStructureInfo b;

    private static final DefinedStructureInfo c;

    private static final WorldGenEndCityPieces.PieceGenerator d;

    private static final List<Tuple<EnumBlockRotation, BlockPosition>> e;

    private static final WorldGenEndCityPieces.PieceGenerator f;

    private static final WorldGenEndCityPieces.PieceGenerator g;

    private static final List<Tuple<EnumBlockRotation, BlockPosition>> h;

    private static final WorldGenEndCityPieces.PieceGenerator i;

    public static void a() {
    }

    private static WorldGenEndCityPieces.Piece b(WorldGenEndCityPieces.Piece worldgenendcitypieces_piece, BlockPosition blockposition, String s, EnumBlockRotation enumblockrotation, boolean flag) {
        return null;
    }

    public static void a(BlockPosition blockposition, EnumBlockRotation enumblockrotation, List<StructurePiece> list, Random random) {
    }

    private static WorldGenEndCityPieces.Piece b(List<StructurePiece> list, WorldGenEndCityPieces.Piece worldgenendcitypieces_piece) {
        return null;
    }

    private static boolean b(WorldGenEndCityPieces.PieceGenerator worldgenendcitypieces_piecegenerator, int i, WorldGenEndCityPieces.Piece worldgenendcitypieces_piece, BlockPosition blockposition, List<StructurePiece> list, Random random) {
        return false;
    }

    interface PieceGenerator {

        void a() {
        }

        boolean a(int i, WorldGenEndCityPieces.Piece worldgenendcitypieces_piece, BlockPosition blockposition, List<StructurePiece> list, Random random) {
            return false;
        }
    }

    public static class Piece extends DefinedStructurePiece {

        private String d;

        private EnumBlockRotation e;

        private boolean f;

        public Piece() {
        }

        public Piece(String s, BlockPosition blockposition, EnumBlockRotation enumblockrotation, boolean flag) {
        }

        private void a(BlockPosition blockposition) {
        }

        protected void a(NBTTagCompound nbttagcompound) {
        }

        protected void b(NBTTagCompound nbttagcompound) {
        }

        protected void a(String s, BlockPosition blockposition, World world, Random random, StructureBoundingBox structureboundingbox) {
        }
    }
}
