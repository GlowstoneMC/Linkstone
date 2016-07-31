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

    private static final UUID a;

    private static final AttributeModifier b;

    protected static final DataWatcherObject<Byte> au;

    public static final DataWatcherObject<Float> HEALTH;

    private static final DataWatcherObject<Integer> f;

    private static final DataWatcherObject<Boolean> g;

    private static final DataWatcherObject<Integer> h;

    private AttributeMapBase br;

    public CombatTracker combatTracker;

    public final Map<MobEffectList, MobEffect> effects;

    private final ItemStack[] bu;

    private final ItemStack[] bv;

    public boolean av;

    public EnumHand aw;

    public int ax;

    public int ay;

    public int hurtTicks;

    public int aA;

    public float aB;

    public int deathTicks;

    public float aD;

    public float aE;

    protected int aF;

    public float aG;

    public float aH;

    public float aI;

    public int maxNoDamageTicks;

    public float aK;

    public float aL;

    public float aM;

    public float aN;

    public float aO;

    public float aP;

    public float aQ;

    public float aR;

    public float aS;

    public EntityHuman killer;

    protected int lastDamageByPlayerTime;

    protected boolean aV;

    protected int ticksFarFromPlayer;

    protected float aX;

    protected float aY;

    protected float aZ;

    protected float ba;

    protected float bb;

    protected int bc;

    public float lastDamage;

    protected boolean be;

    public float bf;

    public float bg;

    public float bh;

    protected int bi;

    protected double bj;

    protected double bk;

    protected double bl;

    protected double bm;

    protected double bn;

    public boolean updateEffects;

    public EntityLiving lastDamager;

    public int hurtTimestamp;

    private EntityLiving bz;

    private int bA;

    private float bB;

    private int bC;

    private float bD;

    protected ItemStack bo;

    protected int bp;

    protected int bq;

    private BlockPosition bE;

    private DamageSource bF;

    private long bG;

    // CraftBukkit start
    public int expToDrop;

    public int maxAirTicks;

    boolean forceDrops;

    ArrayList<org.bukkit.inventory.ItemStack> drops;

    public org.bukkit.craftbukkit.attribute.CraftAttributeMap craftAttributes;

    public boolean collides;

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
    private boolean isTickingEffects;

    private List<Object> effectsToProcess;

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

        static final int[] a;

        static {
        }
    }
}
