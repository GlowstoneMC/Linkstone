package org.bukkit.craftbukkit.block;

import java.util.ArrayList;
import java.util.Collection;
import net.minecraft.server.EntityHuman;
import net.minecraft.server.MobEffectList;
import net.minecraft.server.TileEntityBeacon;
import org.bukkit.Material;
import org.bukkit.block.Beacon;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.inventory.CraftInventoryBeacon;
import org.bukkit.craftbukkit.potion.CraftPotionUtil;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class CraftBeacon extends CraftBlockState implements Beacon {

    private final CraftWorld world = null;

    private final TileEntityBeacon beacon = null;

    public CraftBeacon(final Block block) {
    }

    public CraftBeacon(final Material material, final TileEntityBeacon te) {
    }

    public Inventory getInventory() {
        return null;
    }

    @Override
    public boolean update(boolean force, boolean applyPhysics) {
        return false;
    }

    @Override
    public TileEntityBeacon getTileEntity() {
        return null;
    }

    @Override
    public Collection<LivingEntity> getEntitiesInRange() {
        return null;
    }

    @Override
    public int getTier() {
        return 0;
    }

    @Override
    public PotionEffect getPrimaryEffect() {
        return null;
    }

    @Override
    public void setPrimaryEffect(PotionEffectType effect) {
    }

    @Override
    public PotionEffect getSecondaryEffect() {
        return null;
    }

    @Override
    public void setSecondaryEffect(PotionEffectType effect) {
    }
}
