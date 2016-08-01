package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public class LootItemFunctionSetCount extends LootItemFunction {

    private final LootValueBounds a;

    public LootItemFunctionSetCount(LootItemCondition[] alootitemcondition, LootValueBounds lootvaluebounds) {
    }

    public ItemStack a(ItemStack itemstack, Random random, LootTableInfo loottableinfo) {
        return null;
    }

    public static class a extends LootItemFunction.a<LootItemFunctionSetCount> {

        protected a() {
        }

        public void a(JsonObject jsonobject, LootItemFunctionSetCount lootitemfunctionsetcount, JsonSerializationContext jsonserializationcontext) {
        }

        public LootItemFunctionSetCount a(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext, LootItemCondition[] alootitemcondition) {
            return null;
        }

        public LootItemFunction b(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext, LootItemCondition[] alootitemcondition) {
            return null;
        }
    }
}
