package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityWitherSkull;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.WitherSkull;

public class CraftWitherSkull extends CraftFireball implements WitherSkull {

    public CraftWitherSkull(CraftServer server, EntityWitherSkull entity) {
    }

    @Override
    public void setCharged(boolean charged) {
    }

    @Override
    public boolean isCharged() {
        return false;
    }

    @Override
    public EntityWitherSkull getHandle() {
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
