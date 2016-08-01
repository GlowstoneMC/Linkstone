package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bukkit.inventory.InventoryHolder;

// CraftBukkit
public abstract class TileEntity {

    private static final Logger a = null;

    private static final Map<String, Class<? extends TileEntity>> f = null;

    private static final Map<Class<? extends TileEntity>, String> g = null;

    protected World world = null;

    protected BlockPosition position = null;

    protected boolean d = false;

    private int h = 0;

    protected Block e = null;

    public TileEntity() {
    }

    private static void a(Class<? extends TileEntity> oclass, String s) {
    }

    public World getWorld() {
        return null;
    }

    public void a(World world) {
    }

    public boolean t() {
        return false;
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public NBTTagCompound save(NBTTagCompound nbttagcompound) {
        return null;
    }

    private NBTTagCompound c(NBTTagCompound nbttagcompound) {
        return null;
    }

    public static TileEntity a(World world, NBTTagCompound nbttagcompound) {
        return null;
    }

    protected void b(World world) {
    }

    public int u() {
        return 0;
    }

    public void update() {
    }

    public BlockPosition getPosition() {
        return null;
    }

    public Block getBlock() {
        return null;
    }

    @Nullable
    public PacketPlayOutTileEntityData getUpdatePacket() {
        return null;
    }

    public NBTTagCompound c() {
        return null;
    }

    public boolean x() {
        return false;
    }

    public void y() {
    }

    public void z() {
    }

    public boolean c(int i, int j) {
        return false;
    }

    public void invalidateBlockCache() {
    }

    public void a(CrashReportSystemDetails crashreportsystemdetails) {
    }

    public void setPosition(BlockPosition blockposition) {
    }

    public boolean isFilteredNBT() {
        return false;
    }

    @Nullable
    public IChatBaseComponent i_() {
        return null;
    }

    public void a(EnumBlockRotation enumblockrotation) {
    }

    public void a(EnumBlockMirror enumblockmirror) {
    }

    static {
    }

    // CraftBukkit start - add method
    public InventoryHolder getOwner() {
        return null;
    }
    // CraftBukkit end
}
