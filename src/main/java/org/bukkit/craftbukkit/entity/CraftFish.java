package org.bukkit.craftbukkit.entity;

import net.minecraft.server.BlockPosition;
import net.minecraft.server.EntityFishingHook;
import net.minecraft.server.EntityHuman;
import net.minecraft.server.MathHelper;
import org.apache.commons.lang.Validate;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fish;
import org.bukkit.entity.LivingEntity;
import org.bukkit.projectiles.ProjectileSource;

public class CraftFish extends AbstractProjectile implements Fish {

    private double biteChance;

    public CraftFish(CraftServer server, EntityFishingHook entity) {
    }

    public ProjectileSource getShooter() {
        return null;
    }

    public void setShooter(ProjectileSource shooter) {
    }

    @Override
    public EntityFishingHook getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }

    public double getBiteChance() {
        return 0.0;
    }

    public void setBiteChance(double chance) {
    }

    @Deprecated
    public LivingEntity _INVALID_getShooter() {
        return null;
    }

    @Deprecated
    public void _INVALID_setShooter(LivingEntity shooter) {
    }
}
