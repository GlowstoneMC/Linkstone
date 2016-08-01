package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

public class LootItemConditionEntityProperty implements LootItemCondition {

    private final LootEntityProperty[] a = null;

    private final LootTableInfo.EntityTarget b = null;

    public LootItemConditionEntityProperty(LootEntityProperty[] alootentityproperty, LootTableInfo.EntityTarget loottableinfo_entitytarget) {
    }

    public boolean a(Random random, LootTableInfo loottableinfo) {
        return false;
    }

    public static class a extends LootItemCondition.a<LootItemConditionEntityProperty> {

        protected a() {
        }

        public void a(JsonObject jsonobject, LootItemConditionEntityProperty lootitemconditionentityproperty, JsonSerializationContext jsonserializationcontext) {
        }

        public LootItemConditionEntityProperty a(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext) {
            return null;
        }

        public LootItemCondition b(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext) {
            return null;
        }
    }
}
