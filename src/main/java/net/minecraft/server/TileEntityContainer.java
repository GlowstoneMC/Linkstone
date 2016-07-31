package net.minecraft.server;

public abstract class TileEntityContainer extends TileEntity implements ITileEntityContainer, ITileInventory {

    private ChestLock a;

    public TileEntityContainer() {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public NBTTagCompound save(NBTTagCompound nbttagcompound) {
        return null;
    }

    public boolean x_() {
        return false;
    }

    public ChestLock y_() {
        return null;
    }

    public void a(ChestLock chestlock) {
    }

    public IChatBaseComponent getScoreboardDisplayName() {
        return null;
    }

    // CraftBukkit start
    @Override
    public org.bukkit.Location getLocation() {
        return null;
    }
    // CraftBukkit end
}
