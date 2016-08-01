package net.minecraft.server;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import java.util.Map;

public class LootItemFunctions {

    private static final Map<MinecraftKey, LootItemFunction.a<?>> a;

    private static final Map<Class<? extends LootItemFunction>, LootItemFunction.a<?>> b;

    public static <T extends LootItemFunction> void a(LootItemFunction.a<? extends T> lootitemfunction_a) {
    }

    public static LootItemFunction.a<?> a(MinecraftKey minecraftkey) {
        return null;
    }

    public static <T extends LootItemFunction> LootItemFunction.a<T> a(T t0) {
        return null;
    }

    static {
    }

    public static class a implements JsonDeserializer<LootItemFunction>, JsonSerializer<LootItemFunction> {

        public a() {
        }

        public LootItemFunction a(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }

        public JsonElement a(LootItemFunction lootitemfunction, Type type, JsonSerializationContext jsonserializationcontext) {
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
