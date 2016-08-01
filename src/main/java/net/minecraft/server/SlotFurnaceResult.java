package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.FurnaceExtractEvent;

// CraftBukkit end
public class SlotFurnaceResult extends Slot {

    private final EntityHuman a;

    private int b;

    public SlotFurnaceResult(EntityHuman entityhuman, IInventory iinventory, int i, int j, int k) {
    }

    public boolean isAllowed(@Nullable ItemStack itemstack) {
        return false;
    }

    public ItemStack a(int i) {
        return null;
    }

    public void a(EntityHuman entityhuman, ItemStack itemstack) {
    }

    protected void a(ItemStack itemstack, int i) {
    }

    protected void c(ItemStack itemstack) {
    }
}
