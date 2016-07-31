package net.minecraft.server;

import javax.annotation.Nullable;

public class EntityRabbit extends EntityAnimal {

    private static final DataWatcherObject<Integer> bx;

    private int by;

    private int bz;

    private boolean bB;

    private int bC;

    private int bD;

    public EntityRabbit(World world) {
    }

    // CraftBukkit start - code from constructor
    public void initializePathFinderGoals() {
    }

    // CraftBukkit end
    protected void r() {
    }

    protected float ck() {
        return 0.0F;
    }

    protected void cl() {
    }

    public void c(double d0) {
    }

    public void l(boolean flag) {
    }

    public void de() {
    }

    protected void i() {
    }

    public void M() {
    }

    public void am() {
    }

    private void a(double d0, double d1) {
    }

    private void di() {
    }

    private void dm() {
    }

    private void dn() {
    }

    private void do_() {
    }

    public void n() {
    }

    protected void initAttributes() {
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    protected SoundEffect df() {
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

    public boolean B(Entity entity) {
        return false;
    }

    public SoundCategory bC() {
        return null;
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    private boolean a(Item item) {
        return false;
    }

    public EntityRabbit b(EntityAgeable entityageable) {
        return null;
    }

    public boolean e(@Nullable ItemStack itemstack) {
        return false;
    }

    public int getRabbitType() {
        return 0;
    }

    public void setRabbitType(int i) {
    }

    @Nullable
    public GroupDataEntity prepare(DifficultyDamageScaler difficultydamagescaler, @Nullable GroupDataEntity groupdataentity) {
        return null;
    }

    private int dp() {
        return 0;
    }

    private boolean dq() {
        return false;
    }

    protected void dh() {
    }

    public void a(DataWatcherObject<?> datawatcherobject) {
    }

    public EntityAgeable createChild(EntityAgeable entityageable) {
        return null;
    }

    static class PathfinderGoalKillerRabbitMeleeAttack extends PathfinderGoalMeleeAttack {

        public PathfinderGoalKillerRabbitMeleeAttack(EntityRabbit entityrabbit) {
        }

        protected double a(EntityLiving entityliving) {
            return 0.0;
        }
    }

    static class PathfinderGoalRabbitPanic extends PathfinderGoalPanic {

        private final EntityRabbit b;

        public PathfinderGoalRabbitPanic(EntityRabbit entityrabbit, double d0) {
        }

        public void e() {
        }
    }

    static class PathfinderGoalEatCarrots extends PathfinderGoalGotoTarget {

        private final EntityRabbit c;

        private boolean d;

        private boolean e;

        public PathfinderGoalEatCarrots(EntityRabbit entityrabbit) {
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }

        protected boolean a(World world, BlockPosition blockposition) {
            return false;
        }
    }

    static class PathfinderGoalRabbitAvoidTarget<T extends Entity> extends PathfinderGoalAvoidTarget<T> {

        private final EntityRabbit c;

        public PathfinderGoalRabbitAvoidTarget(EntityRabbit entityrabbit, Class<T> oclass, float f, double d0, double d1) {
        }

        public boolean a() {
            return false;
        }
    }

    static class ControllerMoveRabbit extends ControllerMove {

        private final EntityRabbit i;

        private double j;

        public ControllerMoveRabbit(EntityRabbit entityrabbit) {
        }

        public void c() {
        }

        public void a(double d0, double d1, double d2, double d3) {
        }
    }

    public class ControllerJumpRabbit extends ControllerJump {

        private final EntityRabbit c;

        private boolean d;

        public ControllerJumpRabbit(EntityRabbit entityrabbit) {
        }

        public boolean c() {
            return false;
        }

        public boolean d() {
            return false;
        }

        public void a(boolean flag) {
        }

        public void b() {
        }
    }

    public static class GroupDataRabbit implements GroupDataEntity {

        public int a;

        public GroupDataRabbit(int i) {
        }
    }
}
