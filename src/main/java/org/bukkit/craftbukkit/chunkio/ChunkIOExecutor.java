package org.bukkit.craftbukkit.chunkio;

import net.minecraft.server.Chunk;
import net.minecraft.server.ChunkProviderServer;
import net.minecraft.server.ChunkRegionLoader;
import net.minecraft.server.World;
import org.bukkit.craftbukkit.util.AsynchronousExecutor;

public class ChunkIOExecutor {

    static final int BASE_THREADS = 0;

    static final int PLAYERS_PER_THREAD = 0;

    private static final AsynchronousExecutor<QueuedChunk, Chunk, Runnable, RuntimeException> instance = null;

    public static Chunk syncChunkLoad(World world, ChunkRegionLoader loader, ChunkProviderServer provider, int x, int z) {
        return null;
    }

    public static void queueChunkLoad(World world, ChunkRegionLoader loader, ChunkProviderServer provider, int x, int z, Runnable runnable) {
    }

    // Abuses the fact that hashCode and equals for QueuedChunk only use world and coords
    public static void dropQueuedChunkLoad(World world, int x, int z, Runnable runnable) {
    }

    public static void adjustPoolSize(int players) {
    }

    public static void tick() {
    }
}
