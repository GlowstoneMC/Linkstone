package net.minecraft.server;

public class Material {

    public static final Material AIR = null;

    public static final Material GRASS = null;

    public static final Material EARTH = null;

    public static final Material WOOD = null;

    public static final Material STONE = null;

    public static final Material ORE = null;

    public static final Material HEAVY = null;

    public static final Material WATER = null;

    public static final Material LAVA = null;

    public static final Material LEAVES = null;

    public static final Material PLANT = null;

    public static final Material REPLACEABLE_PLANT = null;

    public static final Material SPONGE = null;

    public static final Material CLOTH = null;

    public static final Material FIRE = null;

    public static final Material SAND = null;

    public static final Material ORIENTABLE = null;

    public static final Material WOOL = null;

    public static final Material SHATTERABLE = null;

    public static final Material BUILDABLE_GLASS = null;

    public static final Material TNT = null;

    public static final Material CORAL = null;

    public static final Material ICE = null;

    public static final Material SNOW_LAYER = null;

    public static final Material PACKED_ICE = null;

    public static final Material SNOW_BLOCK = null;

    public static final Material CACTUS = null;

    public static final Material CLAY = null;

    public static final Material PUMPKIN = null;

    public static final Material DRAGON_EGG = null;

    public static final Material PORTAL = null;

    public static final Material CAKE = null;

    public static final Material WEB = null;

    public static final Material PISTON = null;

    public static final Material BANNER = null;

    public static final Material J = null;

    private boolean canBurn = false;

    private boolean L = false;

    private boolean M = false;

    private final MaterialMapColor N = null;

    private boolean O = false;

    private EnumPistonReaction P = null;

    private boolean Q = false;

    public Material(MaterialMapColor materialmapcolor) {
    }

    public boolean isLiquid() {
        return false;
    }

    public boolean isBuildable() {
        return false;
    }

    public boolean blocksLight() {
        return false;
    }

    public boolean isSolid() {
        return false;
    }

    private Material s() {
        return null;
    }

    protected Material f() {
        return null;
    }

    protected Material g() {
        return null;
    }

    public boolean isBurnable() {
        return false;
    }

    public Material i() {
        return null;
    }

    public boolean isReplaceable() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public boolean isAlwaysDestroyable() {
        return false;
    }

    public EnumPistonReaction getPushReaction() {
        return null;
    }

    protected Material n() {
        return null;
    }

    protected Material o() {
        return null;
    }

    protected Material p() {
        return null;
    }

    public MaterialMapColor r() {
        return null;
    }
}
