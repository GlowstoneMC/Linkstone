package net.minecraft.server;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

public class LootItemConditionEntityScore implements LootItemCondition {

    private final Map<String, LootValueBounds> a;

    private final LootTableInfo.EntityTarget b;

    public LootItemConditionEntityScore(Map<String, LootValueBounds> map, LootTableInfo.EntityTarget loottableinfo_entitytarget) {
    }

    public boolean a(Random random, LootTableInfo loottableinfo) {
        return false;
    }

    protected boolean a(Entity entity, Scoreboard scoreboard, String s, LootValueBounds lootvaluebounds) {
        return false;
    }

    public static class a extends LootItemCondition.a<LootItemConditionEntityScore> {

        protected a() {
        }

        public void a(JsonObject jsonobject, LootItemConditionEntityScore lootitemconditionentityscore, JsonSerializationContext jsonserializationcontext) {
        }

        public LootItemConditionEntityScore a(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext) {
            return null;
        }

        public LootItemCondition b(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext) {
            return null;
        }
    }
}
