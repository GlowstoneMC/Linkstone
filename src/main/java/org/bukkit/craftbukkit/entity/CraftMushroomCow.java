package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityMushroomCow;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.MushroomCow;

public class CraftMushroomCow extends CraftCow implements MushroomCow {

    public CraftMushroomCow(CraftServer server, EntityMushroomCow entity) {
    }

    @Override
    public EntityMushroomCow getHandle() {
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
