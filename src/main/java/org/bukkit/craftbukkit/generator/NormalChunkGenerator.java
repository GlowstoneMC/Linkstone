package org.bukkit.craftbukkit.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.server.*;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.generator.BlockPopulator;

public class NormalChunkGenerator extends InternalChunkGenerator {

    private final ChunkGenerator generator = null;

    public NormalChunkGenerator(World world, long seed) {
    }

    @Override
    public byte[] generate(org.bukkit.World world, Random random, int x, int z) {
        return null;
    }

    @Override
    public boolean canSpawn(org.bukkit.World world, int x, int z) {
        return false;
    }

    @Override
    public List<BlockPopulator> getDefaultPopulators(org.bukkit.World world) {
        return null;
    }

    @Override
    public Chunk getOrCreateChunk(int i, int i1) {
        return null;
    }

    @Override
    public void recreateStructures(int i, int i1) {
    }

    @Override
    public boolean a(Chunk chunk, int i, int i1) {
        return false;
    }

    @Override
    public List<BiomeBase.BiomeMeta> getMobsFor(EnumCreatureType enumCreatureType, BlockPosition blockPosition) {
        return null;
    }

    @Override
    public BlockPosition findNearestMapFeature(World world, String s, BlockPosition blockPosition) {
        return null;
    }

    @Override
    public void recreateStructures(Chunk chunk, int i, int i1) {
    }
}
