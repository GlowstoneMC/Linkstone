package org.bukkit.craftbukkit.enchantments;

import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.inventory.ItemStack;

public class CraftEnchantment extends Enchantment {

    private final net.minecraft.server.Enchantment target;

    public CraftEnchantment(net.minecraft.server.Enchantment target) {
    }

    @Override
    public int getMaxLevel() {
        return 0;
    }

    @Override
    public int getStartLevel() {
        return 0;
    }

    @Override
    public EnchantmentTarget getItemTarget() {
        return null;
    }

    @Override
    public boolean canEnchantItem(ItemStack item) {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    public static net.minecraft.server.Enchantment getRaw(Enchantment enchantment) {
        return null;
    }

    @Override
    public boolean conflictsWith(Enchantment other) {
        return false;
    }

    public net.minecraft.server.Enchantment getHandle() {
        return null;
    }
}
