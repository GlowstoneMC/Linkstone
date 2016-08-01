package net.minecraft.server;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum DimensionManager {

    OVERWORLD(0, "Overworld", "", WorldProviderNormal.class), NETHER(-1, "Nether", "_nether", WorldProviderHell.class), THE_END(1, "The End", "_end", WorldProviderTheEnd.class);

    private final int d = 0;

    private final String e = null;

    private final String f = null;

    private final Class<? extends WorldProvider> g = null;

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
