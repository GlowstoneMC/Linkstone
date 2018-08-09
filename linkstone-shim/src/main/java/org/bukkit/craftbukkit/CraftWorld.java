package org.bukkit.craftbukkit;

import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.annotations.LBoxed;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LDelegate;
import org.bukkit.World;

import net.glowstone.GlowWorld;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LBox(GlowWorld.class)
@LClassfile(version = V1_12_R1)
public class CraftWorld {
    @LBoxed
    @LDelegate(World.class)
    public GlowWorld glow;

    public CraftWorld(GlowWorld glow) {
        this.glow = glow;
    }
}