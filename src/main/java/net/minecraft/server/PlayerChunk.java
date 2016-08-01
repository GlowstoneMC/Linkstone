package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit Start
import org.bukkit.craftbukkit.chunkio.ChunkIOExecutor;

// CraftBukkit end
public class PlayerChunk {

    private static final Logger a;

    private final PlayerChunkMap playerChunkMap;

    public final List<EntityPlayer> c;

    // CraftBukkit - public
    private final ChunkCoordIntPair location;

    private final short[] dirtyBlocks;

    @Nullable
    public Chunk chunk;

    // CraftBukkit - public
    private int dirtyCount;

    private int h;

    private long i;

    private boolean done;

    // CraftBukkit start - add fields
    private boolean loadInProgress;

    private Runnable loadedRunnable;

    // CraftBukkit end
    public PlayerChunk(PlayerChunkMap playerchunkmap, int i, int j) {
    }

    public ChunkCoordIntPair a() {
        return null;
    }

    public void a(final EntityPlayer entityplayer) {
    }

    public void b(EntityPlayer entityplayer) {
    }

    public boolean a(boolean flag) {
        return false;
    }

    public boolean b() {
        return false;
    }

    public void sendChunk(EntityPlayer entityplayer) {
    }

    public void c() {
    }

    public void a(int i, int j, int k) {
    }

    public void a(Packet<?> packet) {
    }

    public void d() {
    }

    private void a(@Nullable TileEntity tileentity) {
    }

    public boolean d(EntityPlayer entityplayer) {
        return false;
    }

    public boolean a(Predicate<EntityPlayer> predicate) {
        return false;
    }

    public boolean a(double d0, Predicate<EntityPlayer> predicate) {
        return false;
    }

    public boolean e() {
        return false;
    }

    @Nullable
    public Chunk f() {
        return null;
    }

    public double g() {
        return 0.0;
    }
}
