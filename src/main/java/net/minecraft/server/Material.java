package net.minecraft.server;

public class Material {

    public static final Material AIR;

    public static final Material GRASS;

    public static final Material EARTH;

    public static final Material WOOD;

    public static final Material STONE;

    public static final Material ORE;

    public static final Material HEAVY;

    public static final Material WATER;

    public static final Material LAVA;

    public static final Material LEAVES;

    public static final Material PLANT;

    public static final Material REPLACEABLE_PLANT;

    public static final Material SPONGE;

    public static final Material CLOTH;

    public static final Material FIRE;

    public static final Material SAND;

    public static final Material ORIENTABLE;

    public static final Material WOOL;

    public static final Material SHATTERABLE;

    public static final Material BUILDABLE_GLASS;

    public static final Material TNT;

    public static final Material CORAL;

    public static final Material ICE;

    public static final Material SNOW_LAYER;

    public static final Material PACKED_ICE;

    public static final Material SNOW_BLOCK;

    public static final Material CACTUS;

    public static final Material CLAY;

    public static final Material PUMPKIN;

    public static final Material DRAGON_EGG;

    public static final Material PORTAL;

    public static final Material CAKE;

    public static final Material WEB;

    public static final Material PISTON;

    public static final Material BANNER;

    public static final Material J;

    private boolean canBurn;

    private boolean L;

    private boolean M;

    private final MaterialMapColor N;

    private boolean O;

    private EnumPistonReaction P;

    private boolean Q;

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
