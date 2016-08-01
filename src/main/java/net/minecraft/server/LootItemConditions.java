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
import java.util.Random;
import javax.annotation.Nullable;

public class LootItemConditions {

    private static final Map<MinecraftKey, LootItemCondition.a<?>> a = null;

    private static final Map<Class<? extends LootItemCondition>, LootItemCondition.a<?>> b = null;

    public static <T extends LootItemCondition> void a(LootItemCondition.a<? extends T> lootitemcondition_a) {
    }

    public static boolean a(@Nullable LootItemCondition[] alootitemcondition, Random random, LootTableInfo loottableinfo) {
        return false;
    }

    public static LootItemCondition.a<?> a(MinecraftKey minecraftkey) {
        return null;
    }

    public static <T extends LootItemCondition> LootItemCondition.a<T> a(T t0) {
        return null;
    }

    static {
    }

    public static class a implements JsonDeserializer<LootItemCondition>, JsonSerializer<LootItemCondition> {

        public a() {
        }

        public LootItemCondition a(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }

        public JsonElement a(LootItemCondition lootitemcondition, Type type, JsonSerializationContext jsonserializationcontext) {
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
