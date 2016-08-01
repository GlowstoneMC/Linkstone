package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public class LootItemConditionKilledByPlayer implements LootItemCondition {

    private final boolean a = false;

    public LootItemConditionKilledByPlayer(boolean flag) {
    }

    public boolean a(Random random, LootTableInfo loottableinfo) {
        return false;
    }

    public static class a extends LootItemCondition.a<LootItemConditionKilledByPlayer> {

        protected a() {
        }

        public void a(JsonObject jsonobject, LootItemConditionKilledByPlayer lootitemconditionkilledbyplayer, JsonSerializationContext jsonserializationcontext) {
        }

        public LootItemConditionKilledByPlayer a(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext) {
            return null;
        }

        public LootItemCondition b(JsonObject jsonobject, JsonDeserializationContext jsondeserializationcontext) {
            return null;
        }
    }
}
