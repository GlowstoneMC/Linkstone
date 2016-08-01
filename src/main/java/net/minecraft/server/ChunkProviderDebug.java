package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class ChunkProviderDebug implements ChunkGenerator {

    private static final List<IBlockData> c = null;

    private static final int d = 0;

    private static final int e = 0;

    protected static final IBlockData a = null;

    protected static final IBlockData b = null;

    private final World f = null;

    public ChunkProviderDebug(World world) {
    }

    public Chunk getOrCreateChunk(int i, int j) {
        return null;
    }

    public static IBlockData c(int i, int j) {
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

    static {
    }
}
