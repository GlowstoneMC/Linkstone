package net.minecraft.server;

import javax.annotation.Nullable;

public class TileEntityMobSpawner extends TileEntity implements ITickable {

    private final MobSpawnerAbstract a;

    public TileEntityMobSpawner() {
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public NBTTagCompound save(NBTTagCompound nbttagcompound) {
        return null;
    }

    public void E_() {
    }

    @Nullable
    public PacketPlayOutTileEntityData getUpdatePacket() {
        return null;
    }

    public NBTTagCompound c() {
        return null;
    }

    public boolean c(int i, int j) {
        return false;
    }

    public boolean isFilteredNBT() {
        return false;
    }

    public MobSpawnerAbstract getSpawner() {
        return null;
    }
}
