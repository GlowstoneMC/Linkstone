package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public class LootItemConditionRandomChance implements LootItemCondition {

    private final float a;

    public LootItemConditionRandomChance(float f) {
    }

    public boolean a(Random random, LootTableInfo loottableinfo) {
        return false;
    }

    public static class a extends LootItemCondition.a<LootItemConditionRandomChance> {

        protected a() {
        }

        public void a(JsonObject jsonobject, LootItemConditionRandomChance lootitemconditionrandomchance, JsonSerializationContext jsonserializationcontext) {
        }

        public LootItemConditionRandomChance a(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext) {
            return null;
        }

        public LootItemCondition b(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext) {
            return null;
        }
    }
}
