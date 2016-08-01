package org.bukkit.craftbukkit;

import com.mojang.authlib.GameProfile;
import net.minecraft.server.GameProfileBanEntry;
import net.minecraft.server.GameProfileBanList;
import net.minecraft.server.MinecraftServer;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import org.bukkit.Bukkit;

public final class CraftProfileBanEntry implements org.bukkit.BanEntry {

    private final GameProfileBanList list = null;

    private final GameProfile profile = null;

    private Date created = null;

    private String source = null;

    private Date expiration = null;

    private String reason = null;

    public CraftProfileBanEntry(GameProfile profile, GameProfileBanEntry entry, GameProfileBanList list) {
    }

    @Override
    public String getTarget() {
        return null;
    }

    @Override
    public Date getCreated() {
        return null;
    }

    @Override
    public void setCreated(Date created) {
    }

    @Override
    public String getSource() {
        return null;
    }

    @Override
    public void setSource(String source) {
    }

    @Override
    public Date getExpiration() {
        return null;
    }

    @Override
    public void setExpiration(Date expiration) {
    }

    @Override
    public String getReason() {
        return null;
    }

    @Override
    public void setReason(String reason) {
    }

    @Override
    public void save() {
    }
}
