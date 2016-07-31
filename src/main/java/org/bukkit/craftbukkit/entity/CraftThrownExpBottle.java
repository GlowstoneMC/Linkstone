package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityThrownExpBottle;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ThrownExpBottle;

public class CraftThrownExpBottle extends CraftProjectile implements ThrownExpBottle {

    public CraftThrownExpBottle(CraftServer server, EntityThrownExpBottle entity) {
    }

    @Override
    public EntityThrownExpBottle getHandle() {
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
