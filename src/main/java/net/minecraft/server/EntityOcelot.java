package net.minecraft.server;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class EntityOcelot extends EntityTameableAnimal {

    private static final DataWatcherObject<Integer> bB;

    private PathfinderGoalAvoidTarget<EntityHuman> bC;

    private PathfinderGoalTempt bD;

    public EntityOcelot(World world) {
    }

    protected void r() {
    }

    protected void i() {
    }

    public void M() {
    }

    protected boolean isTypeNotPersistent() {
        return false;
    }

    protected void initAttributes() {
    }

    public void e(float f, float f1) {
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    @Nullable
    protected SoundEffect G() {
        return null;
    }

    protected SoundEffect bV() {
        return null;
    }

    protected SoundEffect bW() {
        return null;
    }

    protected float ch() {
        return 0.0F;
    }

    public boolean B(Entity entity) {
        return false;
    }

    /* CraftBukkit start
    // Function disabled as it has no special function anymore after
    //   setSitting is disabled.
    public boolean damageEntity(DamageSource damagesource, float f) {
        if (this.isInvulnerable(damagesource)) {
            return false;
        } else {
            if (this.goalSit != null) {
                this.goalSit.setSitting(false);
            }

            return super.damageEntity(damagesource, f);
        }
    }
    // CraftBukkit end */
    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    public boolean a(EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack) {
        return false;
    }

    public EntityOcelot b(EntityAgeable entityageable) {
        return null;
    }

    public boolean e(@Nullable ItemStack itemstack) {
        return false;
    }

    public boolean mate(EntityAnimal entityanimal) {
        return false;
    }

    public int getCatType() {
        return 0;
    }

    public void setCatType(int i) {
    }

    public boolean cK() {
        return false;
    }

    public boolean canSpawn() {
        return false;
    }

    public String getName() {
        return null;
    }

    public void setTamed(boolean flag) {
    }

    protected void df() {
    }

    @Nullable
    public GroupDataEntity prepare(DifficultyDamageScaler difficultydamagescaler, @Nullable GroupDataEntity groupdataentity) {
        return null;
    }

    public EntityAgeable createChild(EntityAgeable entityageable) {
        return null;
    }
}
