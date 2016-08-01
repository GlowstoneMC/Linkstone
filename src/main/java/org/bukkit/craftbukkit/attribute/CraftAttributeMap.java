package org.bukkit.craftbukkit.attribute;

import com.google.common.base.Preconditions;
import net.minecraft.server.AttributeMapBase;
import org.bukkit.attribute.Attributable;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;

public class CraftAttributeMap implements Attributable {

    private final AttributeMapBase handle = null;

    public CraftAttributeMap(AttributeMapBase handle) {
    }

    @Override
    public AttributeInstance getAttribute(Attribute attribute) {
        return null;
    }

    static String toMinecraft(String bukkit) {
        return null;
    }
}
