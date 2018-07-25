package net.glowstone.linkstone;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        try {
            Class.forName("net.glowstone.GlowServer");
        } catch (ClassNotFoundException e) {
            getLogger().warning("Linkstone cannot run on non-glowstone servers");
            getServer().getPluginManager().disablePlugin(this);
        }
    }
}
