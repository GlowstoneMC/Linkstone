package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityZombie;
import net.minecraft.server.EnumZombieType;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Zombie;

public class CraftZombie extends CraftMonster implements Zombie {

    public CraftZombie(CraftServer server, EntityZombie entity) {
    }

    @Override
    public EntityZombie getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }

    public boolean isBaby() {
        return false;
    }

    public void setBaby(boolean flag) {
    }

    public boolean isVillager() {
        return false;
    }

    public void setVillager(boolean flag) {
    }

    @Override
    public void setVillagerProfession(Villager.Profession profession) {
    }

    @Override
    public Villager.Profession getVillagerProfession() {
        return null;
    }
}
