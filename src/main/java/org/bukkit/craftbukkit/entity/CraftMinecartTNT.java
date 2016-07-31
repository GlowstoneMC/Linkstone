package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityMinecartTNT;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.minecart.ExplosiveMinecart;

final class CraftMinecartTNT extends CraftMinecart implements ExplosiveMinecart {

    CraftMinecartTNT(CraftServer server, EntityMinecartTNT entity) {
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }
}
