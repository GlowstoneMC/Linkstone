package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityLiving;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.ComplexLivingEntity;

public abstract class CraftComplexLivingEntity extends CraftLivingEntity implements ComplexLivingEntity {

    public CraftComplexLivingEntity(CraftServer server, EntityLiving entity) {
    }

    @Override
    public EntityLiving getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
