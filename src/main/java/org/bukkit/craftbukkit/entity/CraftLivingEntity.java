package org.bukkit.craftbukkit.entity;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.bukkit.EntityAnimation;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import net.glowstone.entity.GlowLivingEntity;

public class CraftLivingEntity extends CraftEntity implements LivingEntity {
    private GlowLivingEntity base;
    public CraftLivingEntity(GlowLivingEntity p) {
        super(p);
        this.base = p;
    }

    @Override
    public AttributeInstance getAttribute(Attribute arg0) {
        return base.getAttribute(arg0); // LinkFiller Generated
    }

    @Override
    public void damage(double arg0) {
        base.damage(arg0); // LinkFiller Generated
    }

    @Override
    public void damage(double arg0, Entity arg1) {
        base.damage(arg0, arg1); // LinkFiller Generated
    }

    @Override
    public void damage(double arg0, DamageCause arg1) {
        base.damage(arg0, arg1); // LinkFiller Generated
    }

    @Override
    public void damage(double arg0, Entity arg1, DamageCause arg2) {
        base.damage(arg0, arg1, arg2); // LinkFiller Generated
    }

    @Override
    public double getHealth() {
        return base.getHealth(); // LinkFiller Generated
    }

    @Override
    public double getMaxHealth() {
        return base.getMaxHealth(); // LinkFiller Generated
    }

    @Override
    public void resetMaxHealth() {
        base.resetMaxHealth(); // LinkFiller Generated
    }

    @Override
    public void setHealth(double arg0) {
        base.setHealth(arg0); // LinkFiller Generated
    }

    @Override
    public void setMaxHealth(double arg0) {
        base.setMaxHealth(arg0); // LinkFiller Generated
    }

    @Override
    public <T extends Projectile> T launchProjectile(Class<? extends T> arg0) {
        return base.launchProjectile(arg0);
    }

    @Override
    public <T extends Projectile> T launchProjectile(Class<? extends T> arg0, Vector arg1) {
        return base.launchProjectile(arg0, arg1);
    }

    @Override
    public boolean addPotionEffect(PotionEffect arg0) {
        return base.addPotionEffect(arg0); // LinkFiller Generated
    }

    @Override
    public boolean addPotionEffect(PotionEffect arg0, boolean arg1) {
        return base.addPotionEffect(arg0, arg1); // LinkFiller Generated
    }

    @Override
    public boolean addPotionEffects(Collection<PotionEffect> arg0) {
        return base.addPotionEffects(arg0); // LinkFiller Generated
    }

    @Override
    public Collection<PotionEffect> getActivePotionEffects() {
        return base.getActivePotionEffects(); // LinkFiller Generated
    }

    @Override
    public int getArrowsStuck() {
        return base.getArrowsStuck(); // LinkFiller Generated
    }

    @Override
    public boolean getCanPickupItems() {
        return base.getCanPickupItems(); // LinkFiller Generated
    }

    @Override
    public EntityEquipment getEquipment() {
        return base.getEquipment(); // LinkFiller Generated
    }

    @Override
    public double getEyeHeight() {
        return base.getEyeHeight(); // LinkFiller Generated
    }

    @Override
    public double getEyeHeight(boolean arg0) {
        return base.getEyeHeight(arg0); // LinkFiller Generated
    }

    @Override
    public Location getEyeLocation() {
        return base.getEyeLocation(); // LinkFiller Generated
    }

    @Override
    public Player getKiller() {
        return base.getKiller(); // LinkFiller Generated
    }

    @Override
    public double getLastDamage() {
        return base.getLastDamage(); // LinkFiller Generated
    }

    @Override
    public List<Block> getLastTwoTargetBlocks(Set<Material> arg0, int arg1) {
        return base.getLastTwoTargetBlocks(arg0, arg1); // LinkFiller Generated
    }

    @Override
    public Entity getLeashHolder() throws IllegalStateException {
        return base.getLeashHolder(); // LinkFiller Generated
    }

    @Override
    public List<Block> getLineOfSight(Set<Material> arg0, int arg1) {
        return base.getLineOfSight(arg0, arg1); // LinkFiller Generated
    }

    @Override
    public int getMaximumAir() {
        return base.getMaximumAir(); // LinkFiller Generated
    }

    @Override
    public int getMaximumNoDamageTicks() {
        return base.getMaximumNoDamageTicks(); // LinkFiller Generated
    }

    @Override
    public int getNoDamageTicks() {
        return base.getNoDamageTicks(); // LinkFiller Generated
    }

    @Override
    public PotionEffect getPotionEffect(PotionEffectType arg0) {
        return base.getPotionEffect(arg0); // LinkFiller Generated
    }

    @Override
    public int getRemainingAir() {
        return base.getRemainingAir(); // LinkFiller Generated
    }

    @Override
    public boolean getRemoveWhenFarAway() {
        return base.getRemoveWhenFarAway(); // LinkFiller Generated
    }

    @Override
    public Block getTargetBlock(Set<Material> arg0, int arg1) {
        return base.getTargetBlock(arg0, arg1); // LinkFiller Generated
    }

    @Override
    public boolean hasAI() {
        return base.hasAI(); // LinkFiller Generated
    }

    @Override
    public boolean hasLineOfSight(Entity arg0) {
        return base.hasLineOfSight(arg0); // LinkFiller Generated
    }

    @Override
    public boolean hasPotionEffect(PotionEffectType arg0) {
        return base.hasPotionEffect(arg0); // LinkFiller Generated
    }

    @Override
    public boolean isCollidable() {
        return base.isCollidable(); // LinkFiller Generated
    }

    @Override
    public boolean isGliding() {
        return base.isGliding(); // LinkFiller Generated
    }

    @Override
    public boolean isLeashed() {
        return base.isLeashed(); // LinkFiller Generated
    }

    @Override
    public void playAnimation(EntityAnimation arg0) {
        base.playAnimation(arg0); // LinkFiller Generated
    }

    @Override
    public void removePotionEffect(PotionEffectType arg0) {
        base.removePotionEffect(arg0); // LinkFiller Generated
    }

    @Override
    public void setAI(boolean arg0) {
        base.setAI(arg0); // LinkFiller Generated
    }

    @Override
    public void setArrowsStuck(int arg0) {
        base.setArrowsStuck(arg0); // LinkFiller Generated
    }

    @Override
    public void setCanPickupItems(boolean arg0) {
        base.setCanPickupItems(arg0); // LinkFiller Generated
    }

    @Override
    public void setCollidable(boolean arg0) {
        base.setCollidable(arg0); // LinkFiller Generated
    }

    @Override
    public void setGliding(boolean arg0) {
        base.setGliding(arg0); // LinkFiller Generated
    }

    @Override
    public void setKiller(Player arg0) {
        base.setKiller(arg0); // LinkFiller Generated
    }

    @Override
    public void setLastDamage(double arg0) {
        base.setLastDamage(arg0); // LinkFiller Generated
    }

    @Override
    public boolean setLeashHolder(Entity arg0) {
        return base.setLeashHolder(arg0); // LinkFiller Generated
    }

    @Override
    public void setMaximumAir(int arg0) {
        base.setMaximumAir(arg0); // LinkFiller Generated
    }

    @Override
    public void setMaximumNoDamageTicks(int arg0) {
        base.setMaximumNoDamageTicks(arg0); // LinkFiller Generated
    }

    @Override
    public void setNoDamageTicks(int arg0) {
        base.setNoDamageTicks(arg0); // LinkFiller Generated
    }

    @Override
    public void setRemainingAir(int arg0) {
        base.setRemainingAir(arg0); // LinkFiller Generated
    }

    @Override
    public void setRemoveWhenFarAway(boolean arg0) {
        base.setRemoveWhenFarAway(arg0); // LinkFiller Generated
    }

}