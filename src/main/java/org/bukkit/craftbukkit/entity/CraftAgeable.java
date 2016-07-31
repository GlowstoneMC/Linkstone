package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityAgeable;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Ageable;

public class CraftAgeable extends CraftCreature implements Ageable {

    public CraftAgeable(CraftServer server, EntityAgeable entity) {
    }

    public int getAge() {
        return 0;
    }

    public void setAge(int age) {
    }

    public void setAgeLock(boolean lock) {
    }

    public boolean getAgeLock() {
        return false;
    }

    public void setBaby() {
    }

    public void setAdult() {
    }

    public boolean isAdult() {
        return false;
    }

    public boolean canBreed() {
        return false;
    }

    public void setBreed(boolean breed) {
    }

    @Override
    public EntityAgeable getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
