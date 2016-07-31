package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityGiantZombie;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Giant;

public class CraftGiant extends CraftMonster implements Giant {

    public CraftGiant(CraftServer server, EntityGiantZombie entity) {
    }

    @Override
    public EntityGiantZombie getHandle() {
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
