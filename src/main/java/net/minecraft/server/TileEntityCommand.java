package net.minecraft.server;

import javax.annotation.Nullable;

public class TileEntityCommand extends TileEntity {

    private boolean a;

    private boolean f;

    private boolean g;

    private boolean h;

    private final CommandBlockListenerAbstract i;

    public TileEntityCommand() {
    }

    public NBTTagCompound save(NBTTagCompound nbttagcompound) {
        return null;
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    @Nullable
    public PacketPlayOutTileEntityData getUpdatePacket() {
        return null;
    }

    public boolean isFilteredNBT() {
        return false;
    }

    public CommandBlockListenerAbstract getCommandBlock() {
        return null;
    }

    public CommandObjectiveExecutor e() {
        return null;
    }

    public void a(boolean flag) {
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public void b(boolean flag) {
    }

    public boolean i() {
        return false;
    }

    public void c(boolean flag) {
    }

    public boolean j() {
        return false;
    }

    public void d(boolean flag) {
    }

    public TileEntityCommand.Type k() {
        return null;
    }

    public boolean l() {
        return false;
    }

    public void z() {
    }

    public static enum Type {

        SEQUENCE, AUTO, REDSTONE;

        private Type() {
        }
    }
}
