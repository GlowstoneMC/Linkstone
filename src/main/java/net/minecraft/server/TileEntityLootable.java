package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class TileEntityLootable extends TileEntityContainer implements ILootable {

    protected MinecraftKey m = null;

    protected long n = 0;

    public TileEntityLootable() {
    }

    protected boolean c(NBTTagCompound nbttagcompound) {
        return false;
    }

    protected boolean d(NBTTagCompound nbttagcompound) {
        return false;
    }

    protected void d(@Nullable EntityHuman entityhuman) {
    }

    public MinecraftKey b() {
        return null;
    }

    public void a(MinecraftKey minecraftkey, long i) {
    }
}
