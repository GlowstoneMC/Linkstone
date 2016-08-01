package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public class LootItemConditionRandomChanceWithLooting implements LootItemCondition {

    private final float a;

    private final float b;

    public LootItemConditionRandomChanceWithLooting(float f, float f1) {
    }

    public boolean a(Random random, LootTableInfo loottableinfo) {
        return false;
    }

    public static class a extends LootItemCondition.a<LootItemConditionRandomChanceWithLooting> {

        protected a() {
        }

        public void a(JsonObject jsonobject, LootItemConditionRandomChanceWithLooting lootitemconditionrandomchancewithlooting, JsonSerializationContext jsonserializationcontext) {
        }

        public LootItemConditionRandomChanceWithLooting a(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext) {
            return null;
        }

        public LootItemCondition b(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext) {
            return null;
        }
    }
}
