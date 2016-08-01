package org.bukkit.craftbukkit.command;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.CommandSender;
import org.bukkit.permissions.PermissibleBase;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import java.util.Set;

public abstract class ServerCommandSender implements CommandSender {

    private final PermissibleBase perm = null;

    public ServerCommandSender() {
    }

    public boolean isPermissionSet(String name) {
        return false;
    }

    public boolean isPermissionSet(Permission perm) {
        return false;
    }

    public boolean hasPermission(String name) {
        return false;
    }

    public boolean hasPermission(Permission perm) {
        return false;
    }

    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value) {
        return null;
    }

    public PermissionAttachment addAttachment(Plugin plugin) {
        return null;
    }

    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks) {
        return null;
    }

    public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
        return null;
    }

    public void removeAttachment(PermissionAttachment attachment) {
    }

    public void recalculatePermissions() {
    }

    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        return null;
    }

    public boolean isPlayer() {
        return false;
    }

    public Server getServer() {
        return null;
    }
}
