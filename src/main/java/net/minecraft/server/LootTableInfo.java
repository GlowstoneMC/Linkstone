package net.minecraft.server;

import com.google.common.collect.Sets;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Set;
import javax.annotation.Nullable;

public class LootTableInfo {

    private final float a;

    private final WorldServer b;

    private final LootTableRegistry c;

    @Nullable
    private final Entity d;

    @Nullable
    private final EntityHuman e;

    @Nullable
    private final DamageSource f;

    private final Set<LootTable> g;

    public LootTableInfo(float f, WorldServer worldserver, LootTableRegistry loottableregistry, @Nullable Entity entity, @Nullable EntityHuman entityhuman, @Nullable DamageSource damagesource) {
    }

    @Nullable
    public Entity a() {
        return null;
    }

    @Nullable
    public Entity b() {
        return null;
    }

    @Nullable
    public Entity c() {
        return null;
    }

    public boolean a(LootTable loottable) {
        return false;
    }

    public void b(LootTable loottable) {
    }

    public LootTableRegistry e() {
        return null;
    }

    public float f() {
        return 0.0F;
    }

    @Nullable
    public Entity a(LootTableInfo.EntityTarget loottableinfo_entitytarget) {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }

    public static enum EntityTarget {

        THIS("this"), KILLER("killer"), KILLER_PLAYER("killer_player");

        private final String d;

        private EntityTarget(String s) {
        }

        public static LootTableInfo.EntityTarget a(String s) {
            return null;
        }

        public static class b$a extends TypeAdapter<LootTableInfo.EntityTarget> {

            public b$a() {
            }

            public void a(JsonWriter jsonwriter, LootTableInfo.EntityTarget loottableinfo_entitytarget) throws IOException {
            }

            public LootTableInfo.EntityTarget a(JsonReader jsonreader) throws IOException {
                return null;
            }

            public Object read(JsonReader jsonreader) throws IOException {
                return null;
            }

            public void write(JsonWriter jsonwriter, Object object) throws IOException {
            }
        }
    }

    public static class a {

        private final WorldServer a;

        private float b;

        private Entity c;

        private EntityHuman d;

        private DamageSource e;

        public a(WorldServer worldserver) {
        }

        public LootTableInfo.a a(float f) {
            return null;
        }

        public LootTableInfo.a a(Entity entity) {
            return null;
        }

        public LootTableInfo.a a(EntityHuman entityhuman) {
            return null;
        }

        public LootTableInfo.a a(DamageSource damagesource) {
            return null;
        }

        public LootTableInfo a() {
            return null;
        }
    }
}
