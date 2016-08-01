package net.minecraft.server;

public class EnchantmentProtection extends Enchantment {

    public final EnchantmentProtection.DamageType a;

    public EnchantmentProtection(Enchantment.Rarity enchantment_rarity, EnchantmentProtection.DamageType enchantmentprotection_damagetype, EnumItemSlot... aenumitemslot) {
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

    public int a(int i, DamageSource damagesource) {
        return 0;
    }

    public String a() {
        return null;
    }

    public boolean a(Enchantment enchantment) {
        return false;
    }

    public static int a(EntityLiving entityliving, int i) {
        return 0;
    }

    public static double a(EntityLiving entityliving, double d0) {
        return 0.0;
    }

    public static enum DamageType {

        ALL("all", 1, 11, 20), FIRE("fire", 10, 8, 12), FALL("fall", 5, 6, 10), EXPLOSION("explosion", 5, 8, 12), PROJECTILE("projectile", 3, 6, 15);

        private final String f;

        private final int g;

        private final int h;

        private final int i;

        private DamageType(String s, int i, int j, int k) {
        }

        public String a() {
            return null;
        }

        public int b() {
            return 0;
        }

        public int c() {
            return 0;
        }
    }
}
