package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public interface LootItemCondition {

    boolean a(Random random, LootTableInfo loottableinfo) {
        return false;
    }

    public abstract static class a<T extends LootItemCondition> {

        private final MinecraftKey a;

        private final Class<T> b;

        protected a(MinecraftKey minecraftkey, Class<T> oclass) {
        }

        public MinecraftKey a() {
            return null;
        }

        public Class<T> b() {
            return null;
        }

        public abstract void a(JsonObject jsonobject, T t0, JsonSerializationContext jsonserializationcontext);

        public abstract T b(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext);
    }
}
