package net.minecraft.server;

import java.io.File;

public interface IDataManager {

    WorldData getWorldData() {
        return null;
    }

    void checkSession() throws ExceptionWorldConflict {
    }

    IChunkLoader createChunkLoader(WorldProvider worldprovider) {
        return null;
    }

    void saveWorldData(WorldData worlddata, NBTTagCompound nbttagcompound) {
    }

    void saveWorldData(WorldData worlddata) {
    }

    IPlayerFileData getPlayerFileData() {
        return null;
    }

    void a() {
    }

    File getDirectory() {
        return null;
    }

    File getDataFile(String s) {
        return null;
    }

    DefinedStructureManager h() {
        return null;
    }

    java.util.UUID getUUID() {
        return null;
    }
    // CraftBukkit
}
