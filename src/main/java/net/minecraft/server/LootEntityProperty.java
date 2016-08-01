package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public interface LootEntityProperty {

    boolean a(Random random, Entity entity) {
        return false;
    }

    public abstract static class a<T extends LootEntityProperty> {

        private final MinecraftKey a = null;

        private final Class<T> b = null;

        protected a(MinecraftKey minecraftkey, Class<T> oclass) {
        }

        public MinecraftKey a() {
            return null;
        }

        public Class<T> b() {
            return null;
        }

        public abstract JsonElement a(T t0, JsonSerializationContext jsonserializationcontext);

        public abstract T a(JsonElement jsonelement, JsonDeserializationContext jsondeserializationcontext);
    }
}
