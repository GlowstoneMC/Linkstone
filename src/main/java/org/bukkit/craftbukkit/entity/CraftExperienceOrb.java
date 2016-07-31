package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityExperienceOrb;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ExperienceOrb;

public class CraftExperienceOrb extends CraftEntity implements ExperienceOrb {

    public CraftExperienceOrb(CraftServer server, EntityExperienceOrb entity) {
    }

    public int getExperience() {
        return 0;
    }

    public void setExperience(int value) {
    }

    @Override
    public EntityExperienceOrb getHandle() {
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
