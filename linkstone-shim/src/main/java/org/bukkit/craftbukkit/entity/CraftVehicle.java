package org.bukkit.craftbukkit.entity;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LDelegate;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Vehicle;

import net.glowstone.entity.GlowEntity;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public abstract class CraftVehicle<V extends GlowEntity & Vehicle> extends CraftEntity implements Vehicle {
    @LDelegate(Vehicle.class)
    private V glow;

    public CraftVehicle(V glow) {
        super(glow);
    }
}