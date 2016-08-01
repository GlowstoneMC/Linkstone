package net.minecraft.server;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.Iterator;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LootItemFunctionSetAttribute extends LootItemFunction {

    private static final Logger a;

    private final LootItemFunctionSetAttribute.a[] b;

    public LootItemFunctionSetAttribute(LootItemCondition[] alootitemcondition, LootItemFunctionSetAttribute.a[] alootitemfunctionsetattribute_a) {
    }

    public ItemStack a(ItemStack itemstack, Random random, LootTableInfo loottableinfo) {
        return null;
    }

    static class a {

        private final String a;

        private final String b;

        private final int c;

        private final LootValueBounds d;

        @Nullable
        private final UUID e;

        private final EnumItemSlot[] f;

        private a(String s, String s1, int i, LootValueBounds lootvaluebounds, EnumItemSlot[] aenumitemslot, @Nullable UUID uuid) {
        }

        public JsonObject a(JsonSerializationContext jsonserializationcontext) {
            return null;
        }

        public static LootItemFunctionSetAttribute.a a(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext) {
            return null;
        }

        private static String a(int i) {
            return null;
        }

        private static int a(String s) {
            return 0;
        }
    }

    public static class b extends LootItemFunction.a<LootItemFunctionSetAttribute> {

        public b() {
        }

        public void a(JsonObject jsonobject, LootItemFunctionSetAttribute lootitemfunctionsetattribute, JsonSerializationContext jsonserializationcontext) {
        }

        public LootItemFunctionSetAttribute a(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext, LootItemCondition[] alootitemcondition) {
            return null;
        }

        public LootItemFunction b(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext, LootItemCondition[] alootitemcondition) {
            return null;
        }
    }
}
