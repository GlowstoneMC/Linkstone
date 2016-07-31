package net.minecraft.server;

import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
//CraftBukkit start
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityCombustByEntityEvent;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.event.entity.EntityTargetEvent;

//CraftBukkit end
public class EntityZombie extends EntityMonster {

    protected static final IAttribute a;

    private static final UUID b;

    private static final AttributeModifier c;

    private static final DataWatcherObject<Boolean> bx;

    private static final DataWatcherObject<Integer> by;

    private static final DataWatcherObject<Boolean> bz;

    private static final DataWatcherObject<Boolean> bA;

    private final PathfinderGoalBreakDoor bB;

    private int bC;

    private boolean bD;

    private float bE;

    private float bF;

    private int lastTick;

    // CraftBukkit - add field
    public EntityZombie(World world) {
    }

    protected void r() {
    }

    protected void o() {
    }

    protected void initAttributes() {
    }

    protected void i() {
    }

    public void a(boolean flag) {
    }

    public boolean dh() {
        return false;
    }

    public void p(boolean flag) {
    }

    public boolean isBaby() {
        return false;
    }

    protected int getExpValue(EntityHuman entityhuman) {
        return 0;
    }

    public void setBaby(boolean flag) {
    }

    public EnumZombieType getVillagerType() {
        return null;
    }

    public boolean isVillager() {
        return false;
    }

    public int dk() {
        return 0;
    }

    public void setVillagerType(EnumZombieType enumzombietype) {
    }

    public void a(DataWatcherObject<?> datawatcherobject) {
    }

    public void n() {
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public void m() {
    }

    public boolean B(Entity entity) {
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

    protected void a(BlockPosition blockposition, Block block) {
    }

    public EnumMonsterType getMonsterType() {
        return null;
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    protected void a(DifficultyDamageScaler difficultydamagescaler) {
    }

    public static void d(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void b(EntityLiving entityliving) {
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    protected boolean c(ItemStack itemstack) {
        return false;
    }

    @Nullable
    public GroupDataEntity prepare(DifficultyDamageScaler difficultydamagescaler, @Nullable GroupDataEntity groupdataentity) {
        return null;
    }

    public boolean a(EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack) {
        return false;
    }

    protected void a(int i) {
    }

    protected boolean isTypeNotPersistent() {
        return false;
    }

    public boolean isConverting() {
        return false;
    }

    protected void dm() {
    }

    protected int getConversionTime() {
        return 0;
    }

    public void r(boolean flag) {
    }

    public final void setSize(float f, float f1) {
    }

    protected final void a(float f) {
    }

    public double ax() {
        return 0.0;
    }

    public void die(DamageSource damagesource) {
    }

    public String getName() {
        return null;
    }

    static class SyntheticClass_1 {
    }

    class GroupDataZombie implements GroupDataEntity {

        public boolean a;

        public boolean b;

        private GroupDataZombie(boolean flag, boolean flag1) {
        }

        GroupDataZombie(boolean flag, boolean flag1, EntityZombie.SyntheticClass_1 entityzombie_syntheticclass_1) {
        }
    }
}
