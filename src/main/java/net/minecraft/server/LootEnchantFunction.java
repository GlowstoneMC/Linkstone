package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public class LootEnchantFunction extends LootItemFunction {

    private final LootValueBounds a = null;

    private final int b = 0;

    public LootEnchantFunction(LootItemCondition[] alootitemcondition, LootValueBounds lootvaluebounds, int i) {
    }

    public ItemStack a(ItemStack itemstack, Random random, LootTableInfo loottableinfo) {
        return null;
    }

    public static class a extends LootItemFunction.a<LootEnchantFunction> {

        protected a() {
        }

        public void a(JsonObject jsonobject, LootEnchantFunction lootenchantfunction, JsonSerializationContext jsonserializationcontext) {
        }

        public LootEnchantFunction a(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext, LootItemCondition[] alootitemcondition) {
            return null;
        }

        public LootItemFunction b(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext, LootItemCondition[] alootitemcondition) {
            return null;
        }
    }
}
