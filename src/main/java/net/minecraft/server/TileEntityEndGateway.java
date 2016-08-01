package net.minecraft.server;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.event.player.PlayerTeleportEvent;

// CraftBukkit end
public class TileEntityEndGateway extends TileEntity implements ITickable {

    private static final Logger a = null;

    private long f = 0;

    private int g = 0;

    public BlockPosition exitPortal = null;

    public boolean exactTeleport = false;

    public TileEntityEndGateway() {
    }

    public NBTTagCompound save(NBTTagCompound nbttagcompound) {
        return null;
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void E_() {
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    @Nullable
    public PacketPlayOutTileEntityData getUpdatePacket() {
        return null;
    }

    public NBTTagCompound c() {
        return null;
    }

    public void i() {
    }

    public boolean c(int i, int j) {
        return false;
    }

    public void a(Entity entity) {
    }

    private BlockPosition k() {
        return null;
    }

    private void l() {
    }

    private static BlockPosition a(World world, BlockPosition blockposition, int i, boolean flag) {
        return null;
    }

    private static Chunk a(World world, Vec3D vec3d) {
        return null;
    }

    @Nullable
    private static BlockPosition a(Chunk chunk) {
        return null;
    }

    private void b(BlockPosition blockposition) {
    }
}
