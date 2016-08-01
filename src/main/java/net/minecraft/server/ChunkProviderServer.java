package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import org.bukkit.craftbukkit.chunkio.ChunkIOExecutor;
import org.bukkit.event.world.ChunkUnloadEvent;

// CraftBukkit end
public class ChunkProviderServer implements IChunkProvider {

    private static final Logger a;

    public final Set<Long> unloadQueue;

    public final ChunkGenerator chunkGenerator;

    private final IChunkLoader chunkLoader;

    public final Long2ObjectMap<Chunk> chunks;

    public final WorldServer world;

    public ChunkProviderServer(WorldServer worldserver, IChunkLoader ichunkloader, ChunkGenerator chunkgenerator) {
    }

    public Collection<Chunk> a() {
        return null;
    }

    public void unload(Chunk chunk) {
    }

    public void b() {
    }

    @Nullable
    public Chunk getLoadedChunkAt(int i, int j) {
        return null;
    }

    @Nullable
    public Chunk getOrLoadChunkAt(int i, int j) {
        return null;
    }

    @Nullable
    public Chunk originalGetOrLoadChunkAt(int i, int j) {
        return null;
    }

    // CraftBukkit start
    public Chunk getChunkIfLoaded(int x, int z) {
        return null;
    }

    // CraftBukkit end
    public Chunk getChunkAt(int i, int j) {
        return null;
    }

    public Chunk getChunkAt(int i, int j, Runnable runnable) {
        return null;
    }

    public Chunk getChunkAt(int i, int j, Runnable runnable, boolean generate) {
        return null;
    }

    public Chunk originalGetChunkAt(int i, int j) {
        return null;
    }

    @Nullable
    public Chunk loadChunk(int i, int j) {
        return null;
    }

    public void saveChunkNOP(Chunk chunk) {
    }

    public void saveChunk(Chunk chunk) {
    }

    public boolean a(boolean flag) {
        return false;
    }

    public void c() {
    }

    public boolean unloadChunks() {
        return false;
    }

    // CraftBukkit start
    public boolean unloadChunk(Chunk chunk, boolean save) {
        return false;
    }

    // CraftBukkit end
    public boolean e() {
        return false;
    }

    public String getName() {
        return null;
    }

    public List<BiomeBase.BiomeMeta> a(EnumCreatureType enumcreaturetype, BlockPosition blockposition) {
        return null;
    }

    @Nullable
    public BlockPosition a(World world, String s, BlockPosition blockposition) {
        return null;
    }

    public int g() {
        return 0;
    }

    public boolean isLoaded(int i, int j) {
        return false;
    }
}
