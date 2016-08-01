package net.minecraft.server;

import java.util.Calendar;
import javax.annotation.Nullable;
import org.bukkit.event.entity.EntityCombustEvent;

// CraftBukkit
public class EntitySkeleton extends EntityMonster implements IRangedEntity {

    private static final DataWatcherObject<Integer> a = null;

    private static final DataWatcherObject<Boolean> b = null;

    private final PathfinderGoalBowShoot c = null;

    private final PathfinderGoalMeleeAttack bx = null;

    public EntitySkeleton(World world) {
    }

    protected void r() {
    }

    protected void initAttributes() {
    }

    protected void i() {
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

    public boolean B(Entity entity) {
        return false;
    }

    public EnumMonsterType getMonsterType() {
        return null;
    }

    public void n() {
    }

    public void aw() {
    }

    public void die(DamageSource damagesource) {
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    protected void a(DifficultyDamageScaler difficultydamagescaler) {
    }

    @Nullable
    public GroupDataEntity prepare(DifficultyDamageScaler difficultydamagescaler, @Nullable GroupDataEntity groupdataentity) {
        return null;
    }

    public void o() {
    }

    public void a(EntityLiving entityliving, float f) {
    }

    public EnumSkeletonType getSkeletonType() {
        return null;
    }

    public void setSkeletonType(EnumSkeletonType enumskeletontype) {
    }

    private void b(EnumSkeletonType enumskeletontype) {
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void setSlot(EnumItemSlot enumitemslot, @Nullable ItemStack itemstack) {
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    public double ax() {
        return 0.0;
    }

    public void a(boolean flag) {
    }
}
