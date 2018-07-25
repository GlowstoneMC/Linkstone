package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import org.bukkit.craftbukkit.CraftWorld;

import net.glowstone.GlowWorld;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public abstract class WorldServer extends World implements IAsyncTaskHandler {

    public WorldServer(GlowWorld glow) {
        super(glow);
    }

    public WorldServer(CraftWorld craft) {
        super(craft);
    }

}