package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntitySlime;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Slime;

public class CraftSlime extends CraftLivingEntity implements Slime {

    public CraftSlime(CraftServer server, EntitySlime entity) {
    }

    public int getSize() {
        return 0;
    }

    public void setSize(int size) {
    }

    @Override
    public EntitySlime getHandle() {
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
