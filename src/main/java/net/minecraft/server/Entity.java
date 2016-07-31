package net.minecraft.server;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.TravelAgent;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Hanging;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityCombustByEntityEvent;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.vehicle.VehicleBlockCollisionEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.entity.CraftEntity;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.event.entity.EntityPortalEvent;
import org.bukkit.plugin.PluginManager;

// CraftBukkit end
public abstract class Entity implements ICommandListener {

    // CraftBukkit start
    private static final int CURRENT_LEVEL;

    static boolean isLevelAtLeast(NBTTagCompound tag, int level) {
        return false;
    }

    protected CraftEntity bukkitEntity;

    public CraftEntity getBukkitEntity() {
        return null;
    }

    // CraftBukikt end
    private static final Logger a;

    private static final AxisAlignedBB b;

    private static double c;

    private static int entityCount;

    private int id;

    public boolean i;

    public final List<Entity> passengers;

    protected int j;

    private Entity au;

    public boolean attachedToPlayer;

    public World world;

    public double lastX;

    public double lastY;

    public double lastZ;

    public double locX;

    public double locY;

    public double locZ;

    public double motX;

    public double motY;

    public double motZ;

    public float yaw;

    public float pitch;

    public float lastYaw;

    public float lastPitch;

    private AxisAlignedBB boundingBox;

    public boolean onGround;

    public boolean positionChanged;

    public boolean B;

    public boolean C;

    public boolean velocityChanged;

    protected boolean E;

    private boolean aw;

    public boolean dead;

    public float width;

    public float length;

    public float I;

    public float J;

    public float K;

    public float fallDistance;

    private int ax;

    public double M;

    public double N;

    public double O;

    public float P;

    public boolean noclip;

    public float R;

    protected Random random;

    public int ticksLived;

    public int maxFireTicks;

    public int fireTicks;

    public boolean inWater;

    public int noDamageTicks;

    protected boolean justCreated;

    protected boolean fireProof;

    protected DataWatcher datawatcher;

    protected static final DataWatcherObject<Byte> aa;

    private static final DataWatcherObject<Integer> az;

    private static final DataWatcherObject<String> aA;

    private static final DataWatcherObject<Boolean> aB;

    private static final DataWatcherObject<Boolean> aC;

    private static final DataWatcherObject<Boolean> aD;

    public boolean ab;

    public int ac;

    public int ad;

    public int ae;

    public boolean ai;

    public boolean impulse;

    public int portalCooldown;

    protected boolean al;

    protected int am;

    public int dimension;

    protected BlockPosition ao;

    protected Vec3D ap;

    protected EnumDirection aq;

    private boolean invulnerable;

    protected UUID uniqueID;

    protected String as;

    private final CommandObjectiveExecutor aF;

    private final List<ItemStack> aG;

    public boolean glowing;

    private final Set<String> aH;

    private boolean aI;

    public boolean valid;

    // CraftBukkit
    public org.bukkit.projectiles.ProjectileSource projectileSource;

    // CraftBukkit - For projectiles only
    public boolean forceExplosionKnockback;

    // CraftBukkit - SPIGOT-949
    public Entity(World world) {
    }

    public int getId() {
        return 0;
    }

    public void h(int i) {
    }

    public Set<String> P() {
        return null;
    }

    public boolean a(String s) {
        return false;
    }

    public boolean b(String s) {
        return false;
    }

    public void Q() {
    }

    protected abstract void i();

    public DataWatcher getDataWatcher() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public void die() {
    }

    public void b(boolean flag) {
    }

    public void setSize(float f, float f1) {
    }

    protected void setYawPitch(float f, float f1) {
    }

    public void setPosition(double d0, double d1, double d2) {
    }

    public void m() {
    }

    public void U() {
    }

    protected void H() {
    }

    public int V() {
        return 0;
    }

    protected void burnFromLava() {
    }

    public void setOnFire(int i) {
    }

    public void extinguish() {
    }

    protected void Y() {
    }

    public boolean c(double d0, double d1, double d2) {
        return false;
    }

    private boolean b(AxisAlignedBB axisalignedbb) {
        return false;
    }

    public void move(double d0, double d1, double d2) {
    }

    public void recalcPosition() {
    }

    protected SoundEffect aa() {
        return null;
    }

    protected SoundEffect ab() {
        return null;
    }

    protected void checkBlockCollisions() {
    }

    protected void a(BlockPosition blockposition, Block block) {
    }

    public void a(SoundEffect soundeffect, float f, float f1) {
    }

    public boolean isSilent() {
        return false;
    }

    public void setSilent(boolean flag) {
    }

    public boolean isNoGravity() {
        return false;
    }

    public void setNoGravity(boolean flag) {
    }

    protected boolean playStepSound() {
        return false;
    }

    protected void a(double d0, boolean flag, IBlockData iblockdata, BlockPosition blockposition) {
    }

    @Nullable
    public AxisAlignedBB ag() {
        return null;
    }

    protected void burn(float i) {
    }

    public final boolean isFireProof() {
        return false;
    }

    public void e(float f, float f1) {
    }

    public boolean ai() {
        return false;
    }

    public boolean isInWater() {
        return false;
    }

    public boolean ak() {
        return false;
    }

    protected void al() {
    }

    public void am() {
    }

    protected void an() {
    }

    public boolean a(Material material) {
        return false;
    }

    public boolean ao() {
        return false;
    }

    public void a(float f, float f1, float f2) {
    }

    public float e(float f) {
        return 0.0F;
    }

    public void spawnIn(World world) {
    }

    public void setLocation(double d0, double d1, double d2, float f, float f1) {
    }

    public void setPositionRotation(BlockPosition blockposition, float f, float f1) {
    }

    public void setPositionRotation(double d0, double d1, double d2, float f, float f1) {
    }

    public float g(Entity entity) {
        return 0.0F;
    }

    public double e(double d0, double d1, double d2) {
        return 0.0;
    }

    public double c(BlockPosition blockposition) {
        return 0.0;
    }

    public double d(BlockPosition blockposition) {
        return 0.0;
    }

    public double f(double d0, double d1, double d2) {
        return 0.0;
    }

    public double h(Entity entity) {
        return 0.0;
    }

    public void d(EntityHuman entityhuman) {
    }

    public void collide(Entity entity) {
    }

    public void g(double d0, double d1, double d2) {
    }

    protected void ap() {
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public Vec3D f(float f) {
        return null;
    }

    protected final Vec3D f(float f, float f1) {
        return null;
    }

    public boolean isInteractable() {
        return false;
    }

    public boolean isCollidable() {
        return false;
    }

    public void b(Entity entity, int i) {
    }

    public boolean c(NBTTagCompound nbttagcompound) {
        return false;
    }

    public boolean d(NBTTagCompound nbttagcompound) {
        return false;
    }

    public NBTTagCompound e(NBTTagCompound nbttagcompound) {
        return null;
    }

    public void f(NBTTagCompound nbttagcompound) {
    }

    protected boolean as() {
        return false;
    }

    protected final String at() {
        return null;
    }

    protected abstract void a(NBTTagCompound nbttagcompound);

    protected abstract void b(NBTTagCompound nbttagcompound);

    protected NBTTagList a(double... adouble) {
        return null;
    }

    protected NBTTagList a(float... afloat) {
        return null;
    }

    public EntityItem a(Item item, int i) {
        return null;
    }

    public EntityItem a(Item item, int i, float f) {
        return null;
    }

    public EntityItem a(ItemStack itemstack, float f) {
        return null;
    }

    public boolean isAlive() {
        return false;
    }

    public boolean inBlock() {
        return false;
    }

    public boolean a(EntityHuman entityhuman, @Nullable ItemStack itemstack, EnumHand enumhand) {
        return false;
    }

    @Nullable
    public AxisAlignedBB j(Entity entity) {
        return null;
    }

    public void aw() {
    }

    public void k(Entity entity) {
    }

    public double ax() {
        return 0.0;
    }

    public double ay() {
        return 0.0;
    }

    public boolean startRiding(Entity entity) {
        return false;
    }

    public boolean a(Entity entity, boolean flag) {
        return false;
    }

    protected boolean n(Entity entity) {
        return false;
    }

    public void az() {
    }

    public void stopRiding() {
    }

    protected void o(Entity entity) {
    }

    protected void p(Entity entity) {
    }

    protected boolean q(Entity entity) {
        return false;
    }

    public float aA() {
        return 0.0F;
    }

    public Vec3D aB() {
        return null;
    }

    public void e(BlockPosition blockposition) {
    }

    public int aE() {
        return 0;
    }

    public Iterable<ItemStack> aG() {
        return null;
    }

    public Iterable<ItemStack> getArmorItems() {
        return null;
    }

    public Iterable<ItemStack> aI() {
        return null;
    }

    public void setEquipment(EnumItemSlot enumitemslot, @Nullable ItemStack itemstack) {
    }

    public boolean isBurning() {
        return false;
    }

    public boolean isPassenger() {
        return false;
    }

    public boolean isVehicle() {
        return false;
    }

    public boolean isSneaking() {
        return false;
    }

    public void setSneaking(boolean flag) {
    }

    public boolean isSprinting() {
        return false;
    }

    public void setSprinting(boolean flag) {
    }

    public boolean aO() {
        return false;
    }

    public void g(boolean flag) {
    }

    public boolean isInvisible() {
        return false;
    }

    @Nullable
    public ScoreboardTeamBase aQ() {
        return null;
    }

    public boolean r(Entity entity) {
        return false;
    }

    public boolean a(ScoreboardTeamBase scoreboardteambase) {
        return false;
    }

    public void setInvisible(boolean flag) {
    }

    public boolean getFlag(int i) {
        return false;
    }

    public void setFlag(int i, boolean flag) {
    }

    public int getAirTicks() {
        return 0;
    }

    public void setAirTicks(int i) {
    }

    public void onLightningStrike(EntityLightning entitylightning) {
    }

    public void b(EntityLiving entityliving) {
    }

    protected boolean j(double d0, double d1, double d2) {
        return false;
    }

    public void aS() {
    }

    public String getName() {
        return null;
    }

    public Entity[] aT() {
        return null;
    }

    public boolean s(Entity entity) {
        return false;
    }

    public float getHeadRotation() {
        return 0.0F;
    }

    public void h(float f) {
    }

    public void i(float f) {
    }

    public boolean aV() {
        return false;
    }

    public boolean t(Entity entity) {
        return false;
    }

    public String toString() {
        return null;
    }

    public boolean isInvulnerable(DamageSource damagesource) {
        return false;
    }

    public void setInvulnerable(boolean flag) {
    }

    public void u(Entity entity) {
    }

    private void a(Entity entity) {
    }

    @Nullable
    public Entity c(int i) {
        return null;
    }

    public Entity teleportTo(Location exit, boolean portal) {
        return null;
    }

    public boolean aX() {
        return false;
    }

    public float a(Explosion explosion, World world, BlockPosition blockposition, IBlockData iblockdata) {
        return 0.0F;
    }

    public boolean a(Explosion explosion, World world, BlockPosition blockposition, IBlockData iblockdata, float f) {
        return false;
    }

    public int aY() {
        return 0;
    }

    public Vec3D getPortalOffset() {
        return null;
    }

    public EnumDirection getPortalDirection() {
        return null;
    }

    public boolean isIgnoreBlockTrigger() {
        return false;
    }

    public void appendEntityCrashDetails(CrashReportSystemDetails crashreportsystemdetails) {
    }

    public void a(UUID uuid) {
    }

    public UUID getUniqueID() {
        return null;
    }

    public String bf() {
        return null;
    }

    public boolean bg() {
        return false;
    }

    public IChatBaseComponent getScoreboardDisplayName() {
        return null;
    }

    public void setCustomName(String s) {
    }

    public String getCustomName() {
        return null;
    }

    public boolean hasCustomName() {
        return false;
    }

    public void setCustomNameVisible(boolean flag) {
    }

    public boolean getCustomNameVisible() {
        return false;
    }

    public void enderTeleportTo(double d0, double d1, double d2) {
    }

    public void a(DataWatcherObject<?> datawatcherobject) {
    }

    public EnumDirection getDirection() {
        return null;
    }

    public EnumDirection bm() {
        return null;
    }

    protected ChatHoverable bn() {
        return null;
    }

    public boolean a(EntityPlayer entityplayer) {
        return false;
    }

    public AxisAlignedBB getBoundingBox() {
        return null;
    }

    public void a(AxisAlignedBB axisalignedbb) {
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    public boolean br() {
        return false;
    }

    public void k(boolean flag) {
    }

    public boolean c(int i, ItemStack itemstack) {
        return false;
    }

    public void sendMessage(IChatBaseComponent ichatbasecomponent) {
    }

    public boolean a(int i, String s) {
        return false;
    }

    public BlockPosition getChunkCoordinates() {
        return null;
    }

    public Vec3D d() {
        return null;
    }

    public World getWorld() {
        return null;
    }

    public Entity f() {
        return null;
    }

    public boolean getSendCommandFeedback() {
        return false;
    }

    public void a(CommandObjectiveExecutor.EnumCommandResult commandobjectiveexecutor_enumcommandresult, int i) {
    }

    @Nullable
    public MinecraftServer h() {
        return null;
    }

    public CommandObjectiveExecutor bs() {
        return null;
    }

    public void v(Entity entity) {
    }

    public EnumInteractionResult a(EntityHuman entityhuman, Vec3D vec3d, @Nullable ItemStack itemstack, EnumHand enumhand) {
        return null;
    }

    public boolean bt() {
        return false;
    }

    protected void a(EntityLiving entityliving, Entity entity) {
    }

    public void b(EntityPlayer entityplayer) {
    }

    public void c(EntityPlayer entityplayer) {
    }

    public float a(EnumBlockRotation enumblockrotation) {
        return 0.0F;
    }

    public float a(EnumBlockMirror enumblockmirror) {
        return 0.0F;
    }

    public boolean bu() {
        return false;
    }

    public boolean bv() {
        return false;
    }

    @Nullable
    public Entity bw() {
        return null;
    }

    public List<Entity> bx() {
        return null;
    }

    public boolean w(Entity entity) {
        return false;
    }

    public Collection<Entity> by() {
        return null;
    }

    public <T extends Entity> Collection<T> b(Class<T> oclass) {
        return null;
    }

    private <T extends Entity> void a(Class<T> oclass, Set<T> set) {
    }

    public Entity getVehicle() {
        return null;
    }

    public boolean x(Entity entity) {
        return false;
    }

    public boolean y(Entity entity) {
        return false;
    }

    public boolean bA() {
        return false;
    }

    @Nullable
    public Entity bB() {
        return null;
    }

    public EnumPistonReaction o_() {
        return null;
    }

    public SoundCategory bC() {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static final int[] b;

        static {
        }
    }
}
