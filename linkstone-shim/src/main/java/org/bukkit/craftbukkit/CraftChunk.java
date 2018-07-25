/**
 * This file has methods auto-generated (marked with // LinkFiller)
 */
package org.bukkit.craftbukkit;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Chunk;
import org.bukkit.ChunkSnapshot;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.craftbukkit.entity.CraftEntity;
import org.bukkit.entity.Entity;

import net.glowstone.chunk.GlowChunk;
import net.glowstone.entity.GlowEntity;

public class CraftChunk implements Chunk {
    public GlowChunk base;
    public CraftChunk(GlowChunk c) {
        this.base = c;
    }

    public CraftChunk(net.minecraft.server.Chunk chunk) {
        // TODO
    }

    public CraftWorld getCraftWorld() {
        return new CraftWorld(base.getWorld());
    }

    public Chunk getHandle() {
        return null; // TODO
    }

    @Override
    public String toString() {
        return "CraftChunk{" + "x=" + getX() + "z=" + getZ() + '}';
    }

    @Override
    public Block getBlock(int arg0, int arg1, int arg2) {
        return base.getBlock(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public ChunkSnapshot getChunkSnapshot() {
        return base.getChunkSnapshot(); // LinkFiller
    }

    @Override
    public ChunkSnapshot getChunkSnapshot(boolean arg0, boolean arg1, boolean arg2) {
        return base.getChunkSnapshot(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public Entity[] getEntities() {
        List<Entity> list = new ArrayList<>();
        for (Entity e : base.getEntities()) {
            list.add(new CraftEntity((GlowEntity) e));
        }
        return list.toArray(new Entity[0]);
    }

    @Override
    @Deprecated
    public BlockState[] getTileEntities() {
        return base.getTileEntities(); // LinkFiller
    }

    @Override
    public World getWorld() {
        return new CraftWorld(base.getWorld());
    }

    @Override
    public int getX() {
        return base.getX(); // LinkFiller
    }

    @Override
    public int getZ() {
        return base.getZ(); // LinkFiller
    }

    @Override
    public boolean isLoaded() {
        return base.isLoaded(); // LinkFiller
    }

    @Override
    public boolean isSlimeChunk() {
        return base.isSlimeChunk(); // LinkFiller
    }

    @Override
    public boolean load() {
        return base.load(); // LinkFiller
    }

    @Override
    public boolean load(boolean arg0) {
        return base.load(arg0); // LinkFiller
    }

    @Override
    public boolean unload() {
        return base.unload(); // LinkFiller
    }

    @Override
    public boolean unload(boolean arg0) {
        return base.unload(arg0); // LinkFiller
    }

    @Override
    public boolean unload(boolean arg0, boolean arg1) {
        return base.unload(arg0, arg1); // LinkFiller
    }

}