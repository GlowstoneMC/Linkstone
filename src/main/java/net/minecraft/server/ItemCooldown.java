package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ItemCooldown {

    private final Map<Item, ItemCooldown.Info> a;

    private int b;

    public ItemCooldown() {
    }

    public boolean a(Item item) {
        return false;
    }

    public float a(Item item, float f) {
        return 0.0F;
    }

    public void a() {
    }

    public void a(Item item, int i) {
    }

    protected void b(Item item, int i) {
    }

    protected void c(Item item) {
    }

    static class SyntheticClass_1 {
    }

    class Info {

        final int a;

        final int b;

        private Info(int i, int j) {
        }

        Info(int i, int j, ItemCooldown.SyntheticClass_1 itemcooldown_syntheticclass_1) {
        }
    }
}
