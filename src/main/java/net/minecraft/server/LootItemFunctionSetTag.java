package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.Random;

public class LootItemFunctionSetTag extends LootItemFunction {

    private final NBTTagCompound a;

    public LootItemFunctionSetTag(LootItemCondition[] alootitemcondition, NBTTagCompound nbttagcompound) {
    }

    public ItemStack a(ItemStack itemstack, Random random, LootTableInfo loottableinfo) {
        return null;
    }

    public static class a extends LootItemFunction.a<LootItemFunctionSetTag> {

        public a() {
        }

        public void a(JsonObject jsonobject, LootItemFunctionSetTag lootitemfunctionsettag, JsonSerializationContext jsonserializationcontext) {
        }

        public LootItemFunctionSetTag a(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext, LootItemCondition[] alootitemcondition) {
            return null;
        }

        public LootItemFunction b(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext, LootItemCondition[] alootitemcondition) {
            return null;
        }
    }
}
