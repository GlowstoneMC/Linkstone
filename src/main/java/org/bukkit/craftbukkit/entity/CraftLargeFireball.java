package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityLargeFireball;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LargeFireball;

public class CraftLargeFireball extends CraftFireball implements LargeFireball {

    public CraftLargeFireball(CraftServer server, EntityLargeFireball entity) {
    }

    @Override
    public void setYield(float yield) {
    }

    @Override
    public EntityLargeFireball getHandle() {
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
