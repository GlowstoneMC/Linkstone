package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityCreature;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Creature;
import org.bukkit.entity.LivingEntity;

public class CraftCreature extends CraftLivingEntity implements Creature {

    public CraftCreature(CraftServer server, EntityCreature entity) {
    }

    public void setTarget(LivingEntity target) {
    }

    public CraftLivingEntity getTarget() {
        return null;
    }

    @Override
    public EntityCreature getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
