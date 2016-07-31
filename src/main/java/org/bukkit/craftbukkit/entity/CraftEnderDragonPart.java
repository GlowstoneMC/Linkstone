package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityComplexPart;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.EnderDragonPart;
import org.bukkit.entity.Entity;
import org.bukkit.util.NumberConversions;

public class CraftEnderDragonPart extends CraftComplexPart implements EnderDragonPart {

    public CraftEnderDragonPart(CraftServer server, EntityComplexPart entity) {
    }

    @Override
    public EnderDragon getParent() {
        return null;
    }

    @Override
    public EntityComplexPart getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public void damage(double amount) {
    }

    public void damage(double amount, Entity source) {
    }

    public double getHealth() {
        return 0.0;
    }

    public void setHealth(double health) {
    }

    public double getMaxHealth() {
        return 0.0;
    }

    public void setMaxHealth(double health) {
    }

    public void resetMaxHealth() {
    }

    @Deprecated
    public void _INVALID_damage(int amount) {
    }

    @Deprecated
    public void _INVALID_damage(int amount, Entity source) {
    }

    @Deprecated
    public int _INVALID_getHealth() {
        return 0;
    }

    @Deprecated
    public void _INVALID_setHealth(int health) {
    }

    @Deprecated
    public int _INVALID_getMaxHealth() {
        return 0;
    }

    @Deprecated
    public void _INVALID_setMaxHealth(int health) {
    }
}
