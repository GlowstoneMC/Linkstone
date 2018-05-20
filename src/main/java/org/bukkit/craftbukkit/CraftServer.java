package org.bukkit.craftbukkit;

public class CraftServer {
    private final String serverName = "Linkstone";
    private final String serverVersion = "Linkstone-1.12";
    private final String consoleVersion = "1.12.2"; // TODO: remove when add console method
    
    public CraftServer() {
    }

    @Override
    public String toString() {
        return "CraftServer{" + "serverName=" + serverName + ",serverVersion=" + serverVersion + ",minecraftVersion=" + consoleVersion + '}';
    }
}
