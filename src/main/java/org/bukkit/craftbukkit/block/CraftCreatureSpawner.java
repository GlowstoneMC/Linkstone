package org.bukkit.craftbukkit.block;

import net.minecraft.server.TileEntityMobSpawner;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.entity.EntityType;

public class CraftCreatureSpawner extends CraftBlockState implements CreatureSpawner {

    private final TileEntityMobSpawner spawner;

    public CraftCreatureSpawner(final Block block) {
    }

    public CraftCreatureSpawner(final Material material, TileEntityMobSpawner te) {
    }

    public EntityType getSpawnedType() {
        return null;
    }

    public void setSpawnedType(EntityType entityType) {
    }

    @Deprecated
    public String getCreatureTypeId() {
        return null;
    }

    @Deprecated
    public void setCreatureTypeId(String creatureName) {
    }

    public String getCreatureTypeName() {
        return null;
    }

    public void setCreatureTypeByName(String creatureType) {
    }

    public int getDelay() {
        return 0;
    }

    public void setDelay(int delay) {
    }

    @Override
    public TileEntityMobSpawner getTileEntity() {
        return null;
    }
}
