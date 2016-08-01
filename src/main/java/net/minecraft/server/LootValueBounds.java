package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Random;

public class LootValueBounds {

    private final float a = 0.0F;

    private final float b = 0.0F;

    public LootValueBounds(float f, float f1) {
    }

    public LootValueBounds(float f) {
    }

    public float a() {
        return 0.0F;
    }

    public float b() {
        return 0.0F;
    }

    public int a(Random random) {
        return 0;
    }

    public float b(Random random) {
        return 0.0F;
    }

    public boolean a(int i) {
        return false;
    }

    public static class a implements JsonDeserializer<LootValueBounds>, JsonSerializer<LootValueBounds> {

        public a() {
        }

        public LootValueBounds a(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }

        public JsonElement a(LootValueBounds lootvaluebounds, Type type, JsonSerializationContext jsonserializationcontext) {
            return null;
        }

        public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonserializationcontext) {
            return null;
        }

        public Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }
    }
}
