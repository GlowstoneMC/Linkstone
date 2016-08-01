package org.bukkit.craftbukkit.util;

import net.minecraft.server.ExceptionWorldConflict;
import net.minecraft.server.MinecraftServer;

public class ServerShutdownThread extends Thread {

    private final MinecraftServer server = null;

    public ServerShutdownThread(MinecraftServer server) {
    }

    @Override
    public void run() {
    }
}
