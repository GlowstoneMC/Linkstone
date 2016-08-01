package net.minecraft.server;

import javax.annotation.Nullable;

public class IntHashMap<V> {

    private transient IntHashMap.IntHashMapEntry<V>[] a;

    private transient int b;

    private int c;

    private final float d;

    public IntHashMap() {
    }

    private static int g(int i) {
        return 0;
    }

    private static int a(int i, int j) {
        return 0;
    }

    @Nullable
    public V get(int i) {
        return null;
    }

    public boolean b(int i) {
        return false;
    }

    @Nullable
    final IntHashMap.IntHashMapEntry<V> c(int i) {
        return null;
    }

    public void a(int i, V v0) {
    }

    private void h(int i) {
    }

    private void a(IntHashMap.IntHashMapEntry<V>[] ainthashmap_inthashmapentry) {
    }

    @Nullable
    public V d(int i) {
        return null;
    }

    @Nullable
    final IntHashMap.IntHashMapEntry<V> e(int i) {
        return null;
    }

    public void c() {
    }

    private void a(int i, int j, V v0, int k) {
    }

    static class IntHashMapEntry<V> {

        final int a;

        V b;

        IntHashMap.IntHashMapEntry<V> c;

        final int d;

        IntHashMapEntry(int i, int j, V v0, IntHashMap.IntHashMapEntry<V> inthashmap_inthashmapentry) {
        }

        public final int a() {
            return 0;
        }

        public final V b() {
            return null;
        }

        public final boolean equals(Object object) {
            return false;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return null;
        }
    }
}
