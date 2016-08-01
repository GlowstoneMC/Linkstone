package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityBat;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Bat;
import org.bukkit.entity.EntityType;

public class CraftBat extends CraftAmbient implements Bat {

    public CraftBat(CraftServer server, EntityBat entity) {
    }

    @Override
    public EntityBat getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }

    @Override
    public boolean isAwake() {
        return false;
    }

    @Override
    public void setAwake(boolean state) {
    }
}
