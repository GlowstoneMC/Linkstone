package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityMinecartAbstract;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.minecart.RideableMinecart;

public class CraftMinecartRideable extends CraftMinecart implements RideableMinecart {

    public CraftMinecartRideable(CraftServer server, EntityMinecartAbstract entity) {
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }
}
