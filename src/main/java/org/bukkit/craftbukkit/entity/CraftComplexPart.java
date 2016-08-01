package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityComplexPart;
import net.minecraft.server.EntityEnderDragon;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.ComplexLivingEntity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityDamageEvent;

public class CraftComplexPart extends CraftEntity implements ComplexEntityPart {

    public CraftComplexPart(CraftServer server, EntityComplexPart entity) {
    }

    public ComplexLivingEntity getParent() {
        return null;
    }

    @Override
    public void setLastDamageCause(EntityDamageEvent cause) {
    }

    @Override
    public EntityDamageEvent getLastDamageCause() {
        return null;
    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public EntityComplexPart getHandle() {
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
