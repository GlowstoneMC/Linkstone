package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegistrySimple<K, V> implements IRegistry<K, V> {

    private static final Logger a;

    protected final Map<K, V> c;

    private Object[] b;

    public RegistrySimple() {
    }

    protected Map<K, V> b() {
        return null;
    }

    @Nullable
    public V get(@Nullable K k0) {
        return null;
    }

    public void a(K k0, V v0) {
    }

    public Set<K> keySet() {
        return null;
    }

    @Nullable
    public V a(Random random) {
        return null;
    }

    public boolean d(K k0) {
        return false;
    }

    public Iterator<V> iterator() {
        return null;
    }
}
