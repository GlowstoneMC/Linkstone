package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntitySmallFireball;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.SmallFireball;

public class CraftSmallFireball extends CraftFireball implements SmallFireball {

    public CraftSmallFireball(CraftServer server, EntitySmallFireball entity) {
    }

    @Override
    public EntitySmallFireball getHandle() {
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
