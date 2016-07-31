package net.minecraft.server;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multisets;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.Bukkit;
import org.bukkit.event.server.MapInitializeEvent;

// CraftBukkit end
public class ItemWorldMap extends ItemWorldMapBase {

    protected ItemWorldMap() {
    }

    public WorldMap getSavedMap(ItemStack itemstack, World world) {
        return null;
    }

    public void a(World world, Entity entity, WorldMap worldmap) {
    }

    public void a(ItemStack itemstack, World world, Entity entity, int i, boolean flag) {
    }

    @Nullable
    public Packet<?> a(ItemStack itemstack, World world, EntityHuman entityhuman) {
        return null;
    }

    public void b(ItemStack itemstack, World world, EntityHuman entityhuman) {
    }

    protected static void a(ItemStack itemstack, World world, int i) {
    }

    protected static void b(ItemStack itemstack, World world) {
    }
}
