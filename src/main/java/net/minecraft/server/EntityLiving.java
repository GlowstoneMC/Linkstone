package net.minecraft.server;

import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
// CraftBukkit start
import java.util.ArrayList;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.bukkit.Location;
import org.bukkit.craftbukkit.attribute.CraftAttributeMap;
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageModifier;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.EntityTeleportEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;

// CraftBukkit end
public abstract class EntityLiving extends Entity {

    private static final UUID a = null;

    private static final AttributeModifier b = null;

    protected static final DataWatcherObject<Byte> au = null;

    public static final DataWatcherObject<Float> HEALTH = null;

    private static final DataWatcherObject<Integer> f = null;

    private static final DataWatcherObject<Boolean> g = null;

    private static final DataWatcherObject<Integer> h = null;

    private AttributeMapBase br = null;

    public CombatTracker combatTracker = null;

    public final Map<MobEffectList, MobEffect> effects = null;

    private final ItemStack[] bu = null;

    private final ItemStack[] bv = null;

    public boolean av = false;

    public EnumHand aw = null;

    public int ax = 0;

    public int ay = 0;

    public int hurtTicks = 0;

    public int aA = 0;

    public float aB = 0.0F;

    public int deathTicks = 0;

    public float aD = 0.0F;

    public float aE = 0.0F;

    protected int aF = 0;

    public float aG = 0.0F;

    public float aH = 0.0F;

    public float aI = 0.0F;

    public int maxNoDamageTicks = 0;

    public float aK = 0.0F;

    public float aL = 0.0F;

    public float aM = 0.0F;

    public float aN = 0.0F;

    public float aO = 0.0F;

    public float aP = 0.0F;

    public float aQ = 0.0F;

    public float aR = 0.0F;

    public float aS = 0.0F;

    public EntityHuman killer = null;

    protected int lastDamageByPlayerTime = 0;

    protected boolean aV = false;

    protected int ticksFarFromPlayer = 0;

    protected float aX = 0.0F;

    protected float aY = 0.0F;

    protected float aZ = 0.0F;

    protected float ba = 0.0F;

    protected float bb = 0.0F;

    protected int bc = 0;

    public float lastDamage = 0.0F;

    protected boolean be = false;

    public float bf = 0.0F;

    public float bg = 0.0F;

    public float bh = 0.0F;

    protected int bi = 0;

    protected double bj = 0.0;

    protected double bk = 0.0;

    protected double bl = 0.0;

    protected double bm = 0.0;

    protected double bn = 0.0;

    public boolean updateEffects = false;

    public EntityLiving lastDamager = null;

    public int hurtTimestamp = 0;

    private EntityLiving bz = null;

    private int bA = 0;

    private float bB = 0.0F;

    private int bC = 0;

    private float bD = 0.0F;

    protected ItemStack bo = null;

    protected int bp = 0;

    protected int bq = 0;

    private BlockPosition bE = null;

    private DamageSource bF = null;

    private long bG = 0;

    // CraftBukkit start
    public int expToDrop = 0;

    public int maxAirTicks = 0;

    boolean forceDrops = false;

    ArrayList<org.bukkit.inventory.ItemStack> drops = null;

    public org.bukkit.craftbukkit.attribute.CraftAttributeMap craftAttributes = null;

    public boolean collides = false;

    // CraftBukkit end
    public void Q() {
    }

    public EntityLiving(World world) {
    }

    protected void i() {
    }

    protected void initAttributes() {
    }

    protected void a(double d0, boolean flag, IBlockData iblockdata, BlockPosition blockposition) {
    }

    public boolean bE() {
        return false;
    }

    public void U() {
    }

    // CraftBukkit start
    public int getExpReward() {
        return 0;
    }

    // CraftBukkit end
    protected void b(BlockPosition blockposition) {
    }

    public boolean isBaby() {
        return false;
    }

    protected void bF() {
    }

    protected boolean isDropExperience() {
        return false;
    }

    protected int d(int i) {
        return 0;
    }

    protected int getExpValue(EntityHuman entityhuman) {
        return 0;
    }

    protected boolean alwaysGivesExp() {
        return false;
    }

    public Random getRandom() {
        return null;
    }

    public EntityLiving getLastDamager() {
        return null;
    }

    public int bK() {
        return 0;
    }

    public void a(@Nullable EntityLiving entityliving) {
    }

    public EntityLiving bL() {
        return null;
    }

    public int bM() {
        return 0;
    }

    public void z(Entity entity) {
    }

    public int bN() {
        return 0;
    }

    protected void a_(@Nullable ItemStack itemstack) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    // CraftBukkit start
    private boolean isTickingEffects = false;

    private List<Object> effectsToProcess = null;

    // CraftBukkit end
    protected void tickPotionEffects() {
    }

    protected void F() {
    }

    public static boolean a(Collection<MobEffect> collection) {
        return false;
    }

    protected void bP() {
    }

    public void removeAllEffects() {
    }

    public Collection<MobEffect> getEffects() {
        return null;
    }

    public boolean hasEffect(MobEffectList mobeffectlist) {
        return false;
    }

    @Nullable
    public MobEffect getEffect(MobEffectList mobeffectlist) {
        return null;
    }

    public void addEffect(MobEffect mobeffect) {
    }

    public boolean d(MobEffect mobeffect) {
        return false;
    }

    public boolean bS() {
        return false;
    }

    @Nullable
    public MobEffect c(@Nullable MobEffectList mobeffectlist) {
        return null;
    }

    public void removeEffect(MobEffectList mobeffectlist) {
    }

    protected void a(MobEffect mobeffect) {
    }

    protected void a(MobEffect mobeffect, boolean flag) {
    }

    protected void b(MobEffect mobeffect) {
    }

    // CraftBukkit start - Delegate so we can handle providing a reason for health being regained
    public void heal(float f) {
    }

    public void heal(float f, EntityRegainHealthEvent.RegainReason regainReason) {
    }

    public final float getHealth() {
        return 0.0F;
    }

    public void setHealth(float f) {
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    @Nullable
    public DamageSource bU() {
        return null;
    }

    protected void c(DamageSource damagesource) {
    }

    private boolean d(DamageSource damagesource) {
        return false;
    }

    public void b(ItemStack itemstack) {
    }

    public void die(DamageSource damagesource) {
    }

    protected void a(boolean flag, int i, DamageSource damagesource) {
    }

    protected void dropEquipment(boolean flag, int i) {
    }

    public void a(Entity entity, float f, double d0, double d1) {
    }

    @Nullable
    protected SoundEffect bV() {
        return null;
    }

    @Nullable
    protected SoundEffect bW() {
        return null;
    }

    protected SoundEffect e(int i) {
        return null;
    }

    protected void dropDeathLoot(boolean flag, int i) {
    }

    public boolean m_() {
        return false;
    }

    private boolean a(BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    public boolean isAlive() {
        return false;
    }

    public void e(float f, float f1) {
    }

    public int getArmorStrength() {
        return 0;
    }

    protected void damageArmor(float f) {
    }

    protected void k(float f) {
    }

    protected float applyArmorModifier(DamageSource damagesource, float f) {
        return 0.0F;
    }

    protected float applyMagicModifier(DamageSource damagesource, float f) {
        return 0.0F;
    }

    // CraftBukkit start
    protected boolean damageEntity0(final DamageSource damagesource, float f) {
        return false;
    }

    public CombatTracker getCombatTracker() {
        return null;
    }

    @Nullable
    public EntityLiving bZ() {
        return null;
    }

    public final float getMaxHealth() {
        return 0.0F;
    }

    public final int cb() {
        return 0;
    }

    public final void f(int i) {
    }

    private int o() {
        return 0;
    }

    public void a(EnumHand enumhand) {
    }

    protected void Y() {
    }

    protected void cc() {
    }

    public AttributeInstance getAttributeInstance(IAttribute iattribute) {
        return null;
    }

    public AttributeMapBase getAttributeMap() {
        return null;
    }

    public EnumMonsterType getMonsterType() {
        return null;
    }

    @Nullable
    public ItemStack getItemInMainHand() {
        return null;
    }

    @Nullable
    public ItemStack getItemInOffHand() {
        return null;
    }

    @Nullable
    public ItemStack b(EnumHand enumhand) {
        return null;
    }

    public void a(EnumHand enumhand, @Nullable ItemStack itemstack) {
    }

    public abstract Iterable<ItemStack> getArmorItems();

    @Nullable
    public abstract ItemStack getEquipment(EnumItemSlot enumitemslot);

    public abstract void setSlot(EnumItemSlot enumitemslot, @Nullable ItemStack itemstack);

    public void setSprinting(boolean flag) {
    }

    protected float ch() {
        return 0.0F;
    }

    protected float ci() {
        return 0.0F;
    }

    protected boolean cj() {
        return false;
    }

    public void A(Entity entity) {
    }

    protected float ck() {
        return 0.0F;
    }

    protected void cl() {
    }

    protected void cm() {
    }

    protected void cn() {
    }

    protected float co() {
        return 0.0F;
    }

    public void g(float f, float f1) {
    }

    public float cp() {
        return 0.0F;
    }

    public void l(float f) {
    }

    public boolean B(Entity entity) {
        return false;
    }

    public boolean isSleeping() {
        return false;
    }

    public void m() {
    }

    protected float h(float f, float f1) {
        return 0.0F;
    }

    public void n() {
    }

    private void r() {
    }

    protected void doTick() {
    }

    protected void cs() {
    }

    protected void C(Entity entity) {
    }

    public void stopRiding() {
    }

    public void aw() {
    }

    public void l(boolean flag) {
    }

    public void receive(Entity entity, int i) {
    }

    public boolean hasLineOfSight(Entity entity) {
        return false;
    }

    public Vec3D aB() {
        return null;
    }

    public Vec3D f(float f) {
        return null;
    }

    public boolean ct() {
        return false;
    }

    public boolean isInteractable() {
        return false;
    }

    public boolean isCollidable() {
        return false;
    }

    protected void ap() {
    }

    public float getHeadRotation() {
        return 0.0F;
    }

    public void h(float f) {
    }

    public void i(float f) {
    }

    public float getAbsorptionHearts() {
        return 0.0F;
    }

    public void setAbsorptionHearts(float f) {
    }

    public void enterCombat() {
    }

    public void exitCombat() {
    }

    protected void cv() {
    }

    public abstract EnumMainHand getMainHand();

    public boolean cx() {
        return false;
    }

    public EnumHand cy() {
        return null;
    }

    protected void cz() {
    }

    public void c(EnumHand enumhand) {
    }

    public void a(DataWatcherObject<?> datawatcherobject) {
    }

    protected void a(@Nullable ItemStack itemstack, int i) {
    }

    protected void v() {
    }

    @Nullable
    public ItemStack cA() {
        return null;
    }

    public int cB() {
        return 0;
    }

    public int cC() {
        return 0;
    }

    public void clearActiveItem() {
    }

    public void cE() {
    }

    public boolean isBlocking() {
        return false;
    }

    public boolean cG() {
        return false;
    }

    public boolean k(double d0, double d1, double d2) {
        return false;
    }

    public boolean cI() {
        return false;
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static {
        }
    }
}
