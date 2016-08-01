package net.minecraft.server;

import java.io.IOException;
import javax.annotation.Nullable;

public interface IChunkLoader {

    @Nullable
    Chunk a(World world, int i, int j) throws IOException {
        return null;
    }

    void a(World world, Chunk chunk) throws IOException, ExceptionWorldConflict {
    }

    void b(World world, Chunk chunk) throws IOException {
    }

    void a() {
    }

    void b() {
    }
}
