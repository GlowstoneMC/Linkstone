package org.bukkit.craftbukkit;

import org.bukkit.ChunkSnapshot;
import org.bukkit.block.Biome;
import org.bukkit.craftbukkit.block.CraftBlock;
import net.minecraft.server.BiomeBase;

/**
 * Represents a static, thread-safe snapshot of chunk of blocks
 * Purpose is to allow clean, efficient copy of a chunk data to be made, and then handed off for processing in another thread (e.g. map rendering)
 */
public class CraftChunkSnapshot implements ChunkSnapshot {

    private final int x, z;

    private final String worldname;

    private final short[][] blockids;

    /* Block IDs, by section */
    private final byte[][] blockdata;

    private final byte[][] skylight;

    private final byte[][] emitlight;

    private final boolean[] empty;

    private final int[] hmap;

    // Height map
    private final long captureFulltime;

    private final BiomeBase[] biome;

    private final double[] biomeTemp;

    private final double[] biomeRain;

    CraftChunkSnapshot(int x, int z, String wname, long wtime, short[][] sectionBlockIDs, byte[][] sectionBlockData, byte[][] sectionSkyLights, byte[][] sectionEmitLights, boolean[] sectionEmpty, int[] hmap, BiomeBase[] biome, double[] biomeTemp, double[] biomeRain) {
    }

    public int getX() {
        return 0;
    }

    public int getZ() {
        return 0;
    }

    public String getWorldName() {
        return null;
    }

    public final int getBlockTypeId(int x, int y, int z) {
        return 0;
    }

    public final int getBlockData(int x, int y, int z) {
        return 0;
    }

    public final int getBlockSkyLight(int x, int y, int z) {
        return 0;
    }

    public final int getBlockEmittedLight(int x, int y, int z) {
        return 0;
    }

    public final int getHighestBlockYAt(int x, int z) {
        return 0;
    }

    public final Biome getBiome(int x, int z) {
        return null;
    }

    public final double getRawBiomeTemperature(int x, int z) {
        return 0.0;
    }

    public final double getRawBiomeRainfall(int x, int z) {
        return 0.0;
    }

    public final long getCaptureFullTime() {
        return 0;
    }

    public final boolean isSectionEmpty(int sy) {
        return false;
    }
}
