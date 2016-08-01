package net.minecraft.server;

import javax.annotation.Nullable;

public class TileEntitySign extends TileEntity {

    public final IChatBaseComponent[] lines;

    public int f;

    public boolean isEditable;

    private EntityHuman h;

    private final CommandObjectiveExecutor i;

    public TileEntitySign() {
    }

    public NBTTagCompound save(NBTTagCompound nbttagcompound) {
        return null;
    }

    protected void b(World world) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    @Nullable
    public PacketPlayOutTileEntityData getUpdatePacket() {
        return null;
    }

    public NBTTagCompound c() {
        return null;
    }

    public boolean isFilteredNBT() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public void a(EntityHuman entityhuman) {
    }

    public EntityHuman e() {
        return null;
    }

    public boolean b(final EntityHuman entityhuman) {
        return false;
    }

    public CommandObjectiveExecutor g() {
        return null;
    }
}
