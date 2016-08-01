package net.minecraft.server;

import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class EntityGuardian extends EntityMonster {

    private static final DataWatcherObject<Byte> a = null;

    private static final DataWatcherObject<Integer> b = null;

    private float c = 0.0F;

    private float bx = 0.0F;

    private float by = 0.0F;

    private float bz = 0.0F;

    private float bA = 0.0F;

    private EntityLiving bB = null;

    private int bC = 0;

    private boolean bD = false;

    public PathfinderGoalRandomStroll goalRandomStroll = null;

    public EntityGuardian(World world) {
    }

    protected void r() {
    }

    public void initAttributes() {
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    protected NavigationAbstract b(World world) {
        return null;
    }

    protected void i() {
    }

    private boolean a(int i) {
        return false;
    }

    private void a(int i, boolean flag) {
    }

    public boolean o() {
        return false;
    }

    private void p(boolean flag) {
    }

    public int df() {
        return 0;
    }

    public boolean isElder() {
        return false;
    }

    public void setElder(boolean flag) {
    }

    private void b(int i) {
    }

    public boolean di() {
        return false;
    }

    public EntityLiving dj() {
        return null;
    }

    public void a(DataWatcherObject<?> datawatcherobject) {
    }

    public int C() {
        return 0;
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

    protected boolean playStepSound() {
        return false;
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    public float a(BlockPosition blockposition) {
        return 0.0F;
    }

    public void n() {
    }

    public float s(float f) {
        return 0.0F;
    }

    protected void M() {
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    protected boolean s_() {
        return false;
    }

    public boolean canSpawn() {
        return false;
    }

    public boolean cK() {
        return false;
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public int N() {
        return 0;
    }

    public void g(float f, float f1) {
    }

    static class ControllerMoveGuardian extends ControllerMove {

        private final EntityGuardian i = null;

        public ControllerMoveGuardian(EntityGuardian entityguardian) {
        }

        public void c() {
        }
    }

    static class PathfinderGoalGuardianAttack extends PathfinderGoal {

        private final EntityGuardian a = null;

        private int b = 0;

        public PathfinderGoalGuardianAttack(EntityGuardian entityguardian) {
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
    }

    static class EntitySelectorGuardianTargetHumanSquid implements Predicate<EntityLiving> {

        private final EntityGuardian a = null;

        public EntitySelectorGuardianTargetHumanSquid(EntityGuardian entityguardian) {
        }

        public boolean a(@Nullable EntityLiving entityliving) {
            return false;
        }

        public boolean apply(Object object) {
            return false;
        }
    }
}
