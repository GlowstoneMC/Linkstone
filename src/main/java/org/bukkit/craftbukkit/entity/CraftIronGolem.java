package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityIronGolem;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.IronGolem;

public class CraftIronGolem extends CraftGolem implements IronGolem {

    public CraftIronGolem(CraftServer server, EntityIronGolem entity) {
    }

    @Override
    public EntityIronGolem getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public boolean isPlayerCreated() {
        return false;
    }

    public void setPlayerCreated(boolean playerCreated) {
    }

    @Override
    public EntityType getType() {
        return null;
    }
}
