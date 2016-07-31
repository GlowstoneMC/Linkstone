package org.bukkit.craftbukkit.entity;

import net.minecraft.server.BlockPosition;
import net.minecraft.server.EntityItemFrame;
import net.minecraft.server.EnumDirection;
import net.minecraft.server.ItemStack;
import net.minecraft.server.WorldServer;
import org.apache.commons.lang.Validate;
import org.bukkit.Rotation;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ItemFrame;

public class CraftItemFrame extends CraftHanging implements ItemFrame {

    public CraftItemFrame(CraftServer server, EntityItemFrame entity) {
    }

    public boolean setFacingDirection(BlockFace face, boolean force) {
        return false;
    }

    private void update() {
    }

    public void setItem(org.bukkit.inventory.ItemStack item) {
    }

    public org.bukkit.inventory.ItemStack getItem() {
        return null;
    }

    public Rotation getRotation() {
        return null;
    }

    Rotation toBukkitRotation(int value) {
        return null;
    }

    public void setRotation(Rotation rotation) {
    }

    static int toInteger(Rotation rotation) {
        return 0;
    }

    @Override
    public EntityItemFrame getHandle() {
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
