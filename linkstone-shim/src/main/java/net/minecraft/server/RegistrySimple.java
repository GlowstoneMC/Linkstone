package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class RegistrySimple<K, V> implements IRegistry<K, V>  {
    private final Map<K, V> map = new HashMap<>();

    @Override
    public Iterator<V> iterator() {
        return map.values().iterator();
    }

    @Override
    @LOverride
    public void add(K key, V value) {
        map.put(key, value);
    }

}