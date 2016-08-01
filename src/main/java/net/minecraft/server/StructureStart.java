package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class StructureStart {

    protected List<StructurePiece> a;

    protected StructureBoundingBox b;

    private int c;

    private int d;

    public StructureStart() {
    }

    public StructureStart(int i, int j) {
    }

    public StructureBoundingBox b() {
        return null;
    }

    public List<StructurePiece> c() {
        return null;
    }

    public void a(World world, Random random, StructureBoundingBox structureboundingbox) {
    }

    protected void d() {
    }

    public NBTTagCompound a(int i, int j) {
        return null;
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void a(World world, NBTTagCompound nbttagcompound) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    protected void a(World world, Random random, int i) {
    }

    protected void a(World world, Random random, int i, int j) {
    }

    public boolean a() {
        return false;
    }

    public boolean a(ChunkCoordIntPair chunkcoordintpair) {
        return false;
    }

    public void b(ChunkCoordIntPair chunkcoordintpair) {
    }

    public int e() {
        return 0;
    }

    public int f() {
        return 0;
    }
}
