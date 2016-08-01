package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public class LootEntityPropertyOnFire implements LootEntityProperty {

    private final boolean a = false;

    public LootEntityPropertyOnFire(boolean flag) {
    }

    public boolean a(Random random, Entity entity) {
        return false;
    }

    public static class a extends LootEntityProperty.a<LootEntityPropertyOnFire> {

        protected a() {
        }

        public JsonElement a(LootEntityPropertyOnFire lootentitypropertyonfire, JsonSerializationContext jsonserializationcontext) {
            return null;
        }

        public LootEntityPropertyOnFire b(JsonElement jsonelement, JsonDeserializationContext jsondeserializationcontext) {
            return null;
        }

        public LootEntityProperty a(JsonElement jsonelement, JsonDeserializationContext jsondeserializationcontext) {
            return null;
        }
    }
}
