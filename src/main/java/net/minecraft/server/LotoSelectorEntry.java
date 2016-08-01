package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Random;

public abstract class LotoSelectorEntry {

    protected final int c;

    protected final int d;

    protected final LootItemCondition[] e;

    protected LotoSelectorEntry(int i, int j, LootItemCondition[] alootitemcondition) {
    }

    public int a(float f) {
        return 0;
    }

    public abstract void a(Collection<ItemStack> collection, Random random, LootTableInfo loottableinfo);

    protected abstract void a(JsonObject jsonobject, JsonSerializationContext jsonserializationcontext);

    public static class a implements JsonDeserializer<LotoSelectorEntry>, JsonSerializer<LotoSelectorEntry> {

        public a() {
        }

        public LotoSelectorEntry a(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }

        public JsonElement a(LotoSelectorEntry lotoselectorentry, Type type, JsonSerializationContext jsonserializationcontext) {
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
