/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bukkit.craftbukkit.generator;

import java.util.Arrays;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.material.MaterialData;

/**
 * Data to be used for the block types and data in a newly generated chunk.
 */
public final class CraftChunkData implements ChunkGenerator.ChunkData {

    private final int maxHeight = 0;

    private final char[][] sections = null;

    public CraftChunkData(World world) {
    }

    /* pp for tests */
    CraftChunkData(int maxHeight) {
    }

    @Override
    public int getMaxHeight() {
        return 0;
    }

    @Override
    public void setBlock(int x, int y, int z, Material material) {
    }

    @Override
    public void setBlock(int x, int y, int z, MaterialData material) {
    }

    @Override
    public void setRegion(int xMin, int yMin, int zMin, int xMax, int yMax, int zMax, Material material) {
    }

    @Override
    public void setRegion(int xMin, int yMin, int zMin, int xMax, int yMax, int zMax, MaterialData material) {
    }

    @Override
    public Material getType(int x, int y, int z) {
        return null;
    }

    @Override
    public MaterialData getTypeAndData(int x, int y, int z) {
        return null;
    }

    @Override
    public void setRegion(int xMin, int yMin, int zMin, int xMax, int yMax, int zMax, int blockId) {
    }

    @Override
    public void setRegion(int xMin, int yMin, int zMin, int xMax, int yMax, int zMax, int blockId, int data) {
    }

    @Override
    public void setBlock(int x, int y, int z, int blockId) {
    }

    @Override
    public void setBlock(int x, int y, int z, int blockId, byte data) {
    }

    @Override
    public int getTypeId(int x, int y, int z) {
        return 0;
    }

    @Override
    public byte getData(int x, int y, int z) {
        return 0;
    }

    private void setBlock(int x, int y, int z, char type) {
    }

    private char[] getChunkSection(int y, boolean create) {
        return null;
    }

    char[][] getRawChunkData() {
        return null;
    }
}
