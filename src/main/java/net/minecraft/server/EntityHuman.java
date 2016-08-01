package net.minecraft.server;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.craftbukkit.entity.CraftItem;
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityCombustByEntityEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.bukkit.util.Vector;

// CraftBukkit end
public abstract class EntityHuman extends EntityLiving {

    private static final DataWatcherObject<Float> a;

    private static final DataWatcherObject<Integer> b;

    protected static final DataWatcherObject<Byte> br;

    protected static final DataWatcherObject<Byte> bs;

    public PlayerInventory inventory;

    private InventoryEnderChest enderChest;

    public Container defaultContainer;

    public Container activeContainer;

    protected FoodMetaData foodData;

    // CraftBukkit - add "this" to constructor
    protected int bx;

    public float by;

    public float bz;

    public int bA;

    public double bB;

    public double bC;

    public double bD;

    public double bE;

    public double bF;

    public double bG;

    public boolean sleeping;

    public BlockPosition bedPosition;

    public int sleepTicks;

    public float bJ;

    public float bK;

    private BlockPosition e;

    private boolean f;

    private BlockPosition g;

    public PlayerAbilities abilities;

    public int expLevel;

    public int expTotal;

    public float exp;

    private int h;

    protected float bP;

    protected float bQ;

    private int bS;

    private final GameProfile bT;

    private ItemStack bV;

    private final ItemCooldown bW;

    public EntityFishingHook hookedFish;

    // CraftBukkit start
    public boolean fauxSleeping;

    public String spawnWorld;

    public int oldLevel;

    @Override
    public CraftHumanEntity getBukkitEntity() {
        return null;
    }

    // CraftBukkit end
    protected ItemCooldown l() {
        return null;
    }

    public EntityHuman(World world, GameProfile gameprofile) {
    }

    protected void initAttributes() {
    }

    protected void i() {
    }

    public void m() {
    }

    private void o() {
    }

    protected void cJ() {
    }

    public int V() {
        return 0;
    }

    protected SoundEffect aa() {
        return null;
    }

    protected SoundEffect ab() {
        return null;
    }

    public int aE() {
        return 0;
    }

    public void a(SoundEffect soundeffect, float f, float f1) {
    }

    public SoundCategory bC() {
        return null;
    }

    protected boolean cj() {
        return false;
    }

    public void closeInventory() {
    }

    public void aw() {
    }

    protected void doTick() {
    }

    public void n() {
    }

    private void c(Entity entity) {
    }

    public int getScore() {
        return 0;
    }

    public void setScore(int i) {
    }

    public void addScore(int i) {
    }

    public void die(DamageSource damagesource) {
    }

    protected SoundEffect bV() {
        return null;
    }

    protected SoundEffect bW() {
        return null;
    }

    public void b(Entity entity, int i) {
    }

    private Collection<ScoreboardScore> d(Entity entity) {
        return null;
    }

    @Nullable
    public EntityItem a(boolean flag) {
        return null;
    }

    @Nullable
    public EntityItem drop(@Nullable ItemStack itemstack, boolean flag) {
        return null;
    }

    @Nullable
    public EntityItem a(@Nullable ItemStack itemstack, boolean flag, boolean flag1) {
        return null;
    }

    @Nullable
    protected ItemStack a(EntityItem entityitem) {
        return null;
    }

    public float a(IBlockData iblockdata) {
        return 0.0F;
    }

    public boolean hasBlock(IBlockData iblockdata) {
        return false;
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    protected void damageArmor(float f) {
    }

    protected void k(float f) {
    }

    public float cL() {
        return 0.0F;
    }

    // CraftBukkit start
    protected boolean damageEntity0(DamageSource damagesource, float f) {
        return false;
    }

    public void openSign(TileEntitySign tileentitysign) {
    }

    public void a(CommandBlockListenerAbstract commandblocklistenerabstract) {
    }

    public void a(TileEntityCommand tileentitycommand) {
    }

    public void a(TileEntityStructure tileentitystructure) {
    }

    public void openTrade(IMerchant imerchant) {
    }

    public void openContainer(IInventory iinventory) {
    }

    public void a(EntityHorse entityhorse, IInventory iinventory) {
    }

    public void openTileEntity(ITileEntityContainer itileentitycontainer) {
    }

    public void a(ItemStack itemstack, EnumHand enumhand) {
    }

    public EnumInteractionResult a(Entity entity, @Nullable ItemStack itemstack, EnumHand enumhand) {
        return null;
    }

    public double ax() {
        return 0.0;
    }

    public void stopRiding() {
    }

    public void attack(Entity entity) {
    }

    public void a(Entity entity) {
    }

    public void b(Entity entity) {
    }

    public void cM() {
    }

    public void die() {
    }

    public boolean inBlock() {
        return false;
    }

    public boolean cO() {
        return false;
    }

    public GameProfile getProfile() {
        return null;
    }

    public EntityHuman.EnumBedResult a(BlockPosition blockposition) {
        return null;
    }

    private void a(EnumDirection enumdirection) {
    }

    public void a(boolean flag, boolean flag1, boolean flag2) {
    }

    private boolean r() {
        return false;
    }

    @Nullable
    public static BlockPosition getBed(World world, BlockPosition blockposition, boolean flag) {
        return null;
    }

    public boolean isSleeping() {
        return false;
    }

    public boolean isDeeplySleeping() {
        return false;
    }

    public void b(IChatBaseComponent ichatbasecomponent) {
    }

    public BlockPosition getBed() {
        return null;
    }

    public boolean isRespawnForced() {
        return false;
    }

    public void setRespawnPosition(BlockPosition blockposition, boolean flag) {
    }

    public boolean a(Achievement achievement) {
        return false;
    }

    public void b(Statistic statistic) {
    }

    public void a(Statistic statistic, int i) {
    }

    public void a(Statistic statistic) {
    }

    public void cl() {
    }

    public void g(float f, float f1) {
    }

    public float cp() {
        return 0.0F;
    }

    public void checkMovement(double d0, double d1, double d2) {
    }

    private void m(double d0, double d1, double d2) {
    }

    public void e(float f, float f1) {
    }

    protected void al() {
    }

    protected SoundEffect e(int i) {
        return null;
    }

    public void b(EntityLiving entityliving) {
    }

    public void aS() {
    }

    public void giveExp(int i) {
    }

    public int cV() {
        return 0;
    }

    public void enchantDone(int i) {
    }

    public void levelDown(int i) {
    }

    public int getExpToLevel() {
        return 0;
    }

    public void applyExhaustion(float f) {
    }

    public FoodMetaData getFoodData() {
        return null;
    }

    public boolean m(boolean flag) {
        return false;
    }

    public boolean cY() {
        return false;
    }

    public boolean cZ() {
        return false;
    }

    public boolean a(BlockPosition blockposition, EnumDirection enumdirection, @Nullable ItemStack itemstack) {
        return false;
    }

    protected int getExpValue(EntityHuman entityhuman) {
        return 0;
    }

    protected boolean alwaysGivesExp() {
        return false;
    }

    public void copyTo(EntityHuman entityhuman, boolean flag) {
    }

    protected boolean playStepSound() {
        return false;
    }

    public void updateAbilities() {
    }

    public void a(EnumGamemode enumgamemode) {
    }

    public String getName() {
        return null;
    }

    public InventoryEnderChest getEnderChest() {
        return null;
    }

    @Nullable
    public ItemStack getEquipment(EnumItemSlot enumitemslot) {
        return null;
    }

    public void setSlot(EnumItemSlot enumitemslot, @Nullable ItemStack itemstack) {
    }

    public Iterable<ItemStack> aG() {
        return null;
    }

    public Iterable<ItemStack> getArmorItems() {
        return null;
    }

    public abstract boolean isSpectator();

    public abstract boolean z();

    public boolean bg() {
        return false;
    }

    public Scoreboard getScoreboard() {
        return null;
    }

    public ScoreboardTeamBase aQ() {
        return null;
    }

    public IChatBaseComponent getScoreboardDisplayName() {
        return null;
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    public void setAbsorptionHearts(float f) {
    }

    public float getAbsorptionHearts() {
        return 0.0F;
    }

    public static UUID a(GameProfile gameprofile) {
        return null;
    }

    public static UUID d(String s) {
        return null;
    }

    public boolean a(ChestLock chestlock) {
        return false;
    }

    public boolean getSendCommandFeedback() {
        return false;
    }

    public boolean c(int i, ItemStack itemstack) {
        return false;
    }

    public EnumMainHand getMainHand() {
        return null;
    }

    public void a(EnumMainHand enummainhand) {
    }

    public float dd() {
        return 0.0F;
    }

    public float o(float f) {
        return 0.0F;
    }

    public void de() {
    }

    public ItemCooldown df() {
        return null;
    }

    public void collide(Entity entity) {
    }

    public float dg() {
        return 0.0F;
    }

    public boolean dh() {
        return false;
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }

    public static enum EnumBedResult {

        OK, NOT_POSSIBLE_HERE, NOT_POSSIBLE_NOW, TOO_FAR_AWAY, OTHER_PROBLEM, NOT_SAFE;

        private EnumBedResult() {
        }
    }

    public static enum EnumChatVisibility {

        FULL(0, "options.chat.visibility.full"), SYSTEM(1, "options.chat.visibility.system"), HIDDEN(2, "options.chat.visibility.hidden");

        private static final EntityHuman.EnumChatVisibility[] d;

        private final int e;

        private final String f;

        private EnumChatVisibility(int i, String s) {
        }

        static {
        }
    }
}
