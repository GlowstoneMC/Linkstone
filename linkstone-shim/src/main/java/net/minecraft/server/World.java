package net.minecraft.server;

import net.glowstone.linkstone.Linkstone;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LMethod;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.CraftWorld;

import net.glowstone.GlowWorld;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public abstract class World implements IBlockAccess {

    public GlowWorld base;
    public CraftWorld craft;

    public World(GlowWorld glow) {
        this.base = glow;
        this.craft = Linkstone.box(glow);
    }

    public World(CraftWorld craft) {
        this.craft = craft;
        this.base = craft.glow;
    }

    @LMethod(version = V1_12_R1)
    public CraftWorld getWorld() {
        return this.craft;
    }

    @LMethod(version = V1_12_R1, name = "b")
    public World getNmsWorld() { // get this
        return this;
    }

    @LMethod(version = V1_12_R1)
    public CraftServer getServer() {
        return Linkstone.box(Bukkit.getServer());
    }
}
