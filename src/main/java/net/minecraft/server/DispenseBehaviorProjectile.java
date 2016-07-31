package net.minecraft.server;

// CraftBukkit start
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.event.block.BlockDispenseEvent;

// CraftBukkit end
public abstract class DispenseBehaviorProjectile extends DispenseBehaviorItem {

    public DispenseBehaviorProjectile() {
    }

    public ItemStack b(ISourceBlock isourceblock, ItemStack itemstack) {
        return null;
    }

    protected void a(ISourceBlock isourceblock) {
    }

    protected abstract IProjectile a(World world, IPosition iposition, ItemStack itemstack);

    protected float a() {
        return 0.0F;
    }

    protected float getPower() {
        return 0.0F;
    }
}
