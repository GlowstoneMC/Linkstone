package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityMinecartFurnace;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.PoweredMinecart;

@SuppressWarnings("deprecation")
public class CraftMinecartFurnace extends CraftMinecart implements PoweredMinecart {

    public CraftMinecartFurnace(CraftServer server, EntityMinecartFurnace entity) {
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }
}
