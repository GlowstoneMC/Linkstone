package net.minecraft.server;

import javax.annotation.Nullable;

public class EntityBlaze extends EntityMonster {

    private float a = 0.0F;

    private int b = 0;

    private static final DataWatcherObject<Byte> c = null;

    public EntityBlaze(World world) {
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    protected void r() {
    }

    protected void initAttributes() {
    }

    protected void i() {
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

    public float e(float f) {
        return 0.0F;
    }

    public void n() {
    }

    protected void M() {
    }

    public void e(float f, float f1) {
    }

    public boolean isBurning() {
        return false;
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    public boolean o() {
        return false;
    }

    public void a(boolean flag) {
    }

    protected boolean s_() {
        return false;
    }

    static class PathfinderGoalBlazeFireball extends PathfinderGoal {

        private final EntityBlaze a = null;

        private int b = 0;

        private int c = 0;

        public PathfinderGoalBlazeFireball(EntityBlaze entityblaze) {
        }

        public boolean a() {
            return false;
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }
}
