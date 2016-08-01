package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntitySpectralArrow;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.SpectralArrow;

public class CraftSpectralArrow extends CraftArrow implements SpectralArrow {

    public CraftSpectralArrow(CraftServer server, EntitySpectralArrow entity) {
    }

    @Override
    public EntitySpectralArrow getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public EntityType getType() {
        return null;
    }

    @Override
    public int getGlowingTicks() {
        return 0;
    }

    @Override
    public void setGlowingTicks(int duration) {
    }
}
