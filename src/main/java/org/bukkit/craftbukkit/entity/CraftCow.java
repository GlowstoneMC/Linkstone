package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityCow;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Cow;
import org.bukkit.entity.EntityType;

public class CraftCow extends CraftAnimals implements Cow {

    public CraftCow(CraftServer server, EntityCow entity) {
    }

    @Override
    public EntityCow getHandle() {
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
