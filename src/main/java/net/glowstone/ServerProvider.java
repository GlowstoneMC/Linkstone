package net.glowstone;

import org.bukkit.Bukkit;
import org.bukkit.Server;

public final class ServerProvider {

    public static Server getServer() {
        return Bukkit.getNonLinkstone(); // LINKSTONE: Fix CCE. Because of the change of getServer() to CraftServer instance.
    }

}