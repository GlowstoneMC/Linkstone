package net.minecraft.server;

public class ItemMapEmpty extends ItemWorldMapBase {

    protected ItemMapEmpty() {
    }

    public InteractionResultWrapper<ItemStack> a(ItemStack itemstack, World world, EntityHuman entityhuman, EnumHand enumhand) {
        return null;
    }
}
