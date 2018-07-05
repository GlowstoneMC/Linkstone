package net.minecraft.server;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.CraftWorld;

import net.glowstone.GlowWorld;

public abstract class World implements IBlockAccess {

    public GlowWorld base;
    public CraftWorld craft;

    public World(GlowWorld glow) {
        this.base = glow;
        this.craft = new CraftWorld(glow);
    }

    public World(CraftWorld craft) {
        this.craft = craft;
        this.base = craft.base;
    }

    public CraftWorld getWorld() {
        return this.craft;
    }

    public CraftServer getServer() {
        return (CraftServer) Bukkit.getServer();
    }

    public World b() { // get this
        return this;
    }

    protected void b(Entity entity) { // add entity?
        entity.valid = true;
    }
}