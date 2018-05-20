package net.minecraft.server;

import org.bukkit.Bukkit;

public class MinecraftServer {
    private String motd;

    public MinecraftServer() {
        this.motd = Bukkit.getServer().getMotd(); 
    }

    public String getVersion() {
        return "1.12.2";
    }

    public int getSpawnProtection() {
        return 16;
    }
    
    public boolean V() {
        return false; // demo mode
    }
    
    public void b(boolean flag) {
        // Demomode
    }

    public boolean getAllowNether() {
        return true; // TODO: configuration
    }

    public int H() {
        return Bukkit.getServer().getOnlinePlayers().size();
    }

    public int I() {
        return Bukkit.getServer().getMaxPlayers();
    }

    public String getServerModName() {
        return "Linkstone";
    }

    public boolean getSpawnMonsters() {
        return true; // TODO: read configuration
    }

    public String getMotd() {
        return this.motd;
    }

    public void setMotd(String s) {
        this.motd = s;
    }

    public static long aw() {
        return System.currentTimeMillis();
    }
}
