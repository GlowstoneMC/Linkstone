package net.minecraft.server;

public class WorldType {

    public static final WorldType[] types;

    public static final WorldType NORMAL;

    public static final WorldType FLAT;

    public static final WorldType LARGE_BIOMES;

    public static final WorldType AMPLIFIED;

    public static final WorldType CUSTOMIZED;

    public static final WorldType DEBUG_ALL_BLOCK_STATES;

    public static final WorldType NORMAL_1_1;

    private final int i;

    private final String name;

    private final int version;

    private boolean l;

    private boolean m;

    private boolean n;

    private WorldType(int i, String s) {
    }

    private WorldType(int i, String s, int j) {
    }

    public String name() {
        return null;
    }

    public int getVersion() {
        return 0;
    }

    public WorldType a(int i) {
        return null;
    }

    private WorldType a(boolean flag) {
        return null;
    }

    private WorldType i() {
        return null;
    }

    public boolean f() {
        return false;
    }

    public static WorldType getType(String s) {
        return null;
    }

    public int g() {
        return 0;
    }

    private WorldType j() {
        return null;
    }
}
