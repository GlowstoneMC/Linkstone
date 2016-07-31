package org.bukkit.craftbukkit.entity;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import net.minecraft.server.EntityHuman;
import net.minecraft.server.EntityVillager;
import net.minecraft.server.MerchantRecipeList;
import org.apache.commons.lang.Validate;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.inventory.CraftInventory;
import org.bukkit.craftbukkit.inventory.CraftMerchantRecipe;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.MerchantRecipe;

public class CraftVillager extends CraftAgeable implements Villager, InventoryHolder {

    public CraftVillager(CraftServer server, EntityVillager entity) {
    }

    @Override
    public EntityVillager getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }

    public Profession getProfession() {
        return null;
    }

    public void setProfession(Profession profession) {
    }

    @Override
    public Inventory getInventory() {
        return null;
    }

    @Override
    public List<MerchantRecipe> getRecipes() {
        return null;
    }

    @Override
    public void setRecipes(List<MerchantRecipe> list) {
    }

    @Override
    public MerchantRecipe getRecipe(int i) {
        return null;
    }

    @Override
    public void setRecipe(int i, MerchantRecipe merchantRecipe) {
    }

    @Override
    public int getRecipeCount() {
        return 0;
    }

    @Override
    public boolean isTrading() {
        return false;
    }

    @Override
    public HumanEntity getTrader() {
        return null;
    }

    @Override
    public int getRiches() {
        return 0;
    }

    @Override
    public void setRiches(int riches) {
    }
}
