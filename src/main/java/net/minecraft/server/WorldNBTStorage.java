package net.minecraft.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import java.util.UUID;
import org.bukkit.craftbukkit.entity.CraftPlayer;

// CraftBukkit end
public class WorldNBTStorage implements IDataManager, IPlayerFileData {

    private static final Logger b = null;

    private final File baseDir = null;

    private final File playerDir = null;

    private final File dataDir = null;

    private final long sessionId = 0;

    private final String g = null;

    private final DefinedStructureManager h = null;

    protected final DataConverterManager a = null;

    private UUID uuid = null;

    // CraftBukkit
    public WorldNBTStorage(File file, String s, boolean flag, DataConverterManager dataconvertermanager) {
    }

    private void i() {
    }

    public File getDirectory() {
        return null;
    }

    public void checkSession() throws ExceptionWorldConflict {
    }

    public IChunkLoader createChunkLoader(WorldProvider worldprovider) {
        return null;
    }

    public WorldData getWorldData() {
        return null;
    }

    public void saveWorldData(WorldData worlddata, @Nullable NBTTagCompound nbttagcompound) {
    }

    public void saveWorldData(WorldData worlddata) {
    }

    public void save(EntityHuman entityhuman) {
    }

    public NBTTagCompound load(EntityHuman entityhuman) {
        return null;
    }

    // CraftBukkit start
    public NBTTagCompound getPlayerData(String s) {
        return null;
    }

    // CraftBukkit end
    public IPlayerFileData getPlayerFileData() {
        return null;
    }

    public String[] getSeenPlayers() {
        return null;
    }

    public void a() {
    }

    public File getDataFile(String s) {
        return null;
    }

    public DefinedStructureManager h() {
        return null;
    }

    // CraftBukkit start
    public UUID getUUID() {
        return null;
    }

    public File getPlayerDir() {
        return null;
    }
    // CraftBukkit end
}
