package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntitySnowball;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Snowball;

public class CraftSnowball extends CraftProjectile implements Snowball {

    public CraftSnowball(CraftServer server, EntitySnowball entity) {
    }

    @Override
    public EntitySnowball getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }
}
