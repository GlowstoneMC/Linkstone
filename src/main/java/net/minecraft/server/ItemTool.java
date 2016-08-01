package net.minecraft.server;

import com.google.common.collect.Multimap;
import java.util.Set;

public class ItemTool extends Item {

    private final Set<Block> e = null;

    protected float a = 0.0F;

    protected float b = 0.0F;

    protected float c = 0.0F;

    protected Item.EnumToolMaterial d = null;

    protected ItemTool(float f, float f1, Item.EnumToolMaterial item_enumtoolmaterial, Set<Block> set) {
    }

    protected ItemTool(Item.EnumToolMaterial item_enumtoolmaterial, Set<Block> set) {
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

    public Item.EnumToolMaterial g() {
        return null;
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
