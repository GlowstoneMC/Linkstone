package org.bukkit.craftbukkit.chunkio;

import net.minecraft.server.ChunkProviderServer;
import net.minecraft.server.ChunkRegionLoader;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.World;

class QueuedChunk {

    final int x = 0;

    final int z = 0;

    final ChunkRegionLoader loader = null;

    final World world = null;

    final ChunkProviderServer provider = null;

    NBTTagCompound compound = null;

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
