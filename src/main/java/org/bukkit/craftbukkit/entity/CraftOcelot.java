package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityOcelot;
import org.apache.commons.lang.Validate;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Ocelot;

public class CraftOcelot extends CraftTameableAnimal implements Ocelot {

    public CraftOcelot(CraftServer server, EntityOcelot wolf) {
    }

    @Override
    public EntityOcelot getHandle() {
        return null;
    }

    public Type getCatType() {
        return null;
    }

    public void setCatType(Type type) {
    }

    @Override
    public EntityType getType() {
        return null;
    }
}
