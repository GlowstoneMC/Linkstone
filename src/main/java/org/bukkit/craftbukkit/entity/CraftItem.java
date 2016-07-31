package org.bukkit.craftbukkit.entity;

import net.minecraft.server.Entity;
import net.minecraft.server.EntityItem;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.craftbukkit.CraftServer;

public class CraftItem extends CraftEntity implements Item {

    private final EntityItem item;

    public CraftItem(CraftServer server, Entity entity, EntityItem item) {
    }

    public CraftItem(CraftServer server, EntityItem entity) {
    }

    public ItemStack getItemStack() {
        return null;
    }

    public void setItemStack(ItemStack stack) {
    }

    public int getPickupDelay() {
        return 0;
    }

    public void setPickupDelay(int delay) {
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }
}
