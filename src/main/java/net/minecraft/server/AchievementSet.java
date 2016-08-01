package net.minecraft.server;

import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Iterator;
import java.util.Set;

public class AchievementSet extends ForwardingSet<String> implements IJsonStatistic {

    private final Set<String> a;

    public AchievementSet() {
    }

    public void a(JsonElement jsonelement) {
    }

    public JsonElement a() {
        return null;
    }

    protected Set<String> delegate() {
        return null;
    }
}
