package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityWeather;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Weather;

public class CraftWeather extends CraftEntity implements Weather {

    public CraftWeather(final CraftServer server, final EntityWeather entity) {
    }

    @Override
    public EntityWeather getHandle() {
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
