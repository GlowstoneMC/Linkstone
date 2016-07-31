package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityPigZombie;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.PigZombie;

public class CraftPigZombie extends CraftZombie implements PigZombie {

    public CraftPigZombie(CraftServer server, EntityPigZombie entity) {
    }

    public int getAnger() {
        return 0;
    }

    public void setAnger(int level) {
    }

    public void setAngry(boolean angry) {
    }

    public boolean isAngry() {
        return false;
    }

    @Override
    public EntityPigZombie getHandle() {
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
