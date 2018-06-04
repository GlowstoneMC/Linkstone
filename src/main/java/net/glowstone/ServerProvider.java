package net.glowstone;

import org.bukkit.Bukkit;
import org.bukkit.Server;

// LINKSTONE: override class to fix Class Cast Execption.
public final class ServerProvider {
    private static volatile Server mockServer;

    /**
     * Returns the current GlowServer instance.
     * @return the GlowServer instance
     */
    public static Server getServer() {
        return mockServer == null ? Bukkit.getNonLinkstone() : mockServer;
    }
}