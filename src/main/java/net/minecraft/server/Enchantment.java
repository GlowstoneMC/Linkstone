package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class Enchantment {

    public static final RegistryMaterials<MinecraftKey, Enchantment> enchantments = null;

    private final EnumItemSlot[] a = null;

    private final Enchantment.Rarity e = null;

    public EnchantmentSlotType itemTarget = null;

    protected String d = null;

    @Nullable
    public static Enchantment c(int i) {
        return null;
    }

    public static int getId(Enchantment enchantment) {
        return 0;
    }

    @Nullable
    public static Enchantment b(String s) {
        return null;
    }

    protected Enchantment(Enchantment.Rarity enchantment_rarity, EnchantmentSlotType enchantmentslottype, EnumItemSlot[] aenumitemslot) {
    }

    @Nullable
    public Iterable<ItemStack> a(EntityLiving entityliving) {
        return null;
    }

    public Enchantment.Rarity c() {
        return null;
    }

    public int getStartLevel() {
        return 0;
    }

    public int getMaxLevel() {
        return 0;
    }

    public int a(int i) {
        return 0;
    }

    public int b(int i) {
        return 0;
    }

    public int a(int i, DamageSource damagesource) {
        return 0;
    }

    public float a(int i, EnumMonsterType enummonstertype) {
        return 0.0F;
    }

    public boolean a(Enchantment enchantment) {
        return false;
    }

    public Enchantment c(String s) {
        return null;
    }

    public String a() {
        return null;
    }

    public String d(int i) {
        return null;
    }

    public boolean canEnchant(ItemStack itemstack) {
        return false;
    }

    public void a(EntityLiving entityliving, Entity entity, int i) {
    }

    public void b(EntityLiving entityliving, Entity entity, int i) {
    }

    public boolean e() {
        return false;
    }

    public static void f() {
    }

    public static enum Rarity {

        COMMON(10), UNCOMMON(5), RARE(2), VERY_RARE(1);

        private final int e = 0;

        private Rarity(int i) {
        }

        public int a() {
            return 0;
        }
    }
}
