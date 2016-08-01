package net.minecraft.server;

import java.util.List;
import javax.annotation.Nullable;

public interface ChunkGenerator {

    Chunk getOrCreateChunk(int i, int j) {
        return null;
    }

    void recreateStructures(int i, int j) {
    }

    boolean a(Chunk chunk, int i, int j) {
        return false;
    }

    List<BiomeBase.BiomeMeta> getMobsFor(EnumCreatureType enumcreaturetype, BlockPosition blockposition) {
        return null;
    }

    @Nullable
    BlockPosition findNearestMapFeature(World world, String s, BlockPosition blockposition) {
        return null;
    }

    void recreateStructures(Chunk chunk, int i, int j) {
    }
}
