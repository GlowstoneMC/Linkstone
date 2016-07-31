package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityAmbient;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Ambient;
import org.bukkit.entity.EntityType;

public class CraftAmbient extends CraftLivingEntity implements Ambient {

    public CraftAmbient(CraftServer server, EntityAmbient entity) {
    }

    @Override
    public EntityAmbient getHandle() {
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
