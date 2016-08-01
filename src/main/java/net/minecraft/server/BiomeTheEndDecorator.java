package net.minecraft.server;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BiomeTheEndDecorator extends BiomeDecorator {

    private static final LoadingCache<Long, WorldGenEnder.Spike[]> M;

    private final WorldGenEnder N;

    public BiomeTheEndDecorator() {
    }

    protected void a(BiomeBase biomebase, World world, Random random) {
    }

    public static WorldGenEnder.Spike[] a(World world) {
        return null;
    }

    static class SyntheticClass_1 {
    }

    static class SpikeCache extends CacheLoader<Long, WorldGenEnder.Spike[]> {

        private SpikeCache() {
        }

        public WorldGenEnder.Spike[] a(Long olong) throws Exception {
            return null;
        }

        public Object load(Object object) throws Exception {
            return null;
        }

        SpikeCache(BiomeTheEndDecorator.SyntheticClass_1 biometheenddecorator_syntheticclass_1) {
        }
    }
}
