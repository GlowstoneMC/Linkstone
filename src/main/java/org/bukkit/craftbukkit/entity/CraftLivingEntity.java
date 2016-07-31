package org.bukkit.craftbukkit.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.server.DamageSource;
import net.minecraft.server.EntityArmorStand;
import net.minecraft.server.EntityArrow;
import net.minecraft.server.EntityDragonFireball;
import net.minecraft.server.EntityEgg;
import net.minecraft.server.EntityEnderPearl;
import net.minecraft.server.EntityFishingHook;
import net.minecraft.server.EntityHuman;
import net.minecraft.server.EntityFireball;
import net.minecraft.server.EntityInsentient;
import net.minecraft.server.EntityLargeFireball;
import net.minecraft.server.EntityLiving;
import net.minecraft.server.EntityPlayer;
import net.minecraft.server.EntityPotion;
import net.minecraft.server.EntityProjectile;
import net.minecraft.server.EntitySmallFireball;
import net.minecraft.server.EntitySnowball;
import net.minecraft.server.EntityThrownExpBottle;
import net.minecraft.server.EntityTippedArrow;
import net.minecraft.server.EntitySpectralArrow;
import net.minecraft.server.EntityWither;
import net.minecraft.server.EntityWitherSkull;
import net.minecraft.server.GenericAttributes;
import net.minecraft.server.MobEffect;
import net.minecraft.server.MobEffectList;
import org.apache.commons.lang.Validate;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.inventory.CraftEntityEquipment;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.craftbukkit.potion.CraftPotionUtil;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.DragonFireball;
import org.bukkit.entity.Egg;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Fish;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.LingeringPotion;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.SmallFireball;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.entity.ThrownExpBottle;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.entity.TippedArrow;
import org.bukkit.entity.WitherSkull;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;
import org.bukkit.util.BlockIterator;
import org.bukkit.util.NumberConversions;
import org.bukkit.util.Vector;

public class CraftLivingEntity extends CraftEntity implements LivingEntity {

    private CraftEntityEquipment equipment;

    public CraftLivingEntity(final CraftServer server, final EntityLiving entity) {
    }

    public double getHealth() {
        return 0.0;
    }

    public void setHealth(double health) {
    }

    public double getMaxHealth() {
        return 0.0;
    }

    public void setMaxHealth(double amount) {
    }

    public void resetMaxHealth() {
    }

    public double getEyeHeight() {
        return 0.0;
    }

    public double getEyeHeight(boolean ignoreSneaking) {
        return 0.0;
    }

    private List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance, int maxLength) {
        return null;
    }

    private List<Block> getLineOfSight(Set<Material> transparent, int maxDistance, int maxLength) {
        return null;
    }

    public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
        return null;
    }

    public List<Block> getLineOfSight(Set<Material> transparent, int maxDistance) {
        return null;
    }

    public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
        return null;
    }

    public Block getTargetBlock(Set<Material> transparent, int maxDistance) {
        return null;
    }

    public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent, int maxDistance) {
        return null;
    }

    public List<Block> getLastTwoTargetBlocks(Set<Material> transparent, int maxDistance) {
        return null;
    }

    public int getRemainingAir() {
        return 0;
    }

    public void setRemainingAir(int ticks) {
    }

    public int getMaximumAir() {
        return 0;
    }

    public void setMaximumAir(int ticks) {
    }

    public void damage(double amount) {
    }

    public void damage(double amount, org.bukkit.entity.Entity source) {
    }

    public Location getEyeLocation() {
        return null;
    }

    public int getMaximumNoDamageTicks() {
        return 0;
    }

    public void setMaximumNoDamageTicks(int ticks) {
    }

    public double getLastDamage() {
        return 0.0;
    }

    public void setLastDamage(double damage) {
    }

    public int getNoDamageTicks() {
        return 0;
    }

    public void setNoDamageTicks(int ticks) {
    }

    @Override
    public EntityLiving getHandle() {
        return null;
    }

    public void setHandle(final EntityLiving entity) {
    }

    @Override
    public String toString() {
        return null;
    }

    public Player getKiller() {
        return null;
    }

    public boolean addPotionEffect(PotionEffect effect) {
        return false;
    }

    public boolean addPotionEffect(PotionEffect effect, boolean force) {
        return false;
    }

    public boolean addPotionEffects(Collection<PotionEffect> effects) {
        return false;
    }

    public boolean hasPotionEffect(PotionEffectType type) {
        return false;
    }

    public void removePotionEffect(PotionEffectType type) {
    }

    public Collection<PotionEffect> getActivePotionEffects() {
        return null;
    }

    public <T extends Projectile> T launchProjectile(Class<? extends T> projectile) {
        return null;
    }

    @SuppressWarnings("unchecked")
    public <T extends Projectile> T launchProjectile(Class<? extends T> projectile, Vector velocity) {
        return null;
    }

    public EntityType getType() {
        return null;
    }

    public boolean hasLineOfSight(Entity other) {
        return false;
    }

    public boolean getRemoveWhenFarAway() {
        return false;
    }

    public void setRemoveWhenFarAway(boolean remove) {
    }

    public EntityEquipment getEquipment() {
        return null;
    }

    public void setCanPickupItems(boolean pickup) {
    }

    public boolean getCanPickupItems() {
        return false;
    }

    @Override
    public boolean teleport(Location location, PlayerTeleportEvent.TeleportCause cause) {
        return false;
    }

    public boolean isLeashed() {
        return false;
    }

    public Entity getLeashHolder() throws IllegalStateException {
        return null;
    }

    private boolean unleash() {
        return false;
    }

    public boolean setLeashHolder(Entity holder) {
        return false;
    }

    @Override
    public boolean isGliding() {
        return false;
    }

    @Override
    public void setGliding(boolean gliding) {
    }

    @Deprecated
    public int _INVALID_getLastDamage() {
        return 0;
    }

    @Deprecated
    public void _INVALID_setLastDamage(int damage) {
    }

    @Deprecated
    public void _INVALID_damage(int amount) {
    }

    @Deprecated
    public void _INVALID_damage(int amount, Entity source) {
    }

    @Deprecated
    public int _INVALID_getHealth() {
        return 0;
    }

    @Deprecated
    public void _INVALID_setHealth(int health) {
    }

    @Deprecated
    public int _INVALID_getMaxHealth() {
        return 0;
    }

    @Deprecated
    public void _INVALID_setMaxHealth(int health) {
    }

    @Override
    public AttributeInstance getAttribute(Attribute attribute) {
        return null;
    }

    @Override
    public void setAI(boolean ai) {
    }

    @Override
    public boolean hasAI() {
        return false;
    }

    @Override
    public void setCollidable(boolean collidable) {
    }

    @Override
    public boolean isCollidable() {
        return false;
    }
}
