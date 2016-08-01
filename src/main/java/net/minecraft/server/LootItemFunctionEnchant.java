package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LootItemFunctionEnchant extends LootItemFunction {

    private static final Logger a = null;

    @Nullable
    private final List<Enchantment> b = null;

    public LootItemFunctionEnchant(LootItemCondition[] alootitemcondition, @Nullable List<Enchantment> list) {
    }

    public ItemStack a(ItemStack itemstack, Random random, LootTableInfo loottableinfo) {
        return null;
    }

    public static class a extends LootItemFunction.a<LootItemFunctionEnchant> {

        public a() {
        }

        public void a(JsonObject jsonobject, LootItemFunctionEnchant lootitemfunctionenchant, JsonSerializationContext jsonserializationcontext) {
        }

        public LootItemFunctionEnchant a(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext, LootItemCondition[] alootitemcondition) {
            return null;
        }

        public LootItemFunction b(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext, LootItemCondition[] alootitemcondition) {
            return null;
        }
    }
}
