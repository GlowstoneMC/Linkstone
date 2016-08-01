package org.bukkit.craftbukkit.entity;

import com.google.common.base.Optional;
import net.minecraft.server.EntityFireworks;
import net.minecraft.server.ItemStack;
import net.minecraft.server.Items;
import org.bukkit.Material;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.inventory.meta.FireworkMeta;
import java.util.Random;

public class CraftFirework extends CraftEntity implements Firework {

    private final Random random = null;

    private final CraftItemStack item = null;

    public CraftFirework(CraftServer server, EntityFireworks entity) {
    }

    @Override
    public EntityFireworks getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public EntityType getType() {
        return null;
    }

    @Override
    public FireworkMeta getFireworkMeta() {
        return null;
    }

    @Override
    public void setFireworkMeta(FireworkMeta meta) {
    }

    @Override
    public void detonate() {
    }
}
