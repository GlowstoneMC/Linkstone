package org.bukkit.craftbukkit;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;

import org.bukkit.BanList;
import org.bukkit.BanList.Type;
import org.bukkit.GameMode;
import org.bukkit.NamespacedKey;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.UnsafeValues;
import org.bukkit.Warning.WarningState;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.advancement.Advancement;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.generator.ChunkGenerator.ChunkData;
import org.bukkit.help.HelpMap;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFactory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Merchant;
import org.bukkit.inventory.Recipe;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginLoadOrder;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.util.CachedServerIcon;

import com.destroystokyo.paper.profile.PlayerProfile;

import net.glowstone.GlowServer;
import net.glowstone.entity.GlowPlayer;
import net.minecraft.server.ICommandListener;
import net.minecraft.server.MinecraftServer;

public class CraftServer implements Server {
    private final String serverName = "Linkstone";
    private final String serverVersion = "Linkstone-1.12";
    private final String consoleVersion = "1.12.2";
    private GlowServer base;

    public CraftServer(GlowServer server) {
        this.base = server;
    }
    
    public boolean getPermissionOverride(ICommandListener listener) {
        return false;
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
        base.getConfig().save();
    }

    private void saveCommandsConfig() {
    }

    public void loadPlugins() {
    }

    public void enablePlugins(PluginLoadOrder type) {
    }

    public MinecraftServer getServer() {
        return MinecraftServer.getServer();
    }

    public void disablePlugins() {
        base.getPluginManager().disablePlugins();
    }

    private void setVanillaCommands() {
    }

    private void enablePlugin(Plugin plugin) {
    }

    @Override
    public String toString() {
        return "CraftServer{" + "serverName=" + serverName + ",serverVersion=" + serverVersion + ",minecraftVersion=" + consoleVersion + '}';
    }

    @Override
    public String getName() {
        return serverName;
    }

    @Override
    public String getVersion() {
        return "1.12.2_b1";
    }

    @Override
    public String getBukkitVersion() {
        return "1.12.2";
    }


	@Override
	public Set<String> getListeningPluginChannels() {
		return base.getListeningPluginChannels();
	}

	@Override
	public void sendPluginMessage(Plugin arg0, String arg1, byte[] arg2) {
		base.sendPluginMessage(arg0, arg1, arg2);
	}

	@Override
	public boolean addRecipe(Recipe arg0) {
		return base.addRecipe(arg0);
	}

	@Override
	public Iterator<Advancement> advancementIterator() {
		return base.advancementIterator();
	}

	@Override
	public void banIP(String arg0) {
	    base.banIP(arg0);
	}

	@Override
	public int broadcast(String arg0, String arg1) {
		return base.broadcast(arg0, arg1);
	}

	@Override
	public int broadcastMessage(String arg0) {
		return base.broadcastMessage(arg0);
	}

	@Override
	public void clearRecipes() {
		base.clearRecipes();	
	}

	@Override
	public BossBar createBossBar(String arg0, BarColor arg1, BarStyle arg2, BarFlag... arg3) {
		return base.createBossBar(arg0, arg1, arg2, arg3);
	}

	@Override
	public ChunkData createChunkData(World arg0) {
		return base.createChunkData(arg0);
	}

	@Override
	public Inventory createInventory(InventoryHolder arg0, InventoryType arg1) {
		return base.createInventory(arg0, arg1);
	}

	@Override
	public Inventory createInventory(InventoryHolder arg0, int arg1) throws IllegalArgumentException {
		return base.createInventory(arg0, arg1);
	}

	@Override
	public Inventory createInventory(InventoryHolder arg0, InventoryType arg1, String arg2) {
		return base.createInventory(arg0, arg1, arg2);
	}

	@Override
	public Inventory createInventory(InventoryHolder arg0, int arg1, String arg2) throws IllegalArgumentException {
		return base.createInventory(arg0, arg1, arg2);
	}

	@Override
	public MapView createMap(World arg0) {
		return base.createMap(arg0);
	}

	@Override
	public Merchant createMerchant(String arg0) {
		return base.createMerchant(arg0);
	}

	@Override
	public PlayerProfile createProfile(UUID arg0) {
		return base.createProfile(arg0);
	}

	@Override
	public PlayerProfile createProfile(String arg0) {
		return base.createProfile(arg0);
	}

	@Override
	public PlayerProfile createProfile(UUID arg0, String arg1) {
		return base.createProfile(arg0, arg1);
	}

	@Override
	public World createWorld(WorldCreator arg0) {
		return base.createWorld(arg0);
	}

	@Override
	public boolean dispatchCommand(CommandSender arg0, String arg1) throws CommandException {
		return base.dispatchCommand(arg0, arg1);
	}

	@Override
	public Advancement getAdvancement(NamespacedKey arg0) {
		return base.getAdvancement(arg0);
	}

	@Override
	public boolean getAllowEnd() {
		return base.getAllowEnd();
	}

	@Override
	public boolean getAllowFlight() {
		return base.getAllowFlight();
	}

	@Override
	public boolean getAllowNether() {
		return base.getAllowNether();
	}

	@Override
	public int getAmbientSpawnLimit() {
		return base.getAmbientSpawnLimit();
	}

	@Override
	public int getAnimalSpawnLimit() {
		return base.getAnimalSpawnLimit();
	}

	@Override
	public BanList getBanList(Type arg0) {
		return base.getBanList(arg0);
	}

	@Override
	public Set<OfflinePlayer> getBannedPlayers() {
		return base.getBannedPlayers();
	}


	@Override
	public Map<String, String[]> getCommandAliases() {
		return base.getCommandAliases();
	}

	@Override
	public CommandMap getCommandMap() {
		return base.getCommandMap();
	}

	@Override
	public long getConnectionThrottle() {
		return base.getConnectionThrottle();
	}

	@Override
	public ConsoleCommandSender getConsoleSender() {
		return base.getConsoleSender();
	}

	@Override
	public GameMode getDefaultGameMode() {
		return base.getDefaultGameMode();
	}

	@Override
	public Entity getEntity(UUID arg0) {
		return base.getEntity(arg0);
	}

	@Override
	public boolean getGenerateStructures() {
		return base.getGenerateStructures();
	}

	@Override
	public HelpMap getHelpMap() {
		return base.getHelpMap(); 
	}

	@Override
	public Set<String> getIPBans() {
		return base.getIPBans();
	}

	@Override
	public int getIdleTimeout() {
		return base.getIdleTimeout();
	}

	@Override
	public String getIp() {
		return base.getIp();
	}

	@Override
	public ItemFactory getItemFactory() {
		return base.getItemFactory();
	}

	@Override
	public Logger getLogger() {
		return base.getLogger();
	}

	@Override
	public MapView getMap(short arg0) {
		return base.getMap(arg0);
	}

	@Override
	public int getMaxPlayers() {
		return base.getMaxPlayers();
	}

	@Override
	public Messenger getMessenger() {
		return base.getMessenger();
	}

	@Override
	public int getMonsterSpawnLimit() {
		return base.getMonsterSpawnLimit();
	}

	@Override
	public String getMotd() {
		return base.getMotd();
	}

	@Override
	@Deprecated
	public OfflinePlayer getOfflinePlayer(String arg0) {
		return base.getOfflinePlayer(arg0);
	}

	@Override
	public OfflinePlayer getOfflinePlayer(UUID arg0) {
		return base.getOfflinePlayer(arg0);
	}

	@Override
	public OfflinePlayer[] getOfflinePlayers() {
		return base.getOfflinePlayers();
	}

	@Override
	public boolean getOnlineMode() {
		return base.getOnlineMode();
	}

	@Override
	public Collection<? extends Player> getOnlinePlayers() {
		return base.getOnlinePlayers(); // TODO: craftplayer
	}

	@Override
	public Set<OfflinePlayer> getOperators() {
		return base.getOperators();
	}

	@Override
	public CraftPlayer getPlayer(String arg0) {
		return new CraftPlayer((GlowPlayer) base.getPlayer(arg0));
	}

	@Override
	public CraftPlayer getPlayer(UUID arg0) {
		return new CraftPlayer((GlowPlayer) base.getPlayer(arg0));
	}

	@Override
	public CraftPlayer getPlayerExact(String arg0) {
		return new CraftPlayer((GlowPlayer) base.getPlayer(arg0));
	}

	@Override
	public UUID getPlayerUniqueId(String arg0) {
		return base.getPlayerUniqueId(arg0);
	}

	@Override
	public PluginCommand getPluginCommand(String arg0) {
		return base.getPluginCommand(arg0);
	}

	@Override
	public PluginManager getPluginManager() {
		return base.getPluginManager();
	}

	@Override
	public int getPort() {
		return base.getPort();
	}

	@Override
	public List<Recipe> getRecipesFor(ItemStack arg0) {
		return base.getRecipesFor(arg0);
	}

	@Override
	public BukkitScheduler getScheduler() {
		return base.getScheduler();
	}

	@Override
	public ScoreboardManager getScoreboardManager() {
		return base.getScoreboardManager();
	}

	@Override
	public CachedServerIcon getServerIcon() {
		return base.getServerIcon();
	}

	@Override
	public String getServerId() {
		return base.getServerId();
	}

	@Override
	public String getServerName() {
		return base.getServerName();
	}

	@Override
	public ServicesManager getServicesManager() {
		return base.getServicesManager();
	}

	@Override
	public String getShutdownMessage() {
		return base.getShutdownMessage();
	}

	@Override
	public int getSpawnRadius() {
		return base.getSpawnRadius();
	}

	@Override
	public double[] getTPS() {
		return base.getTPS();
	}

	@Override
	public int getTicksPerAnimalSpawns() {
		return base.getTicksPerAnimalSpawns();
	}

	@Override
	public int getTicksPerMonsterSpawns() {
		return base.getTicksPerMonsterSpawns();
	}

	@Override
	public UnsafeValues getUnsafe() {
		return base.getUnsafe();
	}

	@Override
	public String getUpdateFolder() {
		return base.getUpdateFolder();
	}

	@Override
	public File getUpdateFolderFile() {
		return base.getUpdateFolderFile();
	}

	@Override
	public int getViewDistance() {
		return base.getViewDistance();
	}

	@Override
	public WarningState getWarningState() {
		return base.getWarningState();
	}

	@Override
	public int getWaterAnimalSpawnLimit() {
		return base.getWaterAnimalSpawnLimit();
	}

	@Override
	public Set<OfflinePlayer> getWhitelistedPlayers() {
		return base.getWhitelistedPlayers();
	}

	@Override
	public World getWorld(String arg0) {
		return base.getWorld(arg0);
	}

	@Override
	public World getWorld(UUID arg0) {
		return base.getWorld(arg0);
	}

	@Override
	public File getWorldContainer() {
		return base.getWorldContainer();
	}

	@Override
	public String getWorldType() {
		return base.getWorldType();
	}

	@Override
	public List<World> getWorlds() {
		return base.getWorlds();
	}

	@Override
	public boolean hasWhitelist() {
		return base.hasWhitelist();
	}

	@Override
	public boolean isHardcore() {
		return base.isHardcore();
	}

	@Override
	public boolean isPrimaryThread() {
		return base.isPrimaryThread();
	}

	@Override
	public CachedServerIcon loadServerIcon(File arg0) throws IllegalArgumentException, Exception {
		return base.loadServerIcon(arg0);
	}

	@Override
	public CachedServerIcon loadServerIcon(BufferedImage arg0) throws IllegalArgumentException, Exception {
		return base.loadServerIcon(arg0);
	}

	@Override
	public List<Player> matchPlayer(String arg0) {
	    List<Player> list = new ArrayList<>();
	    for (Player p : base.matchPlayer(arg0)) {
	        list.add(new CraftPlayer((GlowPlayer) p));
	    }
		return list;
	}

	@Override
	public Iterator<Recipe> recipeIterator() {
		return base.recipeIterator();
	}

	@Override
	public void reload() {
		base.reload();
	}

	@Override
	public boolean reloadCommandAliases() {
		return base.reloadCommandAliases();
	}

	@Override
	public void reloadData() {
		base.reloadData();
	}

	@Override
	public void reloadPermissions() {
		base.reloadPermissions();
	}

	@Override
	public void reloadWhitelist() {
		base.reloadWhitelist();
	}

	@Override
	public void resetRecipes() {
		base.resetRecipes();
	}

	@Override
	public void savePlayers() {
		base.savePlayers();
	}

	@Override
	public void setDefaultGameMode(GameMode arg0) {
		base.setDefaultGameMode(arg0);
	}

	@Override
	public void setIdleTimeout(int arg0) {
		base.setIdleTimeout(arg0);
	}

	@Override
	public void setSpawnRadius(int arg0) {
		base.setSpawnRadius(arg0);
	}

	@Override
	public void setWhitelist(boolean arg0) {
		base.setWhitelist(arg0);
	}

	@Override
	public void shutdown() {
		getLogger().info("[Linkstone] Shutting down...");
		base.shutdown();
	}

	@Override
	public Spigot spigot() {
		return base.spigot();
	}

	@Override
	public boolean suggestPlayerNamesWhenNullTabCompletions() {
		return base.suggestPlayerNamesWhenNullTabCompletions();
	}

	@Override
	public void unbanIP(String arg0) {
		base.unbanIP(arg0);
	}

	@Override
	public boolean unloadWorld(String arg0, boolean arg1) {
		return base.unloadWorld(arg0, arg1);
	}

	@Override
	public boolean unloadWorld(World arg0, boolean arg1) {
		return base.unloadWorld(arg0, arg1);
	}
}