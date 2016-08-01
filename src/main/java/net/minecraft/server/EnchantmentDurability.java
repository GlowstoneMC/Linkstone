package net.minecraft.server;

import java.util.Random;

public class EnchantmentDurability extends Enchantment {

    protected EnchantmentDurability(Enchantment.Rarity enchantment_rarity, EnumItemSlot... aenumitemslot) {
    }

    public int a(int i) {
        return 0;
    }

    public int b(int i) {
        return 0;
    }

    public int getMaxLevel() {
        return 0;
    }

    public boolean canEnchant(ItemStack itemstack) {
        return false;
    }

    public static boolean a(ItemStack itemstack, int i, Random random) {
        return false;
    }
}
