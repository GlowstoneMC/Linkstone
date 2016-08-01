package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LootItemFunctionSetData extends LootItemFunction {

    private static final Logger a = null;

    private final LootValueBounds b = null;

    public LootItemFunctionSetData(LootItemCondition[] alootitemcondition, LootValueBounds lootvaluebounds) {
    }

    public ItemStack a(ItemStack itemstack, Random random, LootTableInfo loottableinfo) {
        return null;
    }

    public static class a extends LootItemFunction.a<LootItemFunctionSetData> {

        protected a() {
        }

        public void a(JsonObject jsonobject, LootItemFunctionSetData lootitemfunctionsetdata, JsonSerializationContext jsonserializationcontext) {
        }

        public LootItemFunctionSetData a(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext, LootItemCondition[] alootitemcondition) {
            return null;
        }

        public LootItemFunction b(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext, LootItemCondition[] alootitemcondition) {
            return null;
        }
    }
}
