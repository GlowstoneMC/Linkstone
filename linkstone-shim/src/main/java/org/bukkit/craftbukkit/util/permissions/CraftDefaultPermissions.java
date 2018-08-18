package org.bukkit.craftbukkit.util.permissions;

import net.glowstone.linkstone.annotations.LClassfile;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;
import org.bukkit.util.permissions.DefaultPermissions;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public final class CraftDefaultPermissions {
    private CraftDefaultPermissions() {}

    public static void registerCorePermissions() {
        Permission parent = DefaultPermissions.registerPermission("minecraft", "Gives the user the ability to use all vanilla utilities and commands");
        CommandPermissions.registerPermissions(parent);
        parent.recalculatePermissibles();
    }
}