package org.bukkit.craftbukkit.entity;

import net.minecraft.server.Blocks;
import net.minecraft.server.EntityMinecartAbstract;
import net.minecraft.server.IBlockData;
import org.bukkit.Material;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.entity.Minecart;
import org.bukkit.material.MaterialData;
import org.bukkit.util.NumberConversions;
import org.bukkit.util.Vector;

public abstract class CraftMinecart extends CraftVehicle implements Minecart {

    public CraftMinecart(CraftServer server, EntityMinecartAbstract entity) {
    }

    public void setDamage(double damage) {
    }

    public double getDamage() {
        return 0.0;
    }

    public double getMaxSpeed() {
        return 0.0;
    }

    public void setMaxSpeed(double speed) {
    }

    public boolean isSlowWhenEmpty() {
        return false;
    }

    public void setSlowWhenEmpty(boolean slow) {
    }

    public Vector getFlyingVelocityMod() {
        return null;
    }

    public void setFlyingVelocityMod(Vector flying) {
    }

    public Vector getDerailedVelocityMod() {
        return null;
    }

    public void setDerailedVelocityMod(Vector derailed) {
    }

    @Override
    public EntityMinecartAbstract getHandle() {
        return null;
    }

    @Deprecated
    public void _INVALID_setDamage(int damage) {
    }

    @Deprecated
    public int _INVALID_getDamage() {
        return 0;
    }

    public void setDisplayBlock(MaterialData material) {
    }

    public MaterialData getDisplayBlock() {
        return null;
    }

    public void setDisplayBlockOffset(int offset) {
    }

    public int getDisplayBlockOffset() {
        return 0;
    }
}
