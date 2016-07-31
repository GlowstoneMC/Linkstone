package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityEnderman;
import net.minecraft.server.IBlockData;
import org.bukkit.Material;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.EntityType;
import org.bukkit.material.MaterialData;

public class CraftEnderman extends CraftMonster implements Enderman {

    public CraftEnderman(CraftServer server, EntityEnderman entity) {
    }

    public MaterialData getCarriedMaterial() {
        return null;
    }

    public void setCarriedMaterial(MaterialData data) {
    }

    @Override
    public EntityEnderman getHandle() {
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
