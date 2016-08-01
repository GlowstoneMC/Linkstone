package net.minecraft.server;

import java.util.ArrayList;
import javax.annotation.Nullable;

public class MerchantRecipeList extends ArrayList<MerchantRecipe> {

    public MerchantRecipeList() {
    }

    public MerchantRecipeList(NBTTagCompound nbttagcompound) {
    }

    @Nullable
    public MerchantRecipe a(ItemStack itemstack, @Nullable ItemStack itemstack1, int i) {
        return null;
    }

    private boolean a(ItemStack itemstack, ItemStack itemstack1) {
        return false;
    }

    public void a(PacketDataSerializer packetdataserializer) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public NBTTagCompound a() {
        return null;
    }
}
