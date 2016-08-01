package net.minecraft.server;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class EntityShulker extends EntityGolem implements IMonster {

    private static final UUID bx;

    private static final AttributeModifier by;

    protected static final DataWatcherObject<EnumDirection> a;

    protected static final DataWatcherObject<Optional<BlockPosition>> b;

    protected static final DataWatcherObject<Byte> c;

    private float bz;

    private float bA;

    private BlockPosition bB;

    private int bC;

    public EntityShulker(World world) {
    }

    @Nullable
    public GroupDataEntity prepare(DifficultyDamageScaler difficultydamagescaler, @Nullable GroupDataEntity groupdataentity) {
        return null;
    }

    protected void r() {
    }

    protected boolean playStepSound() {
        return false;
    }

    public SoundCategory bC() {
        return null;
    }

    protected SoundEffect G() {
        return null;
    }

    public void D() {
    }

    protected SoundEffect bW() {
        return null;
    }

    protected SoundEffect bV() {
        return null;
    }

    protected void i() {
    }

    protected void initAttributes() {
    }

    protected EntityAIBodyControl s() {
        return null;
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void m() {
    }

    public void setPosition(double d0, double d1, double d2) {
    }

    protected boolean o() {
        return false;
    }

    public void n() {
    }

    public void a(DataWatcherObject<?> datawatcherobject) {
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    private boolean dk() {
        return false;
    }

    @Nullable
    public AxisAlignedBB ag() {
        return null;
    }

    public EnumDirection de() {
        return null;
    }

    @Nullable
    public BlockPosition df() {
        return null;
    }

    public void g(@Nullable BlockPosition blockposition) {
    }

    public int dg() {
        return 0;
    }

    public void a(int i) {
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    public int N() {
        return 0;
    }

    public int cJ() {
        return 0;
    }

    public void collide(Entity entity) {
    }

    public float aA() {
        return 0.0F;
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }

    static class c extends PathfinderGoalNearestAttackableTarget<EntityLiving> {

        public c(EntityShulker entityshulker) {
        }

        public boolean a() {
            return false;
        }

        protected AxisAlignedBB a(double d0) {
            return null;
        }
    }

    class d extends PathfinderGoalNearestAttackableTarget<EntityHuman> {

        public d(EntityShulker entityshulker) {
        }

        public boolean a() {
            return false;
        }

        protected AxisAlignedBB a(double d0) {
            return null;
        }
    }

    class a extends PathfinderGoal {

        private int b;

        public a() {
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

    class e extends PathfinderGoal {

        private int b;

        private e() {
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

        e(EntityShulker.SyntheticClass_1 entityshulker_syntheticclass_1) {
        }
    }

    class b extends EntityAIBodyControl {

        public b(EntityLiving entityliving) {
        }

        public void a() {
        }
    }
}
