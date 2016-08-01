package org.bukkit.craftbukkit.entity;

import net.minecraft.server.BlockPosition;
import net.minecraft.server.EntityEnderCrystal;
import org.bukkit.Location;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EnderCrystal;
import org.bukkit.entity.EntityType;

public class CraftEnderCrystal extends CraftEntity implements EnderCrystal {

    public CraftEnderCrystal(CraftServer server, EntityEnderCrystal entity) {
    }

    @Override
    public boolean isShowingBottom() {
        return false;
    }

    @Override
    public void setShowingBottom(boolean showing) {
    }

    @Override
    public Location getBeamTarget() {
        return null;
    }

    @Override
    public void setBeamTarget(Location location) {
    }

    @Override
    public EntityEnderCrystal getHandle() {
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
