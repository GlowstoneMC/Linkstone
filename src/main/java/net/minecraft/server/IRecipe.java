package net.minecraft.server;

import javax.annotation.Nullable;

public interface IRecipe {

    boolean a(InventoryCrafting inventorycrafting, World world) {
        return false;
    }

    @Nullable
    ItemStack craftItem(InventoryCrafting inventorycrafting) {
        return null;
    }

    int a() {
        return 0;
    }

    @Nullable
    ItemStack b() {
        return null;
    }

    ItemStack[] b(InventoryCrafting inventorycrafting) {
        return null;
    }

    org.bukkit.inventory.Recipe toBukkitRecipe() {
        return null;
    }
    // CraftBukkit
}
