package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import org.apache.commons.lang3.ArrayUtils;

public class LootSelector {

    private final LotoSelectorEntry[] a = null;

    private final LootItemCondition[] b = null;

    private final LootValueBounds c = null;

    private final LootValueBounds d = null;

    public LootSelector(LotoSelectorEntry[] alotoselectorentry, LootItemCondition[] alootitemcondition, LootValueBounds lootvaluebounds, LootValueBounds lootvaluebounds1) {
    }

    protected void a(Collection<ItemStack> collection, Random random, LootTableInfo loottableinfo) {
    }

    public void b(Collection<ItemStack> collection, Random random, LootTableInfo loottableinfo) {
    }

    public static class a implements JsonDeserializer<LootSelector>, JsonSerializer<LootSelector> {

        public a() {
        }

        public LootSelector a(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }

        public JsonElement a(LootSelector lootselector, Type type, JsonSerializationContext jsonserializationcontext) {
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
