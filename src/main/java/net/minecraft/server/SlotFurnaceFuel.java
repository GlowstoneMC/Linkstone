package net.minecraft.server;

import javax.annotation.Nullable;

public class SlotFurnaceFuel extends Slot {

    public SlotFurnaceFuel(IInventory iinventory, int i, int j, int k) {
    }

    public boolean isAllowed(@Nullable ItemStack itemstack) {
        return false;
    }

    public int getMaxStackSize(ItemStack itemstack) {
        return 0;
    }

    public static boolean d_(ItemStack itemstack) {
        return false;
    }
}
