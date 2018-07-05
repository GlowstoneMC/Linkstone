package org.bukkit.craftbukkit.entity;

import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Vehicle;

import net.glowstone.entity.GlowEntity;

public abstract class CraftVehicle extends CraftEntity implements Vehicle {

    public CraftVehicle(GlowEntity glow) {
        super(glow);
    }

    public CraftVehicle(CraftServer server, net.minecraft.server.Entity entity) {
        super(server, entity);
    }

    @Override
    public String toString() {
        return "CraftVehicle{passenger=" + getPassenger() + '}';
    }

}