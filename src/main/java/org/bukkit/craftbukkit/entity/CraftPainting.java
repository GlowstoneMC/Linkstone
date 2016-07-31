package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityPainting;
import net.minecraft.server.EntityPainting.EnumArt;
import net.minecraft.server.WorldServer;
import org.bukkit.Art;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.CraftArt;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Painting;

public class CraftPainting extends CraftHanging implements Painting {

    public CraftPainting(CraftServer server, EntityPainting entity) {
    }

    public Art getArt() {
        return null;
    }

    public boolean setArt(Art art) {
        return false;
    }

    public boolean setArt(Art art, boolean force) {
        return false;
    }

    public boolean setFacingDirection(BlockFace face, boolean force) {
        return false;
    }

    private void update() {
    }

    @Override
    public EntityPainting getHandle() {
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
