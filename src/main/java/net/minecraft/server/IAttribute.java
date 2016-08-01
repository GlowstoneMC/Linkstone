package net.minecraft.server;

import javax.annotation.Nullable;

public interface IAttribute {

    String getName() {
        return null;
    }

    double a(double d0) {
        return 0.0;
    }

    double b() {
        return 0.0;
    }

    boolean c() {
        return false;
    }

    @Nullable
    IAttribute d() {
        return null;
    }
}
