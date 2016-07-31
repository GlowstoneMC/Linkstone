package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityWolf;
import net.minecraft.server.EnumColor;
import org.bukkit.DyeColor;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Wolf;

public class CraftWolf extends CraftTameableAnimal implements Wolf {

    public CraftWolf(CraftServer server, EntityWolf wolf) {
    }

    public boolean isAngry() {
        return false;
    }

    public void setAngry(boolean angry) {
    }

    @Override
    public EntityWolf getHandle() {
        return null;
    }

    @Override
    public EntityType getType() {
        return null;
    }

    public DyeColor getCollarColor() {
        return null;
    }

    public void setCollarColor(DyeColor color) {
    }
}
