package net.minecraft.server;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EntitySlice<T> extends AbstractSet<T> {

    private static final Set<Class<?>> a;

    // CraftBukkit
    private final Map<Class<?>, List<T>> b;

    private final Set<Class<?>> c;

    private final Class<T> d;

    private final List<T> e;

    public EntitySlice(Class<T> oclass) {
    }

    protected void a(Class<?> oclass) {
    }

    protected Class<?> b(Class<?> oclass) {
        return null;
    }

    public boolean add(T t0) {
        return false;
    }

    private void a(T t0, Class<?> oclass) {
    }

    public boolean remove(Object object) {
        return false;
    }

    public boolean contains(Object object) {
        return false;
    }

    public <S> Iterable<S> c(final Class<S> oclass) {
        return null;
    }

    public Iterator<T> iterator() {
        return null;
    }

    public int size() {
        return 0;
    }
}
