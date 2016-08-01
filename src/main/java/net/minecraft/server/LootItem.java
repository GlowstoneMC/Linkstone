package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Collection;
import java.util.Random;

public class LootItem extends LotoSelectorEntry {

    protected final Item a;

    protected final LootItemFunction[] b;

    public LootItem(Item item, int i, int j, LootItemFunction[] alootitemfunction, LootItemCondition[] alootitemcondition) {
    }

    public void a(Collection<ItemStack> collection, Random random, LootTableInfo loottableinfo) {
    }

    protected void a(JsonObject jsonobject, JsonSerializationContext jsonserializationcontext) {
    }

    public static LootItem a(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext, int i, int j, LootItemCondition[] alootitemcondition) {
        return null;
    }
}
