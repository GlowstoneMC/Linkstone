package net.minecraft.server;

// CraftBukkit start
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.event.block.BlockDispenseEvent;

// CraftBukkit end
public class DispenseBehaviorItem implements IDispenseBehavior {

    public DispenseBehaviorItem() {
    }

    public final ItemStack a(ISourceBlock isourceblock, ItemStack itemstack) {
        return null;
    }

    protected ItemStack b(ISourceBlock isourceblock, ItemStack itemstack) {
        return null;
    }

    // CraftBukkit start - void -> boolean return, IPosition -> ISourceBlock last argument
    public static boolean a(World world, ItemStack itemstack, int i, EnumDirection enumdirection, ISourceBlock isourceblock) {
        return false;
    }

    protected void a(ISourceBlock isourceblock) {
    }

    protected void a(ISourceBlock isourceblock, EnumDirection enumdirection) {
    }

    private int a(EnumDirection enumdirection) {
        return 0;
    }
}
