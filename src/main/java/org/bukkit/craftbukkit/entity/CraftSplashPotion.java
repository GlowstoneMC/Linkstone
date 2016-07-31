package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityPotion;
import org.apache.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.SplashPotion;
import org.bukkit.inventory.ItemStack;

public class CraftSplashPotion extends CraftThrownPotion implements SplashPotion {

    public CraftSplashPotion(CraftServer server, EntityPotion entity) {
    }

    @Override
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
