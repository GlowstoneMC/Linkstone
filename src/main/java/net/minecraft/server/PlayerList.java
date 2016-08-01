package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.chunkio.ChunkIOExecutor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.TravelAgent;
import org.bukkit.craftbukkit.util.CraftChatMessage;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.util.Vector;

// CraftBukkit end
public abstract class PlayerList {

    public static final File a = null;

    public static final File b = null;

    public static final File c = null;

    public static final File d = null;

    private static final Logger f = null;

    private static final SimpleDateFormat g = null;

    private final MinecraftServer server = null;

    public final List<EntityPlayer> players = null;

    // CraftBukkit - ArrayList -> CopyOnWriteArrayList: Iterator safety
    private final Map<UUID, EntityPlayer> j = null;

    private final GameProfileBanList k = null;

    private final IpBanList l = null;

    private final OpList operators = null;

    private final WhiteList whitelist = null;

    private final Map<UUID, ServerStatisticManager> o = null;

    public IPlayerFileData playerFileData = null;

    private boolean hasWhitelist = false;

    protected int maxPlayers = 0;

    private int r = 0;

    private EnumGamemode s = null;

    private boolean t = false;

    private int u = 0;

    // CraftBukkit start
    private CraftServer cserver = null;

    public PlayerList(MinecraftServer minecraftserver) {
    }

    public void a(NetworkManager networkmanager, EntityPlayer entityplayer) {
    }

    public void sendScoreboard(ScoreboardServer scoreboardserver, EntityPlayer entityplayer) {
    }

    public void setPlayerFileData(WorldServer[] aworldserver) {
    }

    public void a(EntityPlayer entityplayer, WorldServer worldserver) {
    }

    public int d() {
        return 0;
    }

    public NBTTagCompound a(EntityPlayer entityplayer) {
        return null;
    }

    protected void savePlayerFile(EntityPlayer entityplayer) {
    }

    public void onPlayerJoin(EntityPlayer entityplayer, String joinMessage) {
    }

    public void d(EntityPlayer entityplayer) {
    }

    public String disconnect(EntityPlayer entityplayer) {
        return null;
    }

    // CraftBukkit start - Whole method, SocketAddress to LoginListener, added hostname to signature, return EntityPlayer
    public EntityPlayer attemptLogin(LoginListener loginlistener, GameProfile gameprofile, String hostname) {
        return null;
    }

    public EntityPlayer processLogin(GameProfile gameprofile, EntityPlayer player) {
        return null;
    }

    // CraftBukkit start
    public EntityPlayer moveToWorld(EntityPlayer entityplayer, int i, boolean flag) {
        return null;
    }

    public EntityPlayer moveToWorld(EntityPlayer entityplayer, int i, boolean flag, Location location, boolean avoidSuffocation) {
        return null;
    }

    // CraftBukkit start - Replaced the standard handling of portals with a more customised method.
    public void changeDimension(EntityPlayer entityplayer, int i, TeleportCause cause) {
    }

    public void f(EntityPlayer entityplayer) {
    }

    public void a(EntityPlayer entityplayer, int i) {
    }

    public void changeWorld(Entity entity, int i, WorldServer worldserver, WorldServer worldserver1) {
    }

    // Copy of original changeWorld(Entity, int, WorldServer, WorldServer) method with only location calculation logic
    public Location calculateTarget(Location enter, World target) {
        return null;
    }

    // copy of original a(Entity, int, WorldServer, WorldServer) method with only entity repositioning logic
    public void repositionEntity(Entity entity, Location exit, boolean portal) {
    }

    public void tick() {
    }

    public void sendAll(Packet<?> packet) {
    }

    // CraftBukkit start - add a world/entity limited version
    public void sendAll(Packet packet, EntityHuman entityhuman) {
    }

    public void sendAll(Packet packet, World world) {
    }

    // CraftBukkit end
    public void a(Packet<?> packet, int i) {
    }

    public void a(EntityHuman entityhuman, IChatBaseComponent ichatbasecomponent) {
    }

    public void b(EntityHuman entityhuman, IChatBaseComponent ichatbasecomponent) {
    }

    public String b(boolean flag) {
        return null;
    }

    public String[] f() {
        return null;
    }

    public GameProfile[] g() {
        return null;
    }

    public GameProfileBanList getProfileBans() {
        return null;
    }

    public IpBanList getIPBans() {
        return null;
    }

    public void addOp(GameProfile gameprofile) {
    }

    public void removeOp(GameProfile gameprofile) {
    }

    private void b(EntityPlayer entityplayer, int i) {
    }

    public boolean isWhitelisted(GameProfile gameprofile) {
        return false;
    }

    public boolean isOp(GameProfile gameprofile) {
        return false;
    }

    @Nullable
    public EntityPlayer getPlayer(String s) {
        return null;
    }

    public void sendPacketNearby(@Nullable EntityHuman entityhuman, double d0, double d1, double d2, double d3, int i, Packet<?> packet) {
    }

    public void savePlayers() {
    }

    public void addWhitelist(GameProfile gameprofile) {
    }

    public void removeWhitelist(GameProfile gameprofile) {
    }

    public WhiteList getWhitelist() {
        return null;
    }

    public String[] getWhitelisted() {
        return null;
    }

    public OpList getOPs() {
        return null;
    }

    public String[] n() {
        return null;
    }

    public void reloadWhitelist() {
    }

    public void b(EntityPlayer entityplayer, WorldServer worldserver) {
    }

    public void updateClient(EntityPlayer entityplayer) {
    }

    public int getPlayerCount() {
        return 0;
    }

    public int getMaxPlayers() {
        return 0;
    }

    public String[] getSeenPlayers() {
        return null;
    }

    public boolean getHasWhitelist() {
        return false;
    }

    public void setHasWhitelist(boolean flag) {
    }

    public List<EntityPlayer> b(String s) {
        return null;
    }

    public int s() {
        return 0;
    }

    public MinecraftServer getServer() {
        return null;
    }

    public NBTTagCompound t() {
        return null;
    }

    private void a(EntityPlayer entityplayer, EntityPlayer entityplayer1, World world) {
    }

    public void u() {
    }

    // CraftBukkit start
    public void sendMessage(IChatBaseComponent[] iChatBaseComponents) {
    }

    // CraftBukkit end
    public void sendMessage(IChatBaseComponent ichatbasecomponent, boolean flag) {
    }

    public void sendMessage(IChatBaseComponent ichatbasecomponent) {
    }

    public ServerStatisticManager a(EntityHuman entityhuman) {
        return null;
    }

    public void a(int i) {
    }

    public List<EntityPlayer> v() {
        return null;
    }

    public EntityPlayer a(UUID uuid) {
        return null;
    }

    public boolean f(GameProfile gameprofile) {
        return false;
    }
}
