package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityPotion;
import org.apache.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LingeringPotion;
import org.bukkit.inventory.ItemStack;

public class CraftLingeringPotion extends CraftThrownPotion implements LingeringPotion {

    public CraftLingeringPotion(CraftServer server, EntityPotion entity) {
    }

    public void setItem(ItemStack item) {
    }

    @Override
    public EntityPotion getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public EntityType getType() {
        return null;
    }
}
