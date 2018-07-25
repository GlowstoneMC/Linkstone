package org.bukkit.craftbukkit.entity;

import net.glowstone.linkstone.annotations.LClassfile;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Vehicle;

import net.glowstone.entity.GlowEntity;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
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