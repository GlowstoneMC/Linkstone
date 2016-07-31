package org.bukkit.craftbukkit.inventory;

import net.minecraft.server.InventoryMerchant;
import org.bukkit.inventory.MerchantInventory;
import org.bukkit.inventory.MerchantRecipe;

public class CraftInventoryMerchant extends CraftInventory implements MerchantInventory {

    public CraftInventoryMerchant(InventoryMerchant merchant) {
    }

    @Override
    public int getSelectedRecipeIndex() {
        return 0;
    }

    @Override
    public MerchantRecipe getSelectedRecipe() {
        return null;
    }

    @Override
    public InventoryMerchant getInventory() {
        return null;
    }
}
