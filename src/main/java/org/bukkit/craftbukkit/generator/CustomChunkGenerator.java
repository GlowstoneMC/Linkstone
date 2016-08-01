package org.bukkit.craftbukkit.generator;

import java.util.List;
import java.util.Random;
import net.minecraft.server.*;
import org.bukkit.block.Biome;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.craftbukkit.block.CraftBlock;

public class CustomChunkGenerator extends InternalChunkGenerator {

    private final ChunkGenerator generator = null;

    private final WorldServer world = null;

    private final Random random = null;

    private final WorldGenStronghold strongholdGen = null;

    private static class CustomBiomeGrid implements BiomeGrid {

        BiomeBase[] biome = null;

        @Override
        public Biome getBiome(int x, int z) {
            return null;
        }

        @Override
        public void setBiome(int x, int z, Biome bio) {
        }
    }

    public CustomChunkGenerator(World world, long seed, ChunkGenerator generator) {
    }

    @Override
    public Chunk getOrCreateChunk(int x, int z) {
        return null;
    }

    @Override
    public boolean a(Chunk chunk, int i, int i1) {
        return false;
    }

    @SuppressWarnings("deprecation")
    @Override
    public byte[] generate(org.bukkit.World world, Random random, int x, int z) {
        return null;
    }

    @Override
    public byte[][] generateBlockSections(org.bukkit.World world, Random random, int x, int z, BiomeGrid biomes) {
        return null;
    }

    @Override
    public short[][] generateExtBlockSections(org.bukkit.World world, Random random, int x, int z, BiomeGrid biomes) {
        return null;
    }

    public Chunk getChunkAt(int x, int z) {
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
    public List<BiomeBase.BiomeMeta> getMobsFor(EnumCreatureType type, BlockPosition position) {
        return null;
    }

    @Override
    public BlockPosition findNearestMapFeature(World world, String type, BlockPosition position) {
        return null;
    }

    @Override
    public void recreateStructures(int i, int j) {
    }

    @Override
    public void recreateStructures(Chunk chunk, int i, int j) {
    }
}
