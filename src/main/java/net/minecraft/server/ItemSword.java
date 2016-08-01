package net.minecraft.server;

import com.google.common.collect.Multimap;

public class ItemSword extends Item {

    private final float a = 0.0F;

    private final Item.EnumToolMaterial b = null;

    public ItemSword(Item.EnumToolMaterial item_enumtoolmaterial) {
    }

    public float g() {
        return 0.0F;
    }

    public float getDestroySpeed(ItemStack itemstack, IBlockData iblockdata) {
        return 0.0F;
    }

    public boolean a(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1) {
        return false;
    }

    public boolean a(ItemStack itemstack, World world, IBlockData iblockdata, BlockPosition blockposition, EntityLiving entityliving) {
        return false;
    }

    public boolean canDestroySpecialBlock(IBlockData iblockdata) {
        return false;
    }

    public int c() {
        return 0;
    }

    public String h() {
        return null;
    }

    public boolean a(ItemStack itemstack, ItemStack itemstack1) {
        return false;
    }

    public Multimap<String, AttributeModifier> a(EnumItemSlot enumitemslot) {
        return null;
    }
}
