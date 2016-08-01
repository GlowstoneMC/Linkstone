package net.minecraft.server;

import javax.annotation.Nullable;

public class EntitySquid extends EntityWaterAnimal {

    public float a;

    public float b;

    public float c;

    public float bv;

    public float bw;

    public float bx;

    public float by;

    public float bz;

    private float bA;

    private float bB;

    private float bC;

    private float bD;

    private float bE;

    private float bF;

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

        private final EntitySquid a;

        public PathfinderGoalSquid(EntitySquid entitysquid) {
        }

        public boolean a() {
            return false;
        }

        public void e() {
        }
    }
}
