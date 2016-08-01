package net.minecraft.server;

import javax.annotation.Nullable;

public interface IChunkProvider {

    @Nullable
    Chunk getLoadedChunkAt(int i, int j) {
        return null;
    }

    Chunk getChunkAt(int i, int j) {
        return null;
    }

    boolean unloadChunks() {
        return false;
    }

    String getName() {
        return null;
    }
}
