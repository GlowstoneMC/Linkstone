package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class EnchantmentManager {

    private static final Random a;

    private static final EnchantmentManager.EnchantmentModifierProtection b;

    private static final EnchantmentManager.EnchantmentModifierDamage c;

    private static final EnchantmentManager.EnchantmentModifierThorns d;

    private static final EnchantmentManager.EnchantmentModifierArthropods e;

    public static int getEnchantmentLevel(Enchantment enchantment, @Nullable ItemStack itemstack) {
        return 0;
    }

    public static Map<Enchantment, Integer> a(ItemStack itemstack) {
        return null;
    }

    public static void a(Map<Enchantment, Integer> map, ItemStack itemstack) {
    }

    private static void a(EnchantmentManager.EnchantmentModifier enchantmentmanager_enchantmentmodifier, ItemStack itemstack) {
    }

    private static void a(EnchantmentManager.EnchantmentModifier enchantmentmanager_enchantmentmodifier, Iterable<ItemStack> iterable) {
    }

    public static int a(Iterable<ItemStack> iterable, DamageSource damagesource) {
        return 0;
    }

    public static float a(ItemStack itemstack, EnumMonsterType enummonstertype) {
        return 0.0F;
    }

    public static void a(EntityLiving entityliving, Entity entity) {
    }

    public static void b(EntityLiving entityliving, Entity entity) {
    }

    public static int a(Enchantment enchantment, EntityLiving entityliving) {
        return 0;
    }

    public static int a(EntityLiving entityliving) {
        return 0;
    }

    public static int getFireAspectEnchantmentLevel(EntityLiving entityliving) {
        return 0;
    }

    public static int getOxygenEnchantmentLevel(EntityLiving entityliving) {
        return 0;
    }

    public static int d(EntityLiving entityliving) {
        return 0;
    }

    public static int getDigSpeedEnchantmentLevel(EntityLiving entityliving) {
        return 0;
    }

    public static int f(EntityLiving entityliving) {
        return 0;
    }

    public static int g(EntityLiving entityliving) {
        return 0;
    }

    public static int h(EntityLiving entityliving) {
        return 0;
    }

    public static boolean i(EntityLiving entityliving) {
        return false;
    }

    public static boolean j(EntityLiving entityliving) {
        return false;
    }

    @Nullable
    public static ItemStack b(Enchantment enchantment, EntityLiving entityliving) {
        return null;
    }

    public static int a(Random random, int i, int j, ItemStack itemstack) {
        return 0;
    }

    public static ItemStack a(Random random, ItemStack itemstack, int i, boolean flag) {
        return null;
    }

    public static List<WeightedRandomEnchant> b(Random random, ItemStack itemstack, int i, boolean flag) {
        return null;
    }

    public static void a(List<WeightedRandomEnchant> list, WeightedRandomEnchant weightedrandomenchant) {
    }

    public static List<WeightedRandomEnchant> a(int i, ItemStack itemstack, boolean flag) {
        return null;
    }

    static class SyntheticClass_1 {
    }

    static final class EnchantmentModifierArthropods implements EnchantmentManager.EnchantmentModifier {

        public EntityLiving a;

        public Entity b;

        private EnchantmentModifierArthropods() {
        }

        public void a(Enchantment enchantment, int i) {
        }

        EnchantmentModifierArthropods(EnchantmentManager.SyntheticClass_1 enchantmentmanager_syntheticclass_1) {
        }
    }

    static final class EnchantmentModifierThorns implements EnchantmentManager.EnchantmentModifier {

        public EntityLiving a;

        public Entity b;

        private EnchantmentModifierThorns() {
        }

        public void a(Enchantment enchantment, int i) {
        }

        EnchantmentModifierThorns(EnchantmentManager.SyntheticClass_1 enchantmentmanager_syntheticclass_1) {
        }
    }

    static final class EnchantmentModifierDamage implements EnchantmentManager.EnchantmentModifier {

        public float a;

        public EnumMonsterType b;

        private EnchantmentModifierDamage() {
        }

        public void a(Enchantment enchantment, int i) {
        }

        EnchantmentModifierDamage(EnchantmentManager.SyntheticClass_1 enchantmentmanager_syntheticclass_1) {
        }
    }

    static final class EnchantmentModifierProtection implements EnchantmentManager.EnchantmentModifier {

        public int a;

        public DamageSource b;

        private EnchantmentModifierProtection() {
        }

        public void a(Enchantment enchantment, int i) {
        }

        EnchantmentModifierProtection(EnchantmentManager.SyntheticClass_1 enchantmentmanager_syntheticclass_1) {
        }
    }

    interface EnchantmentModifier {

        void a(Enchantment enchantment, int i) {
        }
    }
}
