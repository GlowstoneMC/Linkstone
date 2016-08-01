package net.minecraft.server;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;

public class RegistryMaterials<K, V> extends RegistrySimple<K, V> implements Registry<V> {

    protected final RegistryID<V> a;

    protected final Map<V, K> b;

    public RegistryMaterials() {
    }

    public void a(int i, K k0, V v0) {
    }

    protected Map<K, V> b() {
        return null;
    }

    @Nullable
    public V get(@Nullable K k0) {
        return null;
    }

    @Nullable
    public K b(V v0) {
        return null;
    }

    public boolean d(K k0) {
        return false;
    }

    public int a(V v0) {
        return 0;
    }

    @Nullable
    public V getId(int i) {
        return null;
    }

    public Iterator<V> iterator() {
        return null;
    }
}
