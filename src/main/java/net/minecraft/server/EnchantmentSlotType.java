package net.minecraft.server;

public enum EnchantmentSlotType {

    ALL, ARMOR, ARMOR_FEET, ARMOR_LEGS, ARMOR_CHEST, ARMOR_HEAD, WEAPON, DIGGER, FISHING_ROD, BREAKABLE, BOW;

    private EnchantmentSlotType() {
    }

    public boolean canEnchant(Item item) {
        return false;
    }
}
