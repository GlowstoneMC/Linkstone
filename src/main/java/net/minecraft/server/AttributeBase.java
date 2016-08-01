package net.minecraft.server;

import javax.annotation.Nullable;

public abstract class AttributeBase implements IAttribute {

    private final IAttribute a;

    private final String b;

    private final double c;

    private boolean d;

    protected AttributeBase(@Nullable IAttribute iattribute, String s, double d0) {
    }

    public String getName() {
        return null;
    }

    public double b() {
        return 0.0;
    }

    public boolean c() {
        return false;
    }

    public AttributeBase a(boolean flag) {
        return null;
    }

    @Nullable
    public IAttribute d() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean equals(Object object) {
        return false;
    }
}
