package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class EntitySpider extends EntityMonster {

    private static final DataWatcherObject<Byte> a;

    public EntitySpider(World world) {
    }

    public static void d(DataConverterManager dataconvertermanager) {
    }

    protected void r() {
    }

    public double ay() {
        return 0.0;
    }

    protected NavigationAbstract b(World world) {
        return null;
    }

    protected void i() {
    }

    public void m() {
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

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    public boolean m_() {
        return false;
    }

    public void aS() {
    }

    public EnumMonsterType getMonsterType() {
        return null;
    }

    public boolean d(MobEffect mobeffect) {
        return false;
    }

    public boolean o() {
        return false;
    }

    public void a(boolean flag) {
    }

    @Nullable
    public GroupDataEntity prepare(DifficultyDamageScaler difficultydamagescaler, @Nullable GroupDataEntity groupdataentity) {
        return null;
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    static class PathfinderGoalSpiderNearestAttackableTarget<T extends EntityLiving> extends PathfinderGoalNearestAttackableTarget<T> {

        public PathfinderGoalSpiderNearestAttackableTarget(EntitySpider entityspider, Class<T> oclass) {
        }

        public boolean a() {
            return false;
        }
    }

    static class PathfinderGoalSpiderMeleeAttack extends PathfinderGoalMeleeAttack {

        public PathfinderGoalSpiderMeleeAttack(EntitySpider entityspider) {
        }

        public boolean b() {
            return false;
        }

        protected double a(EntityLiving entityliving) {
            return 0.0;
        }
    }

    public static class GroupDataSpider implements GroupDataEntity {

        public MobEffectList a;

        public GroupDataSpider() {
        }

        public void a(Random random) {
        }
    }
}
