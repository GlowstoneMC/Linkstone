package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityArrow;
import org.apache.commons.lang.Validate;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.projectiles.ProjectileSource;

public class CraftArrow extends AbstractProjectile implements Arrow {

    public CraftArrow(CraftServer server, EntityArrow entity) {
    }

    public void setKnockbackStrength(int knockbackStrength) {
    }

    public int getKnockbackStrength() {
        return 0;
    }

    public boolean isCritical() {
        return false;
    }

    public void setCritical(boolean critical) {
    }

    public ProjectileSource getShooter() {
        return null;
    }

    public void setShooter(ProjectileSource shooter) {
    }

    @Override
    public EntityArrow getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
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
