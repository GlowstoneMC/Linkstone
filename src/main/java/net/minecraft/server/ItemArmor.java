package net.minecraft.server;

import com.google.common.base.Predicates;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.UUID;
// CraftBukkit start
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.event.block.BlockDispenseEvent;

// CraftBukkit end
public class ItemArmor extends Item {

    private static final int[] n = null;

    private static final UUID[] o = null;

    public static final String[] a = null;

    public static final IDispenseBehavior b = null;

    public final EnumItemSlot c = null;

    public final int d = 0;

    public final float e = 0.0F;

    public final int f = 0;

    private final ItemArmor.EnumArmorMaterial p = null;

    public static ItemStack a(ISourceBlock isourceblock, ItemStack itemstack) {
        return null;
    }

    public ItemArmor(ItemArmor.EnumArmorMaterial itemarmor_enumarmormaterial, int i, EnumItemSlot enumitemslot) {
    }

    public int c() {
        return 0;
    }

    public ItemArmor.EnumArmorMaterial d() {
        return null;
    }

    public boolean e_(ItemStack itemstack) {
        return false;
    }

    public int b(ItemStack itemstack) {
        return 0;
    }

    public void c(ItemStack itemstack) {
    }

    public void a(ItemStack itemstack, int i) {
    }

    public boolean a(ItemStack itemstack, ItemStack itemstack1) {
        return false;
    }

    public InteractionResultWrapper<ItemStack> a(ItemStack itemstack, World world, EntityHuman entityhuman, EnumHand enumhand) {
        return null;
    }

    public Multimap<String, AttributeModifier> a(EnumItemSlot enumitemslot) {
        return null;
    }

    public static enum EnumArmorMaterial {

        LEATHER("leather", 5, new int[] { 1, 2, 3, 1 }, 15, SoundEffects.s, 0.0F), CHAIN("chainmail", 15, new int[] { 1, 4, 5, 2 }, 12, SoundEffects.n, 0.0F), IRON("iron", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEffects.r, 0.0F), GOLD("gold", 7, new int[] { 1, 3, 5, 2 }, 25, SoundEffects.q, 0.0F), DIAMOND("diamond", 33, new int[] { 3, 6, 8, 3 }, 10, SoundEffects.o, 2.0F);

        private final String f = null;

        private final int g = 0;

        private final int[] h = null;

        private final int i = 0;

        private final SoundEffect j = null;

        private final float k = 0.0F;

        private EnumArmorMaterial(String s, int i, int[] aint, int j, SoundEffect soundeffect, float f) {
        }

        public int a(EnumItemSlot enumitemslot) {
            return 0;
        }

        public int b(EnumItemSlot enumitemslot) {
            return 0;
        }

        public int a() {
            return 0;
        }

        public SoundEffect b() {
            return null;
        }

        public Item c() {
            return null;
        }

        public float e() {
            return 0.0F;
        }
    }
}
