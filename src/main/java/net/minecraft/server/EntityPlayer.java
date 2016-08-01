package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import org.bukkit.Bukkit;
import org.bukkit.WeatherType;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerChangedMainHandEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.MainHand;

// CraftBukkit end
public class EntityPlayer extends EntityHuman implements ICrafting {

    private static final Logger bS = null;

    private String locale = null;

    public PlayerConnection playerConnection = null;

    public final MinecraftServer server = null;

    public final PlayerInteractManager playerInteractManager = null;

    public double d = 0.0;

    public double e = 0.0;

    public final List<Integer> removeQueue = null;

    private final ServerStatisticManager bV = null;

    private float bW = 0.0F;

    private int bX = 0;

    private int bY = 0;

    private int bZ = 0;

    private int ca = 0;

    private int cb = 0;

    private float lastHealthSent = 0.0F;

    private int cd = 0;

    private boolean ce = false;

    public int lastSentExp = 0;

    public int invulnerableTicks = 0;

    private EntityHuman.EnumChatVisibility ch = null;

    private boolean ci = false;

    private long cj = 0;

    private Entity ck = null;

    public boolean worldChangeInvuln = false;

    private int containerCounter = 0;

    public boolean f = false;

    public int ping = 0;

    public boolean viewingCredits = false;

    // CraftBukkit start
    public String displayName = null;

    public IChatBaseComponent listName = null;

    public org.bukkit.Location compassTarget = null;

    public int newExp = 0;

    public int newLevel = 0;

    public int newTotalExp = 0;

    public boolean keepLevel = false;

    public double maxHealthCache = 0.0;

    public boolean joining = false;

    // CraftBukkit end
    public EntityPlayer(MinecraftServer minecraftserver, WorldServer worldserver, GameProfile gameprofile, PlayerInteractManager playerinteractmanager) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    // CraftBukkit start - World fallback code, either respawn location or global spawn
    public void spawnIn(World world) {
    }

    // CraftBukkit end
    public void levelDown(int i) {
    }

    public void enchantDone(int i) {
    }

    public void syncInventory() {
    }

    public void enterCombat() {
    }

    public void exitCombat() {
    }

    protected ItemCooldown l() {
        return null;
    }

    public void m() {
    }

    public void k_() {
    }

    private void a(IScoreboardCriteria iscoreboardcriteria, int i) {
    }

    protected void o() {
    }

    public void die(DamageSource damagesource) {
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    private boolean canPvP() {
        return false;
    }

    @Nullable
    public Entity c(int i) {
        return null;
    }

    public boolean a(EntityPlayer entityplayer) {
        return false;
    }

    private void a(TileEntity tileentity) {
    }

    public void receive(Entity entity, int i) {
    }

    public EntityHuman.EnumBedResult a(BlockPosition blockposition) {
        return null;
    }

    public void a(boolean flag, boolean flag1, boolean flag2) {
    }

    public boolean a(Entity entity, boolean flag) {
        return false;
    }

    public void stopRiding() {
    }

    public boolean isInvulnerable(DamageSource damagesource) {
        return false;
    }

    protected void a(double d0, boolean flag, IBlockData iblockdata, BlockPosition blockposition) {
    }

    protected void b(BlockPosition blockposition) {
    }

    public void a(double d0, boolean flag) {
    }

    public void openSign(TileEntitySign tileentitysign) {
    }

    public int nextContainerCounter() {
        return 0;
    }

    public void openTileEntity(ITileEntityContainer itileentitycontainer) {
    }

    public void openContainer(IInventory iinventory) {
    }

    public void openTrade(IMerchant imerchant) {
    }

    public void a(EntityHorse entityhorse, IInventory iinventory) {
    }

    public void a(ItemStack itemstack, EnumHand enumhand) {
    }

    public void a(TileEntityCommand tileentitycommand) {
    }

    public void a(Container container, int i, ItemStack itemstack) {
    }

    public void updateInventory(Container container) {
    }

    public void a(Container container, List<ItemStack> list) {
    }

    public void setContainerData(Container container, int i, int j) {
    }

    public void setContainerData(Container container, IInventory iinventory) {
    }

    public void closeInventory() {
    }

    public void broadcastCarriedItem() {
    }

    public void s() {
    }

    public void a(float f, float f1, boolean flag, boolean flag1) {
    }

    public boolean a(Achievement achievement) {
        return false;
    }

    public void a(Statistic statistic, int i) {
    }

    public void a(Statistic statistic) {
    }

    public void t() {
    }

    public void triggerHealthUpdate() {
    }

    // CraftBukkit start - Support multi-line messages
    public void sendMessage(IChatBaseComponent[] ichatbasecomponent) {
    }

    // CraftBukkit end
    public void b(IChatBaseComponent ichatbasecomponent) {
    }

    protected void v() {
    }

    public void copyTo(EntityHuman entityhuman, boolean flag) {
    }

    protected void a(MobEffect mobeffect) {
    }

    protected void a(MobEffect mobeffect, boolean flag) {
    }

    protected void b(MobEffect mobeffect) {
    }

    public void enderTeleportTo(double d0, double d1, double d2) {
    }

    public void a(Entity entity) {
    }

    public void b(Entity entity) {
    }

    public void updateAbilities() {
    }

    public WorldServer x() {
        return null;
    }

    public void a(EnumGamemode enumgamemode) {
    }

    public boolean isSpectator() {
        return false;
    }

    public boolean z() {
        return false;
    }

    public void sendMessage(IChatBaseComponent ichatbasecomponent) {
    }

    public boolean a(int i, String s) {
        return false;
    }

    public String A() {
        return null;
    }

    public void a(PacketPlayInSettings packetplayinsettings) {
    }

    public EntityHuman.EnumChatVisibility getChatFlags() {
        return null;
    }

    public void setResourcePack(String s, String s1) {
    }

    public BlockPosition getChunkCoordinates() {
        return null;
    }

    public void resetIdleTimer() {
    }

    public ServerStatisticManager getStatisticManager() {
        return null;
    }

    public void c(Entity entity) {
    }

    public void d(Entity entity) {
    }

    protected void F() {
    }

    public Entity getSpecatorTarget() {
        return null;
    }

    public void setSpectatorTarget(Entity entity) {
    }

    protected void H() {
    }

    public void attack(Entity entity) {
    }

    public long I() {
        return 0;
    }

    @Nullable
    public IChatBaseComponent getPlayerListName() {
        return null;
    }

    public void a(EnumHand enumhand) {
    }

    public boolean K() {
        return false;
    }

    public void L() {
    }

    public void M() {
    }

    public void N() {
    }

    // CraftBukkit start - Add per-player time and weather.
    public long timeOffset = 0;

    public boolean relativeTime = false;

    public long getPlayerTime() {
        return 0;
    }

    public WeatherType weather = null;

    public WeatherType getPlayerWeather() {
        return null;
    }

    public void setPlayerWeather(WeatherType type, boolean plugin) {
    }

    private float pluginRainPosition = 0.0F;

    private float pluginRainPositionPrevious = 0.0F;

    public void updateWeather(float oldRain, float newRain, float oldThunder, float newThunder) {
    }

    public void tickWeather() {
    }

    public void resetPlayerWeather() {
    }

    @Override
    public String toString() {
        return null;
    }

    public void reset() {
    }

    @Override
    public CraftPlayer getBukkitEntity() {
        return null;
    }
    // CraftBukkit end
}
