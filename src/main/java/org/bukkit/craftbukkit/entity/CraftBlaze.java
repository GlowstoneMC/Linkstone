package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityBlaze;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.EntityType;

public class CraftBlaze extends CraftMonster implements Blaze {

    public CraftBlaze(CraftServer server, EntityBlaze entity) {
    }

    @Override
    public EntityBlaze getHandle() {
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
