package net.minecraft.server;

public enum EnumCreatureType {

    MONSTER(IMonster.class, 70, Material.AIR, false, false), CREATURE(EntityAnimal.class, 10, Material.AIR, true, true), AMBIENT(EntityAmbient.class, 15, Material.AIR, true, false), WATER_CREATURE(EntityWaterAnimal.class, 5, Material.WATER, true, false);

    private final Class<? extends IAnimal> e = null;

    private final int f = 0;

    private final Material g = null;

    private final boolean h = false;

    private final boolean i = false;

    private EnumCreatureType(Class<? extends IAnimal> oclass, int i, Material material, boolean flag, boolean flag1) {
    }

    public Class<? extends IAnimal> a() {
        return null;
    }

    public int b() {
        return 0;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }
}
