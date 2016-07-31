package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityPig;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Pig;

public class CraftPig extends CraftAnimals implements Pig {

    public CraftPig(CraftServer server, EntityPig entity) {
    }

    public boolean hasSaddle() {
        return false;
    }

    public void setSaddle(boolean saddled) {
    }

    public EntityPig getHandle() {
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
