package net.minecraft.server;

import java.util.Collection;
import java.util.UUID;
import javax.annotation.Nullable;

public interface AttributeInstance {

    IAttribute getAttribute() {
        return null;
    }

    double b() {
        return 0.0;
    }

    void setValue(double d0) {
    }

    Collection<AttributeModifier> a(int i) {
        return null;
    }

    Collection<AttributeModifier> c() {
        return null;
    }

    boolean a(AttributeModifier attributemodifier) {
        return false;
    }

    @Nullable
    AttributeModifier a(UUID uuid) {
        return null;
    }

    void b(AttributeModifier attributemodifier) {
    }

    void c(AttributeModifier attributemodifier) {
    }

    void b(UUID uuid) {
    }

    double getValue() {
        return 0.0;
    }
}
