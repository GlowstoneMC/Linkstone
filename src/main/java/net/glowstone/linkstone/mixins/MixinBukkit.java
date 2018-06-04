package net.glowstone.linkstone.mixins;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import net.glowstone.GlowServer;
import net.glowstone.entity.GlowPlayer;

@Mixin(Bukkit.class)
public class MixinBukkit {
    @Shadow
    private static Server server;

	public CraftServer craftserver;

	@Overwrite
	public CraftServer getServer() {
	    if (craftserver == null) {
	        craftserver = new CraftServer((GlowServer) Bukkit.getNonLinkstone());
	    }
	    return craftserver;
	}

	public GlowServer getGlowServer() {
	    if (server != null) {
	        return (GlowServer) server;
	    } else {
	        throw new RuntimeException("setServer() has not been called in GlowServer yet");
	    }
	}

	@Overwrite
	public CraftPlayer getPlayer(String name) {
		return new CraftPlayer((GlowPlayer)getGlowServer().getPlayer(name));
	}

	@Overwrite
	public CraftPlayer getPlayer(UUID u) {
	    return new CraftPlayer((GlowPlayer)getGlowServer().getPlayer(u));
	}
}