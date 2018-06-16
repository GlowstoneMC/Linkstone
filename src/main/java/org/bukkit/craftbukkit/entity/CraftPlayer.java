package org.bukkit.craftbukkit.entity;

import java.net.InetSocketAddress;
import java.util.Map;
import java.util.Set;
import org.bukkit.Achievement;
import org.bukkit.Effect;
import org.bukkit.EntityAnimation;
import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.Statistic;
import org.bukkit.WeatherType;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementProgress;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerResourcePackStatusEvent.Status;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;
import org.bukkit.scoreboard.Scoreboard;
import com.destroystokyo.paper.Title;
import com.destroystokyo.paper.profile.PlayerProfile;
import com.mojang.authlib.GameProfile;

import net.glowstone.GlowOfflinePlayer;
import net.glowstone.entity.GlowPlayer;
import net.md_5.bungee.api.chat.BaseComponent;
import net.minecraft.server.EntityPlayer;

@DelegateDeserialization(GlowOfflinePlayer.class)
public class CraftPlayer extends CraftHumanEntity implements Player {
    private GlowPlayer base;
    private EntityPlayer nms;

    public CraftPlayer(GlowPlayer p) {
        super(p);
        this.base = p;
        this.nms = new EntityPlayer(base);
    }

    public GameProfile getProfile() {
        return getHandle().getProfile();
    }

    public EntityPlayer getHandle() {
        return nms;
    }

    @Override
    public void abandonConversation(Conversation arg0) {
        base.abandonConversation(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void abandonConversation(Conversation arg0, ConversationAbandonedEvent arg1) {
        base.abandonConversation(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void acceptConversationInput(String arg0) {
        base.acceptConversationInput(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public boolean beginConversation(Conversation arg0) {
        return base.beginConversation(arg0);
    }

    @Override
    public boolean isConversing() {
        return base.isConversing(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public long getFirstPlayed() {
        return base.getFirstPlayed(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public long getLastPlayed() {
        return base.getLastPlayed(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public Player getPlayer() {
        return this;
    }

    @Override
    public boolean hasPlayedBefore() {
        return base.hasPlayedBefore(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public boolean isBanned() {
        return base.isBanned(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public boolean isOnline() {
        return base.isOnline(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public boolean isWhitelisted() {
        return base.isWhitelisted(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setWhitelisted(boolean arg0) {
        base.setWhitelisted(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public Map<String, Object> serialize() {
        return base.serialize();
    }

    @Override
    public Set<String> getListeningPluginChannels() {
        return base.getListeningPluginChannels(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void sendPluginMessage(Plugin arg0, String arg1, byte[] arg2) {
        base.sendPluginMessage(arg0, arg1, arg2); // LINKSTONE AUTO GENERATED
    }

    @Override
    public int getProtocolVersion() {
        return base.getProtocolVersion(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public InetSocketAddress getVirtualHost() {
        return base.getVirtualHost(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public int applyMending(int arg0) {
        return base.applyMending(arg0);
    }

    @Override
    @Deprecated
    public void awardAchievement(Achievement arg0) {
        base.awardAchievement(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public boolean canSee(Player arg0) {
        return base.canSee(arg0);
    }

    @Override
    public void chat(String arg0) {
        base.chat(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void decrementStatistic(Statistic arg0) throws IllegalArgumentException {
        base.decrementStatistic(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void decrementStatistic(Statistic arg0, int arg1) throws IllegalArgumentException {
        base.decrementStatistic(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void decrementStatistic(Statistic arg0, Material arg1) throws IllegalArgumentException {
        base.decrementStatistic(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void decrementStatistic(Statistic arg0, EntityType arg1) throws IllegalArgumentException {
        base.decrementStatistic(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void decrementStatistic(Statistic arg0, Material arg1, int arg2) throws IllegalArgumentException {
        base.decrementStatistic(arg0, arg1, arg2); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void decrementStatistic(Statistic arg0, EntityType arg1, int arg2) {
        base.decrementStatistic(arg0, arg1, arg2); // LINKSTONE AUTO GENERATED
    }

    @Override
    public InetSocketAddress getAddress() {
        return base.getAddress(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public AdvancementProgress getAdvancementProgress(Advancement arg0) {
        return base.getAdvancementProgress(arg0);
    }

    @Override
    public boolean getAffectsSpawning() {
        return base.getAffectsSpawning(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public boolean getAllowFlight() {
        return base.getAllowFlight(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public Location getBedSpawnLocation() {
        return base.getBedSpawnLocation(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public Location getCompassTarget() {
        return base.getCompassTarget(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public String getDisplayName() {
        return base.getDisplayName(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public float getExhaustion() {
        return base.getExhaustion(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public float getExp() {
        return base.getExp(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public float getFlySpeed() {
        return base.getFlySpeed(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public int getFoodLevel() {
        return base.getFoodLevel(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public double getHealthScale() {
        return base.getHealthScale(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public int getLevel() {
        return base.getLevel(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public String getLocale() {
        return base.getLocale(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public String getPlayerListName() {
        return base.getPlayerListName(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public PlayerProfile getPlayerProfile() {
        return base.getPlayerProfile(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public long getPlayerTime() {
        return base.getPlayerTime(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public long getPlayerTimeOffset() {
        return base.getPlayerTimeOffset(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public WeatherType getPlayerWeather() {
        return base.getPlayerWeather(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public String getResourcePackHash() {
        return base.getResourcePackHash(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public Status getResourcePackStatus() {
        return base.getResourcePackStatus(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public float getSaturation() {
        return base.getSaturation(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public Scoreboard getScoreboard() {
        return base.getScoreboard(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public Entity getSpectatorTarget() {
        return base.getSpectatorTarget(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public int getStatistic(Statistic arg0) throws IllegalArgumentException {
        return base.getStatistic(arg0);
    }

    @Override
    public int getStatistic(Statistic arg0, Material arg1) throws IllegalArgumentException {
        return base.getStatistic(arg0,arg1);
    }

    @Override
    public int getStatistic(Statistic arg0, EntityType arg1) throws IllegalArgumentException {
        return base.getStatistic(arg0,arg1);
    }

    @Override
    public int getTotalExperience() {
        return base.getTotalExperience(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public int getViewDistance() {
        return base.getViewDistance(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public float getWalkSpeed() {
        return base.getWalkSpeed(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void giveExp(int arg0, boolean arg1) {
        base.giveExp(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void giveExpLevels(int arg0) {
        base.giveExpLevels(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    @Deprecated
    public boolean hasAchievement(Achievement arg0) {
        System.out.println("[WARNNING]: Deprecated call to hasAchievement");
        return base.hasAchievement(arg0);
    }

    @Override
    public boolean hasResourcePack() {
        return base.hasResourcePack(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void hidePlayer(Player arg0) {
        base.hidePlayer(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void hidePlayer(Plugin arg0, Player arg1) {
        base.hidePlayer(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void hideTitle() {
        base.hideTitle(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void incrementStatistic(Statistic arg0) throws IllegalArgumentException {
        base.incrementStatistic(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void incrementStatistic(Statistic arg0, int arg1) throws IllegalArgumentException {
        base.incrementStatistic(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void incrementStatistic(Statistic arg0, Material arg1) throws IllegalArgumentException {
        base.incrementStatistic(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void incrementStatistic(Statistic arg0, EntityType arg1) throws IllegalArgumentException {
        base.incrementStatistic(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void incrementStatistic(Statistic arg0, Material arg1, int arg2) throws IllegalArgumentException {
        base.incrementStatistic(arg0, arg1, arg2); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void incrementStatistic(Statistic arg0, EntityType arg1, int arg2) throws IllegalArgumentException {
        base.incrementStatistic(arg0, arg1, arg2); // LINKSTONE AUTO GENERATED
    }

    @Override
    public boolean isFlying() {
        return base.isFlying(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public boolean isHealthScaled() {
        return base.isHealthScaled(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public boolean isPlayerTimeRelative() {
        return base.isPlayerTimeRelative(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public boolean isSleepingIgnored() {
        return base.isSleepingIgnored(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public boolean isSneaking() {
        return base.isSneaking(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public boolean isSprinting() {
        return base.isSprinting(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void kickPlayer(String arg0) {
        base.kickPlayer(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void loadData() {
        base.loadData(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public boolean performCommand(String arg0) {
        return base.performCommand(arg0);
    }

    @Override
    public void playAnimationToSelf(EntityAnimation arg0) {
        base.playAnimationToSelf(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void playEffect(Location arg0, Effect arg1, int arg2) {
        base.playEffect(arg0, arg1, arg2); // LINKSTONE AUTO GENERATED
    }

    @Override
    public <T> void playEffect(Location arg0, Effect arg1, T arg2) {
        base.playEffect(arg0,arg1,arg2);
    }

    @Override
    public void playNote(Location arg0, byte arg1, byte arg2) {
        base.playNote(arg0, arg1, arg2); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void playNote(Location arg0, Instrument arg1, Note arg2) {
        base.playNote(arg0, arg1, arg2); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void playSound(Location arg0, Sound arg1, float arg2, float arg3) {
        base.playSound(arg0, arg1, arg2, arg3); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void playSound(Location arg0, String arg1, float arg2, float arg3) {
        base.playSound(arg0, arg1, arg2, arg3); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void playSound(Location arg0, Sound arg1, SoundCategory arg2, float arg3, float arg4) {
        base.playSound(arg0, arg1, arg2, arg3, arg4); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void playSound(Location arg0, String arg1, SoundCategory arg2, float arg3, float arg4) {
        base.playSound(arg0, arg1, arg2, arg3, arg4); // LINKSTONE AUTO GENERATED
    }

    @Override
    @Deprecated
    public void removeAchievement(Achievement arg0) {
        base.removeAchievement(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void resetPlayerTime() {
        base.resetPlayerTime(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void resetPlayerWeather() {
        base.resetPlayerWeather(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void resetTitle() {
        base.resetTitle(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void saveData() {
        base.saveData(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void sendActionBar(String arg0) {
        base.sendActionBar(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void sendActionBar(char arg0, String arg1) {
        base.sendActionBar(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void sendBlockChange(Location arg0, Material arg1, byte arg2) {
        base.sendBlockChange(arg0, arg1, arg2); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void sendBlockChange(Location arg0, int arg1, byte arg2) {
        base.sendBlockChange(arg0, arg1, arg2); // LINKSTONE AUTO GENERATED
    }

    @Override
    public boolean sendChunkChange(Location arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        return base.sendChunkChange(arg0, arg1, arg2,arg3, arg4);
    }

    @Override
    public void sendMap(MapView arg0) {
        base.sendMap(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void sendRawMessage(String arg0) {
        base.sendRawMessage(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void sendSignChange(Location arg0, String[] arg1) throws IllegalArgumentException {
        base.sendSignChange(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void sendTitle(Title arg0) {
        base.sendTitle(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void sendTitle(String arg0, String arg1) {
        base.sendTitle(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void sendTitle(String arg0, String arg1, int arg2, int arg3, int arg4) {
        base.sendTitle(arg0, arg1, arg2, arg3, arg4); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setAffectsSpawning(boolean arg0) {
        base.setAffectsSpawning(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setAllowFlight(boolean arg0) {
        base.setAllowFlight(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setBedSpawnLocation(Location arg0) {
        base.setBedSpawnLocation(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setBedSpawnLocation(Location arg0, boolean arg1) {
        base.setBedSpawnLocation(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setCompassTarget(Location arg0) {
        base.setCompassTarget(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setDisplayName(String arg0) {
        base.setDisplayName(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setExhaustion(float arg0) {
        base.setExhaustion(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setExp(float arg0) {
        base.setExp(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setFlySpeed(float arg0) throws IllegalArgumentException {
        base.setFlySpeed(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setFlying(boolean arg0) {
        base.setFlying(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setFoodLevel(int arg0) {
        base.setFoodLevel(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setHealthScale(double arg0) throws IllegalArgumentException {
        base.setHealthScale(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setHealthScaled(boolean arg0) {
        base.setHealthScaled(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setLevel(int arg0) {
        base.setLevel(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setPlayerListHeaderFooter(BaseComponent[] arg0, BaseComponent[] arg1) {
        base.setPlayerListHeaderFooter(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setPlayerListHeaderFooter(BaseComponent arg0, BaseComponent arg1) {
        base.setPlayerListHeaderFooter(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setPlayerListName(String arg0) {
        base.setPlayerListName(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setPlayerProfile(PlayerProfile arg0) {
        base.setPlayerProfile(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setPlayerTime(long arg0, boolean arg1) {
        base.setPlayerTime(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setPlayerWeather(WeatherType arg0) {
        base.setPlayerWeather(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setResourcePack(String arg0) {
        base.setResourcePack(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setResourcePack(String arg0, byte[] arg1) {
        base.setResourcePack(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setResourcePack(String arg0, String arg1) {
        base.setResourcePack(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setSaturation(float arg0) {
        base.setSaturation(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setScoreboard(Scoreboard arg0) throws IllegalArgumentException, IllegalStateException {
        base.setScoreboard(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setSleepingIgnored(boolean arg0) {
        base.setSleepingIgnored(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setSneaking(boolean arg0) {
        base.setSneaking(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setSpectatorTarget(Entity arg0) {
        base.setSpectatorTarget(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setSprinting(boolean arg0) {
        base.setSprinting(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setStatistic(Statistic arg0, int arg1) throws IllegalArgumentException {
        base.setStatistic(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setStatistic(Statistic arg0, Material arg1, int arg2) throws IllegalArgumentException {
        base.setStatistic(arg0, arg1, arg2); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setStatistic(Statistic arg0, EntityType arg1, int arg2) {
        base.setStatistic(arg0, arg1, arg2); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setSubtitle(BaseComponent[] arg0) {
        base.setSubtitle(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setSubtitle(BaseComponent arg0) {
        base.setSubtitle(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    @Deprecated
    public void setTexturePack(String arg0) {
        base.setTexturePack(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setTitleTimes(int arg0, int arg1, int arg2) {
        base.setTitleTimes(arg0, arg1, arg2); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setTotalExperience(int arg0) {
        base.setTotalExperience(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setViewDistance(int arg0) {
        base.setViewDistance(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void setWalkSpeed(float arg0) throws IllegalArgumentException {
        base.setWalkSpeed(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void showPlayer(Player arg0) {
        base.showPlayer(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void showPlayer(Plugin arg0, Player arg1) {
        base.showPlayer(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void showTitle(BaseComponent[] arg0) {
        base.showTitle(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void showTitle(BaseComponent arg0) {
        base.showTitle(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void showTitle(BaseComponent[] arg0, BaseComponent[] arg1, int arg2, int arg3, int arg4) {
        base.showTitle(arg0, arg1, arg2, arg3, arg4); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void showTitle(BaseComponent arg0, BaseComponent arg1, int arg2, int arg3, int arg4) {
        base.showTitle(arg0, arg1, arg2, arg3, arg4); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void spawnParticle(Particle arg0, Location arg1, int arg2) {
        base.spawnParticle(arg0, arg1, arg2); // LINKSTONE AUTO GENERATED
    }

    @Override
    public <T> void spawnParticle(Particle arg0, Location arg1, int arg2, T arg3) {
        base.spawnParticle(arg0,arg1,arg2,arg3);
    }

    @Override
    public void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4) {
        base.spawnParticle(arg0, arg1, arg2, arg3, arg4); // LINKSTONE AUTO GENERATED
    }

    @Override
    public <T> void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, T arg5) {
        base.spawnParticle(arg0,arg1,arg2,arg3,arg4,arg5);
    }

    @Override
    public void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5) {
        base.spawnParticle(arg0, arg1, arg2, arg3, arg4, arg5); // LINKSTONE AUTO GENERATED
    }

    @Override
    public <T> void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5,
            T arg6) {
        base.spawnParticle(arg0,arg1,arg2,arg3,arg4,arg5,arg6);
    }

    @Override
    public void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5,
            double arg6) {
        base.spawnParticle(arg0,arg1,arg2,arg3,arg4,arg5,arg6);
    }

    @Override
    public void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, double arg5, double arg6,
            double arg7) {
        base.spawnParticle(arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7);
    }

    @Override
    public <T> void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5,
            double arg6, T arg7) {
        base.spawnParticle(arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7);
    }

    @Override
    public <T> void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, double arg5,
            double arg6, double arg7, T arg8) {
        base.spawnParticle(arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8);
    }

    @Override
    public void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, double arg5, double arg6,
            double arg7, double arg8) {
        base.spawnParticle(arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8);
    }

    @Override
    public <T> void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, double arg5,
            double arg6, double arg7, double arg8, T arg9) {
        base.spawnParticle(arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
    }

    @Override
    public org.bukkit.entity.Player.Spigot spigot() {
        return base.spigot(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void stopSound(Sound arg0) {
        base.stopSound(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void stopSound(String arg0) {
        base.stopSound(arg0); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void stopSound(Sound arg0, SoundCategory arg1) {
        base.stopSound(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void stopSound(String arg0, SoundCategory arg1) {
        base.stopSound(arg0, arg1); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void updateInventory() {
        base.updateInventory(); // LINKSTONE AUTO GENERATED
    }

    @Override
    public void updateTitle(Title arg0) {
        base.updateTitle(arg0); // LINKSTONE AUTO GENERATED
    }

    public void removeDisconnectingPlayer(Player player) {
        // TODO
    }

    @Override
    public String toString() {
        return "CraftPlayer{" + "name=" + getName() + '}';
    }

    @Override
    public int hashCode() {
        return base.hashCode(); // TODO
    }
}