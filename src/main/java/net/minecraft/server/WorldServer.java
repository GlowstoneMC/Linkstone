package net.minecraft.server;

import org.bukkit.craftbukkit.CraftWorld;

import net.glowstone.GlowWorld;

public abstract class WorldServer extends World implements IAsyncTaskHandler {

    public WorldServer(GlowWorld glow) {
        super(glow);
    }

    public WorldServer(CraftWorld craft) {
        super(craft);
    }

}