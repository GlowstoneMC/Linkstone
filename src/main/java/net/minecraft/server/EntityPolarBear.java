package net.minecraft.server;

import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class EntityPolarBear extends EntityAnimal {

    private static final DataWatcherObject<Boolean> bx = null;

    private float by = 0.0F;

    private float bz = 0.0F;

    private int bB = 0;

    public EntityPolarBear(World world) {
    }

    public EntityAgeable createChild(EntityAgeable entityageable) {
        return null;
    }

    public boolean e(ItemStack itemstack) {
        return false;
    }

    protected void r() {
    }

    protected void initAttributes() {
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

    protected void de() {
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    protected void i() {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void m() {
    }

    public boolean B(Entity entity) {
        return false;
    }

    public boolean df() {
        return false;
    }

    public void p(boolean flag) {
    }

    protected float co() {
        return 0.0F;
    }

    public GroupDataEntity prepare(DifficultyDamageScaler difficultydamagescaler, GroupDataEntity groupdataentity) {
        return null;
    }

    static class SyntheticClass_1 {
    }

    class e extends PathfinderGoalPanic {

        public e() {
        }

        public boolean a() {
            return false;
        }
    }

    class d extends PathfinderGoalMeleeAttack {

        public d() {
        }

        protected void a(EntityLiving entityliving, double d0) {
        }

        public void d() {
        }

        protected double a(EntityLiving entityliving) {
            return 0.0;
        }
    }

    class a extends PathfinderGoalNearestAttackableTarget<EntityHuman> {

        public a() {
        }

        public boolean a() {
            return false;
        }

        protected double i() {
            return 0.0;
        }
    }

    class c extends PathfinderGoalHurtByTarget {

        public c() {
        }

        public void c() {
        }

        protected void a(EntityCreature entitycreature, EntityLiving entityliving) {
        }
    }

    static class b implements GroupDataEntity {

        public boolean a = false;

        private b() {
        }

        b(EntityPolarBear.SyntheticClass_1 entitypolarbear_syntheticclass_1) {
        }
    }
}
