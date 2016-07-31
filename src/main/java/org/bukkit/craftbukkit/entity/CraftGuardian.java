package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityGuardian;
import net.minecraft.server.GenericAttributes;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Guardian;

public class CraftGuardian extends CraftMonster implements Guardian {

    public CraftGuardian(CraftServer server, EntityGuardian entity) {
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public EntityType getType() {
        return null;
    }

    @Override
    public boolean isElder() {
        return false;
    }

    @Override
    public void setElder(boolean shouldBeElder) {
    }
}
