package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class EntitySilverfish extends EntityMonster {

    private EntitySilverfish.PathfinderGoalSilverfishWakeOthers a = null;

    public EntitySilverfish(World world) {
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    protected void r() {
    }

    public double ax() {
        return 0.0;
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    protected void initAttributes() {
    }

    protected boolean playStepSound() {
        return false;
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

    protected void a(BlockPosition blockposition, Block block) {
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    public void m() {
    }

    public float a(BlockPosition blockposition) {
        return 0.0F;
    }

    protected boolean s_() {
        return false;
    }

    public boolean cK() {
        return false;
    }

    public EnumMonsterType getMonsterType() {
        return null;
    }

    static class PathfinderGoalSilverfishHideInBlock extends PathfinderGoalRandomStroll {

        private final EntitySilverfish silverfish = null;

        private EnumDirection b = null;

        private boolean c = false;

        public PathfinderGoalSilverfishHideInBlock(EntitySilverfish entitysilverfish) {
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public void c() {
        }
    }

    static class PathfinderGoalSilverfishWakeOthers extends PathfinderGoal {

        private final EntitySilverfish silverfish = null;

        private int b = 0;

        public PathfinderGoalSilverfishWakeOthers(EntitySilverfish entitysilverfish) {
        }

        public void f() {
        }

        public boolean a() {
            return false;
        }

        public void e() {
        }
    }
}
