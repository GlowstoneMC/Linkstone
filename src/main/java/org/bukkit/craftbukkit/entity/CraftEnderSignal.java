package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityEnderSignal;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EnderSignal;
import org.bukkit.entity.EntityType;

public class CraftEnderSignal extends CraftEntity implements EnderSignal {

    public CraftEnderSignal(CraftServer server, EntityEnderSignal entity) {
    }

    @Override
    public EntityEnderSignal getHandle() {
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
