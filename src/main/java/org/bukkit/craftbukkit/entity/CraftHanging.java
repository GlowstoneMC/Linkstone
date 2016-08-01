package org.bukkit.craftbukkit.entity;

import net.minecraft.server.BlockPosition;
import net.minecraft.server.EntityHanging;
import net.minecraft.server.EnumDirection;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Hanging;

public class CraftHanging extends CraftEntity implements Hanging {

    public CraftHanging(CraftServer server, EntityHanging entity) {
    }

    public BlockFace getAttachedFace() {
        return null;
    }

    public void setFacingDirection(BlockFace face) {
    }

    public boolean setFacingDirection(BlockFace face, boolean force) {
        return false;
    }

    public BlockFace getFacing() {
        return null;
    }

    @Override
    public EntityHanging getHandle() {
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
