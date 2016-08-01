package org.bukkit.craftbukkit;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Date;
import java.util.Set;
import net.minecraft.server.IpBanEntry;
import net.minecraft.server.IpBanList;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;
import com.google.common.collect.ImmutableSet;
import java.util.logging.Level;
import org.bukkit.Bukkit;

public class CraftIpBanList implements org.bukkit.BanList {

    private final IpBanList list = null;

    public CraftIpBanList(IpBanList list) {
    }

    @Override
    public org.bukkit.BanEntry getBanEntry(String target) {
        return null;
    }

    @Override
    public org.bukkit.BanEntry addBan(String target, String reason, Date expires, String source) {
        return null;
    }

    @Override
    public Set<org.bukkit.BanEntry> getBanEntries() {
        return null;
    }

    @Override
    public boolean isBanned(String target) {
        return false;
    }

    @Override
    public void pardon(String target) {
    }
}
