package net.minecraft.server;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class RegistryBlockID<T> implements Registry<T> {

    private final IdentityHashMap<T, Integer> a = null;

    private final List<T> b = null;

    public RegistryBlockID() {
    }

    public RegistryBlockID(int i) {
    }

    public void a(T t0, int i) {
    }

    public int getId(T t0) {
        return 0;
    }

    @Nullable
    public final T fromId(int i) {
        return null;
    }

    public Iterator<T> iterator() {
        return null;
    }

    public int a() {
        return 0;
    }
}
