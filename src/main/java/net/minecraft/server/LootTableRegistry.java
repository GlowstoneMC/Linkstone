package net.minecraft.server;

import com.google.common.base.Charsets;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LootTableRegistry {

    private static final Logger a;

    private static final Gson b;

    private final LoadingCache<MinecraftKey, LootTable> c;

    private final File d;

    public LootTableRegistry(File file) {
    }

    public LootTable a(MinecraftKey minecraftkey) {
        return null;
    }

    public void a() {
    }

    static class SyntheticClass_1 {
    }

    class a extends CacheLoader<MinecraftKey, LootTable> {

        private a() {
        }

        public LootTable a(MinecraftKey minecraftkey) throws Exception {
            return null;
        }

        @Nullable
        private LootTable b(MinecraftKey minecraftkey) {
            return null;
        }

        @Nullable
        private LootTable c(MinecraftKey minecraftkey) {
            return null;
        }

        public Object load(Object object) throws Exception {
            return null;
        }

        a(LootTableRegistry.SyntheticClass_1 loottableregistry_syntheticclass_1) {
        }
    }
}
