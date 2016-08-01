package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityMinecartChest;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.inventory.CraftInventory;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.StorageMinecart;
import org.bukkit.inventory.Inventory;

@SuppressWarnings("deprecation")
public class CraftMinecartChest extends CraftMinecart implements StorageMinecart {

    private final CraftInventory inventory = null;

    public CraftMinecartChest(CraftServer server, EntityMinecartChest entity) {
    }

    public Inventory getInventory() {
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
