package org.bukkit.craftbukkit;

import java.io.File;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LDelegate;
import net.glowstone.linkstone.annotations.LImplements;
import org.bukkit.Server;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginLoadOrder;

import net.glowstone.GlowServer;
import net.minecraft.server.ICommandListener;
import net.minecraft.server.MinecraftServer;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class CraftServer {
    private final String serverName = "Linkstone";
    private final String serverVersion = "Linkstone-1.12";
    private final String consoleVersion = "1.12.2";

    @LDelegate(Server.class)
    private GlowServer glow;

    public CraftServer(GlowServer glow) {
        this.glow = glow;
    }

    public boolean getPermissionOverride(ICommandListener listener) {
        return false;
    }

    public boolean getCommandBlockOverride(String command) {
        return false;
    }

    private File getConfigFile() {
        return null;
    }

    private File getCommandsConfigFile() {
        return null;
    }

    private void saveConfig() {
        glow.getConfig().save();
    }

    private void saveCommandsConfig() {
    }

    public void loadPlugins() {
    }

    public void enablePlugins(PluginLoadOrder type) {
        System.out.println("[Linkstone]: CraftServer Unable to enable plugins ");
    }

    public MinecraftServer getServer() {
        return MinecraftServer.getServer();
    }

    public void disablePlugins() {
        glow.getPluginManager().disablePlugins();
    }

    private void setVanillaCommands() {
    }

    private void enablePlugin(Plugin plugin) {
        glow.getPluginManager().enablePlugin(plugin);
    }

    @Override
    public String toString() {
        return "CraftServer{" + "serverName=" + serverName + ",serverVersion=" + serverVersion + ",minecraftVersion=" + consoleVersion + '}';
    }

    @LImplements
    public String getName() {
        return serverName;
    }

    @LImplements
    public String getVersion() {
        return "1.12.2_b1";
    }

    @LImplements
    public String getBukkitVersion() {
        return "1.12.2";
    }
}