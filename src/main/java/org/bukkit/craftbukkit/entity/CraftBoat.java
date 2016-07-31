package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityBoat;
import org.bukkit.TreeSpecies;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Boat;
import org.bukkit.entity.EntityType;

public class CraftBoat extends CraftVehicle implements Boat {

    public CraftBoat(CraftServer server, EntityBoat entity) {
    }

    @Override
    public TreeSpecies getWoodType() {
        return null;
    }

    @Override
    public void setWoodType(TreeSpecies species) {
    }

    public double getMaxSpeed() {
        return 0.0;
    }

    public void setMaxSpeed(double speed) {
    }

    public double getOccupiedDeceleration() {
        return 0.0;
    }

    public void setOccupiedDeceleration(double speed) {
    }

    public double getUnoccupiedDeceleration() {
        return 0.0;
    }

    public void setUnoccupiedDeceleration(double speed) {
    }

    public boolean getWorkOnLand() {
        return false;
    }

    public void setWorkOnLand(boolean workOnLand) {
    }

    @Override
    public EntityBoat getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }

    public static TreeSpecies getTreeSpecies(EntityBoat.EnumBoatType boatType) {
        return null;
    }

    public static EntityBoat.EnumBoatType getBoatType(TreeSpecies species) {
        return null;
    }
}
