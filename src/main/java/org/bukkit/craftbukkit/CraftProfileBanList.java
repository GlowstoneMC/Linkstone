package org.bukkit.craftbukkit;

import java.io.IOException;
import java.util.Date;
import java.util.Set;
import net.minecraft.server.GameProfileBanEntry;
import net.minecraft.server.GameProfileBanList;
import net.minecraft.server.JsonListEntry;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;
import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import java.util.logging.Level;
import org.bukkit.Bukkit;

public class CraftProfileBanList implements org.bukkit.BanList {

    private final GameProfileBanList list = null;

    public CraftProfileBanList(GameProfileBanList list) {
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
