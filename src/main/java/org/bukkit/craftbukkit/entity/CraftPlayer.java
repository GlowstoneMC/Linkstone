package org.bukkit.craftbukkit.entity;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Achievement;
import org.bukkit.Effect;
import org.bukkit.EntityAnimation;
import org.bukkit.EntityEffect;
import org.bukkit.GameMode;
import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.Particle;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.Statistic;
import org.bukkit.WeatherType;
import org.bukkit.World;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementProgress;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.block.Block;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.block.Sign;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Villager;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.player.PlayerResourcePackStatusEvent.Status;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.InventoryView.Property;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MainHand;
import org.bukkit.inventory.Merchant;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.map.MapView;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.util.Vector;

import com.destroystokyo.paper.Title;
import com.destroystokyo.paper.profile.PlayerProfile;

import net.glowstone.GlowOfflinePlayer;
import net.glowstone.entity.GlowPlayer;
import net.glowstone.entity.meta.profile.GlowPlayerProfile;
import net.glowstone.io.PlayerDataService.PlayerReader;
import net.glowstone.net.GlowSession;
import net.md_5.bungee.api.chat.BaseComponent;

@DelegateDeserialization(GlowOfflinePlayer.class)
public class CraftPlayer implements Player {
	private UUID u;

	public CraftPlayer(UUID u) {
		this.u = u;
	}

	public CraftPlayer(GlowPlayer p) {
		this.u = p.getUniqueId();
	}

	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub
	}

	@Override
	public int getCooldown(Material arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Inventory getEnderChest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getExpToLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GameMode getGameMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlayerInventory getInventory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack getItemInHand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack getItemOnCursor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MainHand getMainHand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InventoryView getOpenInventory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity getShoulderEntityLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity getShoulderEntityRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSleepTicks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasCooldown(Material arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBlocking() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHandRaised() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSleeping() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public InventoryView openEnchanting(Location arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InventoryView openInventory(Inventory arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void openInventory(InventoryView arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InventoryView openMerchant(Villager arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InventoryView openMerchant(Merchant arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void openSign(Sign arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InventoryView openWorkbench(Location arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity releaseLeftShoulderEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity releaseRightShoulderEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCooldown(Material arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGameMode(GameMode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setItemInHand(ItemStack arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setItemOnCursor(ItemStack arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setShoulderEntityLeft(Entity arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setShoulderEntityRight(Entity arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean setWindowProperty(Property arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPotionEffect(PotionEffect arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPotionEffect(PotionEffect arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPotionEffects(Collection<PotionEffect> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<PotionEffect> getActivePotionEffects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getArrowsStuck() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getCanPickupItems() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EntityEquipment getEquipment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getEyeHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getEyeHeight(boolean arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Location getEyeLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player getKiller() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getLastDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(Set<Material> arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity getLeashHolder() throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Block> getLineOfSight(Set<Material> arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMaximumAir() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaximumNoDamageTicks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNoDamageTicks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PotionEffect getPotionEffect(PotionEffectType arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRemainingAir() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getRemoveWhenFarAway() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Block getTargetBlock(Set<Material> arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasAI() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasLineOfSight(Entity arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPotionEffect(PotionEffectType arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCollidable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGliding() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLeashed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void playAnimation(EntityAnimation arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePotionEffect(PotionEffectType arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAI(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setArrowsStuck(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCanPickupItems(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCollidable(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGliding(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setKiller(Player arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLastDamage(double arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean setLeashHolder(Entity arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setMaximumAir(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMaximumNoDamageTicks(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNoDamageTicks(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRemainingAir(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRemoveWhenFarAway(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AttributeInstance getAttribute(Attribute arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addPassenger(Entity arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addScoreboardTag(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eject() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean fromMobSpawner() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getEntityId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getFallDistance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFireTicks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location getLocation(Location arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMaxFireTicks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location getOrigin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity getPassenger() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entity> getPassengers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PistonMoveReaction getPistonMoveReaction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPortalCooldown() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<String> getScoreboardTags() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Server getServer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTicksLived() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EntityType getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UUID getUniqueId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity getVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector getVelocity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public World getWorld() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasGravity() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCustomNameVisible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDead() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGlowing() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInsideVehicle() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInvulnerable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isOnGround() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSilent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean leaveVehicle() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void playEffect(EntityEffect arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean removePassenger(Entity arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeScoreboardTag(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCustomNameVisible(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFallDistance(float arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFireTicks(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGlowing(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGravity(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setInvulnerable(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean setPassenger(Entity arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setPortalCooldown(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSilent(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTicksLived(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVelocity(Vector arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean teleport(Location arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean teleport(Entity arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean teleport(Location arg0, TeleportCause arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean teleport(Entity arg0, TeleportCause arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<MetadataValue> getMetadata(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasMetadata(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeMetadata(String arg0, Plugin arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMetadata(String arg0, MetadataValue arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMessage(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMessage(String[] arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PermissionAttachment addAttachment(Plugin arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionAttachment addAttachment(Plugin arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionAttachment addAttachment(Plugin arg0, String arg1, boolean arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionAttachment addAttachment(Plugin arg0, String arg1, boolean arg2, int arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasPermission(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPermission(Permission arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPermissionSet(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPermissionSet(Permission arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void recalculatePermissions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAttachment(PermissionAttachment arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isOp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setOp(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCustomName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCustomName(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void damage(double arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void damage(double arg0, Entity arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void damage(double arg0, DamageCause arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void damage(double arg0, Entity arg1, DamageCause arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMaxHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void resetMaxHealth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHealth(double arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMaxHealth(double arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T extends Projectile> T launchProjectile(Class<? extends T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Projectile> T launchProjectile(Class<? extends T> arg0, Vector arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void abandonConversation(Conversation arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abandonConversation(Conversation arg0, ConversationAbandonedEvent arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptConversationInput(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean beginConversation(Conversation arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isConversing() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long getFirstPlayed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getLastPlayed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Player getPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasPlayedBefore() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBanned() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isOnline() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWhitelisted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setWhitelisted(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Object> serialize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getListeningPluginChannels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendPluginMessage(Plugin arg0, String arg1, byte[] arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getProtocolVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public InetSocketAddress getVirtualHost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int applyMending(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void awardAchievement(Achievement arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canSee(Player arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void chat(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decrementStatistic(Statistic arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decrementStatistic(Statistic arg0, int arg1) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decrementStatistic(Statistic arg0, Material arg1) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decrementStatistic(Statistic arg0, EntityType arg1) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decrementStatistic(Statistic arg0, Material arg1, int arg2) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decrementStatistic(Statistic arg0, EntityType arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InetSocketAddress getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdvancementProgress getAdvancementProgress(Advancement arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getAffectsSpawning() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getAllowFlight() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Location getBedSpawnLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location getCompassTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getExhaustion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getExp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getFlySpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFoodLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getHealthScale() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getLocale() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPlayerListName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlayerProfile getPlayerProfile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getPlayerTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getPlayerTimeOffset() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public WeatherType getPlayerWeather() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getResourcePackHash() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status getResourcePackStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getSaturation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Scoreboard getScoreboard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity getSpectatorTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getStatistic(Statistic arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStatistic(Statistic arg0, Material arg1) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStatistic(Statistic arg0, EntityType arg1) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTotalExperience() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getViewDistance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getWalkSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void giveExp(int arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void giveExpLevels(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasAchievement(Achievement arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasResourcePack() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void hidePlayer(Player arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hidePlayer(Plugin arg0, Player arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hideTitle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incrementStatistic(Statistic arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incrementStatistic(Statistic arg0, int arg1) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incrementStatistic(Statistic arg0, Material arg1) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incrementStatistic(Statistic arg0, EntityType arg1) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incrementStatistic(Statistic arg0, Material arg1, int arg2) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incrementStatistic(Statistic arg0, EntityType arg1, int arg2) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isFlying() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHealthScaled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPlayerTimeRelative() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSleepingIgnored() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSneaking() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSprinting() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void kickPlayer(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean performCommand(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void playAnimationToSelf(EntityAnimation arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playEffect(Location arg0, Effect arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void playEffect(Location arg0, Effect arg1, T arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playNote(Location arg0, byte arg1, byte arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playNote(Location arg0, Instrument arg1, Note arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playSound(Location arg0, Sound arg1, float arg2, float arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playSound(Location arg0, String arg1, float arg2, float arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playSound(Location arg0, Sound arg1, SoundCategory arg2, float arg3, float arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playSound(Location arg0, String arg1, SoundCategory arg2, float arg3, float arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAchievement(Achievement arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetPlayerTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetPlayerWeather() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetTitle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendActionBar(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendActionBar(char arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendBlockChange(Location arg0, Material arg1, byte arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendBlockChange(Location arg0, int arg1, byte arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean sendChunkChange(Location arg0, int arg1, int arg2, int arg3, byte[] arg4) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sendMap(MapView arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendRawMessage(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSignChange(Location arg0, String[] arg1) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendTitle(Title arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendTitle(String arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendTitle(String arg0, String arg1, int arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAffectsSpawning(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAllowFlight(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBedSpawnLocation(Location arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBedSpawnLocation(Location arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCompassTarget(Location arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDisplayName(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setExhaustion(float arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setExp(float arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFlySpeed(float arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFlying(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFoodLevel(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHealthScale(double arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHealthScaled(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLevel(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayerListHeaderFooter(BaseComponent[] arg0, BaseComponent[] arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayerListHeaderFooter(BaseComponent arg0, BaseComponent arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayerListName(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayerProfile(PlayerProfile arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayerTime(long arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayerWeather(WeatherType arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResourcePack(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResourcePack(String arg0, byte[] arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResourcePack(String arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSaturation(float arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setScoreboard(Scoreboard arg0) throws IllegalArgumentException, IllegalStateException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSleepingIgnored(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSneaking(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSpectatorTarget(Entity arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSprinting(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatistic(Statistic arg0, int arg1) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatistic(Statistic arg0, Material arg1, int arg2) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatistic(Statistic arg0, EntityType arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSubtitle(BaseComponent[] arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSubtitle(BaseComponent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTexturePack(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTitleTimes(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTotalExperience(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setViewDistance(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setWalkSpeed(float arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showPlayer(Player arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showPlayer(Plugin arg0, Player arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showTitle(BaseComponent[] arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showTitle(BaseComponent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showTitle(BaseComponent[] arg0, BaseComponent[] arg1, int arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showTitle(BaseComponent arg0, BaseComponent arg1, int arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spawnParticle(Particle arg0, Location arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void spawnParticle(Particle arg0, Location arg1, int arg2, T arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, T arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5,
			T arg6) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5,
			double arg6) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, double arg5, double arg6,
			double arg7) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5,
			double arg6, T arg7) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, double arg5,
			double arg6, double arg7, T arg8) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, double arg5, double arg6,
			double arg7, double arg8) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, double arg5,
			double arg6, double arg7, double arg8, T arg9) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Spigot spigot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void stopSound(Sound arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopSound(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopSound(Sound arg0, SoundCategory arg1) {
		// TODO Auto-generated method stub
	}

	@Override
	public void stopSound(String arg0, SoundCategory arg1) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void updateInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTitle(Title arg0) {
		// TODO Auto-generated method stub
		
	}
}