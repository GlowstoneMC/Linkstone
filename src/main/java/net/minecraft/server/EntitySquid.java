package net.minecraft.server;

import javax.annotation.Nullable;

public class EntitySquid extends EntityWaterAnimal {

    public float a = 0.0F;

    public float b = 0.0F;

    public float c = 0.0F;

    public float bv = 0.0F;

    public float bw = 0.0F;

    public float bx = 0.0F;

    public float by = 0.0F;

    public float bz = 0.0F;

    private float bA = 0.0F;

    private float bB = 0.0F;

    private float bC = 0.0F;

    private float bD = 0.0F;

    private float bE = 0.0F;

    private float bF = 0.0F;

    public EntitySquid(World world) {
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    protected void r() {
    }

    protected void initAttributes() {
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    protected SoundEffect G() {
        return null;
    }

    protected SoundEffect bV() {
        return null;
    }

    protected SoundEffect bW() {
        return null;
    }

    protected float ch() {
        return 0.0F;
    }

    protected boolean playStepSound() {
        return false;
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    public boolean isInWater() {
        return false;
    }

    public void n() {
    }

    public void g(float f, float f1) {
    }

    public boolean cK() {
        return false;
    }

    public void b(float f, float f1, float f2) {
    }

    public boolean o() {
        return false;
    }

    static class PathfinderGoalSquid extends PathfinderGoal {

        private final EntitySquid a = null;

        public PathfinderGoalSquid(EntitySquid entitysquid) {
        }

        public boolean a() {
            return false;
        }

        public void e() {
        }
    }
}
