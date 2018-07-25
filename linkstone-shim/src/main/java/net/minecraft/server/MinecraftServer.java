package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import org.bukkit.Bukkit;

import net.glowstone.GlowServer;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public abstract class MinecraftServer implements IMojangStatistics {
    private String motd;
    private GlowServer glowserver;
    private static MinecraftServer inst;

    public MinecraftServer() {
        MinecraftServer.inst = this;
        this.glowserver = (GlowServer) Bukkit.getServer();
        this.motd = Bukkit.getServer().getMotd(); 
    }

    public abstract boolean getGenerateStructures();

    public abstract EnumGamemode getGamemode();

    public abstract EnumDifficulty getDifficulty();

    public abstract boolean isHardcore();

    public abstract int q();

    public abstract boolean r();

    public abstract boolean s();

    public String getVersion() {
        return "1.12.2";
    }

    @Deprecated
    public static MinecraftServer getServer() {
        return inst;
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

    public int H() { // online players
        return glowserver.getOnlinePlayers().size();
    }

    public int I() { // max players
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

    @Override
    public void a(MojangStatisticsGenerator a) {
    }

    @Override
    public void b(MojangStatisticsGenerator a) {
    }

    @Override
    public boolean getSnooperEnabled() {
        return false; // TODO: send data to Mojang?
    }

    public void stop() {
        glowserver.shutdown("MinecraftServer#stop() called");
    }

    public boolean isRunning() {
        return true; // TODO
    }

    public boolean getPVP() {
        return glowserver.isPvpEnabled();
    }
}