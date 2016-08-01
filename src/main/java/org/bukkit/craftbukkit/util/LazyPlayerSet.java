package org.bukkit.craftbukkit.util;

import java.util.HashSet;
import java.util.List;
import net.minecraft.server.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import org.bukkit.entity.Player;

public class LazyPlayerSet extends LazyHashSet<Player> {

    private final MinecraftServer server;

    public LazyPlayerSet(MinecraftServer server) {
    }

    @Override
    HashSet<Player> makeReference() {
        return null;
    }
}
