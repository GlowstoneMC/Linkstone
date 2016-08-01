package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Map;

public class ItemFish extends ItemFood {

    private final boolean b;

    public ItemFish(boolean flag) {
    }

    public int getNutrition(ItemStack itemstack) {
        return 0;
    }

    public float getSaturationModifier(ItemStack itemstack) {
        return 0.0F;
    }

    protected void a(ItemStack itemstack, World world, EntityHuman entityhuman) {
    }

    public String f_(ItemStack itemstack) {
        return null;
    }

    public static enum EnumFish {

        COD(0, "cod", 2, 0.1F, 5, 0.6F), SALMON(1, "salmon", 2, 0.1F, 6, 0.8F), CLOWNFISH(2, "clownfish", 1, 0.1F), PUFFERFISH(3, "pufferfish", 1, 0.1F);

        private static final Map<Integer, ItemFish.EnumFish> e;

        private final int f;

        private final String g;

        private final int h;

        private final float i;

        private final int j;

        private final float k;

        private boolean l;

        private EnumFish(int i, String s, int j, float f, int k, float f1) {
        }

        private EnumFish(int i, String s, int j, float f) {
        }

        public int a() {
            return 0;
        }

        public String b() {
            return null;
        }

        public int c() {
            return 0;
        }

        public float d() {
            return 0.0F;
        }

        public int e() {
            return 0;
        }

        public float f() {
            return 0.0F;
        }

        public boolean g() {
            return false;
        }

        public static ItemFish.EnumFish a(int i) {
            return null;
        }

        public static ItemFish.EnumFish a(ItemStack itemstack) {
            return null;
        }

        static {
        }
    }
}
