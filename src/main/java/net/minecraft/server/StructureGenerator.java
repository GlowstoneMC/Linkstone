package net.minecraft.server;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class StructureGenerator extends WorldGenBase {

    private PersistentStructure a = null;

    protected Long2ObjectMap<StructureStart> c = null;

    public StructureGenerator() {
    }

    public abstract String a();

    protected final synchronized void a(World world, final int i, final int j, int k, int l, ChunkSnapshot chunksnapshot) {
    }

    public synchronized boolean a(World world, Random random, ChunkCoordIntPair chunkcoordintpair) {
        return false;
    }

    public boolean b(BlockPosition blockposition) {
        return false;
    }

    protected synchronized StructureStart c(BlockPosition blockposition) {
        return null;
    }

    public synchronized boolean b(World world, BlockPosition blockposition) {
        return false;
    }

    public synchronized BlockPosition getNearestGeneratedFeature(World world, BlockPosition blockposition) {
        return null;
    }

    protected List<BlockPosition> G_() {
        return null;
    }

    protected synchronized void a(World world) {
    }

    private void a(int i, int j, StructureStart structurestart) {
    }

    protected abstract boolean a(int i, int j);

    protected abstract StructureStart b(int i, int j);
}
