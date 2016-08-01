package org.bukkit.craftbukkit.chunkio;

import java.io.IOException;
import net.minecraft.server.Chunk;
import net.minecraft.server.ChunkCoordIntPair;
import net.minecraft.server.ChunkRegionLoader;
import net.minecraft.server.NBTTagCompound;
import org.bukkit.Server;
import org.bukkit.craftbukkit.util.AsynchronousExecutor;
import java.util.concurrent.atomic.AtomicInteger;

class ChunkIOProvider implements AsynchronousExecutor.CallBackProvider<QueuedChunk, Chunk, Runnable, RuntimeException> {

    private final AtomicInteger threadNumber = null;

    // async stuff
    public Chunk callStage1(QueuedChunk queuedChunk) throws RuntimeException {
        return null;
    }

    // sync stuff
    public void callStage2(QueuedChunk queuedChunk, Chunk chunk) throws RuntimeException {
    }

    public void callStage3(QueuedChunk queuedChunk, Chunk chunk, Runnable runnable) throws RuntimeException {
    }

    public Thread newThread(Runnable runnable) {
        return null;
    }
}
