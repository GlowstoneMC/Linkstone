package net.minecraft.server;

import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class RegionFileCache {

    private static final Map<File, RegionFile> a = null;

    public static synchronized RegionFile a(File file, int i, int j) {
        return null;
    }

    public static synchronized void a() {
    }

    // CraftBukkit start - call sites hoisted for synchronization
    public static synchronized NBTTagCompound c(File file, int i, int j) throws IOException {
        return null;
    }

    public static synchronized void d(File file, int i, int j, NBTTagCompound nbttagcompound) throws IOException {
    }
    // CraftBukkit end
}
