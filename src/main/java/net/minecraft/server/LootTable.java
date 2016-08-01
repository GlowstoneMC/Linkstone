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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LootTable {

    private static final Logger b = null;

    public static final LootTable a = null;

    private final LootSelector[] c = null;

    public LootTable(LootSelector[] alootselector) {
    }

    public List<ItemStack> a(Random random, LootTableInfo loottableinfo) {
        return null;
    }

    public void a(IInventory iinventory, Random random, LootTableInfo loottableinfo) {
    }

    private void a(List<ItemStack> list, int i, Random random) {
    }

    private List<Integer> a(IInventory iinventory, Random random) {
        return null;
    }

    public static class a implements JsonDeserializer<LootTable>, JsonSerializer<LootTable> {

        public a() {
        }

        public LootTable a(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }

        public JsonElement a(LootTable loottable, Type type, JsonSerializationContext jsonserializationcontext) {
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
