package org.bukkit.craftbukkit.attribute;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.attribute.AttributeModifier;

public class CraftAttributeInstance implements AttributeInstance {

    private final net.minecraft.server.AttributeInstance handle = null;

    private final Attribute attribute = null;

    public CraftAttributeInstance(net.minecraft.server.AttributeInstance handle, Attribute attribute) {
    }

    @Override
    public Attribute getAttribute() {
        return null;
    }

    @Override
    public double getBaseValue() {
        return 0.0;
    }

    @Override
    public void setBaseValue(double d) {
    }

    @Override
    public Collection<AttributeModifier> getModifiers() {
        return null;
    }

    @Override
    public void addModifier(AttributeModifier modifier) {
    }

    @Override
    public void removeModifier(AttributeModifier modifier) {
    }

    @Override
    public double getValue() {
        return 0.0;
    }

    private static net.minecraft.server.AttributeModifier convert(AttributeModifier bukkit) {
        return null;
    }

    private static AttributeModifier convert(net.minecraft.server.AttributeModifier nms) {
        return null;
    }
}
