package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityLiving;
import net.minecraft.server.EntityProjectile;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Projectile;
import org.bukkit.projectiles.ProjectileSource;

public abstract class CraftProjectile extends AbstractProjectile implements Projectile {

    public CraftProjectile(CraftServer server, net.minecraft.server.Entity entity) {
    }

    public ProjectileSource getShooter() {
        return null;
    }

    public void setShooter(ProjectileSource shooter) {
    }

    @Override
    public EntityProjectile getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    @Deprecated
    public LivingEntity _INVALID_getShooter() {
        return null;
    }

    @Deprecated
    public void _INVALID_setShooter(LivingEntity shooter) {
    }
}
