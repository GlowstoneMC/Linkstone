package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
// CraftBukkit start
import java.util.LinkedList;

// CraftBukkit end
public class PlayerChunkMap {

    private static final Predicate<EntityPlayer> a;

    private static final Predicate<EntityPlayer> b;

    private final WorldServer world;

    private final List<EntityPlayer> managedPlayers;

    private final Long2ObjectMap<PlayerChunk> e;

    private final Set<PlayerChunk> f;

    private final List<PlayerChunk> g;

    private final List<PlayerChunk> h;

    private final List<PlayerChunk> i;

    private int j;

    private long k;

    private boolean l;

    private boolean m;

    private boolean wasNotEmpty;

    // CraftBukkit - add field
    public PlayerChunkMap(WorldServer worldserver) {
    }

    public WorldServer getWorld() {
        return null;
    }

    public Iterator<Chunk> b() {
        return null;
    }

    public void flush() {
    }

    public boolean a(int i, int j) {
        return false;
    }

    @Nullable
    public PlayerChunk getChunk(int i, int j) {
        return null;
    }

    private PlayerChunk c(int i, int j) {
        return null;
    }

    // CraftBukkit start - add method
    public final boolean isChunkInUse(int x, int z) {
        return false;
    }

    // CraftBukkit end
    public void flagDirty(BlockPosition blockposition) {
    }

    public void addPlayer(EntityPlayer entityplayer) {
    }

    public void removePlayer(EntityPlayer entityplayer) {
    }

    private boolean a(int i, int j, int k, int l, int i1) {
        return false;
    }

    public void movePlayer(EntityPlayer entityplayer) {
    }

    public boolean a(EntityPlayer entityplayer, int i, int j) {
        return false;
    }

    public void a(int i) {
    }

    private void e() {
    }

    public static int getFurthestViewableBlock(int i) {
        return 0;
    }

    private static long d(int i, int j) {
        return 0;
    }

    public void a(PlayerChunk playerchunk) {
    }

    public void b(PlayerChunk playerchunk) {
    }

    // CraftBukkit start - Sorter to load nearby chunks first
    private static class ChunkCoordComparator implements java.util.Comparator<ChunkCoordIntPair> {

        private int x;

        private int z;

        public ChunkCoordComparator(EntityPlayer entityplayer) {
        }

        public int compare(ChunkCoordIntPair a, ChunkCoordIntPair b) {
            return 0;
        }
    }
    // CraftBukkit end
}
