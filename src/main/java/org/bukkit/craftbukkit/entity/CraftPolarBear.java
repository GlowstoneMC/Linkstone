package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityPolarBear;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.PolarBear;

public class CraftPolarBear extends CraftAnimals implements PolarBear {

    public CraftPolarBear(CraftServer server, EntityPolarBear entity) {
    }

    @Override
    public EntityPolarBear getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public EntityType getType() {
        return null;
    }
}
