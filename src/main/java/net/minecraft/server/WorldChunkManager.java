package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class WorldChunkManager {

    private GenLayer a;

    private GenLayer b;

    private final BiomeCache c;

    private final List<BiomeBase> d;

    protected WorldChunkManager() {
    }

    private WorldChunkManager(long i, WorldType worldtype, String s) {
    }

    public WorldChunkManager(WorldData worlddata) {
    }

    public List<BiomeBase> a() {
        return null;
    }

    public BiomeBase getBiome(BlockPosition blockposition) {
        return null;
    }

    public BiomeBase getBiome(BlockPosition blockposition, BiomeBase biomebase) {
        return null;
    }

    public float a(float f, int i) {
        return 0.0F;
    }

    public BiomeBase[] getBiomes(BiomeBase[] abiomebase, int i, int j, int k, int l) {
        return null;
    }

    public BiomeBase[] getBiomeBlock(@Nullable BiomeBase[] abiomebase, int i, int j, int k, int l) {
        return null;
    }

    public BiomeBase[] a(@Nullable BiomeBase[] abiomebase, int i, int j, int k, int l, boolean flag) {
        return null;
    }

    public boolean a(int i, int j, int k, List<BiomeBase> list) {
        return false;
    }

    @Nullable
    public BlockPosition a(int i, int j, int k, List<BiomeBase> list, Random random) {
        return null;
    }

    public void b() {
    }
}
