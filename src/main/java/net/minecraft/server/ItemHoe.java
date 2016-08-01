package net.minecraft.server;

import com.google.common.collect.Multimap;

public class ItemHoe extends Item {

    private final float b;

    protected Item.EnumToolMaterial a;

    public ItemHoe(Item.EnumToolMaterial item_enumtoolmaterial) {
    }

    public EnumInteractionResult a(ItemStack itemstack, EntityHuman entityhuman, World world, BlockPosition blockposition, EnumHand enumhand, EnumDirection enumdirection, float f, float f1, float f2) {
        return null;
    }

    public boolean a(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1) {
        return false;
    }

    protected void a(ItemStack itemstack, EntityHuman entityhuman, World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public String g() {
        return null;
    }

    public Multimap<String, AttributeModifier> a(EnumItemSlot enumitemslot) {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }
}
