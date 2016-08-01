package net.minecraft.server;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChunkRegionLoader implements IChunkLoader, IAsyncChunkSaver {

    private static final Logger a;

    private final Map<ChunkCoordIntPair, NBTTagCompound> b;

    private final Set<ChunkCoordIntPair> c;

    private final File d;

    private final DataConverterManager e;

    private boolean f;

    public ChunkRegionLoader(File file, DataConverterManager dataconvertermanager) {
    }

    // CraftBukkit start
    public boolean chunkExists(World world, int i, int j) {
        return false;
    }

    // CraftBukkit end
    // CraftBukkit start - Add async variant, provide compatibility
    @Nullable
    public Chunk a(World world, int i, int j) throws IOException {
        return null;
    }

    public Object[] loadChunk(World world, int i, int j) throws IOException {
        return null;
    }

    protected Object[] a(World world, int i, int j, NBTTagCompound nbttagcompound) {
        return null;
    }

    public void a(World world, Chunk chunk) throws IOException, ExceptionWorldConflict {
    }

    protected void a(ChunkCoordIntPair chunkcoordintpair, NBTTagCompound nbttagcompound) {
    }

    public boolean c() {
        return false;
    }

    private void b(ChunkCoordIntPair chunkcoordintpair, NBTTagCompound nbttagcompound) throws IOException {
    }

    public void b(World world, Chunk chunk) throws IOException {
    }

    public void a() {
    }

    public void b() {
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    private void a(Chunk chunk, World world, NBTTagCompound nbttagcompound) {
    }

    private Chunk a(World world, NBTTagCompound nbttagcompound) {
        return null;
    }

    public void loadEntities(Chunk chunk, NBTTagCompound nbttagcompound, World world) {
    }

    @Nullable
    public static Entity a(NBTTagCompound nbttagcompound, World world, Chunk chunk) {
        return null;
    }

    @Nullable
    public static // CraftBukkit start
    Entity a(NBTTagCompound nbttagcompound, World world, double d0, double d1, double d2, boolean flag) {
        return null;
    }

    public static Entity spawnEntity(NBTTagCompound nbttagcompound, World world, double d0, double d1, double d2, boolean flag, org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason spawnReason) {
        return null;
    }

    @Nullable
    protected static Entity a(NBTTagCompound nbttagcompound, World world) {
        return null;
    }

    // CraftBukkit start
    public static void a(Entity entity, World world) {
    }

    public static void a(Entity entity, World world, org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason reason) {
    }

    @Nullable
    public static Entity a(NBTTagCompound nbttagcompound, World world, boolean flag) {
        return null;
    }
}
