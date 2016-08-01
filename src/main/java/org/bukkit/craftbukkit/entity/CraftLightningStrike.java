package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityLightning;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LightningStrike;

public class CraftLightningStrike extends CraftEntity implements LightningStrike {

    public CraftLightningStrike(final CraftServer server, final EntityLightning entity) {
    }

    public boolean isEffect() {
        return false;
    }

    @Override
    public EntityLightning getHandle() {
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
