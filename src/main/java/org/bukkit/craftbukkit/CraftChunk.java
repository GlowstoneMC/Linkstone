package org.bukkit.craftbukkit;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import net.minecraft.server.*;
import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.craftbukkit.block.CraftBlock;
import org.bukkit.entity.Entity;
import org.bukkit.ChunkSnapshot;

public class CraftChunk implements Chunk {

    private WeakReference<net.minecraft.server.Chunk> weakChunk = null;

    private final WorldServer worldServer = null;

    private final int x = 0;

    private final int z = 0;

    private static final byte[] emptyData = null;

    private static final short[] emptyBlockIDs = null;

    private static final byte[] emptySkyLight = null;

    public CraftChunk(net.minecraft.server.Chunk chunk) {
    }

    public World getWorld() {
        return null;
    }

    public CraftWorld getCraftWorld() {
        return null;
    }

    public net.minecraft.server.Chunk getHandle() {
        return null;
    }

    void breakLink() {
    }

    public int getX() {
        return 0;
    }

    public int getZ() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

    public Block getBlock(int x, int y, int z) {
        return null;
    }

    public Entity[] getEntities() {
        return null;
    }

    public BlockState[] getTileEntities() {
        return null;
    }

    public boolean isLoaded() {
        return false;
    }

    public boolean load() {
        return false;
    }

    public boolean load(boolean generate) {
        return false;
    }

    public boolean unload() {
        return false;
    }

    public boolean unload(boolean save) {
        return false;
    }

    public boolean unload(boolean save, boolean safe) {
        return false;
    }

    public ChunkSnapshot getChunkSnapshot() {
        return null;
    }

    public ChunkSnapshot getChunkSnapshot(boolean includeMaxBlockY, boolean includeBiome, boolean includeBiomeTempRain) {
        return null;
    }

    public static ChunkSnapshot getEmptyChunkSnapshot(int x, int z, CraftWorld world, boolean includeBiome, boolean includeBiomeTempRain) {
        return null;
    }

    private static float[] getTemperatures(WorldChunkManager chunkmanager, int chunkX, int chunkZ) {
        return null;
    }

    static {
    }
}
