package net.minecraft.server;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import javax.annotation.Nullable;

public class RegistryID<K> implements Registry<K>, Iterable<K> {

    private static final Object a;

    private K[] b;

    private int[] c;

    private K[] d;

    private int e;

    private int f;

    public RegistryID(int i) {
    }

    public int getId(K k0) {
        return 0;
    }

    @Nullable
    public K fromId(int i) {
        return null;
    }

    private int c(int i) {
        return 0;
    }

    public int c(K k0) {
        return 0;
    }

    private int c() {
        return 0;
    }

    private void d(int i) {
    }

    public void a(K k0, int i) {
    }

    private int d(K k0) {
        return 0;
    }

    private int b(K k0, int i) {
        return 0;
    }

    private int e(int i) {
        return 0;
    }

    public Iterator<K> iterator() {
        return null;
    }

    public int b() {
        return 0;
    }
}
