package net.minecraft.server;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public abstract class StructurePiece {

    protected StructureBoundingBox l;

    @Nullable
    private EnumDirection a;

    private EnumBlockMirror b;

    private EnumBlockRotation c;

    protected int m;

    public StructurePiece() {
    }

    protected StructurePiece(int i) {
    }

    public final NBTTagCompound c() {
        return null;
    }

    protected abstract void a(NBTTagCompound nbttagcompound);

    public void a(World world, NBTTagCompound nbttagcompound) {
    }

    protected abstract void b(NBTTagCompound nbttagcompound);

    public void a(StructurePiece structurepiece, List<StructurePiece> list, Random random) {
    }

    public abstract boolean a(World world, Random random, StructureBoundingBox structureboundingbox);

    public StructureBoundingBox d() {
        return null;
    }

    public int e() {
        return 0;
    }

    public static StructurePiece a(List<StructurePiece> list, StructureBoundingBox structureboundingbox) {
        return null;
    }

    public BlockPosition a() {
        return null;
    }

    protected boolean a(World world, StructureBoundingBox structureboundingbox) {
        return false;
    }

    protected int a(int i, int j) {
        return 0;
    }

    protected int d(int i) {
        return 0;
    }

    protected int b(int i, int j) {
        return 0;
    }

    protected void a(World world, IBlockData iblockdata, int i, int j, int k, StructureBoundingBox structureboundingbox) {
    }

    protected IBlockData a(World world, int i, int j, int k, StructureBoundingBox structureboundingbox) {
        return null;
    }

    protected int b(World world, int i, int j, int k, StructureBoundingBox structureboundingbox) {
        return 0;
    }

    protected void a(World world, StructureBoundingBox structureboundingbox, int i, int j, int k, int l, int i1, int j1) {
    }

    protected void a(World world, StructureBoundingBox structureboundingbox, int i, int j, int k, int l, int i1, int j1, IBlockData iblockdata, IBlockData iblockdata1, boolean flag) {
    }

    protected void a(World world, StructureBoundingBox structureboundingbox, int i, int j, int k, int l, int i1, int j1, boolean flag, Random random, StructurePiece.StructurePieceBlockSelector structurepiece_structurepieceblockselector) {
    }

    protected void a(World world, StructureBoundingBox structureboundingbox, Random random, float f, int i, int j, int k, int l, int i1, int j1, IBlockData iblockdata, IBlockData iblockdata1, boolean flag, int k1) {
    }

    protected void a(World world, StructureBoundingBox structureboundingbox, Random random, float f, int i, int j, int k, IBlockData iblockdata) {
    }

    protected void a(World world, StructureBoundingBox structureboundingbox, int i, int j, int k, int l, int i1, int j1, IBlockData iblockdata, boolean flag) {
    }

    protected void c(World world, int i, int j, int k, StructureBoundingBox structureboundingbox) {
    }

    protected void b(World world, IBlockData iblockdata, int i, int j, int k, StructureBoundingBox structureboundingbox) {
    }

    protected boolean a(World world, StructureBoundingBox structureboundingbox, Random random, int i, int j, int k, MinecraftKey minecraftkey) {
        return false;
    }

    protected boolean a(World world, StructureBoundingBox structureboundingbox, Random random, int i, int j, int k, EnumDirection enumdirection, MinecraftKey minecraftkey) {
        return false;
    }

    protected void a(World world, StructureBoundingBox structureboundingbox, Random random, int i, int j, int k, EnumDirection enumdirection, BlockDoor blockdoor) {
    }

    public void a(int i, int j, int k) {
    }

    @Nullable
    public EnumDirection f() {
        return null;
    }

    public void a(@Nullable EnumDirection enumdirection) {
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }

    public abstract static class StructurePieceBlockSelector {

        protected IBlockData a;

        protected StructurePieceBlockSelector() {
        }

        public abstract void a(Random random, int i, int j, int k, boolean flag);

        public IBlockData a() {
            return null;
        }
    }
}
