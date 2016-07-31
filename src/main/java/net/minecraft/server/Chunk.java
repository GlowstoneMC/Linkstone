package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.google.common.collect.Lists;
// CraftBukkit
import org.bukkit.Server;

// CraftBukkit
public class Chunk {

    private static final Logger e;

    public static final ChunkSection a;

    private final ChunkSection[] sections;

    private final byte[] g;

    private final int[] h;

    private final boolean[] i;

    private boolean j;

    public final World world;

    public final int[] heightMap;

    public final int locX;

    public final int locZ;

    private boolean m;

    public final Map<BlockPosition, TileEntity> tileEntities;

    public final EntitySlice<Entity>[] entitySlices;

    private boolean done;

    private boolean lit;

    private boolean r;

    private boolean s;

    private boolean t;

    private long lastSaved;

    private int v;

    private long w;

    private int x;

    private ConcurrentLinkedQueue<BlockPosition> y;

    public boolean d;

    // CraftBukkit start - Neighbor loaded cache for chunk lighting and entity ticking
    private int neighbors;

    public long chunkKey;

    public boolean areNeighborsLoaded(final int radius) {
        return false;
    }

    public void setNeighborLoaded(final int x, final int z) {
    }

    public void setNeighborUnloaded(final int x, final int z) {
    }

    // CraftBukkit end
    public Chunk(World world, int i, int j) {
    }

    public org.bukkit.Chunk bukkitChunk;

    public boolean mustSave;

    // CraftBukkit end
    public Chunk(World world, ChunkSnapshot chunksnapshot, int i, int j) {
    }

    public boolean a(int i, int j) {
        return false;
    }

    public int e(BlockPosition blockposition) {
        return 0;
    }

    public int b(int i, int j) {
        return 0;
    }

    @Nullable
    private ChunkSection y() {
        return null;
    }

    public int g() {
        return 0;
    }

    public ChunkSection[] getSections() {
        return null;
    }

    public void initLighting() {
    }

    private void d(int i, int j) {
    }

    private void h(boolean flag) {
    }

    private void b(int i, int j, int k) {
    }

    private void a(int i, int j, int k, int l) {
    }

    private void c(int i, int j, int k) {
    }

    public int b(BlockPosition blockposition) {
        return 0;
    }

    private int d(int i, int j, int k) {
        return 0;
    }

    public IBlockData getBlockData(BlockPosition blockposition) {
        return null;
    }

    public IBlockData a(final int i, final int j, final int k) {
        return null;
    }

    @Nullable
    public IBlockData a(BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public int getBrightness(EnumSkyBlock enumskyblock, BlockPosition blockposition) {
        return 0;
    }

    public void a(EnumSkyBlock enumskyblock, BlockPosition blockposition, int i) {
    }

    public int a(BlockPosition blockposition, int i) {
        return 0;
    }

    public void a(Entity entity) {
    }

    public void b(Entity entity) {
    }

    public void a(Entity entity, int i) {
    }

    public boolean c(BlockPosition blockposition) {
        return false;
    }

    @Nullable
    private TileEntity g(BlockPosition blockposition) {
        return null;
    }

    @Nullable
    public TileEntity a(BlockPosition blockposition, Chunk.EnumTileEntityState chunk_enumtileentitystate) {
        return null;
    }

    public void a(TileEntity tileentity) {
    }

    public void a(BlockPosition blockposition, TileEntity tileentity) {
    }

    public void d(BlockPosition blockposition) {
    }

    public void addEntities() {
    }

    public void removeEntities() {
    }

    public void e() {
    }

    public void a(@Nullable Entity entity, AxisAlignedBB axisalignedbb, List<Entity> list, Predicate<? super Entity> predicate) {
    }

    public <T extends Entity> void a(Class<? extends T> oclass, AxisAlignedBB axisalignedbb, List<T> list, Predicate<? super T> predicate) {
    }

    public boolean a(boolean flag) {
        return false;
    }

    public Random a(long i) {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    // CraftBukkit start
    public void loadNearby(IChunkProvider ichunkprovider, ChunkGenerator chunkgenerator, boolean newChunk) {
    }

    protected void a(ChunkGenerator chunkgenerator) {
    }

    public BlockPosition f(BlockPosition blockposition) {
        return null;
    }

    public void b(boolean flag) {
    }

    public boolean isReady() {
        return false;
    }

    public boolean j() {
        return false;
    }

    public ChunkCoordIntPair k() {
        return null;
    }

    public boolean c(int i, int j) {
        return false;
    }

    public void a(ChunkSection[] achunksection) {
    }

    public BiomeBase getBiome(BlockPosition blockposition, WorldChunkManager worldchunkmanager) {
        return null;
    }

    public byte[] getBiomeIndex() {
        return null;
    }

    public void a(byte[] abyte) {
    }

    public void m() {
    }

    public void n() {
    }

    public void o() {
    }

    private void z() {
    }

    private void a(EnumDirection enumdirection) {
    }

    private boolean e(int i, int j) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public World getWorld() {
        return null;
    }

    public int[] r() {
        return null;
    }

    public void a(int[] aint) {
    }

    public Map<BlockPosition, TileEntity> getTileEntities() {
        return null;
    }

    public EntitySlice<Entity>[] getEntitySlices() {
        return null;
    }

    public boolean isDone() {
        return false;
    }

    public void d(boolean flag) {
    }

    public boolean v() {
        return false;
    }

    public void e(boolean flag) {
    }

    public void f(boolean flag) {
    }

    public void g(boolean flag) {
    }

    public void setLastSaved(long i) {
    }

    public int w() {
        return 0;
    }

    public long x() {
        return 0;
    }

    public void c(long i) {
    }

    public static enum EnumTileEntityState {

        IMMEDIATE, QUEUED, CHECK;

        private EnumTileEntityState() {
        }
    }
}
