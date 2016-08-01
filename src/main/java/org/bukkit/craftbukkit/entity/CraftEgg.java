package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityEgg;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Egg;
import org.bukkit.entity.EntityType;

public class CraftEgg extends CraftProjectile implements Egg {

    public CraftEgg(CraftServer server, EntityEgg entity) {
    }

    @Override
    public EntityEgg getHandle() {
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
