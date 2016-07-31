package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.event.entity.SlimeSplitEvent;

// CraftBukkit end
public class EntitySlime extends EntityInsentient implements IMonster {

    private static final DataWatcherObject<Integer> bv;

    public float a;

    public float b;

    public float c;

    private boolean bw;

    public EntitySlime(World world) {
    }

    protected void r() {
    }

    protected void i() {
    }

    public void setSize(int i) {
    }

    public int getSize() {
        return 0;
    }

    public static void c(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public boolean dg() {
        return false;
    }

    protected EnumParticle o() {
        return null;
    }

    public void m() {
    }

    protected void da() {
    }

    protected int cZ() {
        return 0;
    }

    protected EntitySlime cY() {
        return null;
    }

    public void a(DataWatcherObject<?> datawatcherobject) {
    }

    public void die() {
    }

    public void collide(Entity entity) {
    }

    public void d(EntityHuman entityhuman) {
    }

    protected void d(EntityLiving entityliving) {
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    protected boolean db() {
        return false;
    }

    protected int dc() {
        return 0;
    }

    protected SoundEffect bV() {
        return null;
    }

    protected SoundEffect bW() {
        return null;
    }

    protected SoundEffect dd() {
        return null;
    }

    protected Item getLoot() {
        return null;
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    public boolean cK() {
        return false;
    }

    protected float ch() {
        return 0.0F;
    }

    public int N() {
        return 0;
    }

    protected boolean dh() {
        return false;
    }

    protected void cl() {
    }

    @Nullable
    public GroupDataEntity prepare(DifficultyDamageScaler difficultydamagescaler, @Nullable GroupDataEntity groupdataentity) {
        return null;
    }

    protected SoundEffect de() {
        return null;
    }

    static class PathfinderGoalSlimeIdle extends PathfinderGoal {

        private final EntitySlime a;

        public PathfinderGoalSlimeIdle(EntitySlime entityslime) {
        }

        public boolean a() {
            return false;
        }

        public void e() {
        }
    }

    static class PathfinderGoalSlimeRandomJump extends PathfinderGoal {

        private final EntitySlime a;

        public PathfinderGoalSlimeRandomJump(EntitySlime entityslime) {
        }

        public boolean a() {
            return false;
        }

        public void e() {
        }
    }

    static class PathfinderGoalSlimeRandomDirection extends PathfinderGoal {

        private final EntitySlime a;

        private float b;

        private int c;

        public PathfinderGoalSlimeRandomDirection(EntitySlime entityslime) {
        }

        public boolean a() {
            return false;
        }

        public void e() {
        }
    }

    static class PathfinderGoalSlimeNearestPlayer extends PathfinderGoal {

        private final EntitySlime a;

        private int b;

        public PathfinderGoalSlimeNearestPlayer(EntitySlime entityslime) {
        }

        public boolean a() {
            return false;
        }

        public void c() {
        }

        public boolean b() {
            return false;
        }

        public void e() {
        }
    }

    static class ControllerMoveSlime extends ControllerMove {

        private float i;

        private int j;

        private final EntitySlime k;

        private boolean l;

        public ControllerMoveSlime(EntitySlime entityslime) {
        }

        public void a(float f, boolean flag) {
        }

        public void a(double d0) {
        }

        public void c() {
        }
    }
}
