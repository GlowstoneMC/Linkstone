package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityChicken;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.EntityType;

public class CraftChicken extends CraftAnimals implements Chicken {

    public CraftChicken(CraftServer server, EntityChicken entity) {
    }

    @Override
    public EntityChicken getHandle() {
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
