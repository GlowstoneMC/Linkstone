package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityLeash;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LeashHitch;

public class CraftLeash extends CraftHanging implements LeashHitch {

    public CraftLeash(CraftServer server, EntityLeash entity) {
    }

    @Override
    public EntityLeash getHandle() {
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
