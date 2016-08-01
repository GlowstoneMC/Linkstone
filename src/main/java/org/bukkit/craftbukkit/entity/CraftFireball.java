package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityFireball;
import net.minecraft.server.MathHelper;
import org.apache.commons.lang.Validate;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.LivingEntity;
import org.bukkit.projectiles.ProjectileSource;
import org.bukkit.util.Vector;

public class CraftFireball extends AbstractProjectile implements Fireball {

    public CraftFireball(CraftServer server, EntityFireball entity) {
    }

    public float getYield() {
        return 0.0F;
    }

    public boolean isIncendiary() {
        return false;
    }

    public void setIsIncendiary(boolean isIncendiary) {
    }

    public void setYield(float yield) {
    }

    public ProjectileSource getShooter() {
        return null;
    }

    public void setShooter(ProjectileSource shooter) {
    }

    public Vector getDirection() {
        return null;
    }

    public void setDirection(Vector direction) {
    }

    @Override
    public EntityFireball getHandle() {
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
    public void _INVALID_setShooter(LivingEntity shooter) {
    }

    @Deprecated
    public LivingEntity _INVALID_getShooter() {
        return null;
    }
}
