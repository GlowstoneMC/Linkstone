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
        base.abandonConversation(arg0); // LinkFiller
    }

    @Override
    public void abandonConversation(Conversation arg0, ConversationAbandonedEvent arg1) {
        base.abandonConversation(arg0, arg1); // LinkFiller
    }

    @Override
    public void acceptConversationInput(String arg0) {
        base.acceptConversationInput(arg0); // LinkFiller
    }

    @Override
    public boolean beginConversation(Conversation arg0) {
        return base.beginConversation(arg0);
    }

    @Override
    public boolean isConversing() {
        return base.isConversing(); // LinkFiller
    }

    @Override
    public long getFirstPlayed() {
        return base.getFirstPlayed(); // LinkFiller
    }

    @Override
    public long getLastPlayed() {
        return base.getLastPlayed(); // LinkFiller
    }

    @Override
    public Player getPlayer() {
        return this;
    }

    @Override
    public boolean hasPlayedBefore() {
        return base.hasPlayedBefore(); // LinkFiller
    }

    @Override
    public boolean isBanned() {
        return base.isBanned(); // LinkFiller
    }

    @Override
    public boolean isOnline() {
        return base.isOnline(); // LinkFiller
    }

    @Override
    public boolean isWhitelisted() {
        return base.isWhitelisted(); // LinkFiller
    }

    @Override
    public void setWhitelisted(boolean arg0) {
        base.setWhitelisted(arg0); // LinkFiller
    }

    @Override
    public Map<String, Object> serialize() {
        return base.serialize();
    }

    @Override
    public Set<String> getListeningPluginChannels() {
        return base.getListeningPluginChannels(); // LinkFiller
    }

    @Override
    public void sendPluginMessage(Plugin arg0, String arg1, byte[] arg2) {
        base.sendPluginMessage(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public int getProtocolVersion() {
        return base.getProtocolVersion(); // LinkFiller
    }

    @Override
    public InetSocketAddress getVirtualHost() {
        return base.getVirtualHost(); // LinkFiller
    }

    @Override
    public int applyMending(int arg0) {
        return base.applyMending(arg0);
    }

    @Override
    @Deprecated
    public void awardAchievement(Achievement arg0) {
        base.awardAchievement(arg0); // LinkFiller
    }

    @Override
    public boolean canSee(Player arg0) {
        return base.canSee(arg0);
    }

    @Override
    public void chat(String arg0) {
        base.chat(arg0); // LinkFiller
    }

    @Override
    public void decrementStatistic(Statistic arg0) throws IllegalArgumentException {
        base.decrementStatistic(arg0); // LinkFiller
    }

    @Override
    public void decrementStatistic(Statistic arg0, int arg1) throws IllegalArgumentException {
        base.decrementStatistic(arg0, arg1); // LinkFiller
    }

    @Override
    public void decrementStatistic(Statistic arg0, Material arg1) throws IllegalArgumentException {
        base.decrementStatistic(arg0, arg1); // LinkFiller
    }

    @Override
    public void decrementStatistic(Statistic arg0, EntityType arg1) throws IllegalArgumentException {
        base.decrementStatistic(arg0, arg1); // LinkFiller
    }

    @Override
    public void decrementStatistic(Statistic arg0, Material arg1, int arg2) throws IllegalArgumentException {
        base.decrementStatistic(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public void decrementStatistic(Statistic arg0, EntityType arg1, int arg2) {
        base.decrementStatistic(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public InetSocketAddress getAddress() {
        return base.getAddress(); // LinkFiller
    }

    @Override
    public AdvancementProgress getAdvancementProgress(Advancement arg0) {
        return base.getAdvancementProgress(arg0);
    }

    @Override
    public boolean getAffectsSpawning() {
        return base.getAffectsSpawning(); // LinkFiller
    }

    @Override
    public boolean getAllowFlight() {
        return base.getAllowFlight(); // LinkFiller
    }

    @Override
    public Location getBedSpawnLocation() {
        return base.getBedSpawnLocation(); // LinkFiller
    }

    @Override
    public Location getCompassTarget() {
        return base.getCompassTarget(); // LinkFiller
    }

    @Override
    public String getDisplayName() {
        return base.getDisplayName(); // LinkFiller
    }

    @Override
    public float getExhaustion() {
        return base.getExhaustion(); // LinkFiller
    }

    @Override
    public float getExp() {
        return base.getExp(); // LinkFiller
    }

    @Override
    public float getFlySpeed() {
        return base.getFlySpeed(); // LinkFiller
    }

    @Override
    public int getFoodLevel() {
        return base.getFoodLevel(); // LinkFiller
    }

    @Override
    public double getHealthScale() {
        return base.getHealthScale(); // LinkFiller
    }

    @Override
    public int getLevel() {
        return base.getLevel(); // LinkFiller
    }

    @Override
    public String getLocale() {
        return base.getLocale(); // LinkFiller
    }

    @Override
    public String getPlayerListName() {
        return base.getPlayerListName(); // LinkFiller
    }

    @Override
    public PlayerProfile getPlayerProfile() {
        return base.getPlayerProfile(); // LinkFiller
    }

    @Override
    public long getPlayerTime() {
        return base.getPlayerTime(); // LinkFiller
    }

    @Override
    public long getPlayerTimeOffset() {
        return base.getPlayerTimeOffset(); // LinkFiller
    }

    @Override
    public WeatherType getPlayerWeather() {
        return base.getPlayerWeather(); // LinkFiller
    }

    @Override
    public String getResourcePackHash() {
        return base.getResourcePackHash(); // LinkFiller
    }

    @Override
    public Status getResourcePackStatus() {
        return base.getResourcePackStatus(); // LinkFiller
    }

    @Override
    public float getSaturation() {
        return base.getSaturation(); // LinkFiller
    }

    @Override
    public Scoreboard getScoreboard() {
        return base.getScoreboard(); // LinkFiller
    }

    @Override
    public Entity getSpectatorTarget() {
        return base.getSpectatorTarget(); // LinkFiller
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
        return base.getTotalExperience(); // LinkFiller
    }

    @Override
    public int getViewDistance() {
        return base.getViewDistance(); // LinkFiller
    }

    @Override
    public float getWalkSpeed() {
        return base.getWalkSpeed(); // LinkFiller
    }

    @Override
    public void giveExp(int arg0, boolean arg1) {
        base.giveExp(arg0, arg1); // LinkFiller
    }

    @Override
    public void giveExpLevels(int arg0) {
        base.giveExpLevels(arg0); // LinkFiller
    }

    @Override
    @Deprecated
    public boolean hasAchievement(Achievement arg0) {
        System.out.println("[WARNNING]: Deprecated call to hasAchievement");
        return base.hasAchievement(arg0);
    }

    @Override
    public boolean hasResourcePack() {
        return base.hasResourcePack(); // LinkFiller
    }

    @Override
    public void hidePlayer(Player arg0) {
        base.hidePlayer(arg0); // LinkFiller
    }

    @Override
    public void hidePlayer(Plugin arg0, Player arg1) {
        base.hidePlayer(arg0, arg1); // LinkFiller
    }

    @Override
    public void hideTitle() {
        base.hideTitle(); // LinkFiller
    }

    @Override
    public void incrementStatistic(Statistic arg0) throws IllegalArgumentException {
        base.incrementStatistic(arg0); // LinkFiller
    }

    @Override
    public void incrementStatistic(Statistic arg0, int arg1) throws IllegalArgumentException {
        base.incrementStatistic(arg0, arg1); // LinkFiller
    }

    @Override
    public void incrementStatistic(Statistic arg0, Material arg1) throws IllegalArgumentException {
        base.incrementStatistic(arg0, arg1); // LinkFiller
    }

    @Override
    public void incrementStatistic(Statistic arg0, EntityType arg1) throws IllegalArgumentException {
        base.incrementStatistic(arg0, arg1); // LinkFiller
    }

    @Override
    public void incrementStatistic(Statistic arg0, Material arg1, int arg2) throws IllegalArgumentException {
        base.incrementStatistic(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public void incrementStatistic(Statistic arg0, EntityType arg1, int arg2) throws IllegalArgumentException {
        base.incrementStatistic(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public boolean isFlying() {
        return base.isFlying(); // LinkFiller
    }

    @Override
    public boolean isHealthScaled() {
        return base.isHealthScaled(); // LinkFiller
    }

    @Override
    public boolean isPlayerTimeRelative() {
        return base.isPlayerTimeRelative(); // LinkFiller
    }

    @Override
    public boolean isSleepingIgnored() {
        return base.isSleepingIgnored(); // LinkFiller
    }

    @Override
    public boolean isSneaking() {
        return base.isSneaking(); // LinkFiller
    }

    @Override
    public boolean isSprinting() {
        return base.isSprinting(); // LinkFiller
    }

    @Override
    public void kickPlayer(String arg0) {
        base.kickPlayer(arg0); // LinkFiller
    }

    @Override
    public void loadData() {
        base.loadData(); // LinkFiller
    }

    @Override
    public boolean performCommand(String arg0) {
        return base.performCommand(arg0);
    }

    @Override
    public void playAnimationToSelf(EntityAnimation arg0) {
        base.playAnimationToSelf(arg0); // LinkFiller
    }

    @Override
    public void playEffect(Location arg0, Effect arg1, int arg2) {
        base.playEffect(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public <T> void playEffect(Location arg0, Effect arg1, T arg2) {
        base.playEffect(arg0,arg1,arg2);
    }

    @Override
    public void playNote(Location arg0, byte arg1, byte arg2) {
        base.playNote(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public void playNote(Location arg0, Instrument arg1, Note arg2) {
        base.playNote(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public void playSound(Location arg0, Sound arg1, float arg2, float arg3) {
        base.playSound(arg0, arg1, arg2, arg3); // LinkFiller
    }

    @Override
    public void playSound(Location arg0, String arg1, float arg2, float arg3) {
        base.playSound(arg0, arg1, arg2, arg3); // LinkFiller
    }

    @Override
    public void playSound(Location arg0, Sound arg1, SoundCategory arg2, float arg3, float arg4) {
        base.playSound(arg0, arg1, arg2, arg3, arg4); // LinkFiller
    }

    @Override
    public void playSound(Location arg0, String arg1, SoundCategory arg2, float arg3, float arg4) {
        base.playSound(arg0, arg1, arg2, arg3, arg4); // LinkFiller
    }

    @Override
    @Deprecated
    public void removeAchievement(Achievement arg0) {
        base.removeAchievement(arg0); // LinkFiller
    }

    @Override
    public void resetPlayerTime() {
        base.resetPlayerTime(); // LinkFiller
    }

    @Override
    public void resetPlayerWeather() {
        base.resetPlayerWeather(); // LinkFiller
    }

    @Override
    public void resetTitle() {
        base.resetTitle(); // LinkFiller
    }

    @Override
    public void saveData() {
        base.saveData(); // LinkFiller
    }

    @Override
    public void sendActionBar(String arg0) {
        base.sendActionBar(arg0); // LinkFiller
    }

    @Override
    public void sendActionBar(char arg0, String arg1) {
        base.sendActionBar(arg0, arg1); // LinkFiller
    }

    @Override
    public void sendBlockChange(Location arg0, Material arg1, byte arg2) {
        base.sendBlockChange(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public void sendBlockChange(Location arg0, int arg1, byte arg2) {
        base.sendBlockChange(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public boolean sendChunkChange(Location arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        return base.sendChunkChange(arg0, arg1, arg2,arg3, arg4);
    }

    @Override
    public void sendMap(MapView arg0) {
        base.sendMap(arg0); // LinkFiller
    }

    @Override
    public void sendRawMessage(String arg0) {
        base.sendRawMessage(arg0); // LinkFiller
    }

    @Override
    public void sendSignChange(Location arg0, String[] arg1) throws IllegalArgumentException {
        base.sendSignChange(arg0, arg1); // LinkFiller
    }

    @Override
    public void sendTitle(Title arg0) {
        base.sendTitle(arg0); // LinkFiller
    }

    @Override
    public void sendTitle(String arg0, String arg1) {
        base.sendTitle(arg0, arg1); // LinkFiller
    }

    @Override
    public void sendTitle(String arg0, String arg1, int arg2, int arg3, int arg4) {
        base.sendTitle(arg0, arg1, arg2, arg3, arg4); // LinkFiller
    }

    @Override
    public void setAffectsSpawning(boolean arg0) {
        base.setAffectsSpawning(arg0); // LinkFiller
    }

    @Override
    public void setAllowFlight(boolean arg0) {
        base.setAllowFlight(arg0); // LinkFiller
    }

    @Override
    public void setBedSpawnLocation(Location arg0) {
        base.setBedSpawnLocation(arg0); // LinkFiller
    }

    @Override
    public void setBedSpawnLocation(Location arg0, boolean arg1) {
        base.setBedSpawnLocation(arg0, arg1); // LinkFiller
    }

    @Override
    public void setCompassTarget(Location arg0) {
        base.setCompassTarget(arg0); // LinkFiller
    }

    @Override
    public void setDisplayName(String arg0) {
        base.setDisplayName(arg0); // LinkFiller
    }

    @Override
    public void setExhaustion(float arg0) {
        base.setExhaustion(arg0); // LinkFiller
    }

    @Override
    public void setExp(float arg0) {
        base.setExp(arg0); // LinkFiller
    }

    @Override
    public void setFlySpeed(float arg0) throws IllegalArgumentException {
        base.setFlySpeed(arg0); // LinkFiller
    }

    @Override
    public void setFlying(boolean arg0) {
        base.setFlying(arg0); // LinkFiller
    }

    @Override
    public void setFoodLevel(int arg0) {
        base.setFoodLevel(arg0); // LinkFiller
    }

    @Override
    public void setHealthScale(double arg0) throws IllegalArgumentException {
        base.setHealthScale(arg0); // LinkFiller
    }

    @Override
    public void setHealthScaled(boolean arg0) {
        base.setHealthScaled(arg0); // LinkFiller
    }

    @Override
    public void setLevel(int arg0) {
        base.setLevel(arg0); // LinkFiller
    }

    @Override
    public void setPlayerListHeaderFooter(BaseComponent[] arg0, BaseComponent[] arg1) {
        base.setPlayerListHeaderFooter(arg0, arg1); // LinkFiller
    }

    @Override
    public void setPlayerListHeaderFooter(BaseComponent arg0, BaseComponent arg1) {
        base.setPlayerListHeaderFooter(arg0, arg1); // LinkFiller
    }

    @Override
    public void setPlayerListName(String arg0) {
        base.setPlayerListName(arg0); // LinkFiller
    }

    @Override
    public void setPlayerProfile(PlayerProfile arg0) {
        base.setPlayerProfile(arg0); // LinkFiller
    }

    @Override
    public void setPlayerTime(long arg0, boolean arg1) {
        base.setPlayerTime(arg0, arg1); // LinkFiller
    }

    @Override
    public void setPlayerWeather(WeatherType arg0) {
        base.setPlayerWeather(arg0); // LinkFiller
    }

    @Override
    public void setResourcePack(String arg0) {
        base.setResourcePack(arg0); // LinkFiller
    }

    @Override
    public void setResourcePack(String arg0, byte[] arg1) {
        base.setResourcePack(arg0, arg1); // LinkFiller
    }

    @Override
    public void setResourcePack(String arg0, String arg1) {
        base.setResourcePack(arg0, arg1); // LinkFiller
    }

    @Override
    public void setSaturation(float arg0) {
        base.setSaturation(arg0); // LinkFiller
    }

    @Override
    public void setScoreboard(Scoreboard arg0) throws IllegalArgumentException, IllegalStateException {
        base.setScoreboard(arg0); // LinkFiller
    }

    @Override
    public void setSleepingIgnored(boolean arg0) {
        base.setSleepingIgnored(arg0); // LinkFiller
    }

    @Override
    public void setSneaking(boolean arg0) {
        base.setSneaking(arg0); // LinkFiller
    }

    @Override
    public void setSpectatorTarget(Entity arg0) {
        base.setSpectatorTarget(arg0); // LinkFiller
    }

    @Override
    public void setSprinting(boolean arg0) {
        base.setSprinting(arg0); // LinkFiller
    }

    @Override
    public void setStatistic(Statistic arg0, int arg1) throws IllegalArgumentException {
        base.setStatistic(arg0, arg1); // LinkFiller
    }

    @Override
    public void setStatistic(Statistic arg0, Material arg1, int arg2) throws IllegalArgumentException {
        base.setStatistic(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public void setStatistic(Statistic arg0, EntityType arg1, int arg2) {
        base.setStatistic(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public void setSubtitle(BaseComponent[] arg0) {
        base.setSubtitle(arg0); // LinkFiller
    }

    @Override
    public void setSubtitle(BaseComponent arg0) {
        base.setSubtitle(arg0); // LinkFiller
    }

    @Override
    @Deprecated
    public void setTexturePack(String arg0) {
        base.setTexturePack(arg0); // LinkFiller
    }

    @Override
    public void setTitleTimes(int arg0, int arg1, int arg2) {
        base.setTitleTimes(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public void setTotalExperience(int arg0) {
        base.setTotalExperience(arg0); // LinkFiller
    }

    @Override
    public void setViewDistance(int arg0) {
        base.setViewDistance(arg0); // LinkFiller
    }

    @Override
    public void setWalkSpeed(float arg0) throws IllegalArgumentException {
        base.setWalkSpeed(arg0); // LinkFiller
    }

    @Override
    public void showPlayer(Player arg0) {
        base.showPlayer(arg0); // LinkFiller
    }

    @Override
    public void showPlayer(Plugin arg0, Player arg1) {
        base.showPlayer(arg0, arg1); // LinkFiller
    }

    @Override
    public void showTitle(BaseComponent[] arg0) {
        base.showTitle(arg0); // LinkFiller
    }

    @Override
    public void showTitle(BaseComponent arg0) {
        base.showTitle(arg0); // LinkFiller
    }

    @Override
    public void showTitle(BaseComponent[] arg0, BaseComponent[] arg1, int arg2, int arg3, int arg4) {
        base.showTitle(arg0, arg1, arg2, arg3, arg4); // LinkFiller
    }

    @Override
    public void showTitle(BaseComponent arg0, BaseComponent arg1, int arg2, int arg3, int arg4) {
        base.showTitle(arg0, arg1, arg2, arg3, arg4); // LinkFiller
    }

    @Override
    public void spawnParticle(Particle arg0, Location arg1, int arg2) {
        base.spawnParticle(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public <T> void spawnParticle(Particle arg0, Location arg1, int arg2, T arg3) {
        base.spawnParticle(arg0,arg1,arg2,arg3);
    }

    @Override
    public void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4) {
        base.spawnParticle(arg0, arg1, arg2, arg3, arg4); // LinkFiller
    }

    @Override
    public <T> void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, T arg5) {
        base.spawnParticle(arg0,arg1,arg2,arg3,arg4,arg5);
    }

    @Override
    public void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5) {
        base.spawnParticle(arg0, arg1, arg2, arg3, arg4, arg5); // LinkFiller
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
        return base.spigot(); // LinkFiller
    }

    @Override
    public void stopSound(Sound arg0) {
        base.stopSound(arg0); // LinkFiller
    }

    @Override
    public void stopSound(String arg0) {
        base.stopSound(arg0); // LinkFiller
    }

    @Override
    public void stopSound(Sound arg0, SoundCategory arg1) {
        base.stopSound(arg0, arg1); // LinkFiller
    }

    @Override
    public void stopSound(String arg0, SoundCategory arg1) {
        base.stopSound(arg0, arg1); // LinkFiller
    }

    @Override
    public void updateInventory() {
        base.updateInventory(); // LinkFiller
    }

    @Override
    public void updateTitle(Title arg0) {
        base.updateTitle(arg0); // LinkFiller
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