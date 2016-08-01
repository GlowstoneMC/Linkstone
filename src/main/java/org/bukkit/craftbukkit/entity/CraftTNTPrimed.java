package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityLiving;
import net.minecraft.server.EntityTNTPrimed;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.TNTPrimed;

public class CraftTNTPrimed extends CraftEntity implements TNTPrimed {

    public CraftTNTPrimed(CraftServer server, EntityTNTPrimed entity) {
    }

    public float getYield() {
        return 0.0F;
    }

    public boolean isIncendiary() {
        return false;
    }

    public void setIsIncendiary(boolean isIncendiary) {
    }

    public void setYield(float yield) {
    }

    public int getFuseTicks() {
        return 0;
    }

    public void setFuseTicks(int fuseTicks) {
    }

    @Override
    public EntityTNTPrimed getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }

    public Entity getSource() {
        return null;
    }
}
