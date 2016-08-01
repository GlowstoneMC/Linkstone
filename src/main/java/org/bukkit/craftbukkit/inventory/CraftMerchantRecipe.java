package org.bukkit.craftbukkit.inventory;

import com.google.common.base.Preconditions;
import java.util.List;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;

public class CraftMerchantRecipe extends MerchantRecipe {

    private final net.minecraft.server.MerchantRecipe handle = null;

    public CraftMerchantRecipe(net.minecraft.server.MerchantRecipe merchantRecipe) {
    }

    public CraftMerchantRecipe(ItemStack result, int uses, int maxUses, boolean experienceReward) {
    }

    @Override
    public int getUses() {
        return 0;
    }

    @Override
    public void setUses(int uses) {
    }

    @Override
    public int getMaxUses() {
        return 0;
    }

    @Override
    public void setMaxUses(int maxUses) {
    }

    @Override
    public boolean hasExperienceReward() {
        return false;
    }

    @Override
    public void setExperienceReward(boolean flag) {
    }

    public net.minecraft.server.MerchantRecipe toMinecraft() {
        return null;
    }

    public static CraftMerchantRecipe fromBukkit(MerchantRecipe recipe) {
        return null;
    }
}
