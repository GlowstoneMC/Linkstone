package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.craftbukkit.entity.CraftLivingEntity;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.EntityUnleashEvent;
import org.bukkit.event.entity.EntityUnleashEvent.UnleashReason;

// CraftBukkit end
public abstract class EntityInsentient extends EntityLiving {

    private static final DataWatcherObject<Byte> a = null;

    public int a_ = 0;

    protected int b_ = 0;

    private final ControllerLook lookController = null;

    protected ControllerMove moveController = null;

    protected ControllerJump g = null;

    private final EntityAIBodyControl c = null;

    protected NavigationAbstract navigation = null;

    public PathfinderGoalSelector goalSelector = null;

    public PathfinderGoalSelector targetSelector = null;

    private EntityLiving goalTarget = null;

    private final EntitySenses bw = null;

    private final ItemStack[] bx = null;

    public float[] dropChanceHand = null;

    private final ItemStack[] by = null;

    public float[] dropChanceArmor = null;

    public boolean canPickUpLoot = false;

    public boolean persistent = false;

    private final Map<PathType, Float> bB = null;

    private MinecraftKey bC = null;

    private long bD = 0;

    private boolean bE = false;

    private Entity leashHolder = null;

    private NBTTagCompound bG = null;

    public EntityInsentient(World world) {
    }

    protected void r() {
    }

    protected void initAttributes() {
    }

    protected NavigationAbstract b(World world) {
        return null;
    }

    public float a(PathType pathtype) {
        return 0.0F;
    }

    public void a(PathType pathtype, float f) {
    }

    protected EntityAIBodyControl s() {
        return null;
    }

    public ControllerLook getControllerLook() {
        return null;
    }

    public ControllerMove getControllerMove() {
        return null;
    }

    public ControllerJump getControllerJump() {
        return null;
    }

    public NavigationAbstract getNavigation() {
        return null;
    }

    public EntitySenses getEntitySenses() {
        return null;
    }

    @Nullable
    public EntityLiving getGoalTarget() {
        return null;
    }

    public void setGoalTarget(@Nullable EntityLiving entityliving) {
    }

    public boolean setGoalTarget(EntityLiving entityliving, EntityTargetEvent.TargetReason reason, boolean fireEvent) {
        return false;
    }

    public boolean d(Class<? extends EntityLiving> oclass) {
        return false;
    }

    public void A() {
    }

    protected void i() {
    }

    public int C() {
        return 0;
    }

    public void D() {
    }

    public void U() {
    }

    protected void c(DamageSource damagesource) {
    }

    private void o() {
    }

    protected int getExpValue(EntityHuman entityhuman) {
        return 0;
    }

    public void doSpawnEffect() {
    }

    public void m() {
    }

    protected float h(float f, float f1) {
        return 0.0F;
    }

    @Nullable
    protected SoundEffect G() {
        return null;
    }

    @Nullable
    protected Item getLoot() {
        return null;
    }

    protected void dropDeathLoot(boolean flag, int i) {
    }

    public static void a(DataConverterManager dataconvertermanager, String s) {
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    protected void a(boolean flag, int i, DamageSource damagesource) {
    }

    public void o(float f) {
    }

    public void p(float f) {
    }

    public void l(float f) {
    }

    public void n() {
    }

    protected void a(EntityItem entityitem) {
    }

    protected boolean c(ItemStack itemstack) {
        return false;
    }

    protected boolean isTypeNotPersistent() {
        return false;
    }

    protected void L() {
    }

    protected final void doTick() {
    }

    protected void M() {
    }

    public int N() {
        return 0;
    }

    public int cJ() {
        return 0;
    }

    public void a(Entity entity, float f, float f1) {
    }

    private float b(float f, float f1, float f2) {
        return 0.0F;
    }

    public boolean cK() {
        return false;
    }

    public boolean canSpawn() {
        return false;
    }

    public int cO() {
        return 0;
    }

    public int aY() {
        return 0;
    }

    public Iterable<ItemStack> aG() {
        return null;
    }

    public Iterable<ItemStack> getArmorItems() {
        return null;
    }

    @Nullable
    public ItemStack getEquipment(EnumItemSlot enumitemslot) {
        return null;
    }

    public void setSlot(EnumItemSlot enumitemslot, @Nullable ItemStack itemstack) {
    }

    protected void dropEquipment(boolean flag, int i) {
    }

    protected void a(DifficultyDamageScaler difficultydamagescaler) {
    }

    public static EnumItemSlot d(ItemStack itemstack) {
        return null;
    }

    public static Item a(EnumItemSlot enumitemslot, int i) {
        return null;
    }

    protected void b(DifficultyDamageScaler difficultydamagescaler) {
    }

    @Nullable
    public GroupDataEntity prepare(DifficultyDamageScaler difficultydamagescaler, @Nullable GroupDataEntity groupdataentity) {
        return null;
    }

    public boolean cP() {
        return false;
    }

    public void cQ() {
    }

    public void a(EnumItemSlot enumitemslot, float f) {
    }

    public boolean cR() {
        return false;
    }

    public void m(boolean flag) {
    }

    public boolean isPersistent() {
        return false;
    }

    public final boolean a(EntityHuman entityhuman, @Nullable ItemStack itemstack, EnumHand enumhand) {
        return false;
    }

    protected boolean a(EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack) {
        return false;
    }

    protected void cT() {
    }

    public void unleash(boolean flag, boolean flag1) {
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    public boolean isLeashed() {
        return false;
    }

    public Entity getLeashHolder() {
        return null;
    }

    public void setLeashHolder(Entity entity, boolean flag) {
    }

    public boolean a(Entity entity, boolean flag) {
        return false;
    }

    private void cY() {
    }

    public boolean c(int i, @Nullable ItemStack itemstack) {
        return false;
    }

    public static boolean b(EnumItemSlot enumitemslot, ItemStack itemstack) {
        return false;
    }

    public boolean ct() {
        return false;
    }

    public void setAI(boolean flag) {
    }

    public void o(boolean flag) {
    }

    public boolean hasAI() {
        return false;
    }

    public boolean cX() {
        return false;
    }

    public EnumMainHand getMainHand() {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static final int[] b = null;

        static {
        }
    }

    public static enum EnumEntityPositionType {

        ON_GROUND, IN_AIR, IN_WATER;

        private EnumEntityPositionType() {
        }
    }
}
