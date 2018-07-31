package net.minecraft.server;

import net.glowstone.linkstone.Linkstone;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;
import org.bukkit.Bukkit;

import net.glowstone.GlowServer;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public abstract class MinecraftServer implements IMojangStatistics {
    private GlowServer glow;
    private static MinecraftServer inst;

    public MinecraftServer() {
        MinecraftServer.inst = this;
        this.glow = (GlowServer) Bukkit.getServer();
    }

    @Deprecated
    @LMethod(version = V1_12_R1)
    public static MinecraftServer getServer() {
        return inst;
    }

    @LMethod(version = V1_12_R1)
    public abstract boolean getGenerateStructures();

    @LMethod(version = V1_12_R1)
    public abstract EnumGamemode getGamemode();

    @LMethod(version = V1_12_R1)
    public abstract EnumDifficulty getDifficulty();

    @LMethod(version = V1_12_R1)
    public abstract boolean isHardcore();

    //TODO @Isaiah Deobfuscate and Annotated Method
    public abstract int q();

    //TODO @Isaiah Deobfuscate and Annotated Method
    public abstract boolean r();

    //TODO @Isaiah Deobfuscate and Annotated Method
    public abstract boolean s();

    @LMethod(version = V1_12_R1)
    public String getVersion() {
        return GlowServer.GAME_VERSION;
    }

    @LMethod(version = V1_12_R1)
    public int getSpawnProtection() {
        return glow.getSpawnRadius();
    }

    @LMethod(version = V1_12_R1, name = "V")
    public boolean isDemoMode() {
        return false;
    }

    @LMethod(version = V1_12_R1)
    public boolean getAllowNether() {
        return glow.getAllowNether();
    }

    @LMethod(version = V1_12_R1, name = "H")
    public int getPlayerCount() {
        return glow.getOnlinePlayers().size();
    }

    @LMethod(version = V1_12_R1, name = "I")
    public int getMaxPlayers() {
        return glow.getMaxPlayers();
    }

    @LMethod(version = V1_12_R1)
    public String getServerModName() {
        return glow.getName();
    }

    @LMethod(version = V1_12_R1)
    public boolean getSpawnMonsters() {
        return glow.getMonstersSpawnEnabled();
    }

    @LMethod(version = V1_12_R1)
    public String getMotd() {
        return glow.getMotd();
    }

    @LMethod(version = V1_12_R1, name = "aw")
    public static long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override
    @LOverride
    public void a(MojangStatisticsGenerator a) {
    }

    @Override
    @LOverride
    public void b(MojangStatisticsGenerator a) {
    }

    @Override
    @LOverride
    public boolean getSnooperEnabled() {
        // TODO: send data to Mojang?
        return false;
    }

    @LMethod(version = V1_12_R1)
    public void stop() {
        glow.shutdown("MinecraftServer#stop() called");
    }

    @LMethod(version = V1_12_R1)
    public boolean isRunning() {
        // TODO
        return true;
    }

    @LMethod(version = V1_12_R1)
    public boolean getPVP() {
        return glow.isPvpEnabled();
    }
}