package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Collection;
import java.util.Random;

public class LootSelectorEmpty extends LotoSelectorEntry {

    public LootSelectorEmpty(int i, int j, LootItemCondition[] alootitemcondition) {
    }

    public void a(Collection<ItemStack> collection, Random random, LootTableInfo loottableinfo) {
    }

    protected void a(JsonObject jsonobject, JsonSerializationContext jsonserializationcontext) {
    }

    public static LootSelectorEmpty a(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext, int i, int j, LootItemCondition[] alootitemcondition) {
        return null;
    }
}
