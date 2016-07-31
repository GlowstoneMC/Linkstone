package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityShulkerBullet;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.ShulkerBullet;
import org.bukkit.projectiles.ProjectileSource;

public class CraftShulkerBullet extends AbstractProjectile implements ShulkerBullet {

    public CraftShulkerBullet(CraftServer server, EntityShulkerBullet entity) {
    }

    @Override
    public ProjectileSource getShooter() {
        return null;
    }

    @Override
    public void setShooter(ProjectileSource shooter) {
    }

    @Override
    public org.bukkit.entity.Entity getTarget() {
        return null;
    }

    @Override
    public void setTarget(org.bukkit.entity.Entity target) {
    }

    @Override
    public EntityType getType() {
        return null;
    }

    @Override
    public EntityShulkerBullet getHandle() {
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
