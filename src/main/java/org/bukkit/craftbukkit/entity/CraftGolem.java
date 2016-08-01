package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityGolem;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Golem;

public class CraftGolem extends CraftCreature implements Golem {

    public CraftGolem(CraftServer server, EntityGolem entity) {
    }

    @Override
    public EntityGolem getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
