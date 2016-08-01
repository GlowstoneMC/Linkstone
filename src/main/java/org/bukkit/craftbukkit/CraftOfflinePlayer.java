package org.bukkit.craftbukkit;

import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.server.EntityPlayer;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.WorldNBTStorage;
import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.SerializableAs;
import org.bukkit.entity.Player;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

@SerializableAs("Player")
public class CraftOfflinePlayer implements OfflinePlayer, ConfigurationSerializable {

    private final GameProfile profile = null;

    private final CraftServer server = null;

    private final WorldNBTStorage storage = null;

    protected CraftOfflinePlayer(CraftServer server, GameProfile profile) {
    }

    public GameProfile getProfile() {
        return null;
    }

    public boolean isOnline() {
        return false;
    }

    public String getName() {
        return null;
    }

    public UUID getUniqueId() {
        return null;
    }

    public Server getServer() {
        return null;
    }

    public boolean isOp() {
        return false;
    }

    public void setOp(boolean value) {
    }

    public boolean isBanned() {
        return false;
    }

    public void setBanned(boolean value) {
    }

    public boolean isWhitelisted() {
        return false;
    }

    public void setWhitelisted(boolean value) {
    }

    public Map<String, Object> serialize() {
        return null;
    }

    public static OfflinePlayer deserialize(Map<String, Object> args) {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public Player getPlayer() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    private NBTTagCompound getData() {
        return null;
    }

    private NBTTagCompound getBukkitData() {
        return null;
    }

    private File getDataFile() {
        return null;
    }

    public long getFirstPlayed() {
        return 0;
    }

    public long getLastPlayed() {
        return 0;
    }

    public boolean hasPlayedBefore() {
        return false;
    }

    public Location getBedSpawnLocation() {
        return null;
    }

    public void setMetadata(String metadataKey, MetadataValue metadataValue) {
    }

    public List<MetadataValue> getMetadata(String metadataKey) {
        return null;
    }

    public boolean hasMetadata(String metadataKey) {
        return false;
    }

    public void removeMetadata(String metadataKey, Plugin plugin) {
    }
}
