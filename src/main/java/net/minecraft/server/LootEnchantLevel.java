package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public class LootEnchantLevel extends LootItemFunction {

    private final LootValueBounds a;

    private final boolean b;

    public LootEnchantLevel(LootItemCondition[] alootitemcondition, LootValueBounds lootvaluebounds, boolean flag) {
    }

    public ItemStack a(ItemStack itemstack, Random random, LootTableInfo loottableinfo) {
        return null;
    }

    public static class a extends LootItemFunction.a<LootEnchantLevel> {

        public a() {
        }

        public void a(JsonObject jsonobject, LootEnchantLevel lootenchantlevel, JsonSerializationContext jsonserializationcontext) {
        }

        public LootEnchantLevel a(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext, LootItemCondition[] alootitemcondition) {
            return null;
        }

        public LootItemFunction b(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext, LootItemCondition[] alootitemcondition) {
            return null;
        }
    }
}
