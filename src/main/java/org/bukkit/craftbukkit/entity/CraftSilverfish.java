package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntitySilverfish;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Silverfish;

public class CraftSilverfish extends CraftMonster implements Silverfish {

    public CraftSilverfish(CraftServer server, EntitySilverfish entity) {
    }

    @Override
    public EntitySilverfish getHandle() {
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
