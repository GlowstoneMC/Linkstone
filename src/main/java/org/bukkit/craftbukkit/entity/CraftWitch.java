package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityWitch;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Witch;
import org.bukkit.entity.EntityType;

public class CraftWitch extends CraftMonster implements Witch {

    public CraftWitch(CraftServer server, EntityWitch entity) {
    }

    @Override
    public EntityWitch getHandle() {
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
