package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;

public class ChunkProviderFlat implements ChunkGenerator {

    private final World a;

    private final Random b;

    private final IBlockData[] c;

    private final WorldGenFlatInfo d;

    private final List<StructureGenerator> e;

    private final boolean f;

    private final boolean g;

    private WorldGenLakes h;

    private WorldGenLakes i;

    public ChunkProviderFlat(World world, long i, boolean flag, String s) {
    }

    public Chunk getOrCreateChunk(int i, int j) {
        return null;
    }

    public void recreateStructures(int i, int j) {
    }

    public boolean a(Chunk chunk, int i, int j) {
        return false;
    }

    public List<BiomeBase.BiomeMeta> getMobsFor(EnumCreatureType enumcreaturetype, BlockPosition blockposition) {
        return null;
    }

    @Nullable
    public BlockPosition findNearestMapFeature(World world, String s, BlockPosition blockposition) {
        return null;
    }

    public void recreateStructures(Chunk chunk, int i, int j) {
    }
}
