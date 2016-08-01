package net.minecraft.server;

public abstract class PersistentBase {

    public final String id = null;

    private boolean b = false;

    public PersistentBase(String s) {
    }

    public abstract void a(NBTTagCompound nbttagcompound);

    public abstract NBTTagCompound b(NBTTagCompound nbttagcompound);

    public void c() {
    }

    public void a(boolean flag) {
    }

    public boolean d() {
        return false;
    }
}
