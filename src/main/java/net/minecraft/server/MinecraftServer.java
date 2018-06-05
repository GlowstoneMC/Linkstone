package net.minecraft.server;

import org.bukkit.Bukkit;

import net.glowstone.GlowServer;

public class MinecraftServer {
    private String motd;
    private GlowServer glowserver;
    private static MinecraftServer inst;

    public MinecraftServer() {
        MinecraftServer.inst = this;
        this.glowserver = (GlowServer) Bukkit.getNonLinkstone();
        this.motd = Bukkit.getServer().getMotd(); 
    }

    public String getVersion() {
        return "1.12.2";
    }
    
    public static MinecraftServer getServer() {
        return null == inst ? new MinecraftServer() : inst;
    }

    public int getSpawnProtection() {
        return glowserver.getSpawnRadius();
    }

    public boolean V() {
        return false; // demo mode
    }

    public void b(boolean flag) { // Demomode
    }

    public boolean getAllowNether() {
        return glowserver.getAllowNether();
    }

    public int H() {
        return glowserver.getOnlinePlayers().size();
    }

    public int I() {
        return glowserver.getMaxPlayers();
    }

    public String getServerModName() {
        return "Linkstone";
    }

    public boolean getSpawnMonsters() {
        return glowserver.getMonstersSpawnEnabled();
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
