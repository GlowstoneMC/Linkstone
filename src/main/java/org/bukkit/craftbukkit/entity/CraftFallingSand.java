package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityFallingBlock;
import org.bukkit.Material;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingSand;

public class CraftFallingSand extends CraftEntity implements FallingSand {

    public CraftFallingSand(CraftServer server, EntityFallingBlock entity) {
    }

    @Override
    public EntityFallingBlock getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }

    public Material getMaterial() {
        return null;
    }

    public int getBlockId() {
        return 0;
    }

    public byte getBlockData() {
        return 0;
    }

    public boolean getDropItem() {
        return false;
    }

    public void setDropItem(boolean drop) {
    }

    @Override
    public boolean canHurtEntities() {
        return false;
    }

    @Override
    public void setHurtEntities(boolean hurtEntities) {
    }

    @Override
    public void setTicksLived(int value) {
    }
}
