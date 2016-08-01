package net.minecraft.server;

public interface IWorldInventory extends IInventory {

    int[] getSlotsForFace(EnumDirection enumdirection) {
        return null;
    }

    boolean canPlaceItemThroughFace(int i, ItemStack itemstack, EnumDirection enumdirection) {
        return false;
    }

    boolean canTakeItemThroughFace(int i, ItemStack itemstack, EnumDirection enumdirection) {
        return false;
    }
}
