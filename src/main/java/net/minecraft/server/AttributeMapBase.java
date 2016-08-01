package net.minecraft.server;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public abstract class AttributeMapBase {

    protected final Map<IAttribute, AttributeInstance> a;

    protected final Map<String, AttributeInstance> b;

    protected final Multimap<IAttribute, IAttribute> c;

    public AttributeMapBase() {
    }

    public AttributeInstance a(IAttribute iattribute) {
        return null;
    }

    public AttributeInstance a(String s) {
        return null;
    }

    public AttributeInstance b(IAttribute iattribute) {
        return null;
    }

    protected abstract AttributeInstance c(IAttribute iattribute);

    public Collection<AttributeInstance> a() {
        return null;
    }

    public void a(AttributeInstance attributeinstance) {
    }

    public void a(Multimap<String, AttributeModifier> multimap) {
    }

    public void b(Multimap<String, AttributeModifier> multimap) {
    }
}
