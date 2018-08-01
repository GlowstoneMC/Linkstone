package com.mojang.authlib.properties;

import com.destroystokyo.paper.profile.ProfileProperty;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import net.glowstone.entity.meta.profile.GlowPlayerProfile;
import net.glowstone.linkstone.Linkstone;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Adapter from a {@link GlowPlayerProfile} to a {@link Multimap} of its properties.
 */
public class GlowPlayerProfileMultimapAdapter implements Multimap<String, Property> {
    private final GlowPlayerProfile glow;

    public GlowPlayerProfileMultimapAdapter(GlowPlayerProfile glow) {
        this.glow = glow;
    }

    @Override
    public int size() {
        return glow.getProperties().size();
    }

    @Override
    public boolean isEmpty() {
        return glow.getProperties().isEmpty();
    }

    @Override
    public boolean containsKey(@Nullable Object o) {
        if (o instanceof String) {
            return glow.hasProperty((String) o);
        }
        return false;
    }

    @Override
    public boolean containsValue(@Nullable Object o) {
        if (o instanceof Property) {
            Property other = (Property) o;
            for (ProfileProperty prop : glow.getProperties()) {
                if (other.glow.equals(prop)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsEntry(@Nullable Object oKey, @Nullable Object oValue) {
        if (oKey instanceof String && oValue instanceof Property) {
            String key = (String) oKey;
            Property value = (Property) oValue;

            for (ProfileProperty prop : glow.getProperties()) {
                if (Objects.equals(key, prop.getName()) && Objects.equals(value.glow, prop)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean put(@Nullable String key, @Nullable Property value) {
        boolean hadProperty = containsEntry(key, value);
        glow.setProperty(value.glow);
        return !hadProperty;
    }

    @Override
    public boolean remove(@Nullable Object oKey, @Nullable Object oValue) {
        if (oKey instanceof String && oValue instanceof Property) {
            String key = (String) oKey;
            Property value = (Property) oValue;

            return glow.getProperties().removeIf(p ->
                    Objects.equals(key, p.getName()) && Objects.equals(value.glow, p));
        }
        return false;
    }

    @Override
    public boolean putAll(@Nullable String key, Iterable<? extends Property> values) {
        boolean added = false;
        for (Property value : values) {
            if (!containsEntry(key, value)) {
                glow.setProperty(value.glow);
                added = true;
            }
        }
        return added;
    }

    @Override
    public boolean putAll(Multimap<? extends String, ? extends Property> multimap) {
        boolean added = false;
        for (Map.Entry<? extends String, ? extends Property> entry : multimap.entries()) {
            if (!containsEntry(entry.getKey(), entry.getValue())) {
                glow.setProperty(entry.getValue().glow);
                added = true;
            }
        }
        return added;
    }

    @Override
    public Collection<Property> replaceValues(@Nullable String key, Iterable<? extends Property> iterable) {
        Collection<Property> previousValues = get(key);

        glow.removeProperty(key);

        putAll(key, iterable);

        return previousValues;
    }

    @Override
    public Collection<Property> removeAll(@Nullable Object oKey) {
        if (oKey instanceof String) {
            String key = (String) oKey;

            Collection<Property> previousValues = get(key);
            glow.removeProperty(key);
            return previousValues;
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public void clear() {
        glow.clearProperties();
    }

    @Override
    public Collection<Property> get(@Nullable String key) {
        return glow.getProperties().stream()
                .filter(p -> p.getName().equals(key))
                .map(Linkstone::<Property>box)
                .collect(Collectors.toList());
    }

    @Override
    public Set<String> keySet() {
        return glow.getProperties().stream()
                .map(ProfileProperty::getName)
                .collect(Collectors.toSet());
    }

    @Override
    public Multiset<String> keys() {
        return glow.getProperties().stream()
                .map(ProfileProperty::getName)
                .collect(Collectors.toCollection(HashMultiset::create));
    }

    @Override
    public Collection<Property> values() {
        return glow.getProperties().stream()
                .map(Linkstone::<Property>box)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<Map.Entry<String, Property>> entries() {
        return glow.getProperties().stream()
                .map(p -> new Map.Entry<String, Property>() {
                    @Override
                    public String getKey() {
                        return p.getName();
                    }

                    @Override
                    public Property getValue() {
                        return Linkstone.box(p);
                    }

                    @Override
                    public Property setValue(Property value) {
                        return null;
                    }

                    @Override
                    public boolean equals(Object o) {
                        if (this == o) return true;
                        if (o == null || getClass() != o.getClass()) return false;
                        Map.Entry<String, Property> that = (Map.Entry<String, Property>) o;
                        return Objects.equals(this.getKey(), that.getKey()) &&
                                Objects.equals(this.getValue(), that.getValue());
                    }

                    @Override
                    public int hashCode() {
                        return Objects.hash(super.hashCode(), glow);
                    }
                }).collect(Collectors.toList());
    }

    @Override
    public Map<String, Collection<Property>> asMap() {
        return glow.getProperties().stream()
                .map(Linkstone::<Property>box)
                .collect(Collectors.groupingBy(Property::getName, Collectors.toCollection(ArrayList::new)));
    }
}
