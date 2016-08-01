package org.bukkit.craftbukkit.chunkio;

import net.minecraft.server.ChunkProviderServer;
import net.minecraft.server.ChunkRegionLoader;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.World;

class QueuedChunk {

    final int x;

    final int z;

    final ChunkRegionLoader loader;

    final World world;

    final ChunkProviderServer provider;

    NBTTagCompound compound;

    public QueuedChunk(int x, int z, ChunkRegionLoader loader, World world, ChunkProviderServer provider) {
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        return false;
    }
}
