package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.event.inventory.InventoryMoveItemEvent;

// CraftBukkit end
public class BlockDropper extends BlockDispenser {

    private final IDispenseBehavior e = null;

    public BlockDropper() {
    }

    protected IDispenseBehavior a(@Nullable ItemStack itemstack) {
        return null;
    }

    public TileEntity a(World world, int i) {
        return null;
    }

    public void dispense(World world, BlockPosition blockposition) {
    }
}
