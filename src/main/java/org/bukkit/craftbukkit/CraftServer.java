package org.bukkit.craftbukkit;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import net.minecraft.server.*;
import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.UnsafeValues;
import org.bukkit.Warning.WarningState;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.WorldCreator;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.SimpleCommandMap;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.configuration.serialization.ConfigurationSerialization;
import org.bukkit.conversations.Conversable;
import org.bukkit.craftbukkit.boss.CraftBossBar;
import org.bukkit.craftbukkit.command.VanillaCommandWrapper;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.craftbukkit.generator.CraftChunkData;
import org.bukkit.craftbukkit.help.SimpleHelpMap;
import org.bukkit.craftbukkit.inventory.CraftFurnaceRecipe;
import org.bukkit.craftbukkit.inventory.CraftInventoryCustom;
import org.bukkit.craftbukkit.inventory.CraftItemFactory;
import org.bukkit.craftbukkit.inventory.CraftRecipe;
import org.bukkit.craftbukkit.inventory.CraftShapedRecipe;
import org.bukkit.craftbukkit.inventory.CraftShapelessRecipe;
import org.bukkit.craftbukkit.inventory.RecipeIterator;
import org.bukkit.craftbukkit.map.CraftMapView;
import org.bukkit.craftbukkit.metadata.EntityMetadataStore;
import org.bukkit.craftbukkit.metadata.PlayerMetadataStore;
import org.bukkit.craftbukkit.metadata.WorldMetadataStore;
import org.bukkit.craftbukkit.potion.CraftPotionBrewer;
import org.bukkit.craftbukkit.scheduler.CraftScheduler;
import org.bukkit.craftbukkit.scoreboard.CraftScoreboardManager;
import org.bukkit.craftbukkit.util.CraftIconCache;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.craftbukkit.util.DatFileFilter;
import org.bukkit.craftbukkit.util.Versioning;
import org.bukkit.craftbukkit.util.permissions.CraftDefaultPermissions;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerChatTabCompleteEvent;
import org.bukkit.event.world.WorldInitEvent;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.event.world.WorldUnloadEvent;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.help.HelpMap;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.permissions.Permissible;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginLoadOrder;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.SimplePluginManager;
import org.bukkit.plugin.SimpleServicesManager;
import org.bukkit.plugin.java.JavaPluginLoader;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.plugin.messaging.StandardMessenger;
import org.bukkit.scheduler.BukkitWorker;
import org.bukkit.util.StringUtil;
import org.bukkit.util.permissions.DefaultPermissions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;
import org.yaml.snakeyaml.error.MarkedYAMLException;
import org.apache.commons.lang.Validate;
import com.avaje.ebean.config.DataSourceConfig;
import com.avaje.ebean.config.ServerConfig;
import com.avaje.ebean.config.dbplatform.SQLitePlatform;
import com.avaje.ebeaninternal.server.lib.sql.TransactionIsolation;
import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import jline.console.ConsoleReader;
import org.bukkit.event.server.TabCompleteEvent;

public final class CraftServer implements Server {

    private static final Player[] EMPTY_PLAYER_ARRAY = null;

    private final String serverName = null;

    private final String serverVersion = null;

    private final String bukkitVersion = null;

    private final Logger logger = null;

    private final ServicesManager servicesManager = null;

    private final CraftScheduler scheduler = null;

    private final SimpleCommandMap commandMap = null;

    private final SimpleHelpMap helpMap = null;

    private final StandardMessenger messenger = null;

    private final PluginManager pluginManager = null;

    protected final MinecraftServer console = null;

    protected final DedicatedPlayerList playerList = null;

    private final Map<String, World> worlds = null;

    private YamlConfiguration configuration = null;

    private YamlConfiguration commandsConfiguration = null;

    private final Yaml yaml = null;

    private final Map<UUID, OfflinePlayer> offlinePlayers = null;

    private final EntityMetadataStore entityMetadata = null;

    private final PlayerMetadataStore playerMetadata = null;

    private final WorldMetadataStore worldMetadata = null;

    private int monsterSpawn = 0;

    private int animalSpawn = 0;

    private int waterAnimalSpawn = 0;

    private int ambientSpawn = 0;

    public int chunkGCPeriod = 0;

    public int chunkGCLoadThresh = 0;

    private File container = null;

    private WarningState warningState = null;

    private final BooleanWrapper online = null;

    public CraftScoreboardManager scoreboardManager = null;

    public boolean playerCommandState = false;

    private boolean printSaveWarning = false;

    private CraftIconCache icon = null;

    private boolean overrideAllCommandBlockCommands = false;

    private final Pattern validUserPattern = null;

    private final UUID invalidUserUUID = null;

    private final List<CraftPlayer> playerView = null;

    public int reloadCount = 0;

    private final class BooleanWrapper {

        private boolean value = false;
    }

    static {
    }

    public CraftServer(MinecraftServer console, PlayerList playerList) {
    }

    public boolean getCommandBlockOverride(String command) {
        return false;
    }

    private File getConfigFile() {
        return null;
    }

    private File getCommandsConfigFile() {
        return null;
    }

    private void saveConfig() {
    }

    private void saveCommandsConfig() {
    }

    public void loadPlugins() {
    }

    public void enablePlugins(PluginLoadOrder type) {
    }

    public void disablePlugins() {
    }

    private void setVanillaCommands() {
    }

    private void loadPlugin(Plugin plugin) {
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getVersion() {
        return null;
    }

    @Override
    public String getBukkitVersion() {
        return null;
    }

    @Override
    @Deprecated
    @SuppressWarnings("unchecked")
    public Player[] _INVALID_getOnlinePlayers() {
        return null;
    }

    @Override
    public List<CraftPlayer> getOnlinePlayers() {
        return null;
    }

    @Override
    @Deprecated
    public Player getPlayer(final String name) {
        return null;
    }

    @Override
    @Deprecated
    public Player getPlayerExact(String name) {
        return null;
    }

    @Override
    public Player getPlayer(UUID id) {
        return null;
    }

    @Override
    public int broadcastMessage(String message) {
        return 0;
    }

    public Player getPlayer(final EntityPlayer entity) {
        return null;
    }

    @Override
    @Deprecated
    public List<Player> matchPlayer(String partialName) {
        return null;
    }

    @Override
    public int getMaxPlayers() {
        return 0;
    }

    // NOTE: These are dependent on the corresponding call in MinecraftServer
    // so if that changes this will need to as well
    @Override
    public int getPort() {
        return 0;
    }

    @Override
    public int getViewDistance() {
        return 0;
    }

    @Override
    public String getIp() {
        return null;
    }

    @Override
    public String getServerName() {
        return null;
    }

    @Override
    public String getServerId() {
        return null;
    }

    @Override
    public String getWorldType() {
        return null;
    }

    @Override
    public boolean getGenerateStructures() {
        return false;
    }

    @Override
    public boolean getAllowEnd() {
        return false;
    }

    @Override
    public boolean getAllowNether() {
        return false;
    }

    public boolean getWarnOnOverload() {
        return false;
    }

    public boolean getQueryPlugins() {
        return false;
    }

    @Override
    public boolean hasWhitelist() {
        return false;
    }

    // NOTE: Temporary calls through to server.properies until its replaced
    private String getConfigString(String variable, String defaultValue) {
        return null;
    }

    private int getConfigInt(String variable, int defaultValue) {
        return 0;
    }

    private boolean getConfigBoolean(String variable, boolean defaultValue) {
        return false;
    }

    // End Temporary calls
    @Override
    public String getUpdateFolder() {
        return null;
    }

    @Override
    public File getUpdateFolderFile() {
        return null;
    }

    @Override
    public long getConnectionThrottle() {
        return 0;
    }

    @Override
    public int getTicksPerAnimalSpawns() {
        return 0;
    }

    @Override
    public int getTicksPerMonsterSpawns() {
        return 0;
    }

    @Override
    public PluginManager getPluginManager() {
        return null;
    }

    @Override
    public CraftScheduler getScheduler() {
        return null;
    }

    @Override
    public ServicesManager getServicesManager() {
        return null;
    }

    @Override
    public List<World> getWorlds() {
        return null;
    }

    public DedicatedPlayerList getHandle() {
        return null;
    }

    // NOTE: Should only be called from DedicatedServer.ah()
    public boolean dispatchServerCommand(CommandSender sender, ServerCommand serverCommand) {
        return false;
    }

    @Override
    public boolean dispatchCommand(CommandSender sender, String commandLine) {
        return false;
    }

    @Override
    public void reload() {
    }

    private void loadIcon() {
    }

    @SuppressWarnings({ "unchecked", "finally" })
    private void loadCustomPermissions() {
    }

    @Override
    public String toString() {
        return null;
    }

    public World createWorld(String name, World.Environment environment) {
        return null;
    }

    public World createWorld(String name, World.Environment environment, long seed) {
        return null;
    }

    public World createWorld(String name, Environment environment, ChunkGenerator generator) {
        return null;
    }

    public World createWorld(String name, Environment environment, long seed, ChunkGenerator generator) {
        return null;
    }

    @Override
    public World createWorld(WorldCreator creator) {
        return null;
    }

    @Override
    public boolean unloadWorld(String name, boolean save) {
        return false;
    }

    @Override
    public boolean unloadWorld(World world, boolean save) {
        return false;
    }

    public MinecraftServer getServer() {
        return null;
    }

    @Override
    public World getWorld(String name) {
        return null;
    }

    @Override
    public World getWorld(UUID uid) {
        return null;
    }

    public void addWorld(World world) {
    }

    @Override
    public Logger getLogger() {
        return null;
    }

    public ConsoleReader getReader() {
        return null;
    }

    @Override
    public PluginCommand getPluginCommand(String name) {
        return null;
    }

    @Override
    public void savePlayers() {
    }

    @Override
    public void configureDbConfig(ServerConfig config) {
    }

    @Override
    public boolean addRecipe(Recipe recipe) {
        return false;
    }

    @Override
    public List<Recipe> getRecipesFor(ItemStack result) {
        return null;
    }

    @Override
    public Iterator<Recipe> recipeIterator() {
        return null;
    }

    @Override
    public void clearRecipes() {
    }

    @Override
    public void resetRecipes() {
    }

    @Override
    public Map<String, String[]> getCommandAliases() {
        return null;
    }

    public void removeBukkitSpawnRadius() {
    }

    public int getBukkitSpawnRadius() {
        return 0;
    }

    @Override
    public String getShutdownMessage() {
        return null;
    }

    @Override
    public int getSpawnRadius() {
        return 0;
    }

    @Override
    public void setSpawnRadius(int value) {
    }

    @Override
    public boolean getOnlineMode() {
        return false;
    }

    @Override
    public boolean getAllowFlight() {
        return false;
    }

    @Override
    public boolean isHardcore() {
        return false;
    }

    @Override
    public boolean useExactLoginLocation() {
        return false;
    }

    public ChunkGenerator getGenerator(String world) {
        return null;
    }

    @Override
    @Deprecated
    public CraftMapView getMap(short id) {
        return null;
    }

    @Override
    public CraftMapView createMap(World world) {
        return null;
    }

    @Override
    public void shutdown() {
    }

    @Override
    public int broadcast(String message, String permission) {
        return 0;
    }

    @Override
    @Deprecated
    public OfflinePlayer getOfflinePlayer(String name) {
        return null;
    }

    @Override
    public OfflinePlayer getOfflinePlayer(UUID id) {
        return null;
    }

    public OfflinePlayer getOfflinePlayer(GameProfile profile) {
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Set<String> getIPBans() {
        return null;
    }

    @Override
    public void banIP(String address) {
    }

    @Override
    public void unbanIP(String address) {
    }

    @Override
    public Set<OfflinePlayer> getBannedPlayers() {
        return null;
    }

    @Override
    public BanList getBanList(BanList.Type type) {
        return null;
    }

    @Override
    public void setWhitelist(boolean value) {
    }

    @Override
    public Set<OfflinePlayer> getWhitelistedPlayers() {
        return null;
    }

    @Override
    public Set<OfflinePlayer> getOperators() {
        return null;
    }

    @Override
    public void reloadWhitelist() {
    }

    @Override
    public GameMode getDefaultGameMode() {
        return null;
    }

    @Override
    public void setDefaultGameMode(GameMode mode) {
    }

    @Override
    public ConsoleCommandSender getConsoleSender() {
        return null;
    }

    public EntityMetadataStore getEntityMetadata() {
        return null;
    }

    public PlayerMetadataStore getPlayerMetadata() {
        return null;
    }

    public WorldMetadataStore getWorldMetadata() {
        return null;
    }

    @Override
    public File getWorldContainer() {
        return null;
    }

    @Override
    public OfflinePlayer[] getOfflinePlayers() {
        return null;
    }

    @Override
    public Messenger getMessenger() {
        return null;
    }

    @Override
    public void sendPluginMessage(Plugin source, String channel, byte[] message) {
    }

    @Override
    public Set<String> getListeningPluginChannels() {
        return null;
    }

    @Override
    public Inventory createInventory(InventoryHolder owner, InventoryType type) {
        return null;
    }

    @Override
    public Inventory createInventory(InventoryHolder owner, InventoryType type, String title) {
        return null;
    }

    @Override
    public Inventory createInventory(InventoryHolder owner, int size) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Inventory createInventory(InventoryHolder owner, int size, String title) throws IllegalArgumentException {
        return null;
    }

    @Override
    public HelpMap getHelpMap() {
        return null;
    }

    public SimpleCommandMap getCommandMap() {
        return null;
    }

    @Override
    public int getMonsterSpawnLimit() {
        return 0;
    }

    @Override
    public int getAnimalSpawnLimit() {
        return 0;
    }

    @Override
    public int getWaterAnimalSpawnLimit() {
        return 0;
    }

    @Override
    public int getAmbientSpawnLimit() {
        return 0;
    }

    @Override
    public boolean isPrimaryThread() {
        return false;
    }

    @Override
    public String getMotd() {
        return null;
    }

    @Override
    public WarningState getWarningState() {
        return null;
    }

    public List<String> tabComplete(net.minecraft.server.ICommandListener sender, String message) {
        return null;
    }

    public List<String> tabCompleteCommand(Player player, String message) {
        return null;
    }

    public List<String> tabCompleteChat(Player player, String message) {
        return null;
    }

    @Override
    public CraftItemFactory getItemFactory() {
        return null;
    }

    @Override
    public CraftScoreboardManager getScoreboardManager() {
        return null;
    }

    public void checkSaveState() {
    }

    @Override
    public CraftIconCache getServerIcon() {
        return null;
    }

    @Override
    public CraftIconCache loadServerIcon(File file) throws Exception {
        return null;
    }

    static CraftIconCache loadServerIcon0(File file) throws Exception {
        return null;
    }

    @Override
    public CraftIconCache loadServerIcon(BufferedImage image) throws Exception {
        return null;
    }

    static CraftIconCache loadServerIcon0(BufferedImage image) throws Exception {
        return null;
    }

    @Override
    public void setIdleTimeout(int threshold) {
    }

    @Override
    public int getIdleTimeout() {
        return 0;
    }

    @Override
    public ChunkGenerator.ChunkData createChunkData(World world) {
        return null;
    }

    @Override
    public BossBar createBossBar(String title, BarColor color, BarStyle style, BarFlag... flags) {
        return null;
    }

    @Deprecated
    @Override
    public UnsafeValues getUnsafe() {
        return null;
    }
}
