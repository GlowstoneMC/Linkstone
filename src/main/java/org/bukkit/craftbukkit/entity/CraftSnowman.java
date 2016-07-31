package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntitySnowman;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Snowman;

public class CraftSnowman extends CraftGolem implements Snowman {

    public CraftSnowman(CraftServer server, EntitySnowman entity) {
    }

    @Override
    public boolean isDerp() {
        return false;
    }

    @Override
    public void setDerp(boolean derpMode) {
    }

    @Override
    public EntitySnowman getHandle() {
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
