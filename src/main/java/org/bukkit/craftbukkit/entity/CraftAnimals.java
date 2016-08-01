package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityAnimal;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Animals;

public class CraftAnimals extends CraftAgeable implements Animals {

    public CraftAnimals(CraftServer server, EntityAnimal entity) {
    }

    @Override
    public EntityAnimal getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
