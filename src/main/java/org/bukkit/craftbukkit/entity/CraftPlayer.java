package org.bukkit.craftbukkit.entity;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.minecraft.server.*;
import net.minecraft.server.PacketPlayOutTitle.EnumTitleAction;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.NotImplementedException;
import org.bukkit.*;
import org.bukkit.Achievement;
import org.bukkit.BanList;
import org.bukkit.Statistic;
import org.bukkit.Material;
import org.bukkit.Statistic.Type;
import org.bukkit.World;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.conversations.ManuallyAbandonedConversationCanceller;
import org.bukkit.craftbukkit.CraftParticle;
import org.bukkit.craftbukkit.block.CraftSign;
import org.bukkit.craftbukkit.conversations.ConversationTracker;
import org.bukkit.craftbukkit.CraftEffect;
import org.bukkit.craftbukkit.CraftOfflinePlayer;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.CraftSound;
import org.bukkit.craftbukkit.CraftStatistic;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.map.CraftMapView;
import org.bukkit.craftbukkit.map.RenderData;
import org.bukkit.craftbukkit.scoreboard.CraftScoreboard;
import org.bukkit.craftbukkit.util.CraftChatMessage;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerRegisterChannelEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerUnregisterChannelEvent;
import org.bukkit.inventory.InventoryView.Property;
import org.bukkit.map.MapCursor;
import org.bukkit.map.MapView;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.messaging.StandardMessenger;
import org.bukkit.scoreboard.Scoreboard;

@DelegateDeserialization(CraftOfflinePlayer.class)
public class CraftPlayer extends CraftHumanEntity implements Player {

    private long firstPlayed;

    private long lastPlayed;

    private boolean hasPlayedBefore;

    private final ConversationTracker conversationTracker;

    private final Set<String> channels;

    private final Set<UUID> hiddenPlayers;

    private int hash;

    private double health;

    private boolean scaledHealth;

    private double healthScale;

    public CraftPlayer(CraftServer server, EntityPlayer entity) {
    }

    public GameProfile getProfile() {
        return null;
    }

    @Override
    public boolean isOp() {
        return false;
    }

    @Override
    public void setOp(boolean value) {
    }

    public boolean isOnline() {
        return false;
    }

    public InetSocketAddress getAddress() {
        return null;
    }

    @Override
    public double getEyeHeight() {
        return 0.0;
    }

    @Override
    public double getEyeHeight(boolean ignoreSneaking) {
        return 0.0;
    }

    @Override
    public void sendRawMessage(String message) {
    }

    @Override
    public void sendMessage(String message) {
    }

    @Override
    public void sendMessage(String[] messages) {
    }

    @Override
    public String getDisplayName() {
        return null;
    }

    @Override
    public void setDisplayName(final String name) {
    }

    @Override
    public String getPlayerListName() {
        return null;
    }

    @Override
    public void setPlayerListName(String name) {
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public void kickPlayer(String message) {
    }

    @Override
    public void setCompassTarget(Location loc) {
    }

    @Override
    public Location getCompassTarget() {
        return null;
    }

    @Override
    public void chat(String msg) {
    }

    @Override
    public boolean performCommand(String command) {
        return false;
    }

    @Override
    public void playNote(Location loc, byte instrument, byte note) {
    }

    @Override
    public void playNote(Location loc, Instrument instrument, Note note) {
    }

    @Override
    public void playSound(Location loc, Sound sound, float volume, float pitch) {
    }

    @Override
    public void playSound(Location loc, String sound, float volume, float pitch) {
    }

    @Override
    public void stopSound(Sound sound) {
    }

    @Override
    public void stopSound(String sound) {
    }

    @Override
    public void playEffect(Location loc, Effect effect, int data) {
    }

    @Override
    public <T> void playEffect(Location loc, Effect effect, T data) {
    }

    @Override
    public void sendBlockChange(Location loc, Material material, byte data) {
    }

    @Override
    public void sendBlockChange(Location loc, int material, byte data) {
    }

    @Override
    public void sendSignChange(Location loc, String[] lines) {
    }

    @Override
    public boolean sendChunkChange(Location loc, int sx, int sy, int sz, byte[] data) {
        return false;
    }

    @Override
    public void sendMap(MapView map) {
    }

    @Override
    public boolean teleport(Location location, PlayerTeleportEvent.TeleportCause cause) {
        return false;
    }

    @Override
    public void setSneaking(boolean sneak) {
    }

    @Override
    public boolean isSneaking() {
        return false;
    }

    @Override
    public boolean isSprinting() {
        return false;
    }

    @Override
    public void setSprinting(boolean sprinting) {
    }

    @Override
    public void loadData() {
    }

    @Override
    public void saveData() {
    }

    @Deprecated
    @Override
    public void updateInventory() {
    }

    @Override
    public void setSleepingIgnored(boolean isSleeping) {
    }

    @Override
    public boolean isSleepingIgnored() {
        return false;
    }

    @Override
    public void awardAchievement(Achievement achievement) {
    }

    @Override
    public void removeAchievement(Achievement achievement) {
    }

    @Override
    public boolean hasAchievement(Achievement achievement) {
        return false;
    }

    @Override
    public void incrementStatistic(Statistic statistic) {
    }

    @Override
    public void decrementStatistic(Statistic statistic) {
    }

    @Override
    public int getStatistic(Statistic statistic) {
        return 0;
    }

    @Override
    public void incrementStatistic(Statistic statistic, int amount) {
    }

    @Override
    public void decrementStatistic(Statistic statistic, int amount) {
    }

    @Override
    public void setStatistic(Statistic statistic, int newValue) {
    }

    @Override
    public void incrementStatistic(Statistic statistic, Material material) {
    }

    @Override
    public void decrementStatistic(Statistic statistic, Material material) {
    }

    @Override
    public int getStatistic(Statistic statistic, Material material) {
        return 0;
    }

    @Override
    public void incrementStatistic(Statistic statistic, Material material, int amount) {
    }

    @Override
    public void decrementStatistic(Statistic statistic, Material material, int amount) {
    }

    @Override
    public void setStatistic(Statistic statistic, Material material, int newValue) {
    }

    @Override
    public void incrementStatistic(Statistic statistic, EntityType entityType) {
    }

    @Override
    public void decrementStatistic(Statistic statistic, EntityType entityType) {
    }

    @Override
    public int getStatistic(Statistic statistic, EntityType entityType) {
        return 0;
    }

    @Override
    public void incrementStatistic(Statistic statistic, EntityType entityType, int amount) {
    }

    @Override
    public void decrementStatistic(Statistic statistic, EntityType entityType, int amount) {
    }

    @Override
    public void setStatistic(Statistic statistic, EntityType entityType, int newValue) {
    }

    @Override
    public void setPlayerTime(long time, boolean relative) {
    }

    @Override
    public long getPlayerTimeOffset() {
        return 0;
    }

    @Override
    public long getPlayerTime() {
        return 0;
    }

    @Override
    public boolean isPlayerTimeRelative() {
        return false;
    }

    @Override
    public void resetPlayerTime() {
    }

    @Override
    public void setPlayerWeather(WeatherType type) {
    }

    @Override
    public WeatherType getPlayerWeather() {
        return null;
    }

    @Override
    public void resetPlayerWeather() {
    }

    @Override
    public boolean isBanned() {
        return false;
    }

    @Override
    public void setBanned(boolean value) {
    }

    @Override
    public boolean isWhitelisted() {
        return false;
    }

    @Override
    public void setWhitelisted(boolean value) {
    }

    @Override
    public void setGameMode(GameMode mode) {
    }

    @Override
    public GameMode getGameMode() {
        return null;
    }

    @Override
    public void giveExp(int exp) {
    }

    @Override
    public void giveExpLevels(int levels) {
    }

    @Override
    public float getExp() {
        return 0.0F;
    }

    @Override
    public void setExp(float exp) {
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public void setLevel(int level) {
    }

    @Override
    public int getTotalExperience() {
        return 0;
    }

    @Override
    public void setTotalExperience(int exp) {
    }

    @Override
    public float getExhaustion() {
        return 0.0F;
    }

    @Override
    public void setExhaustion(float value) {
    }

    @Override
    public float getSaturation() {
        return 0.0F;
    }

    @Override
    public void setSaturation(float value) {
    }

    @Override
    public int getFoodLevel() {
        return 0;
    }

    @Override
    public void setFoodLevel(int value) {
    }

    @Override
    public Location getBedSpawnLocation() {
        return null;
    }

    @Override
    public void setBedSpawnLocation(Location location) {
    }

    @Override
    public void setBedSpawnLocation(Location location, boolean override) {
    }

    @Override
    public void hidePlayer(Player player) {
    }

    @Override
    public void showPlayer(Player player) {
    }

    public void removeDisconnectingPlayer(Player player) {
    }

    @Override
    public boolean canSee(Player player) {
        return false;
    }

    @Override
    public Map<String, Object> serialize() {
        return null;
    }

    @Override
    public Player getPlayer() {
        return null;
    }

    @Override
    public EntityPlayer getHandle() {
        return null;
    }

    public void setHandle(final EntityPlayer entity) {
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public long getFirstPlayed() {
        return 0;
    }

    @Override
    public long getLastPlayed() {
        return 0;
    }

    @Override
    public boolean hasPlayedBefore() {
        return false;
    }

    public void setFirstPlayed(long firstPlayed) {
    }

    public void readExtraData(NBTTagCompound nbttagcompound) {
    }

    public void setExtraData(NBTTagCompound nbttagcompound) {
    }

    @Override
    public boolean beginConversation(Conversation conversation) {
        return false;
    }

    @Override
    public void abandonConversation(Conversation conversation) {
    }

    @Override
    public void abandonConversation(Conversation conversation, ConversationAbandonedEvent details) {
    }

    @Override
    public void acceptConversationInput(String input) {
    }

    @Override
    public boolean isConversing() {
        return false;
    }

    @Override
    public void sendPluginMessage(Plugin source, String channel, byte[] message) {
    }

    @Override
    public void setTexturePack(String url) {
    }

    @Override
    public void setResourcePack(String url) {
    }

    public void addChannel(String channel) {
    }

    public void removeChannel(String channel) {
    }

    @Override
    public Set<String> getListeningPluginChannels() {
        return null;
    }

    public void sendSupportedChannels() {
    }

    @Override
    public EntityType getType() {
        return null;
    }

    @Override
    public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
    }

    @Override
    public List<MetadataValue> getMetadata(String metadataKey) {
        return null;
    }

    @Override
    public boolean hasMetadata(String metadataKey) {
        return false;
    }

    @Override
    public void removeMetadata(String metadataKey, Plugin owningPlugin) {
    }

    @Override
    public boolean setWindowProperty(Property prop, int value) {
        return false;
    }

    public void disconnect(String reason) {
    }

    @Override
    public boolean isFlying() {
        return false;
    }

    @Override
    public void setFlying(boolean value) {
    }

    @Override
    public boolean getAllowFlight() {
        return false;
    }

    @Override
    public void setAllowFlight(boolean value) {
    }

    @Override
    public int getNoDamageTicks() {
        return 0;
    }

    @Override
    public void setFlySpeed(float value) {
    }

    @Override
    public void setWalkSpeed(float value) {
    }

    @Override
    public float getFlySpeed() {
        return 0.0F;
    }

    @Override
    public float getWalkSpeed() {
        return 0.0F;
    }

    private void validateSpeed(float value) {
    }

    @Override
    public void setMaxHealth(double amount) {
    }

    @Override
    public void resetMaxHealth() {
    }

    @Override
    public CraftScoreboard getScoreboard() {
        return null;
    }

    @Override
    public void setScoreboard(Scoreboard scoreboard) {
    }

    @Override
    public void setHealthScale(double value) {
    }

    @Override
    public double getHealthScale() {
        return 0.0;
    }

    @Override
    public void setHealthScaled(boolean scale) {
    }

    @Override
    public boolean isHealthScaled() {
        return false;
    }

    public float getScaledHealth() {
        return 0.0F;
    }

    @Override
    public double getHealth() {
        return 0.0;
    }

    public void setRealHealth(double health) {
    }

    public void updateScaledHealth() {
    }

    public void sendHealthUpdate() {
    }

    public void injectScaledMaxHealth(Collection collection, boolean force) {
    }

    @Override
    public org.bukkit.entity.Entity getSpectatorTarget() {
        return null;
    }

    @Override
    public void setSpectatorTarget(org.bukkit.entity.Entity entity) {
    }

    @Override
    public void sendTitle(String title, String subtitle) {
    }

    @Override
    public void resetTitle() {
    }

    @Override
    public void spawnParticle(Particle particle, Location location, int count) {
    }

    @Override
    public void spawnParticle(Particle particle, double x, double y, double z, int count) {
    }

    @Override
    public <T> void spawnParticle(Particle particle, Location location, int count, T data) {
    }

    @Override
    public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, T data) {
    }

    @Override
    public void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ) {
    }

    @Override
    public void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ) {
    }

    @Override
    public <T> void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ, T data) {
    }

    @Override
    public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ, T data) {
    }

    @Override
    public void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ, double extra) {
    }

    @Override
    public void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ, double extra) {
    }

    @Override
    public <T> void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ, double extra, T data) {
    }

    @Override
    public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ, double extra, T data) {
    }
}
