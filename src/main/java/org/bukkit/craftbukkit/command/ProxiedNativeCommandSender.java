package org.bukkit.craftbukkit.command;

import java.util.Set;
import net.minecraft.server.ICommandListener;
import org.bukkit.Server;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ProxiedCommandSender;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;

public class ProxiedNativeCommandSender implements ProxiedCommandSender {

    private final ICommandListener orig = null;

    private final CommandSender caller = null;

    private final CommandSender callee = null;

    public ProxiedNativeCommandSender(ICommandListener orig, CommandSender caller, CommandSender callee) {
    }

    public ICommandListener getHandle() {
        return null;
    }

    @Override
    public CommandSender getCaller() {
        return null;
    }

    @Override
    public CommandSender getCallee() {
        return null;
    }

    @Override
    public void sendMessage(String message) {
    }

    @Override
    public void sendMessage(String[] messages) {
    }

    @Override
    public Server getServer() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isPermissionSet(String name) {
        return false;
    }

    @Override
    public boolean isPermissionSet(Permission perm) {
        return false;
    }

    @Override
    public boolean hasPermission(String name) {
        return false;
    }

    @Override
    public boolean hasPermission(Permission perm) {
        return false;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value) {
        return null;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin) {
        return null;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks) {
        return null;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
        return null;
    }

    @Override
    public void removeAttachment(PermissionAttachment attachment) {
    }

    @Override
    public void recalculatePermissions() {
    }

    @Override
    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        return null;
    }

    @Override
    public boolean isOp() {
        return false;
    }

    @Override
    public void setOp(boolean value) {
    }
}
