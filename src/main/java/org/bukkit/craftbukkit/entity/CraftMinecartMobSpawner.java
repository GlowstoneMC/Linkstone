package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityMinecartMobSpawner;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.minecart.SpawnerMinecart;

final class CraftMinecartMobSpawner extends CraftMinecart implements SpawnerMinecart {

    CraftMinecartMobSpawner(CraftServer server, EntityMinecartMobSpawner entity) {
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }
}
