package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntitySheep;
import net.minecraft.server.EnumColor;
import org.bukkit.DyeColor;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Sheep;

public class CraftSheep extends CraftAnimals implements Sheep {

    public CraftSheep(CraftServer server, EntitySheep entity) {
    }

    public DyeColor getColor() {
        return null;
    }

    public void setColor(DyeColor color) {
    }

    public boolean isSheared() {
        return false;
    }

    public void setSheared(boolean flag) {
    }

    @Override
    public EntitySheep getHandle() {
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
