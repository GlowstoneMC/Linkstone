package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class EntityGhast extends EntityFlying implements IMonster {

    private static final DataWatcherObject<Boolean> a;

    private int b;

    public EntityGhast(World world) {
    }

    protected void r() {
    }

    public void a(boolean flag) {
    }

    public int getPower() {
        return 0;
    }

    public void m() {
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    protected void i() {
    }

    protected void initAttributes() {
    }

    public SoundCategory bC() {
        return null;
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

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    protected float ch() {
        return 0.0F;
    }

    public boolean cK() {
        return false;
    }

    public int cO() {
        return 0;
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    static class PathfinderGoalGhastAttackTarget extends PathfinderGoal {

        private final EntityGhast ghast;

        public int a;

        public PathfinderGoalGhastAttackTarget(EntityGhast entityghast) {
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

    static class PathfinderGoalGhastMoveTowardsTarget extends PathfinderGoal {

        private final EntityGhast a;

        public PathfinderGoalGhastMoveTowardsTarget(EntityGhast entityghast) {
        }

        public boolean a() {
            return false;
        }

        public void e() {
        }
    }

    static class PathfinderGoalGhastIdleMove extends PathfinderGoal {

        private final EntityGhast a;

        public PathfinderGoalGhastIdleMove(EntityGhast entityghast) {
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

    static class ControllerGhast extends ControllerMove {

        private final EntityGhast i;

        private int j;

        public ControllerGhast(EntityGhast entityghast) {
        }

        public void c() {
        }

        private boolean b(double d0, double d1, double d2, double d3) {
            return false;
        }
    }
}
