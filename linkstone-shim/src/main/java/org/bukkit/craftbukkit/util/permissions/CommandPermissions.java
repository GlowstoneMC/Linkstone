package org.bukkit.craftbukkit.util.permissions;

import net.glowstone.linkstone.annotations.LClassfile;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;
import org.bukkit.util.permissions.DefaultPermissions;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public final class CommandPermissions {
    private static final String ROOT = "minecraft.command";
    private static final String PREFIX = ROOT + ".";

    private CommandPermissions() {}

    public static Permission registerPermissions(Permission parent) {
        Permission commands = DefaultPermissions.registerPermission(ROOT, "Gives the user the ability to use all vanilla minecraft commands", parent);

        DefaultPermissions.registerPermission(PREFIX + "kill", "(evil laugh)", PermissionDefault.OP, commands);
        DefaultPermissions.registerPermission(PREFIX + "me", "actions thingy", PermissionDefault.TRUE, commands);
        DefaultPermissions.registerPermission(PREFIX + "tell", "message others", PermissionDefault.TRUE, commands);
        DefaultPermissions.registerPermission(PREFIX + "say", "Talk with a fancy [Name] in the start", PermissionDefault.OP, commands);
        DefaultPermissions.registerPermission(PREFIX + "give", "Give items", PermissionDefault.OP, commands);
        DefaultPermissions.registerPermission(PREFIX + "teleport", "Allows /tp", PermissionDefault.OP, commands);
        DefaultPermissions.registerPermission(PREFIX + "kick", "Allows the user to kick players", PermissionDefault.OP, commands);
        DefaultPermissions.registerPermission(PREFIX + "stop", "Stop the server", PermissionDefault.OP, commands);
        DefaultPermissions.registerPermission(PREFIX + "list", "List of online players", PermissionDefault.OP, commands);
        DefaultPermissions.registerPermission(PREFIX + "gamemode", "Allows the user to change the gamemode of another player", PermissionDefault.OP, commands);
        DefaultPermissions.registerPermission(PREFIX + "xp", "Allows /xp", PermissionDefault.OP, commands);
        DefaultPermissions.registerPermission(PREFIX + "toggledownfall", "Allows the user to toggle rain on/off for a given world", PermissionDefault.OP, commands);
        DefaultPermissions.registerPermission(PREFIX + "defaultgamemode", "Allows the user to change the default gamemode of the server", PermissionDefault.OP, commands);
        DefaultPermissions.registerPermission(PREFIX + "seed", "Allows the user to view the seed of the world", PermissionDefault.OP, commands);
        DefaultPermissions.registerPermission(PREFIX + "effect", "Allows /effect", PermissionDefault.OP, commands);
        DefaultPermissions.registerPermission(PREFIX + "selector", "Allows the use of selectors", PermissionDefault.OP, commands);
        DefaultPermissions.registerPermission(PREFIX + "trigger", "Allows /trigger", PermissionDefault.TRUE, commands);

        commands.recalculatePermissibles();
        return commands;
    }
}
