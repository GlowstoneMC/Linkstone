package org.bukkit.craftbukkit.entity;

import java.util.List;
import net.minecraft.server.EntityAreaEffectCloud;
import net.minecraft.server.EntityLiving;
import net.minecraft.server.MobEffect;
import net.minecraft.server.MobEffectList;
import org.apache.commons.lang.Validate;
import org.bukkit.Color;
import org.bukkit.Particle;
import org.bukkit.craftbukkit.CraftParticle;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.potion.CraftPotionUtil;
import org.bukkit.entity.AreaEffectCloud;
import org.bukkit.entity.EntityType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.projectiles.ProjectileSource;
import org.bukkit.potion.PotionData;
import com.google.common.collect.ImmutableList;

public class CraftAreaEffectCloud extends CraftEntity implements AreaEffectCloud {

    public CraftAreaEffectCloud(CraftServer server, EntityAreaEffectCloud entity) {
    }

    @Override
    public EntityAreaEffectCloud getHandle() {
        return null;
    }

    @Override
    public EntityType getType() {
        return null;
    }

    @Override
    public int getDuration() {
        return 0;
    }

    @Override
    public void setDuration(int duration) {
    }

    @Override
    public int getWaitTime() {
        return 0;
    }

    @Override
    public void setWaitTime(int waitTime) {
    }

    @Override
    public int getReapplicationDelay() {
        return 0;
    }

    @Override
    public void setReapplicationDelay(int delay) {
    }

    @Override
    public int getDurationOnUse() {
        return 0;
    }

    @Override
    public void setDurationOnUse(int duration) {
    }

    @Override
    public float getRadius() {
        return 0.0F;
    }

    @Override
    public void setRadius(float radius) {
    }

    @Override
    public float getRadiusOnUse() {
        return 0.0F;
    }

    @Override
    public void setRadiusOnUse(float radius) {
    }

    @Override
    public float getRadiusPerTick() {
        return 0.0F;
    }

    @Override
    public void setRadiusPerTick(float radius) {
    }

    @Override
    public Particle getParticle() {
        return null;
    }

    @Override
    public void setParticle(Particle particle) {
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public void setColor(Color color) {
    }

    @Override
    public boolean addCustomEffect(PotionEffect effect, boolean override) {
        return false;
    }

    @Override
    public void clearCustomEffects() {
    }

    @Override
    public List<PotionEffect> getCustomEffects() {
        return null;
    }

    @Override
    public boolean hasCustomEffect(PotionEffectType type) {
        return false;
    }

    @Override
    public boolean hasCustomEffects() {
        return false;
    }

    @Override
    public boolean removeCustomEffect(PotionEffectType effect) {
        return false;
    }

    @Override
    public void setBasePotionData(PotionData data) {
    }

    @Override
    public PotionData getBasePotionData() {
        return null;
    }

    public ProjectileSource getSource() {
        return null;
    }

    public void setSource(ProjectileSource shooter) {
    }
}
