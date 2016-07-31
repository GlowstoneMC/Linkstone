package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityMinecartHopper;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.inventory.CraftInventory;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.minecart.HopperMinecart;
import org.bukkit.inventory.Inventory;

final class CraftMinecartHopper extends CraftMinecart implements HopperMinecart {

    private final CraftInventory inventory;

    CraftMinecartHopper(CraftServer server, EntityMinecartHopper entity) {
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }

    public Inventory getInventory() {
        return null;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void setEnabled(boolean enabled) {
    }
}
