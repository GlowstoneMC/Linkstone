package org.bukkit.craftbukkit.entity;

import java.util.Collection;
import net.minecraft.server.EntityPotion;
import net.minecraft.server.MobEffect;
import net.minecraft.server.PotionUtil;
import org.apache.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.craftbukkit.potion.CraftPotionUtil;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import com.google.common.collect.ImmutableList;

public abstract class CraftThrownPotion extends CraftProjectile implements ThrownPotion {

    public CraftThrownPotion(CraftServer server, EntityPotion entity) {
    }

    public Collection<PotionEffect> getEffects() {
        return null;
    }

    public ItemStack getItem() {
        return null;
    }

    @Override
    public EntityPotion getHandle() {
        return null;
    }
}
