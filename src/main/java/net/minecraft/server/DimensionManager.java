package net.minecraft.server;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum DimensionManager {

    OVERWORLD(0, "Overworld", "", WorldProviderNormal.class), NETHER(-1, "Nether", "_nether", WorldProviderHell.class), THE_END(1, "The End", "_end", WorldProviderTheEnd.class);

    private final int d;

    private final String e;

    private final String f;

    private final Class<? extends WorldProvider> g;

    private DimensionManager(int i, String s, String s1, Class<? extends WorldProvider> oclass) {
    }

    public int getDimensionID() {
        return 0;
    }

    public String b() {
        return null;
    }

    public String c() {
        return null;
    }

    public WorldProvider d() {
        return null;
    }

    public static DimensionManager a(int i) {
        return null;
    }
}
