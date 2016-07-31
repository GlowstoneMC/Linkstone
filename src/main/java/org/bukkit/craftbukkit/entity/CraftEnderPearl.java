package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityEnderPearl;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.EntityType;

public class CraftEnderPearl extends CraftProjectile implements EnderPearl {

    public CraftEnderPearl(CraftServer server, EntityEnderPearl entity) {
    }

    @Override
    public EntityEnderPearl getHandle() {
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
