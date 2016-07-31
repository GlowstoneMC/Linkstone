package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityCaveSpider;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.EntityType;

public class CraftCaveSpider extends CraftSpider implements CaveSpider {

    public CraftCaveSpider(CraftServer server, EntityCaveSpider entity) {
    }

    @Override
    public EntityCaveSpider getHandle() {
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
