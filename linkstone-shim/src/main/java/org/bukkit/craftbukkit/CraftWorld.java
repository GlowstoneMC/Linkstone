package org.bukkit.craftbukkit;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LDelegate;
import org.bukkit.World;

import net.glowstone.GlowWorld;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class CraftWorld {
    @LDelegate(World.class)
    public GlowWorld glow;

    public CraftWorld(GlowWorld glow) {
        this.glow = glow;
    }
}