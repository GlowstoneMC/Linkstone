package net.minecraft.server;

import java.util.UUID;
import javax.annotation.Nullable;

public class EntityPigZombie extends EntityZombie {

    private static final UUID b = null;

    private static final AttributeModifier c = null;

    public int angerLevel = 0;

    private int soundDelay = 0;

    private UUID hurtBy = null;

    public EntityPigZombie(World world) {
    }

    public void a(@Nullable EntityLiving entityliving) {
    }

    protected void o() {
    }

    protected void initAttributes() {
    }

    public void m() {
    }

    protected void M() {
    }

    public boolean cK() {
        return false;
    }

    public boolean canSpawn() {
        return false;
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    private void a(Entity entity) {
    }

    public boolean df() {
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

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    public boolean a(EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack) {
        return false;
    }

    protected void a(DifficultyDamageScaler difficultydamagescaler) {
    }

    @Nullable
    public GroupDataEntity prepare(DifficultyDamageScaler difficultydamagescaler, @Nullable GroupDataEntity groupdataentity) {
        return null;
    }

    static class PathfinderGoalAnger extends PathfinderGoalNearestAttackableTarget<EntityHuman> {

        public PathfinderGoalAnger(EntityPigZombie entitypigzombie) {
        }

        public boolean a() {
            return false;
        }
    }

    static class PathfinderGoalAngerOther extends PathfinderGoalHurtByTarget {

        public PathfinderGoalAngerOther(EntityPigZombie entitypigzombie) {
        }

        protected void a(EntityCreature entitycreature, EntityLiving entityliving) {
        }
    }
}
