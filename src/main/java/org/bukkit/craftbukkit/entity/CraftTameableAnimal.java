package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityTameableAnimal;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.AnimalTamer;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Tameable;
import java.util.UUID;

public class CraftTameableAnimal extends CraftAnimals implements Tameable, Creature {

    public CraftTameableAnimal(CraftServer server, EntityTameableAnimal entity) {
    }

    @Override
    public EntityTameableAnimal getHandle() {
        return null;
    }

    public UUID getOwnerUUID() {
        return null;
    }

    public void setOwnerUUID(UUID uuid) {
    }

    public AnimalTamer getOwner() {
        return null;
    }

    public boolean isTamed() {
        return false;
    }

    public void setOwner(AnimalTamer tamer) {
    }

    public void setTamed(boolean tame) {
    }

    public boolean isSitting() {
        return false;
    }

    public void setSitting(boolean sitting) {
    }

    @Override
    public String toString() {
        return null;
    }
}
